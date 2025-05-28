package com.mishisql;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.mishisql.exceptionhandling.CustomErrorListener.CompilerError;
import com.mishisql.querystructure.QueryStructure;

public class ResponseDTO {
    private List<String> transformedQueries;

    private List<CompilerError> errors;

    private Map<String, String> cruds;

    public ResponseDTO(List<String> transformedQueries, List<CompilerError> errors, Map<String, String> cruds) {
        this.transformedQueries = transformedQueries;
        this.errors = errors;
        this.cruds = cruds;
    }

    public String getReponseAsJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
