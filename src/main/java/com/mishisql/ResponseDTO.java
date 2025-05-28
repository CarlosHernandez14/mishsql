package com.mishisql;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        Gson gson = new GsonBuilder()
            .disableHtmlEscaping()  // para que no convierta '>' en \u003e, etc.
            // .setPrettyPrinting()    // para que meta saltos de línea y espacios _fuera_ de los literales
            .create();
        return gson.toJson(this);
    }
}
