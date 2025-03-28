import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        // int x;
        // Obtenemos el primer argumento que se le pase al programa
        String filePath = "";

        try {
            filePath = args[0];
        } catch (Exception e) {
            // En caso de que no encuentre la ruta en los args cargar por defecto una
            filePath = "C:/Users/carlo/Documents/CompilersAntlr/MishiSQL/test.mishsql";
        }

        // Convertimos el archivo que se paso como argumento a un CharStream
        CharStream input = CharStreams.fromFileName(filePath);

        // Input stream from standard input (keyboard)
        // CharStream input = CharStreams.fromStream(System.in);
        mishSQLLexer lexer = new mishSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mishSQLParser parser = new mishSQLParser(tokens);

        // Add custom error listener
        // CustomErrorListener errorListener = new CustomErrorListener();
        // parser.removeErrorListeners();
        // parser.addErrorListener(errorListener);
        // // Asignamos el errorListener a la gramatica
        // parser.setCustomErrorListener(errorListener);

        parser.program();

        // System.out.println("Cantidad de doubles: " + parser.contadorIdsDouble);

        // String jsonErrors = errorListener.getErrorsAsJson();
        // System.out.println(jsonErrors);

        // // Save errors to JSON file
        // errorListener.saveErrorsToJson("errors.json");


    }
}
