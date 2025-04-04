package com.mishisql.querystructure;

import java.util.List;
import java.util.Map;

public class JoinStructure {

    private String joinType; // INNER, LEFT, RIGHT, FULL, CROSS
    private String tableName;
    private String joinCondition;


    // Constructors, Getters and Setters
    public JoinStructure(String joinType, String tableName, String joinCondition) {
        this.joinType = joinType;
        this.tableName = tableName;
        this.joinCondition = joinCondition;
    }
    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType;
    }
    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getJoinCondition() {
        return joinCondition;
    }
    public void setJoinCondition(String joinCondition) {
        this.joinCondition = joinCondition;
    }
    @Override
    public String toString() {
        return "JoinStructure{" +
                "joinType='" + joinType + '\'' +
                ", tableName='" + tableName + '\'' +
                ", joinCondition='" + joinCondition + '\'' +
                '}';
    }
    public String toSQL() {
        return joinType + " JOIN " + tableName + " ON " + joinCondition;
    }
    public String toSQL(String tableAlias) {
        return joinType + " JOIN " + tableName + " AS " + tableAlias + " ON " + joinCondition;
    }

}
