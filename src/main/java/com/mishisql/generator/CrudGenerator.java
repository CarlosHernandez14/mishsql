package com.mishisql.generator;

import com.google.gson.Gson;
import com.mishisql.querystructure.CreateTableStructure;
import com.mishisql.querystructure.CreateTableStructure.ColumnDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrudGenerator {
    // JDBC connection placeholders
    private static final String JDBC_URL = "jdbc:postgresql://HOST:PORT/DATABASE";
    private static final String JDBC_USER = "USERNAME";
    private static final String JDBC_PASS = "PASSWORD";

    /**
     * Generates a Java Swing CRUD class for a given table structure.
     */
    public static String generateCrudClass(CreateTableStructure table) {
        StringBuilder sb = new StringBuilder();
        String className = capitalize(table.getTableName()) + "Crud";

        // Package and imports
        sb.append("package com.mishisql.generated;\n\n");
        sb.append("import javax.swing.*;\n");
        sb.append("import java.awt.*;\n");
        sb.append("import java.awt.event.*;\n");
        sb.append("import java.sql.*;\n\n");

        // Class signature
        sb.append("public class ").append(className).append(" extends JFrame {\n");

        // Fields for inputs
        for (ColumnDefinition col : table.getColumns()) {
            sb.append("    private JTextField ").append(col.name).append("Field;\n");
        }
        sb.append("    private JButton insertBtn, updateBtn;\n\n");

        // Constructor sets up UI
        sb.append("    public ").append(className).append("() {\n");
        sb.append("        super(\"CRUD - ").append(table.getTableName()).append("\");\n");
        sb.append("        setLayout(new GridLayout(").append(table.getColumns().size() + 1).append(", 2));\n");

        // Add labels and text fields
        for (ColumnDefinition col : table.getColumns()) {
            sb.append("        add(new JLabel(\"").append(col.name).append(":\"));\n");
            sb.append("        ").append(col.name).append("Field = new JTextField();\n");
            sb.append("        add(").append(col.name).append("Field);\n");
        }

        // Buttons
        sb.append("        insertBtn = new JButton(\"Insert\");\n");
        sb.append("        updateBtn = new JButton(\"Update\");\n");
        sb.append("        add(insertBtn);\n");
        sb.append("        add(updateBtn);\n");

        // Set default behaviors
        sb.append("        setDefaultCloseOperation(EXIT_ON_CLOSE);\n");
        sb.append("        pack(); setVisible(true);\n");

        // Action listeners
        sb.append(generateActionListener("insertBtn", table));
        sb.append(generateActionListener("updateBtn", table));

        sb.append("    }\n\n");

        // Main
        sb.append("    public static void main(String[] args) { new ").append(className).append("(); }\n");

        // Helper to capitalize
        sb.append("    private static String capitalize(String s) { return s.substring(0,1).toUpperCase() + s.substring(1); }\n");

        sb.append("}\n");
        return sb.toString();
    }

    private static String generateActionListener(String btnName, CreateTableStructure table) {
        StringBuilder sb = new StringBuilder();
        sb.append("        ").append(btnName).append(".addActionListener(e -> {\n");
        sb.append("            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS)) {\n");

        // Build SQL template
        if (btnName.equals("insertBtn")) {
            sb.append("                String sql = \"INSERT INTO ").append(table.getTableName()).append(" (");
            // columns
            List<ColumnDefinition> cols = table.getColumns();
            sb.append(String.join(",", cols.stream().map(c -> c.name).toList()));
            sb.append(") VALUES (");
            sb.append(String.join(",", cols.stream().map(c -> "?").toList()));
            sb.append(")\";\n");
        } else {
            // update: assume first column is primary key
            ColumnDefinition pk = table.getColumns().stream().filter(c -> c.isPrimaryKey).findFirst().orElse(table.getColumns().get(0));
            sb.append("                String sql = \"UPDATE ").append(table.getTableName()).append(" SET ");
            sb.append(String.join(",", table.getColumns().stream().filter(c -> !c.name.equals(pk.name)).map(c -> c.name + "=?").toList()));
            sb.append(" WHERE ").append(pk.name).append("=?\";\n");
        }

        sb.append("                PreparedStatement ps = conn.prepareStatement(sql);\n");
        // set parameters
        List<ColumnDefinition> params = table.getColumns();
        for (int i = 0; i < params.size(); i++) {
            ColumnDefinition c = params.get(i);
            sb.append("                ps.setString(").append(i+1).append(", ").append(c.name).append("Field.getText());\n");
        }
        sb.append("                ps.executeUpdate();\n");
        sb.append("                JOptionPane.showMessageDialog(null, \"Success!\");\n");
        sb.append("            } catch (SQLException ex) { ex.printStackTrace(); }\n");
        sb.append("        });\n");
        return sb.toString();
    }

    /**
     * Generates CRUD classes for all tables and returns a JSON map of classname->code
     */
    public static String generateAllJson(List<CreateTableStructure> tables) {
        Map<String, String> map = new HashMap<>();
        for (CreateTableStructure t : tables) {
            String code = generateCrudClass(t);
            String name = capitalize(t.getTableName()) + "Crud.java";
            map.put(name, code);
        }
        return new Gson().toJson(map);
    }

    public static Map<String, String> generateAllCruds(List<CreateTableStructure> tables) {
        Map<String, String> map = new HashMap<>();
        for (CreateTableStructure t : tables) {
            String code = generateCrudClass(t);
            String name = capitalize(t.getTableName()) + "Crud.java";
            map.put(name, code);
        }
        return map;
    }

    /**
     * Helper to capitalize a string (table names -> class names)
     */
    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
