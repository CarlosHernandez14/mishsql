
package com.mishisql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mishisql.querystructure.CreateDatabaseStructure;
import com.mishisql.querystructure.CreateTableStructure;
import com.mishisql.querystructure.QueryStructure;
import com.mishisql.querystructure.SelectStructure;
import com.mishisql.querystructure.UseDatabaseStructure;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<QueryStructure> transformedQueries = new ArrayList<>();
    private QueryStructure queryStructure;

    // Map to store the table name and its structure
    private Map<String, List<String>> tableStructure;

    @Override
    public Object visitCreateDatabaseQuery(MishiSQLanguageParser.CreateDatabaseQueryContext ctx) {
        String dbName = ctx.dbName.getText();
        CreateDatabaseStructure createDbStructure = new CreateDatabaseStructure(dbName);

        this.queryStructure = createDbStructure;
        this.transformedQueries.add(createDbStructure);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitUseDatabaseQuery(MishiSQLanguageParser.UseDatabaseQueryContext ctx) {
        String dbName = ctx.dbName.getText();
        UseDatabaseStructure useDBStructure = new UseDatabaseStructure(dbName);

        this.queryStructure = useDBStructure;
        this.transformedQueries.add(useDBStructure);

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitCreateTableQuery(MishiSQLanguageParser.CreateTableQueryContext ctx) {
        String tableName = ctx.tableName.getText();
        CreateTableStructure structure = new CreateTableStructure(tableName);

        // Procesar campos
        for (MishiSQLanguageParser.TableFieldContext fieldCtx : ctx.tableFields().tableField()) {
            String name = fieldCtx.fieldName.getText();
            String type;
            switch (fieldCtx.fieldType.getText()) {
                case    "ENTERO"    : type = "INT";             break;
                case    "TEXTO"     : type = "VARCHAR(255)";    break;
                case    "DECIMAL"   : type = "DECIMAL";         break;
                default             : type = "TEXT";
            }

            CreateTableStructure.ColumnDefinition column = new CreateTableStructure.ColumnDefinition(name, type);

            if (fieldCtx.constraints != null) {
                for (MishiSQLanguageParser.FieldConstraintContext cons : fieldCtx.constraints) {
                    if (cons.getText().equals("MISHILLAVEPRIMARIA") || cons.getText().contains("PRIMARIA")) {
                        column.isPrimaryKey = true;
                    }
                    if (cons.getText().contains("NOSEA") || cons.getText().contains("NULO")) {
                        column.isNotNull = true;
                    }
                }
            }

            structure.addColumn(column);
        }

        // Foreign key clause
        if (ctx.foreignKeyClause() != null) {
            String fk = ctx.foreignKeyClause().fkField.getText();
            String refField = ctx.foreignKeyClause().refField.getText();
            String refTable = ctx.foreignKeyClause().refTable.getText();
            structure.setForeignKey(fk, refField, refTable);
        }

        this.queryStructure = structure;
        this.transformedQueries.add(structure);

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx) {
        // TRANSFORM THE QUERY TO SQL FORMAT
        SelectStructure selectStructure = new SelectStructure();
        // Get the columns to select

        // Check if ALL is present, if not, get the specific columns
        List<String> columns = ctx.ALL() != null ? List.of("*")
                : ctx.ids.stream()
                        .map(column -> column.getText())
                        .toList();

        // Set the columns in the query structure
        selectStructure.setColumns(columns);
        // Set the table name
        selectStructure.setTableName(ctx.tableId.getText());

        // Add ORDER BY clause if present
        if (ctx.ORDER() != null) {

            // Set the order by column in the query structure tableIdOrder and orderID
            selectStructure.setOrderByColumn(ctx.tableidOrder.getText() + "." + ctx.orderID.getText());

            // Check if the order is DESC or ASC
            selectStructure.setOrderDirection(ctx.DESC() != null ? "DESC" : "ASC");
        }

        this.queryStructure = selectStructure;
        this.transformedQueries.add(selectStructure);

        // Visit the children of the context to continue the traversal
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitCondition(MishiSQLanguageParser.ConditionContext ctx) {

        // Example: Transforming a condition to SQL format
        StringBuilder condition = new StringBuilder();

        if (ctx.SPECIFIC_ATTR() != null) {
            condition.append(ctx.tableName.getText()).append(".").append(ctx.attrName.getText());
        }
        // Concat the condition with the operator and value
        if (ctx.EQUAL() != null) {
            condition.append(" = ");
        } else if (ctx.GREATER_THAN() != null) {
            condition.append(" > ");
        } else if (ctx.LESS_THAN() != null) {
            condition.append(" < ");
        } else if (ctx.GREATER_THAN_EQUAL() != null) {
            condition.append(" >= ");
        } else if (ctx.LESS_THAN_EQUAL() != null) {
            condition.append(" <= ");
        }

        // Add the value to the condition
        if (ctx.value() != null) {
            ctx.value().forEach(value -> {
                condition.append(value.getText()).append(" ");
            });
        }

        // Add the condition to the SQL query
        this.queryStructure.setWhereCondition(condition.toString());

        // Handle the condition logic here if needed
        return super.visitChildren(ctx);
    }

    public List<QueryStructure> getTransformedQueries() {
        return transformedQueries;
    }

}
