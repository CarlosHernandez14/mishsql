
package com.mishisql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.mishisql.exceptionhandling.CustomErrorListener;
import com.mishisql.querystructure.JoinStructure;
import com.mishisql.querystructure.CreateDatabaseStructure;
import com.mishisql.querystructure.CreateTableStructure;
import com.mishisql.querystructure.InsertStructure;
import com.mishisql.querystructure.QueryStructure;
import com.mishisql.querystructure.SelectStructure;
import com.mishisql.querystructure.UseDatabaseStructure;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<QueryStructure> transformedQueries = new ArrayList<>();
    private QueryStructure queryStructure;

    // Map to store the table name and its structure
    private Map<String, List<String>> tableStructure = new HashMap<>();

    private String currentDatabaseName = null;

    @Override
    public Object visitCreateDatabaseQuery(MishiSQLanguageParser.CreateDatabaseQueryContext ctx) {
        String dbName = ctx.dbName.getText();

        if (tableStructure.containsKey(dbName)) {
            System.out.println("Error: La base de datos '"+ dbName + "' ya existe.");
        } 

        tableStructure.put(dbName, new ArrayList<>());

        CreateDatabaseStructure createDbStructure = new CreateDatabaseStructure(dbName);

        this.queryStructure = createDbStructure;
        this.transformedQueries.add(createDbStructure);

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitUseDatabaseQuery(MishiSQLanguageParser.UseDatabaseQueryContext ctx) {
        String dbName = ctx.dbName.getText();

        if (!tableStructure.containsKey(dbName)) {
            System.out.println("Error: La base de datos '"+ dbName + "' no existe.");
        } 

        setCurrentDatabaseName(dbName);

        UseDatabaseStructure useDBStructure = new UseDatabaseStructure(dbName);

        this.queryStructure = useDBStructure;
        this.transformedQueries.add(useDBStructure);

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitCreateTableQuery(MishiSQLanguageParser.CreateTableQueryContext ctx) {
        String tableName = ctx.tableName.getText();

        List<String> tables = tableStructure.get(getCurrentDatabaseName());

        if (tables.contains(tableName)) {
            System.out.println("Error: La tabla '"+ tableName + "' ya existe en la base de datos '" + getCurrentDatabaseName() + "'.");
        }

        tables.add(tableName);


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
    public Object visitInsertQuery(MishiSQLanguageParser.InsertQueryContext ctx) {
        String tableName = ctx.ID().getText();
        InsertStructure insertStructure = new InsertStructure(tableName);

        for (MishiSQLanguageParser.ValueTupleContext tupleCtx : ctx.valueTuples().valueTuple()) {
            List<String> values = new ArrayList<>();
            for (MishiSQLanguageParser.ValueContext valCtx : tupleCtx.value()) {
                values.add(valCtx.getText());
            }
            insertStructure.addRow(values);
        }   

        this.queryStructure = insertStructure;
        this.transformedQueries.add(insertStructure);
        
        return super.visitChildren(ctx);
    }

    // Custom error listener to also handle the semantic errors
    private CustomErrorListener errorListener;

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
        // Check if its a join query or not
        if (ctx.tableId != null) {
            // If its a normal query, set the table name
            selectStructure.setTableName(ctx.tableId.getText());
        }

        // Add ORDER BY clause if present
        if (ctx.ORDER() != null) {

            // Set the order by column in the query structure tableIdOrder and orderID
            selectStructure.setOrderByColumn(ctx.tableidOrder.getText() + "." + ctx.orderID.getText());

            // Check if the order is DESC or ASC
            selectStructure.setOrderDirection(ctx.DESC() != null ? "DESC" : "ASC");
        }

        // Add LIMIT clause if present
        if (ctx.LIMIT() != null) {
            selectStructure.setLimit(ctx.limitValue.getText());
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

    @Override
    public Object visitFrom_join(MishiSQLanguageParser.From_joinContext ctx) { 

        SelectStructure selectStructure = (SelectStructure) this.queryStructure;

        // Get the join type joinType = (Inner|Left|Right|Full)
        String joinType = null;
        if (ctx.INNER_JOIN() != null) {
            joinType = "INNER";
        } else if (ctx.LEFT_JOIN() != null) {
            joinType = "LEFT";
        } else if (ctx.RIGHT_JOIN() != null) {
            joinType = "RIGHT";
        } else if (ctx.FULL_JOIN() != null) {
            joinType = "FULL";
        }

        // Get the joinable table
        String joinTable = ctx.joinTable.getText();

        // Get the table name to join
        selectStructure.setTableName(ctx.tableIdJoin.getText());

        JoinStructure joinStructure = new JoinStructure(joinType, joinTable, null);

        selectStructure.getJoins().add(joinStructure);

        
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitJoin_condition(MishiSQLanguageParser.Join_conditionContext ctx) {
        // Example: Transforming a join condition to SQL format
        StringBuilder joinCondition = new StringBuilder();

        if (ctx.SPECIFIC_ATTR() != null) {
            joinCondition.append(ctx.tableName.getText()).append(".").append(ctx.attrName.getText());
        }
        // Get the join condition joinCondition =(EQUAL|GREATER_THAN|LESS_THAN|GREATER_THAN_EQUAL|LESS_THAN_EQUAL)
        // from the variable ctx.joinCondition
        if (ctx.EQUAL() != null) {
            joinCondition.append(" = ");
        } 

        joinCondition.append(ctx.tableJoin.getText()).append(".");
        joinCondition.append(ctx.attrJoin.getText());


        // Add the join condition to the SQL query
        SelectStructure selectStructure = (SelectStructure) this.queryStructure;

        JoinStructure joinStructure = selectStructure.getJoins().get(selectStructure.getJoins().size() - 1);
        joinStructure.setJoinCondition(joinCondition.toString());

        return super.visitChildren(ctx);
    }
    

    public List<QueryStructure> getTransformedQueries() {
        return transformedQueries;
    }

    public void setCustomErrorListener(CustomErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    public String getTransformedQueriesAsJson() {
        List<String> stringQueries = this.transformedQueries.stream()
                .map(QueryStructure::toSQL)
                .toList();
        Gson gson = new Gson();
        return gson.toJson(stringQueries);
    }

    public List<String> getTransformedQueriesAsList() {
        return this.transformedQueries.stream()
                .map(QueryStructure::toSQL)
                .toList();
    }
    
    // Método para asignar la base de datos activa
    public void setCurrentDatabaseName(String dbName) {
        this.currentDatabaseName = dbName;
    }

    // Método para obtener el nombre de la base de datos actual
    public String getCurrentDatabaseName() {
        return this.currentDatabaseName;
    }

    // Validar si hay una base seleccionada
    public boolean currentDatabaseSelected() {
        return this.currentDatabaseName != null;
    }

}
