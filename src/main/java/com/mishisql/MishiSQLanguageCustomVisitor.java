
package com.mishisql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mishisql.querystructure.QueryStructure;
import com.mishisql.querystructure.SelectStructure;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<QueryStructure> transformedQueries = new ArrayList<>();
    private QueryStructure queryStructure;

    // Map to store the table name and its structure
    private Map<String, List<String>> tableStructure;

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
