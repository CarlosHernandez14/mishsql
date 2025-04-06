package com.mishisql.querystructure;

public class CreateDatabaseStructure extends QueryStructure{
    
    private String databaseName;

    public CreateDatabaseStructure(String databaseName) {
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
        return "CREATE DATABASE " + databaseName;
    }

    @Override
    public String toString() {
        return "CreateDatabaseStructure{" +
                "databaseName='" + databaseName + '\'' +
                '}';
    }
}
