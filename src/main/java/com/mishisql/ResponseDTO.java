package com.mishisql;

import java.util.List;

import com.google.gson.Gson;
import com.mishisql.exceptionhandling.CustomErrorListener.CompilerError;
import com.mishisql.querystructure.QueryStructure;

public class ResponseDTO {
    private List<String> transformedQueries;

    private List<CompilerError> errors;

    public ResponseDTO(List<String> transformedQueries, List<CompilerError> errors) {
        this.transformedQueries = transformedQueries;
        this.errors = errors;
    }

    public String getReponseAsJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
