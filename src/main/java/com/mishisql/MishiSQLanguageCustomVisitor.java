
package com.mishisql;

import java.util.List;
import java.util.Map;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<String> transformedQueries;

    @Override
    public Object visitSelectQuery(MishiSQLanguageParser.SelectQueryContext ctx) {
        // TRANSFORM THE QUERY TO SQL FORMAT
        StringBuilder sqlQuery = new StringBuilder("SELECT ");
        // Get the columns to select
        List<String> columns = ctx.ALL() != null ? List.of("*") : ctx.ids.stream()
                .map(column -> column.getText())
                .toList();

        sqlQuery.append(String.join(", ", columns));

        sqlQuery.append(" FROM ").append(ctx.tableId.getText());
        // Add WHERE clause if present
        if (ctx.WHERE() != null) {
            sqlQuery.append(" WHERE ").append(ctx.condition().getText());
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


        return null;
    }


}
