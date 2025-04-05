package com.mishisql.querystructure;

import java.util.UUID;

public abstract class QueryStructure {

    protected UUID id;
    protected String whereCondition; // Condition for the query

    // Constructors, Getters and Setters
    public QueryStructure() {
        this.id = UUID.randomUUID(); // Generate a unique ID for each query structure
    }

    public QueryStructure(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getWhereCondition() {
        return whereCondition;
    }

    public void setWhereCondition(String whereCondition) {
        this.whereCondition = whereCondition;
    }

    @Override
    public String toString() {
        return "QueryStructure{" +
                "id=" + id +
                ", whereCondition='" + whereCondition + '\'' +
                '}';
    }

    // Method to convert the query structure to SQL format
    public abstract String toSQL(); // Abstract method to be implemented by subclasses

}
