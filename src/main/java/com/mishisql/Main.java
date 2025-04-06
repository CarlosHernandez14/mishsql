package com.mishisql;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.mishisql.exceptionhandling.CustomErrorListener;

public class Main {

    private static final String EXTENSION = "mishisql";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length == 0 ? new String[] { "test." + EXTENSION } : args;
        // System.out.println("Dirbase: " + DIRBASE);
        for (String file : files) {
            // System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            MishiSQLanguageLexer lexer = new MishiSQLanguageLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MishiSQLanguageParser parser = new MishiSQLanguageParser(tokens);

            // Set  a Custom Error Listener
            CustomErrorListener errorListener = new CustomErrorListener();
            parser.removeErrorListeners(); // Remove default ConsoleErrorListener
            parser.addErrorListener(errorListener);
            

            MishiSQLanguageParser.StartContext tree = parser.start();
            MishiSQLanguageCustomVisitor visitor = new MishiSQLanguageCustomVisitor();

            // Set the custom error listener to the visitor for semantic error handling
            visitor.setCustomErrorListener(errorListener);

            visitor.visit(tree);


            ResponseDTO responseDTO = new ResponseDTO(visitor.getTransformedQueries(), errorListener.getErrors());

            System.out.println(responseDTO.getReponseAsJson());
            // visitor.getTransformedQueries().forEach(query -> {
            //     System.out.println("Transformed Query: " + query.toSQL());
            // });

            // System.out.println("FINISH: " + file);
        }
    }
}
