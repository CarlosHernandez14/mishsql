package com.mishisql.querystructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SelectStructure extends QueryStructure {
    
    private List<String> columns;
    private String tableName;
    private String orderByColumn;
    private String orderDirection;
    private String limit;
    private String offset;

    // In case of inner join, left join, right join, full join, cross join
    List<JoinStructure> joins;

    // Constructors, Getters and Setters

    public SelectStructure() {
        super(); // Call to the parent constructor
        this.joins = new ArrayList<>(); // Initialize the joins list
        this.columns = new ArrayList<>(); // Initialize the columns list
    }
    public SelectStructure(List<String> columns, String tableName, String orderByColumn, String orderDirection, String whereCondition, String limit, String offset) {
        this.columns = columns;
        this.tableName = tableName;
        this.orderByColumn = orderByColumn;
        this.orderDirection = orderDirection;
        this.whereCondition = whereCondition;
        this.limit = limit;
        this.offset = offset;
    }

    @Override
    public String toSQL(){
        StringBuilder sql = new StringBuilder("SELECT ");
        sql.append(String.join(", ", columns)).append(" FROM ").append(tableName);
        
        if (joins != null && !joins.isEmpty()) {
            for (JoinStructure join : joins) {
                sql.append(" ").append(join.toSQL());
            }
        }
        
        if (whereCondition != null && !whereCondition.isEmpty()) {
            sql.append(" WHERE ").append(whereCondition);
        }
        
        if (orderByColumn != null && !orderByColumn.isEmpty()) {
            sql.append(" ORDER BY ").append(orderByColumn).append(" ").append(orderDirection);
        }
        
        if (limit != null && !limit.isEmpty()) {
            sql.append(" LIMIT ").append(limit);
        }
        
        if (offset != null && !offset.isEmpty()) {
            sql.append(" OFFSET ").append(offset);
        }
        
        return sql.toString();
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getWhereCondition() {
        return whereCondition;
    }

    public void setWhereCondition(String whereCondition) {
        this.whereCondition = whereCondition;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public List<JoinStructure> getJoins() {
        return joins;
    }

    public void setJoins(List<JoinStructure> joins) {
        this.joins = joins;
    }

    @Override
    public String toString() {
        return "SelectStructure{" +
                "columns=" + columns +
                ", tableName='" + tableName + '\'' +
                ", orderByColumn='" + orderByColumn + '\'' +
                ", orderDirection='" + orderDirection + '\'' +
                ", whereCondition='" + whereCondition + '\'' +
                ", limit='" + limit + '\'' +
                ", offset='" + offset + '\'' +
                ", joins=" + joins +
                '}';
    }


}

