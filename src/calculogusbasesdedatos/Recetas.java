package calculogusbasesdedatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Recetas extends javax.swing.JFrame {

    String titulos[] = {"Princ. Activo", "GUS", "EIQ", "Momento Aplicacion"};

    public String matrizReceta1[][] = new String[20][4];
    public String matrizReceta2[][] = new String[20][4];
    public String matrizReceta3[][] = new String[20][4];
    public String matrizReceta4[][] = new String[20][4];

    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    
    PreparedStatement ps;
    ResultSet rs;

    public Recetas(String[][] contRecetas1, String[][] contRecetas2, String[][] contRecetas3, String[][] contRecetas4, int contador5, int contador6, int contador7, int contador8) {
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel dtm2 = new DefaultTableModel();
        DefaultTableModel dtm3 = new DefaultTableModel();
        DefaultTableModel dtm4 = new DefaultTableModel();
        DefaultTableModel dtm5 = new DefaultTableModel();

        tblReceta1.setModel(dtm2);
        tblReceta2.setModel(dtm3);
        tblReceta3.setModel(dtm4);
        tblReceta4.setModel(dtm5);

        dtm2.setColumnIdentifiers(titulos);
        dtm3.setColumnIdentifiers(titulos);
        dtm4.setColumnIdentifiers(titulos);
        dtm5.setColumnIdentifiers(titulos);

        matrizReceta1 = contRecetas1;
        matrizReceta2 = contRecetas2;
        matrizReceta3 = contRecetas3;
        matrizReceta4 = contRecetas4;

        contador1 = contador5;
        contador2 = contador6;
        contador3 = contador7;
        contador4 = contador8;

        for (int i = 0; i < contador1; i++) {
            dtm2.addRow(matrizReceta1[i]);
        }
        for (int i = 0; i < contador2; i++) {
            dtm3.addRow(matrizReceta2[i]);
        }
        for (int i = 0; i < contador3; i++) {
            dtm4.addRow(matrizReceta3[i]);
        }
        for (int i = 0; i < contador4; i++) {
            dtm5.addRow(matrizReceta4[i]);
        }

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReceta1 = new javax.swing.JLabel();
        lblCalculo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceta1 = new javax.swing.JTable();
        lblReceta2 = new javax.swing.JLabel();
        lblCalculo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceta2 = new javax.swing.JTable();
        lblReceta3 = new javax.swing.JLabel();
        lblCalculo3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReceta3 = new javax.swing.JTable();
        lblReceta4 = new javax.swing.JLabel();
        lblCalculo4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReceta4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(692, 672));
        setMinimumSize(new java.awt.Dimension(692, 672));
        setPreferredSize(new java.awt.Dimension(692, 672));
        setSize(new java.awt.Dimension(692, 672));
        getContentPane().setLayout(null);

        lblReceta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReceta1.setText("Receta 1");
        getContentPane().add(lblReceta1);
        lblReceta1.setBounds(540, 10, 90, 30);

        lblCalculo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCalculo1.setText("x");
        getContentPane().add(lblCalculo1);
        lblCalculo1.setBounds(540, 50, 90, 30);

        tblReceta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblReceta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 520, 140);

        lblReceta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReceta2.setText("Receta 2");
        getContentPane().add(lblReceta2);
        lblReceta2.setBounds(540, 160, 90, 30);

        lblCalculo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCalculo2.setText("x");
        getContentPane().add(lblCalculo2);
        lblCalculo2.setBounds(540, 200, 90, 30);

        tblReceta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblReceta2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 520, 140);

        lblReceta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReceta3.setText("Receta 3");
        getContentPane().add(lblReceta3);
        lblReceta3.setBounds(540, 310, 90, 30);

        lblCalculo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCalculo3.setText("x");
        getContentPane().add(lblCalculo3);
        lblCalculo3.setBounds(540, 350, 90, 30);

        tblReceta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblReceta3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 310, 520, 140);

        lblReceta4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReceta4.setText("Receta 4");
        getContentPane().add(lblReceta4);
        lblReceta4.setBounds(540, 460, 90, 30);

        lblCalculo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCalculo4.setText("x");
        getContentPane().add(lblCalculo4);
        lblCalculo4.setBounds(540, 500, 90, 30);

        tblReceta4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblReceta4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 460, 520, 140);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 580, 63, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCalculo1;
    private javax.swing.JLabel lblCalculo2;
    private javax.swing.JLabel lblCalculo3;
    private javax.swing.JLabel lblCalculo4;
    private javax.swing.JLabel lblReceta1;
    private javax.swing.JLabel lblReceta2;
    private javax.swing.JLabel lblReceta3;
    private javax.swing.JLabel lblReceta4;
    private javax.swing.JTable tblReceta1;
    private javax.swing.JTable tblReceta2;
    private javax.swing.JTable tblReceta3;
    private javax.swing.JTable tblReceta4;
    // End of variables declaration//GEN-END:variables
}
