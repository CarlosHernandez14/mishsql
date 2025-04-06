package com.mishisql.querystructure;

public class UseDatabaseStructure extends QueryStructure {
    private String databaseName;

    public UseDatabaseStructure(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toSQL() {
        return "USE " + databaseName;
    }

    @Override
    public String toString() {
        return "UseDatabaseStructure{" +
                "databaseName='" + databaseName + '\'' +
                '}';
    }
}
