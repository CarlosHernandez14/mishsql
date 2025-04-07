package com.mishisql.querystructure;

import java.util.ArrayList;
import java.util.List;

public class CreateTableStructure extends QueryStructure {

    private String tableName;
    private List<ColumnDefinition> columns = new ArrayList<>();

    // Foreign key data
    private String foreignKeyField;
    private String referenceField;
    private String referenceTable;

    public static class ColumnDefinition {
        public String name;
        public String type;
        public boolean isPrimaryKey = false;
        public boolean isNotNull = false;

        public ColumnDefinition(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            List<String> parts = new ArrayList<>();
            parts.add(name + " " + type);
            if (isNotNull) parts.add("NOT NULL");
            if (isPrimaryKey) parts.add("PRIMARY KEY");
            return String.join(" ", parts);
        }
    }

    public CreateTableStructure(String tableName) {
        this.tableName = tableName;
    }

    public void addColumn(ColumnDefinition column) {
        this.columns.add(column);
    }

    public void setForeignKey(String field, String refField, String refTable) {
        this.foreignKeyField = field;
        this.referenceField = refField;
        this.referenceTable = refTable;
    }

    @Override
    public String toSQL() {
        List<String> colDefs = new ArrayList<>();
        for (ColumnDefinition col : columns) {
            colDefs.add(col.toString());
        }

        if (foreignKeyField != null) {
            colDefs.add("FOREIGN KEY (" + foreignKeyField + ") REFERENCES " + referenceTable + "(" + referenceField + ")");
        }

        return "CREATE TABLE " + tableName + " (\n  " + String.join(",\n  ", colDefs) + "\n)";
    }

    @Override
    public String toString() {
        return "CreateTableStructure{" +
                "tableName='" + tableName + '\'' +
                ", columns=" + columns +
                ", foreignKeyField='" + foreignKeyField + '\'' +
                ", referenceField='" + referenceField + '\'' +
                ", referenceTable='" + referenceTable + '\'' +
                '}';
    }
}
