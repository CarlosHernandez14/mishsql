
package com.mishisql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.mishisql.exceptionhandling.CustomErrorListener;
import com.mishisql.querystructure.JoinStructure;
import com.mishisql.querystructure.QueryStructure;
import com.mishisql.querystructure.SelectStructure;

public class MishiSQLanguageCustomVisitor extends MishiSQLanguageBaseVisitor<Object> {

    // List of transformed queries to SQL format
    private List<QueryStructure> transformedQueries = new ArrayList<>();
    private QueryStructure queryStructure;

    // Map to store the table name and its structure
    private Map<String, List<String>> tableStructure;

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

}
