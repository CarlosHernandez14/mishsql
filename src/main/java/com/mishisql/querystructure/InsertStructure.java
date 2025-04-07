package com.mishisql.querystructure;

import java.util.ArrayList;
import java.util.List;

public class InsertStructure extends QueryStructure {
    
    private String tableName;
    private List<List<String>> rows = new ArrayList<>();

    public InsertStructure(String tableName) {
        this.tableName = tableName;
    }

    public void addRow(List<String> row) {
        rows.add(row);
    }

    public String getTableName() {
        return tableName;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    @Override
    public String toSQL() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(tableName).append(" VALUES ");
        for (int i = 0; i < rows.size(); i++) {
            sb.append("(");
            List<String> row = rows.get(i);
            sb.append(String.join(", ", row));
            sb.append(")");
            if (i < rows.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "InsertStructure{" +
                "tableName='" + tableName + '\'' +
                ", rows=" + rows +
                '}';
    }
}
