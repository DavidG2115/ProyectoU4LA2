
package proyectounidad2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.io.StringBufferInputStream;
//import java.lang.System.Logger;
//import java.util.logging.Level;
//import java.lang.System.Logger.Level;
import javax.swing.JTextArea;
import java.util.logging.*;
import javax.swing.JOptionPane;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


/**
 *
 * @author garcd
 */
public class GUI extends javax.swing.JFrame {
    private final Conexion conexion;
    private boolean gramaticaValida = false;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        conexion = new Conexion();
        //conexion.getConexion();
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        
        //Salida de Texto no editable
        taSalidasql.setEditable(false);
        taSalida.setEditable(false);
        taJava.setEditable(false);
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEntrada = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taSalidasql = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taSalida = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taJava = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO ALTO NIVEL");

        taEntrada.setColumns(20);
        taEntrada.setRows(5);
        jScrollPane1.setViewportView(taEntrada);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Compilar");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RESULTADO SQL");

        taSalidasql.setColumns(20);
        taSalidasql.setRows(5);
        jScrollPane4.setViewportView(taSalidasql);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AZL-removebg-preview.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/419660.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/585602.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Limpiar");

        taSalida.setColumns(20);
        taSalida.setRows(5);
        jScrollPane2.setViewportView(taSalida);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTRUCTURA BASE DE DATOS");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENVIAR A SQL");

        taJava.setColumns(20);
        taJava.setRows(5);
        jScrollPane3.setViewportView(taJava);

        jButton4.setText("Generar Codigo Java");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Copear codigo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(53, 53, 53)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35)
                        .addComponent(jButton5)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (gramaticaValida) {
            try {
                // Si la conexión no está establecida, establecerla
                if (conexion.getConexion() == null) {
                    conexion.getConexion(); // Establecer la conexión
                }

                // Obtener el código SQL del área de texto
                String codigoSQL = taSalidasql.getText().replaceAll("\\r?\\n", "");

                // Ejecutar el código SQL
                conexion.ejecutarSQL(codigoSQL);

                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Código SQL ejecutado correctamente y enviado a la base de datos");
            } catch (Exception e) {
                // Manejar errores
                JOptionPane.showMessageDialog(this, "Error al ejecutar el código SQL: " + e.getMessage());
            }
        } else {
            // La gramática no es válida, mostrar un mensaje al usuario o realizar otra acción
            JOptionPane.showMessageDialog(this, "La gramática no es válida. Por favor, corrija los errores antes de enviar a SQL.");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        //taEntrada.setText("");  // Limpiar el texto de taEntrada
        taSalida.setText("");   // Limpiar el texto de taSalida
        taSalidasql.setText(""); // Limpiar el texto de taSalidasql
        taJava.setText("");
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        gramaticaValida = false;
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ANTLRInputStream input = null;

        String s = taEntrada.getText();
        StringBufferInputStream str = new StringBufferInputStream(s);

        try {
            input = new ANTLRInputStream(str);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        TLexer lexer = new TLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TParser parser = new TParser(tokens);
        parser.setSalida(taSalida);
        parser.setSalidasql(taSalidasql);

        try {
            parser.inicio();
            gramaticaValida = true; // Análisis exitoso
        } catch (RecognitionException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            gramaticaValida = false;
        }

        jButton1.setEnabled(gramaticaValida); // Habilitar/deshabilitar el botón según la gramática
        jButton4.setEnabled(gramaticaValida);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        if (gramaticaValida) {
            String text = taSalida.getText();
            String dbName = "";
            String[] lines = text.split("\n");
            for (String line : lines) {
                if (line.startsWith("Base de datos actual: ")) {
                    dbName = line.substring("Base de datos actual: ".length()).trim();
                    if (dbName.endsWith(";")) {
                        dbName = dbName.substring(0, dbName.length() - 1);
                    }
                    break;
                }
            }
            if (dbName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontró el nombre de la base de datos en el texto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            String javaCode = 
                "package pruebasjava;\n" +
                "import java.awt.GridLayout;\n" +
                "import javax.swing.BorderFactory;\n" +
                "import javax.swing.JPanel;\n" +
                "import javax.swing.JTextField;\n" +
                "import javax.swing.JFrame;\n" +
                "import javax.swing.JLabel;\n" +
                "import javax.swing.JButton;\n" +
                "import javax.swing.JOptionPane;\n" +
                "import java.awt.event.ActionEvent;\n" +
                "import java.awt.event.ActionListener;\n" +
                "import java.sql.Connection;\n" +
                "import java.sql.DriverManager;\n" +
                "import java.sql.PreparedStatement;\n" +
                "import java.sql.SQLException;\n" +
                "import java.util.logging.Level;\n" +
                "import java.util.logging.Logger;\n" +
                "\n" +
                "public class Principal {\n" +
                "    public static void main(String args[]) {\n" +
                "        try {\n" +
                "            final Connection connection;\n" +
                "            connection = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/" + dbName + "\", \"root\", \"admin\");\n";

            String tableName = "";
            int tableCount = 0;
            int attributeCount = 0;
            String attributeNames = "";
            for (String line : lines) {
                if (line.startsWith("Nombre de la tabla")) {
                    if (tableCount > 0) {
                        javaCode += "                JButton btn" + tableCount + " = new JButton(\"Agregar\");\n";
                        javaCode += "                btn" + tableCount + ".addActionListener(new ActionListener() {\n";
                        javaCode += "                    @Override\n";
                        javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
                        for (int i = 1; i <= attributeCount; i++) {
                            javaCode += "                        String atributo" + i + " = tf" + tableCount + i + ".getText();\n";
                        }
                        javaCode += "                        try {\n";
                        javaCode += "                            String query = \"INSERT INTO " + tableName + " (" + attributeNames + ") VALUES (";
                        for (int i = 1; i <= attributeCount; i++) {
                            javaCode += "?";
                            if (i < attributeCount) {
                                javaCode += ", ";
                            }
                        }
                        javaCode += ")\";\n";
                        javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
                        for (int i = 1; i <= attributeCount; i++) {
                            javaCode += "                            preparedStmt.setString(" + i + ", atributo" + i + ");\n";
                        }
                        javaCode += "                            preparedStmt.execute();\n";
                        javaCode += "                            JOptionPane.showMessageDialog(null, \"Inserción exitosa\");\n";
                        javaCode += "                        } catch (SQLException ex) {\n";
                        javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
                        javaCode += "                            JOptionPane.showMessageDialog(null, \"Error en la inserción: \" + ex.getMessage(), \"Error\", JOptionPane.ERROR_MESSAGE);\n";
                        javaCode += "                        }\n";
                        javaCode += "                    }\n";
                        javaCode += "                });\n";
                        javaCode += "                JButton btnEliminar" + tableCount + " = new JButton(\"Eliminar todo\");\n";
                        javaCode += "                btnEliminar" + tableCount + ".addActionListener(new ActionListener() {\n";
                        javaCode += "                    @Override\n";
                        javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
                        javaCode += "                        try {\n";
                        javaCode += "                            String query = \"DELETE FROM " + tableName + "\";\n";
                        javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
                        javaCode += "                            preparedStmt.execute();\n";
                        javaCode += "                            JOptionPane.showMessageDialog(null, \"Eliminación exitosa\");\n";
                        javaCode += "                        } catch (SQLException ex) {\n";
                        javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
                        javaCode += "                            JOptionPane.showMessageDialog(null, \"Error en la eliminación: \" + ex.getMessage(), \"Error\", JOptionPane.ERROR_MESSAGE);\n";
                        javaCode += "                        }\n";
                        javaCode += "                    }\n";
                        javaCode += "                });\n";
                        javaCode += "                panel" + tableCount + ".add(btnEliminar" + tableCount + ");\n";
                        javaCode += "                panel" + tableCount + ".add(btn" + tableCount + ");\n";
                        javaCode += "                v" + tableCount + ".add(panel" + tableCount + ");\n";
                        javaCode += "                v" + tableCount + ".pack();\n";
                        javaCode += "                v" + tableCount + ".setLocationRelativeTo(null);\n";
                        javaCode += "                v" + tableCount + ".setVisible(true);\n";
                    }
                    tableCount++;
                    attributeCount = 0;
                    attributeNames = "";
                    tableName = line.substring("Nombre de la tabla: ".length());
                    javaCode += "            JFrame v" + tableCount + " = new JFrame(\"" + tableName + "\");\n";
                    javaCode += "            v" + tableCount + ".setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
                    javaCode += "            v" + tableCount + ".setSize(600,400);\n";
                    javaCode += "            JPanel panel" + tableCount + " = new JPanel();\n";
                    javaCode += "            panel" + tableCount + ".setLayout(new GridLayout(0,2,10,10));\n";
                    javaCode += "            panel" + tableCount + ".setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));\n";
                } else if (line.startsWith("Atributo: ")) {
                    attributeCount++;
                    String attributeName = line.substring("Atributo: ".length(), line.indexOf("Tipo de Atributo:") - 1);
                    javaCode += "            JLabel lbl" + tableCount + attributeCount + " = new JLabel(\"" + attributeName + "\");\n";
                    javaCode += "            panel" + tableCount + ".add(lbl" + tableCount + attributeCount + ");\n";
                    javaCode += "            JTextField tf" + tableCount + attributeCount + " = new JTextField();\n";
                    javaCode += "            panel" + tableCount + ".add(tf" + tableCount + attributeCount + ");\n";
                    if (attributeCount == 1) {
                        attributeNames += attributeName;
                    } else {
                        attributeNames += ", " + attributeName;
                    }
                }
            }

            javaCode += "                JButton btn" + tableCount + " = new JButton(\"Agregar\");\n";
            javaCode += "                btn" + tableCount + ".addActionListener(new ActionListener() {\n";
            javaCode += "                    @Override\n";
            javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
            for (int i = 1; i <= attributeCount; i++) {
                javaCode += "                        String atributo" + i + " = tf" + tableCount + i + ".getText();\n";
            }
            javaCode += "                        try {\n";
            javaCode += "                            String query = \"INSERT INTO " + tableName + " (" + attributeNames + ") VALUES (";
            for (int i = 1; i <= attributeCount; i++) {
                javaCode += "?";
                if (i < attributeCount) {
                    javaCode += ", ";
                }
            }
            javaCode += ")\";\n";
            javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
            for (int i = 1; i <= attributeCount; i++) {
                javaCode += "                            preparedStmt.setString(" + i + ", atributo" + i + ");\n";
            }
            javaCode += "                            preparedStmt.execute();\n";
            javaCode += "                            JOptionPane.showMessageDialog(null, \"Inserción exitosa\");\n";
            javaCode += "                        } catch (SQLException ex) {\n";
            javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
            javaCode += "                            JOptionPane.showMessageDialog(null, \"Error en la inserción: \" + ex.getMessage(), \"Error\", JOptionPane.ERROR_MESSAGE);\n";
            javaCode += "                        }\n";
            javaCode += "                    }\n";
            javaCode += "                });\n";
            javaCode += "                JButton btnEliminar" + tableCount + " = new JButton(\"Eliminar todo\");\n";
            javaCode += "                btnEliminar" + tableCount + ".addActionListener(new ActionListener() {\n";
            javaCode += "                    @Override\n";
            javaCode += "                    public void actionPerformed(ActionEvent e) {\n";
            javaCode += "                        try {\n";
            javaCode += "                            String query = \"DELETE FROM " + tableName + "\";\n";
            javaCode += "                            PreparedStatement preparedStmt = connection.prepareStatement(query);\n";
            javaCode += "                            preparedStmt.execute();\n";
            javaCode += "                            JOptionPane.showMessageDialog(null, \"Eliminación exitosa\");\n";
            javaCode += "                        } catch (SQLException ex) {\n";
            javaCode += "                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
            javaCode += "                            JOptionPane.showMessageDialog(null, \"Error en la eliminación: \" + ex.getMessage(), \"Error\", JOptionPane.ERROR_MESSAGE);\n";
            javaCode += "                        }\n";
            javaCode += "                    }\n";
            javaCode += "                });\n";
            javaCode += "                panel" + tableCount + ".add(btnEliminar" + tableCount + ");\n";
            javaCode += "                panel" + tableCount + ".add(btn" + tableCount + ");\n";
            javaCode += "                v" + tableCount + ".add(panel" + tableCount + ");\n";
            javaCode += "                v" + tableCount + ".pack();\n";
            javaCode += "                v" + tableCount + ".setLocationRelativeTo(null);\n";
            javaCode += "                v" + tableCount + ".setVisible(true);\n";
            javaCode += "        } catch (SQLException ex) {\n";
            javaCode += "            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);\n";
            javaCode += "            JOptionPane.showMessageDialog(null, \"Error al conectar con la base de datos: \" + ex.getMessage(), \"Error\", JOptionPane.ERROR_MESSAGE);\n";
            javaCode += "        }\n";
            javaCode += "    }\n";
            javaCode += "}\n";

            taJava.setText(javaCode);
        } else {
            // La gramática no es válida, mostrar un mensaje al usuario o realizar otra acción
            JOptionPane.showMessageDialog(this, "La gramática no es válida. Por favor, corrija los errores.");
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /// Obtener el texto del JTextArea
        String textoACopiar = taJava.getText();

        // Copiar el texto al portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(textoACopiar);
        clipboard.setContents(selection, null);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea taEntrada;
    private javax.swing.JTextArea taJava;
    private javax.swing.JTextArea taSalida;
    private javax.swing.JTextArea taSalidasql;
    // End of variables declaration//GEN-END:variables
}
