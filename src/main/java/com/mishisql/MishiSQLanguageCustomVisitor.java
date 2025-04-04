
package com.mishisql;

import java.util.List;
import java.util.Map;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<String> transformedQueries;
    private StringBuilder sqlQuery = new StringBuilder();

    @Override
    public Object visitSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx) {
        // TRANSFORM THE QUERY TO SQL FORMAT
        this.sqlQuery = new StringBuilder("SELECT ");
        // Get the columns to select
        List<String> columns = ctx.ALL() != null ? List.of("*")
                : ctx.ids.stream()
                        .map(column -> column.getText())
                        .toList();

        sqlQuery.append(String.join(", ", columns));

        sqlQuery.append(" FROM ").append(ctx.tableId.getText());
        // Add WHERE clause if present
        if (ctx.WHERE() != null) {
            sqlQuery.append(" WHERE ");
        }

        // Add ORDER BY clause if present
        if (ctx.ORDER() != null) {
            sqlQuery.append(" ORDER BY ").append(ctx.orderID.getText());
            if (ctx.DESC() != null) {
                sqlQuery.append(" DESC");
            } else if (ctx.ASC() != null) {
                sqlQuery.append(" ASC");
            }
        }

        System.out.println("Transformed SQL Query: " + sqlQuery.toString());

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
        sqlQuery.append(condition.toString());

        System.out.println("Transformed Query: " + sqlQuery.toString());

        // Handle the condition logic here if needed
        return super.visitChildren(ctx);
    }

}
