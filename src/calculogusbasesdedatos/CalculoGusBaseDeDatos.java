/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculogusbasesdedatos;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juank
 */
public class CalculoGusBaseDeDatos extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    double gus;
    double vidaMedia;
    double koc;
    String contReceta1[][] = new String[20][5];
    String contReceta2[][] = new String[20][5];
    String contReceta3[][] = new String[20][5];
    String contReceta4[][] = new String[20][5];
    String titulos[] = {"Princ. Activo", "GUS", "EIQ", "Momento Aplicacion", "Dosis"};
    String valor[] = new String[5];
    String eiq;
    String momentoApl;
    String dosis;
    int receta = 0;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;

    DefaultListModel modelo1 = new DefaultListModel();
    DefaultTableModel dtm1 = new DefaultTableModel();

    public CalculoGusBaseDeDatos() {
        initComponents();

        this.setLocationRelativeTo(this);

        desplegar("");
        pnlInfoColores.setVisible(false);
        pnlGus.setVisible(false);

    }

    public double calculoGus(double vM, double k) {

        double gus = Math.log10(vM) * (4 - Math.log10(k));
        return gus;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblPI1 = new javax.swing.JLabel();
        lblPI2 = new javax.swing.JLabel();
        txtPrincipio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPrincipioActivo = new javax.swing.JList<>();
        pnlDatos = new javax.swing.JPanel();
        lblGus = new javax.swing.JLabel();
        lblResultadoGus = new javax.swing.JLabel();
        lblVidaMedia = new javax.swing.JLabel();
        lblResultadoVidaMedia = new javax.swing.JLabel();
        lblKOC = new javax.swing.JLabel();
        lblResultadoKoc = new javax.swing.JLabel();
        lblToxDermal = new javax.swing.JLabel();
        lblResultadoToxicidadDermal = new javax.swing.JLabel();
        lblDT = new javax.swing.JLabel();
        lblToxAves = new javax.swing.JLabel();
        lblResultadoToxicidadAves = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblToxPeces = new javax.swing.JLabel();
        lblResultadoToxicidadPeces = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblToxAbejas = new javax.swing.JLabel();
        lblResultadoToxicidadAbejas = new javax.swing.JLabel();
        lblZ = new javax.swing.JLabel();
        lblToxLombrices = new javax.swing.JLabel();
        lblResultadoToxicidadLombrices = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        pnlGus = new javax.swing.JPanel();
        lblTaMal1 = new javax.swing.JLabel();
        lblTaMal2 = new javax.swing.JLabel();
        lblTaMal3 = new javax.swing.JLabel();
        lblTaMal4 = new javax.swing.JLabel();
        lblTaMal5 = new javax.swing.JLabel();
        lblTaMal6 = new javax.swing.JLabel();
        lblTaMal7 = new javax.swing.JLabel();
        lblTaMal8 = new javax.swing.JLabel();
        lblTaMal9 = new javax.swing.JLabel();
        lblTaMal10 = new javax.swing.JLabel();
        lblTaMal11 = new javax.swing.JLabel();
        lblTaMal12 = new javax.swing.JLabel();
        lblTaMal13 = new javax.swing.JLabel();
        lblTaMal14 = new javax.swing.JLabel();
        lblTaMal15 = new javax.swing.JLabel();
        lblTaMal16 = new javax.swing.JLabel();
        lblTaMal17 = new javax.swing.JLabel();
        lblTaMal18 = new javax.swing.JLabel();
        lblTaMal19 = new javax.swing.JLabel();
        lblTaMal20 = new javax.swing.JLabel();
        pnlInfoColores = new javax.swing.JPanel();
        lblTaMal = new javax.swing.JLabel();
        lblTaMasoMenos = new javax.swing.JLabel();
        lblTaBien = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();
        pnlMasDatos = new javax.swing.JPanel();
        lblTipoPlagu = new javax.swing.JLabel();
        lblDatoTipoPlagu = new javax.swing.JLabel();
        lblGrupoQCO = new javax.swing.JLabel();
        lblDatoGrupoCQO = new javax.swing.JLabel();
        lblModoAccion = new javax.swing.JLabel();
        lblDatoModoAccion = new javax.swing.JLabel();
        lblMasaMolec = new javax.swing.JLabel();
        lblDatoMasaMolec = new javax.swing.JLabel();
        lblSolubH2O = new javax.swing.JLabel();
        lblDatoSolubH2O = new javax.swing.JLabel();
        lblFusion = new javax.swing.JLabel();
        lblDatoFusion = new javax.swing.JLabel();
        lblEbullicion = new javax.swing.JLabel();
        lblDatoEbullicion = new javax.swing.JLabel();
        lblDegradacion = new javax.swing.JLabel();
        lblDatoDegradacion = new javax.swing.JLabel();
        lblKow = new javax.swing.JLabel();
        lblDatoKow = new javax.swing.JLabel();
        lblPka = new javax.swing.JLabel();
        lblDatoPka = new javax.swing.JLabel();
        lblPresionVapor = new javax.swing.JLabel();
        lblDatoPresionVapor = new javax.swing.JLabel();
        lblKh = new javax.swing.JLabel();
        lblDatoKh = new javax.swing.JLabel();
        lblDtAgua = new javax.swing.JLabel();
        lblDatoDtAgua = new javax.swing.JLabel();
        lblSensPH = new javax.swing.JLabel();
        lblDatoSensPH = new javax.swing.JLabel();
        lblBfc = new javax.swing.JLabel();
        lblDatoBfc = new javax.swing.JLabel();
        lblCt = new javax.swing.JLabel();
        lblDatoCt = new javax.swing.JLabel();
        lblToxAcuatica = new javax.swing.JLabel();
        lblDatoToxAcuatica = new javax.swing.JLabel();
        lblDl50IA = new javax.swing.JLabel();
        lblDatoDl50IA = new javax.swing.JLabel();
        lblNoelRatas = new javax.swing.JLabel();
        lblDatoNoelRatas = new javax.swing.JLabel();
        lblInhalacion = new javax.swing.JLabel();
        lblDatoInhalacion = new javax.swing.JLabel();
        lblIda = new javax.swing.JLabel();
        lblDatoIda = new javax.swing.JLabel();
        lblArfd = new javax.swing.JLabel();
        lblDatoArfd = new javax.swing.JLabel();
        lblAoel = new javax.swing.JLabel();
        lblDatoAoel = new javax.swing.JLabel();
        lblCarcinogen = new javax.swing.JLabel();
        lblDatoCarcinogen = new javax.swing.JLabel();
        lblMutagen = new javax.swing.JLabel();
        lblDatoMutagen = new javax.swing.JLabel();
        lblEndocrineDisrupter = new javax.swing.JLabel();
        lblDatoEndocrineDisrupter = new javax.swing.JLabel();
        lblRDE = new javax.swing.JLabel();
        lblDatoRDE = new javax.swing.JLabel();
        lblCholinesteraseInhibidor = new javax.swing.JLabel();
        lblDatoCholinesteraseInhibidor = new javax.swing.JLabel();
        lblNeurotoxicant = new javax.swing.JLabel();
        lblDatoNeurotoxicant = new javax.swing.JLabel();
        lblRespirantTractIrritant = new javax.swing.JLabel();
        lblDatoRespirantTractIrritant = new javax.swing.JLabel();
        lblSkinIrritant = new javax.swing.JLabel();
        lblDatoSkinIrritant = new javax.swing.JLabel();
        lblSkinSensitiser = new javax.swing.JLabel();
        lblDatoSkinSensitiser = new javax.swing.JLabel();
        lblEyeIrritant = new javax.swing.JLabel();
        lblDatoEyeIrritant = new javax.swing.JLabel();
        lblPhototoxicant = new javax.swing.JLabel();
        lblDatoPhototoxicant = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrincipios = new javax.swing.JTable();
        btnAgregarFila = new javax.swing.JButton();
        btnQuitarFila = new javax.swing.JButton();
        cmbRecetas = new javax.swing.JComboBox<>();
        lblSelecReceta = new javax.swing.JLabel();
        btnMostrarReceta = new javax.swing.JButton();
        btnMostrarEIQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("DATOS POR PRINCIPIO ACTIVO");
        lblTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(470, 30, 390, 60);

        lblPI1.setBackground(new java.awt.Color(255, 255, 255));
        lblPI1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPI1.setText("Seleccione/Ingrese un");
        lblPI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPI1.setOpaque(true);
        getContentPane().add(lblPI1);
        lblPI1.setBounds(10, 140, 140, 20);

        lblPI2.setBackground(new java.awt.Color(255, 255, 255));
        lblPI2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPI2.setText("Principio Activo");
        lblPI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPI2.setOpaque(true);
        getContentPane().add(lblPI2);
        lblPI2.setBounds(10, 160, 140, 20);

        txtPrincipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrincipioKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrincipio);
        txtPrincipio.setBounds(10, 190, 170, 30);

        lstPrincipioActivo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPrincipioActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstPrincipioActivo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPrincipioActivoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPrincipioActivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 170, 160);

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatos.setLayout(null);

        lblGus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGus.setText("Gus");
        pnlDatos.add(lblGus);
        lblGus.setBounds(10, 10, 90, 20);

        lblResultadoGus.setBackground(new java.awt.Color(255, 255, 255));
        lblResultadoGus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResultadoGus.setText("X");
        lblResultadoGus.setOpaque(true);
        lblResultadoGus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResultadoGusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResultadoGusMouseExited(evt);
            }
        });
        pnlDatos.add(lblResultadoGus);
        lblResultadoGus.setBounds(140, 10, 150, 20);

        lblVidaMedia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVidaMedia.setText("Vida Media");
        pnlDatos.add(lblVidaMedia);
        lblVidaMedia.setBounds(10, 70, 90, 20);

        lblResultadoVidaMedia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoVidaMedia.setText("-");
        pnlDatos.add(lblResultadoVidaMedia);
        lblResultadoVidaMedia.setBounds(140, 70, 90, 20);

        lblKOC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblKOC.setText("KOC");
        pnlDatos.add(lblKOC);
        lblKOC.setBounds(10, 40, 90, 20);

        lblResultadoKoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoKoc.setText("-");
        pnlDatos.add(lblResultadoKoc);
        lblResultadoKoc.setBounds(140, 40, 90, 22);

        lblToxDermal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToxDermal.setText("Tox. Dermal");
        pnlDatos.add(lblToxDermal);
        lblToxDermal.setBounds(10, 120, 110, 20);

        lblResultadoToxicidadDermal.setBackground(new java.awt.Color(255, 255, 255));
        lblResultadoToxicidadDermal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoToxicidadDermal.setText("-");
        lblResultadoToxicidadDermal.setOpaque(true);
        pnlDatos.add(lblResultadoToxicidadDermal);
        lblResultadoToxicidadDermal.setBounds(140, 120, 90, 20);

        lblDT.setBackground(new java.awt.Color(255, 255, 255));
        lblDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDT.setText("-");
        lblDT.setOpaque(true);
        lblDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDTMouseExited(evt);
            }
        });
        pnlDatos.add(lblDT);
        lblDT.setBounds(260, 120, 90, 20);

        lblToxAves.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToxAves.setText("Tox. Aves");
        pnlDatos.add(lblToxAves);
        lblToxAves.setBounds(10, 150, 110, 20);

        lblResultadoToxicidadAves.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoToxicidadAves.setText("-");
        pnlDatos.add(lblResultadoToxicidadAves);
        lblResultadoToxicidadAves.setBounds(140, 150, 90, 20);

        lblD.setBackground(new java.awt.Color(255, 255, 255));
        lblD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblD.setText("-");
        lblD.setOpaque(true);
        lblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDMouseExited(evt);
            }
        });
        pnlDatos.add(lblD);
        lblD.setBounds(260, 150, 90, 20);

        lblToxPeces.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToxPeces.setText("Tox. Peces");
        pnlDatos.add(lblToxPeces);
        lblToxPeces.setBounds(10, 180, 110, 20);

        lblResultadoToxicidadPeces.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoToxicidadPeces.setText("-");
        pnlDatos.add(lblResultadoToxicidadPeces);
        lblResultadoToxicidadPeces.setBounds(140, 180, 90, 20);

        lblF.setBackground(new java.awt.Color(255, 255, 255));
        lblF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblF.setText("-");
        lblF.setOpaque(true);
        lblF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFMouseExited(evt);
            }
        });
        pnlDatos.add(lblF);
        lblF.setBounds(260, 180, 90, 20);

        lblToxAbejas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToxAbejas.setText("Tox. Abejas");
        pnlDatos.add(lblToxAbejas);
        lblToxAbejas.setBounds(10, 210, 110, 20);

        lblResultadoToxicidadAbejas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoToxicidadAbejas.setText("-");
        pnlDatos.add(lblResultadoToxicidadAbejas);
        lblResultadoToxicidadAbejas.setBounds(140, 210, 90, 20);

        lblZ.setBackground(new java.awt.Color(255, 255, 255));
        lblZ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblZ.setText("-");
        lblZ.setOpaque(true);
        lblZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblZMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblZMouseExited(evt);
            }
        });
        pnlDatos.add(lblZ);
        lblZ.setBounds(260, 210, 90, 20);

        lblToxLombrices.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblToxLombrices.setText("Tox. Lombrices");
        pnlDatos.add(lblToxLombrices);
        lblToxLombrices.setBounds(10, 240, 120, 20);

        lblResultadoToxicidadLombrices.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultadoToxicidadLombrices.setText("-");
        pnlDatos.add(lblResultadoToxicidadLombrices);
        lblResultadoToxicidadLombrices.setBounds(140, 240, 90, 20);

        lblB.setBackground(new java.awt.Color(255, 255, 255));
        lblB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblB.setText("-");
        lblB.setOpaque(true);
        lblB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBMouseExited(evt);
            }
        });
        pnlDatos.add(lblB);
        lblB.setBounds(260, 240, 90, 20);

        getContentPane().add(pnlDatos);
        pnlDatos.setBounds(190, 120, 380, 260);

        pnlGus.setBackground(new java.awt.Color(255, 255, 255));
        pnlGus.setLayout(null);

        lblTaMal1.setBackground(new java.awt.Color(255, 255, 51));
        lblTaMal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal1.setOpaque(true);
        pnlGus.add(lblTaMal1);
        lblTaMal1.setBounds(0, 60, 60, 20);

        lblTaMal2.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal2.setText("MUY ALTO");
        lblTaMal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal2.setOpaque(true);
        pnlGus.add(lblTaMal2);
        lblTaMal2.setBounds(120, 120, 250, 20);

        lblTaMal3.setBackground(new java.awt.Color(255, 0, 0));
        lblTaMal3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal3.setOpaque(true);
        pnlGus.add(lblTaMal3);
        lblTaMal3.setBounds(0, 100, 60, 20);

        lblTaMal4.setBackground(new java.awt.Color(255, 153, 0));
        lblTaMal4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal4.setOpaque(true);
        pnlGus.add(lblTaMal4);
        lblTaMal4.setBounds(0, 80, 60, 20);

        lblTaMal5.setBackground(new java.awt.Color(255, 51, 255));
        lblTaMal5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal5.setOpaque(true);
        pnlGus.add(lblTaMal5);
        lblTaMal5.setBounds(0, 120, 60, 20);

        lblTaMal6.setBackground(new java.awt.Color(0, 255, 0));
        lblTaMal6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal6.setOpaque(true);
        pnlGus.add(lblTaMal6);
        lblTaMal6.setBounds(0, 40, 60, 20);

        lblTaMal7.setBackground(new java.awt.Color(102, 255, 255));
        lblTaMal7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal7.setOpaque(true);
        pnlGus.add(lblTaMal7);
        lblTaMal7.setBounds(0, 20, 60, 20);

        lblTaMal8.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal8.setText("GUS");
        lblTaMal8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal8.setOpaque(true);
        pnlGus.add(lblTaMal8);
        lblTaMal8.setBounds(60, 0, 60, 20);

        lblTaMal9.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal9.setText("< 1.0");
        lblTaMal9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal9.setOpaque(true);
        pnlGus.add(lblTaMal9);
        lblTaMal9.setBounds(60, 20, 60, 20);

        lblTaMal10.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal10.setText("0,1 - 1");
        lblTaMal10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal10.setOpaque(true);
        pnlGus.add(lblTaMal10);
        lblTaMal10.setBounds(60, 40, 60, 20);

        lblTaMal11.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal11.setText("1 - 2");
        lblTaMal11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal11.setOpaque(true);
        pnlGus.add(lblTaMal11);
        lblTaMal11.setBounds(60, 60, 60, 20);

        lblTaMal12.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal12.setText("2 - 3");
        lblTaMal12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal12.setOpaque(true);
        pnlGus.add(lblTaMal12);
        lblTaMal12.setBounds(60, 80, 60, 20);

        lblTaMal13.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal13.setText("3 - 4");
        lblTaMal13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal13.setOpaque(true);
        pnlGus.add(lblTaMal13);
        lblTaMal13.setBounds(60, 100, 60, 20);

        lblTaMal14.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal14.setText("> 4");
        lblTaMal14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal14.setOpaque(true);
        pnlGus.add(lblTaMal14);
        lblTaMal14.setBounds(60, 120, 60, 20);

        lblTaMal15.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal15.setText("RIESGO DE CONTAMINACION");
        lblTaMal15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal15.setOpaque(true);
        pnlGus.add(lblTaMal15);
        lblTaMal15.setBounds(120, 0, 250, 20);

        lblTaMal16.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal16.setText("EXTREMADAMENTE BAJO");
        lblTaMal16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal16.setOpaque(true);
        pnlGus.add(lblTaMal16);
        lblTaMal16.setBounds(120, 20, 250, 20);

        lblTaMal17.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal17.setText("MUY BAJO");
        lblTaMal17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal17.setOpaque(true);
        pnlGus.add(lblTaMal17);
        lblTaMal17.setBounds(120, 40, 250, 20);

        lblTaMal18.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal18.setText("BAJO");
        lblTaMal18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal18.setOpaque(true);
        pnlGus.add(lblTaMal18);
        lblTaMal18.setBounds(120, 60, 250, 20);

        lblTaMal19.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal19.setText("MODERADO");
        lblTaMal19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal19.setOpaque(true);
        pnlGus.add(lblTaMal19);
        lblTaMal19.setBounds(120, 80, 250, 20);

        lblTaMal20.setBackground(new java.awt.Color(255, 255, 255));
        lblTaMal20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaMal20.setText("ALTO");
        lblTaMal20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal20.setOpaque(true);
        pnlGus.add(lblTaMal20);
        lblTaMal20.setBounds(120, 100, 250, 20);

        getContentPane().add(pnlGus);
        pnlGus.setBounds(590, 130, 370, 140);

        pnlInfoColores.setLayout(null);

        lblTaMal.setBackground(new java.awt.Color(255, 0, 0));
        lblTaMal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMal.setOpaque(true);
        pnlInfoColores.add(lblTaMal);
        lblTaMal.setBounds(0, 30, 100, 20);

        lblTaMasoMenos.setBackground(new java.awt.Color(255, 255, 51));
        lblTaMasoMenos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaMasoMenos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaMasoMenos.setOpaque(true);
        pnlInfoColores.add(lblTaMasoMenos);
        lblTaMasoMenos.setBounds(0, 50, 100, 20);

        lblTaBien.setBackground(new java.awt.Color(102, 255, 102));
        lblTaBien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaBien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTaBien.setOpaque(true);
        pnlInfoColores.add(lblTaBien);
        lblTaBien.setBounds(0, 70, 100, 20);

        lblDato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInfoColores.add(lblDato);
        lblDato.setBounds(30, 0, 40, 20);

        getContentPane().add(pnlInfoColores);
        pnlInfoColores.setBounds(590, 280, 100, 90);

        pnlMasDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlMasDatos.setMaximumSize(new java.awt.Dimension(320, 100));
        pnlMasDatos.setMinimumSize(new java.awt.Dimension(320, 100));
        pnlMasDatos.setPreferredSize(new java.awt.Dimension(320, 100));
        pnlMasDatos.setLayout(null);

        lblTipoPlagu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipoPlagu.setText("Tipo Plagu.");
        pnlMasDatos.add(lblTipoPlagu);
        lblTipoPlagu.setBounds(0, 0, 110, 20);

        lblDatoTipoPlagu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoTipoPlagu.setText("-");
        pnlMasDatos.add(lblDatoTipoPlagu);
        lblDatoTipoPlagu.setBounds(130, 0, 190, 20);

        lblGrupoQCO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGrupoQCO.setText("Grupo QCO");
        pnlMasDatos.add(lblGrupoQCO);
        lblGrupoQCO.setBounds(0, 20, 110, 20);

        lblDatoGrupoCQO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoGrupoCQO.setText("-");
        pnlMasDatos.add(lblDatoGrupoCQO);
        lblDatoGrupoCQO.setBounds(130, 20, 190, 20);

        lblModoAccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModoAccion.setText("Modo Accion");
        pnlMasDatos.add(lblModoAccion);
        lblModoAccion.setBounds(0, 40, 110, 20);

        lblDatoModoAccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoModoAccion.setText("-");
        pnlMasDatos.add(lblDatoModoAccion);
        lblDatoModoAccion.setBounds(130, 40, 190, 20);

        lblMasaMolec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMasaMolec.setText("Masa Molec.");
        pnlMasDatos.add(lblMasaMolec);
        lblMasaMolec.setBounds(0, 60, 110, 20);

        lblDatoMasaMolec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoMasaMolec.setText("-");
        pnlMasDatos.add(lblDatoMasaMolec);
        lblDatoMasaMolec.setBounds(130, 60, 190, 20);

        lblSolubH2O.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSolubH2O.setText("Solub. H2O");
        pnlMasDatos.add(lblSolubH2O);
        lblSolubH2O.setBounds(0, 80, 120, 20);

        lblDatoSolubH2O.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoSolubH2O.setText("-");
        pnlMasDatos.add(lblDatoSolubH2O);
        lblDatoSolubH2O.setBounds(130, 80, 190, 20);

        lblFusion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFusion.setText("Fusion");
        pnlMasDatos.add(lblFusion);
        lblFusion.setBounds(0, 100, 110, 20);

        lblDatoFusion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoFusion.setText("-");
        pnlMasDatos.add(lblDatoFusion);
        lblDatoFusion.setBounds(130, 100, 190, 20);

        lblEbullicion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEbullicion.setText("Ebullicion");
        pnlMasDatos.add(lblEbullicion);
        lblEbullicion.setBounds(0, 120, 110, 20);

        lblDatoEbullicion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoEbullicion.setText("-");
        pnlMasDatos.add(lblDatoEbullicion);
        lblDatoEbullicion.setBounds(130, 120, 190, 20);

        lblDegradacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDegradacion.setText("Degradacion");
        pnlMasDatos.add(lblDegradacion);
        lblDegradacion.setBounds(0, 140, 110, 20);

        lblDatoDegradacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoDegradacion.setText("-");
        pnlMasDatos.add(lblDatoDegradacion);
        lblDatoDegradacion.setBounds(130, 140, 190, 20);

        lblKow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblKow.setText("Kow");
        pnlMasDatos.add(lblKow);
        lblKow.setBounds(0, 160, 110, 20);

        lblDatoKow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoKow.setText("-");
        pnlMasDatos.add(lblDatoKow);
        lblDatoKow.setBounds(130, 160, 190, 20);

        lblPka.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPka.setText("Pka");
        pnlMasDatos.add(lblPka);
        lblPka.setBounds(0, 180, 110, 20);

        lblDatoPka.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoPka.setText("-");
        pnlMasDatos.add(lblDatoPka);
        lblDatoPka.setBounds(130, 180, 190, 20);

        lblPresionVapor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPresionVapor.setText("Presion Vapor mPa");
        pnlMasDatos.add(lblPresionVapor);
        lblPresionVapor.setBounds(0, 200, 160, 20);

        lblDatoPresionVapor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoPresionVapor.setText("-");
        pnlMasDatos.add(lblDatoPresionVapor);
        lblDatoPresionVapor.setBounds(130, 200, 190, 20);

        lblKh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblKh.setText("kh 20 gc");
        pnlMasDatos.add(lblKh);
        lblKh.setBounds(0, 220, 110, 20);

        lblDatoKh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoKh.setText("-");
        pnlMasDatos.add(lblDatoKh);
        lblDatoKh.setBounds(130, 220, 190, 20);

        lblDtAgua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDtAgua.setText("Dt50 Agua");
        pnlMasDatos.add(lblDtAgua);
        lblDtAgua.setBounds(0, 240, 120, 20);

        lblDatoDtAgua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoDtAgua.setText("-");
        pnlMasDatos.add(lblDatoDtAgua);
        lblDatoDtAgua.setBounds(130, 240, 190, 20);

        lblSensPH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSensPH.setText("Sens. PH");
        pnlMasDatos.add(lblSensPH);
        lblSensPH.setBounds(0, 260, 110, 20);

        lblDatoSensPH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoSensPH.setText("-");
        pnlMasDatos.add(lblDatoSensPH);
        lblDatoSensPH.setBounds(130, 260, 190, 20);

        lblBfc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBfc.setText("bfc");
        pnlMasDatos.add(lblBfc);
        lblBfc.setBounds(0, 280, 110, 20);

        lblDatoBfc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoBfc.setText("-");
        pnlMasDatos.add(lblDatoBfc);
        lblDatoBfc.setBounds(130, 280, 190, 20);

        lblCt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCt.setText("ct50");
        pnlMasDatos.add(lblCt);
        lblCt.setBounds(0, 300, 110, 20);

        lblDatoCt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoCt.setText("-");
        pnlMasDatos.add(lblDatoCt);
        lblDatoCt.setBounds(130, 300, 190, 20);

        lblToxAcuatica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblToxAcuatica.setText("Toxicidad Acuatica");
        pnlMasDatos.add(lblToxAcuatica);
        lblToxAcuatica.setBounds(0, 320, 110, 20);

        lblDatoToxAcuatica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoToxAcuatica.setText("-");
        pnlMasDatos.add(lblDatoToxAcuatica);
        lblDatoToxAcuatica.setBounds(130, 320, 190, 20);

        lblDl50IA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDl50IA.setText("dl50 invert. acuat.");
        pnlMasDatos.add(lblDl50IA);
        lblDl50IA.setBounds(0, 340, 110, 20);

        lblDatoDl50IA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoDl50IA.setText("-");
        pnlMasDatos.add(lblDatoDl50IA);
        lblDatoDl50IA.setBounds(130, 340, 190, 20);

        lblNoelRatas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNoelRatas.setText("Noel Ratas");
        pnlMasDatos.add(lblNoelRatas);
        lblNoelRatas.setBounds(0, 360, 110, 20);

        lblDatoNoelRatas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoNoelRatas.setText("-");
        pnlMasDatos.add(lblDatoNoelRatas);
        lblDatoNoelRatas.setBounds(130, 360, 190, 20);

        lblInhalacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInhalacion.setText("Inhalacion");
        pnlMasDatos.add(lblInhalacion);
        lblInhalacion.setBounds(0, 380, 120, 20);

        lblDatoInhalacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoInhalacion.setText("-");
        pnlMasDatos.add(lblDatoInhalacion);
        lblDatoInhalacion.setBounds(130, 380, 190, 20);

        lblIda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIda.setText("Ida");
        pnlMasDatos.add(lblIda);
        lblIda.setBounds(0, 400, 110, 20);

        lblDatoIda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoIda.setText("-");
        pnlMasDatos.add(lblDatoIda);
        lblDatoIda.setBounds(130, 400, 190, 20);

        lblArfd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblArfd.setText("Arfd");
        pnlMasDatos.add(lblArfd);
        lblArfd.setBounds(0, 420, 110, 20);

        lblDatoArfd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoArfd.setText("-");
        pnlMasDatos.add(lblDatoArfd);
        lblDatoArfd.setBounds(130, 420, 190, 20);

        lblAoel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAoel.setText("Aoel");
        pnlMasDatos.add(lblAoel);
        lblAoel.setBounds(0, 440, 110, 20);

        lblDatoAoel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoAoel.setText("-");
        pnlMasDatos.add(lblDatoAoel);
        lblDatoAoel.setBounds(130, 440, 190, 20);

        lblCarcinogen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCarcinogen.setText("Carcinogen");
        pnlMasDatos.add(lblCarcinogen);
        lblCarcinogen.setBounds(0, 460, 110, 20);

        lblDatoCarcinogen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoCarcinogen.setText("-");
        pnlMasDatos.add(lblDatoCarcinogen);
        lblDatoCarcinogen.setBounds(130, 460, 190, 20);

        lblMutagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMutagen.setText("Mutagen");
        pnlMasDatos.add(lblMutagen);
        lblMutagen.setBounds(0, 480, 110, 20);

        lblDatoMutagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoMutagen.setText("-");
        pnlMasDatos.add(lblDatoMutagen);
        lblDatoMutagen.setBounds(130, 480, 190, 20);

        lblEndocrineDisrupter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEndocrineDisrupter.setText("Endocrine Disrupter");
        pnlMasDatos.add(lblEndocrineDisrupter);
        lblEndocrineDisrupter.setBounds(0, 500, 120, 20);

        lblDatoEndocrineDisrupter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoEndocrineDisrupter.setText("-");
        pnlMasDatos.add(lblDatoEndocrineDisrupter);
        lblDatoEndocrineDisrupter.setBounds(130, 500, 190, 20);

        lblRDE.setText("Reprod. develop. effects");
        pnlMasDatos.add(lblRDE);
        lblRDE.setBounds(0, 520, 130, 20);

        lblDatoRDE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoRDE.setText("-");
        pnlMasDatos.add(lblDatoRDE);
        lblDatoRDE.setBounds(130, 520, 190, 20);

        lblCholinesteraseInhibidor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCholinesteraseInhibidor.setText("Cholinesterase inhibidor");
        pnlMasDatos.add(lblCholinesteraseInhibidor);
        lblCholinesteraseInhibidor.setBounds(0, 540, 127, 20);

        lblDatoCholinesteraseInhibidor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoCholinesteraseInhibidor.setText("-");
        pnlMasDatos.add(lblDatoCholinesteraseInhibidor);
        lblDatoCholinesteraseInhibidor.setBounds(130, 540, 190, 20);

        lblNeurotoxicant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNeurotoxicant.setText("Neurotoxicant");
        pnlMasDatos.add(lblNeurotoxicant);
        lblNeurotoxicant.setBounds(0, 560, 110, 20);

        lblDatoNeurotoxicant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoNeurotoxicant.setText("-");
        pnlMasDatos.add(lblDatoNeurotoxicant);
        lblDatoNeurotoxicant.setBounds(130, 560, 190, 20);

        lblRespirantTractIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRespirantTractIrritant.setText("Respirant tract. irritant");
        pnlMasDatos.add(lblRespirantTractIrritant);
        lblRespirantTractIrritant.setBounds(0, 580, 130, 20);

        lblDatoRespirantTractIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoRespirantTractIrritant.setText("-");
        pnlMasDatos.add(lblDatoRespirantTractIrritant);
        lblDatoRespirantTractIrritant.setBounds(130, 580, 190, 20);

        lblSkinIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSkinIrritant.setText("Skin Rritant");
        pnlMasDatos.add(lblSkinIrritant);
        lblSkinIrritant.setBounds(0, 600, 110, 20);

        lblDatoSkinIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoSkinIrritant.setText("-");
        pnlMasDatos.add(lblDatoSkinIrritant);
        lblDatoSkinIrritant.setBounds(130, 600, 160, 20);

        lblSkinSensitiser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSkinSensitiser.setText("Skin Sensitiser");
        pnlMasDatos.add(lblSkinSensitiser);
        lblSkinSensitiser.setBounds(0, 620, 110, 20);

        lblDatoSkinSensitiser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoSkinSensitiser.setText("-");
        pnlMasDatos.add(lblDatoSkinSensitiser);
        lblDatoSkinSensitiser.setBounds(130, 620, 160, 20);

        lblEyeIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEyeIrritant.setText("EyeIrritant");
        pnlMasDatos.add(lblEyeIrritant);
        lblEyeIrritant.setBounds(0, 640, 110, 20);

        lblDatoEyeIrritant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoEyeIrritant.setText("-");
        pnlMasDatos.add(lblDatoEyeIrritant);
        lblDatoEyeIrritant.setBounds(130, 640, 160, 20);

        lblPhototoxicant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPhototoxicant.setText("Phototoxicant");
        pnlMasDatos.add(lblPhototoxicant);
        lblPhototoxicant.setBounds(0, 660, 110, 20);

        lblDatoPhototoxicant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDatoPhototoxicant.setText("-");
        pnlMasDatos.add(lblDatoPhototoxicant);
        lblDatoPhototoxicant.setBounds(130, 660, 160, 20);

        getContentPane().add(pnlMasDatos);
        pnlMasDatos.setBounds(1030, 10, 320, 680);

        tblPrincipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblPrincipios);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 440, 620, 220);

        btnAgregarFila.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarFila.setText("Agregar Fila");
        btnAgregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarFila);
        btnAgregarFila.setBounds(640, 440, 220, 40);

        btnQuitarFila.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuitarFila.setText("Quitar Fila Seleccionada");
        btnQuitarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitarFila);
        btnQuitarFila.setBounds(640, 490, 220, 40);

        cmbRecetas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cmbRecetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receta 1", "Receta 2", "Receta 3", "Receta 4" }));
        cmbRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRecetasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRecetas);
        cmbRecetas.setBounds(10, 400, 130, 30);

        lblSelecReceta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSelecReceta.setText("Seleccione una receta");
        getContentPane().add(lblSelecReceta);
        lblSelecReceta.setBounds(160, 400, 150, 30);

        btnMostrarReceta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarReceta.setText("Mostrar Recetas");
        btnMostrarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarReceta);
        btnMostrarReceta.setBounds(640, 630, 220, 25);

        btnMostrarEIQ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarEIQ.setText("Mostrar EIQ");
        btnMostrarEIQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEIQActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarEIQ);
        btnMostrarEIQ.setBounds(640, 600, 220, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstPrincipioActivoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPrincipioActivoValueChanged

        String pr;
        int ind;
        boolean datoInvalido = false;
        double gusCalculado = 0;
        double toxicidadDermal = 0;
        double toxicidadPeces = 0;
        double toxicidadAves = 0;
        double toxicidadAbejas = 0;
        double toxicidadLombrices = 0;
        lblResultadoGus.setText("");
        ind = lstPrincipioActivo.getSelectedIndex();

        tblPrincipios.setModel(dtm1);
        dtm1.setColumnIdentifiers(titulos);

        if (ind != -1) { // verifico que hay un elemento seleccionado
            pr = lstPrincipioActivo.getSelectedValue().toString();

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bddgus", "root", "");

                if (pr.equals("")) { //Cargo todos los principios activos si no se colocaron caracteres de búsqueda en el txtPrincipio
                    ps = con.prepareStatement("select * from principios_activos");
                } else {  //Cargo sólo los que comienzan con los caracteres seleccionadps
                    ps = con.prepareStatement("select * from principios_activos where principio_activo = '" + pr + "'");
                }

                rs = ps.executeQuery();

                if (rs.next()) {

                    //datos que van en el panel
                    lblResultadoVidaMedia.setText(rs.getString(15));
                    lblResultadoKoc.setText(rs.getString(17));
                    lblResultadoToxicidadDermal.setText(rs.getString(29));
                    lblResultadoToxicidadAves.setText(rs.getString(24));
                    lblResultadoToxicidadPeces.setText(rs.getString(25));
                    lblResultadoToxicidadAbejas.setText(rs.getString(22));
                    lblResultadoToxicidadLombrices.setText(rs.getString(27));

                    //datos que van a la derecha del todo
                    lblDatoTipoPlagu.setText(rs.getString(3));
                    lblDatoGrupoCQO.setText(rs.getString(4));
                    lblDatoModoAccion.setText(rs.getString(5));
                    lblDatoMasaMolec.setText(rs.getString(6));
                    lblDatoSolubH2O.setText(rs.getString(7));
                    lblDatoFusion.setText(rs.getString(8));
                    lblDatoEbullicion.setText(rs.getString(9));
                    lblDatoDegradacion.setText(rs.getString(10));
                    lblDatoKow.setText(rs.getString(11));
                    lblDatoPka.setText(rs.getString(12));
                    lblDatoPresionVapor.setText(rs.getString(13));
                    lblDatoKh.setText(rs.getString(14));
                    lblDatoDtAgua.setText(rs.getString(16));
                    lblDatoSensPH.setText(rs.getString(18));
                    lblDatoBfc.setText(rs.getString(19));
                    lblDatoCt.setText(rs.getString(20));
                    lblDatoToxAcuatica.setText(rs.getString(21));
                    lblDatoDl50IA.setText(rs.getString(26));
                    lblDatoNoelRatas.setText(rs.getString(28));
                    lblDatoInhalacion.setText(rs.getString(30));
                    lblDatoIda.setText(rs.getString(31));
                    lblDatoArfd.setText(rs.getString(32));
                    lblDatoAoel.setText(rs.getString(33));
                    lblDatoCarcinogen.setText(rs.getString(34));
                    lblDatoMutagen.setText(rs.getString(35));
                    lblDatoEndocrineDisrupter.setText(rs.getString(36));
                    lblDatoRDE.setText(rs.getString(37));
                    lblDatoCholinesteraseInhibidor.setText(rs.getString(38));
                    lblDatoNeurotoxicant.setText(rs.getString(39));
                    lblDatoRespirantTractIrritant.setText(rs.getString(40));
                    lblDatoSkinIrritant.setText(rs.getString(41));
                    lblDatoSkinSensitiser.setText(rs.getString(42));
                    lblDatoEyeIrritant.setText(rs.getString(43));
                    lblDatoPhototoxicant.setText(rs.getString(44));

                    valor[0] = pr;

                }

//me aseguro que hay algún valor seleccionado en la lista de principios Activos
                if (ind != -1) {
                    //Me aseguro que los datos son numéricos
                    if (esNumero(rs.getString(17))) {
                        koc = Double.parseDouble(rs.getString(17));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(15))) {
                        vidaMedia = Double.parseDouble(rs.getString(15));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(29))) {
                        toxicidadDermal = Double.parseDouble(rs.getString(29));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(24))) {
                        toxicidadAves = Double.parseDouble(rs.getString(24));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(25))) {
                        toxicidadPeces = Double.parseDouble(rs.getString(25));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(22))) {
                        toxicidadAbejas = Double.parseDouble(rs.getString(22));
                    } else {
                        datoInvalido = true;
                    }
                    if (esNumero(rs.getString(27))) {
                        toxicidadLombrices = Double.parseDouble(rs.getString(27));
                    } else {
                        datoInvalido = true;
                    }
                }
            } catch (SQLException ex) {
                System.out.println("error de carga en la base de datos. " + ex.getMessage());
            }

            if (!datoInvalido) {
                gusCalculado = calculoGus(vidaMedia, koc);

                if (gusCalculado == 0) {
                    lblResultadoGus.setText("0");
                    valor[1] = "0";
                } else {

                    lblResultadoGus.setText(String.valueOf(gusCalculado));
                    valor[1] = Double.toString(gusCalculado);
                }

                //Coloreada de GUS
                if (gusCalculado < 0.1) {
                    lblResultadoGus.setBackground(Color.CYAN);
                } else if (gusCalculado > 0.1 && gusCalculado < 1) {
                    lblResultadoGus.setBackground(Color.GREEN);
                }
                if (gusCalculado > 1 && gusCalculado < 2) {
                    lblResultadoGus.setBackground(Color.YELLOW);
                } else if (gusCalculado > 2 && gusCalculado < 3) {
                    lblResultadoGus.setBackground(Color.ORANGE);
                } else if (gusCalculado > 3 && gusCalculado < 4) {
                    lblResultadoGus.setBackground(Color.red);
                } else if (gusCalculado > 4) {
                    lblResultadoGus.setBackground(Color.magenta);
                }

                //calculo DT Dermal
                if (toxicidadDermal < 200) {
                    lblDT.setBackground(Color.red);
                    lblDT.setText("5");
                } else if (toxicidadDermal >= 200 && toxicidadDermal < 2000) {
                    lblDT.setBackground(Color.yellow);
                    lblDT.setText("3");
                } else if (toxicidadDermal >= 2000) {
                    lblDT.setBackground(Color.GREEN);
                    lblDT.setText("1");
                }

                //calculo D Aves
                if (toxicidadAves <= 100) {
                    lblD.setBackground(Color.red);
                    lblD.setText("5");
                } else if (toxicidadAves <= 1000) {
                    lblD.setBackground(Color.YELLOW);
                    lblD.setText("3");
                } else if (toxicidadAves > 1000) {
                    lblD.setBackground(Color.GREEN);
                    lblD.setText("1");
                }

                //Calculo F Peces
                if (toxicidadPeces <= 1) {
                    lblF.setBackground(Color.red);
                    lblF.setText("5");
                } else if (toxicidadPeces <= 10) {
                    lblF.setBackground(Color.YELLOW);
                    lblF.setText("3");
                } else if (toxicidadPeces > 10) {
                    lblF.setBackground(Color.GREEN);
                    lblF.setText("1");
                }

                //Calculo Z Abejas
                if (toxicidadAbejas <= 2) {
                    lblZ.setBackground(Color.red);
                    lblZ.setText("5");
                } else if (toxicidadAbejas <= 11) {
                    lblZ.setBackground(Color.YELLOW);
                    lblZ.setText("3");
                } else if (toxicidadAbejas > 11) {
                    lblZ.setBackground(Color.GREEN);
                    lblZ.setText("1");
                }

                //Calculo B Lombrices
                if (toxicidadLombrices <= 200) {
                    lblB.setBackground(Color.red);
                    lblB.setText("5");
                } else if (toxicidadLombrices <= 800) {
                    lblB.setBackground(Color.YELLOW);
                    lblB.setText("3");
                } else if (toxicidadLombrices > 800) {
                    lblB.setBackground(Color.GREEN);
                    lblB.setText("1");
                }
            }
        }

    }//GEN-LAST:event_lstPrincipioActivoValueChanged

    private void txtPrincipioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipioKeyReleased
        desplegar(txtPrincipio.getText());
    }//GEN-LAST:event_txtPrincipioKeyReleased

    private void lblDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDTMouseEntered
        pnlInfoColores.setVisible(true);
        lblTaBien.setText("1 > 2000");
        lblTaMasoMenos.setText("3 <= 2000");
        lblTaMal.setText("5 <= 200");
        lblDato.setText("DT");
    }//GEN-LAST:event_lblDTMouseEntered

    private void lblDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDTMouseExited
        pnlInfoColores.setVisible(false);
    }//GEN-LAST:event_lblDTMouseExited

    private void lblDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseEntered
        pnlInfoColores.setVisible(true);
        lblTaBien.setText("1 > 1000");
        lblTaMasoMenos.setText("3 <= 1000");
        lblTaMal.setText("5 <= 100");
        lblDato.setText("D");
    }//GEN-LAST:event_lblDMouseEntered

    private void lblDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseExited
        pnlInfoColores.setVisible(false);
    }//GEN-LAST:event_lblDMouseExited

    private void lblFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFMouseEntered
        pnlInfoColores.setVisible(true);
        lblTaBien.setText("1 > 10");
        lblTaMasoMenos.setText("3 <= 10");
        lblTaMal.setText("5 <= 1");
        lblDato.setText("F");
    }//GEN-LAST:event_lblFMouseEntered

    private void lblFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFMouseExited
        pnlInfoColores.setVisible(false);
    }//GEN-LAST:event_lblFMouseExited

    private void lblZMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblZMouseEntered
        pnlInfoColores.setVisible(true);
        lblTaBien.setText("1 > 11");
        lblTaMasoMenos.setText("3 <= 11");
        lblTaMal.setText("5 <= 2");
        lblDato.setText("Z");
    }//GEN-LAST:event_lblZMouseEntered

    private void lblZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblZMouseExited
        pnlInfoColores.setVisible(false);
    }//GEN-LAST:event_lblZMouseExited

    private void lblBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseEntered
        pnlInfoColores.setVisible(true);
        lblTaBien.setText("1 > 800");
        lblTaMasoMenos.setText("3 <= 800");
        lblTaMal.setText("5 <= 200");
        lblDato.setText("B");
    }//GEN-LAST:event_lblBMouseEntered

    private void lblBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseExited
        pnlInfoColores.setVisible(false);
    }//GEN-LAST:event_lblBMouseExited

    private void lblResultadoGusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResultadoGusMouseEntered
        pnlGus.setVisible(true);
    }//GEN-LAST:event_lblResultadoGusMouseEntered

    private void lblResultadoGusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResultadoGusMouseExited
        pnlGus.setVisible(false);
    }//GEN-LAST:event_lblResultadoGusMouseExited

    private void btnQuitarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarFilaActionPerformed

        int seleccionado = tblPrincipios.getSelectedRow();

        if (seleccionado > -1) {
            for (int i = seleccionado; i < contador1 - 1; i++) {
                contReceta1[i] = contReceta1[i + 1];
            }
            contador1--;
            dtm1.removeRow(tblPrincipios.getSelectedRow());

        }


    }//GEN-LAST:event_btnQuitarFilaActionPerformed

    private void btnAgregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFilaActionPerformed

        DatosDeLaTabla pasar = new DatosDeLaTabla();
        pasar.setVisible(true);

        valor[2] = eiq;
        valor[3] = momentoApl;
        valor[4] = dosis;

        switch (receta) {
            case 0:

                contReceta1[contador1][0] = valor[0];
                contReceta1[contador1][1] = valor[1];
                contReceta1[contador1][2] = valor[2];
                contReceta1[contador1][3] = valor[3];
                contReceta1[contador1][4] = valor[4];
                contador1++;
                dtm1.addRow(valor);

                break;
            case 1:

                contReceta2[contador2][0] = valor[0];
                contReceta2[contador2][1] = valor[1];
                contReceta2[contador2][2] = valor[2];
                contReceta2[contador2][3] = valor[3];
                contReceta2[contador2][4] = valor[4];
                contador2++;
                dtm1.addRow(valor);

                break;
            case 2:

                contReceta3[contador3][0] = valor[0];
                contReceta3[contador3][1] = valor[1];
                contReceta3[contador3][2] = valor[2];
                contReceta3[contador3][3] = valor[3];
                contReceta3[contador3][4] = valor[4];
                contador3++;
                dtm1.addRow(valor);

                break;
            case 3:

                contReceta4[contador4][0] = valor[0];
                contReceta4[contador4][1] = valor[1];
                contReceta4[contador4][2] = valor[2];
                contReceta4[contador4][3] = valor[3];
                contReceta4[contador4][4] = valor[4];
                contador4++;
                dtm1.addRow(valor);

                break;

        }

    }//GEN-LAST:event_btnAgregarFilaActionPerformed

    private void cmbRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRecetasActionPerformed
        receta = cmbRecetas.getSelectedIndex();
        dtm1.setRowCount(0);

        switch (receta) {
            case 0:
                for (int i = 0; i < contador1; i++) {
                    dtm1.addRow(contReceta1[i]);
                }
                break;
            case 1:
                for (int i = 0; i < contador2; i++) {
                    dtm1.addRow(contReceta2[i]);
                }
                break;
            case 2:
                for (int i = 0; i < contador3; i++) {
                    dtm1.addRow(contReceta3[i]);
                }
                break;
            case 3:
                for (int i = 0; i < contador4; i++) {
                    dtm1.addRow(contReceta4[i]);
                }
                break;
        }
    }//GEN-LAST:event_cmbRecetasActionPerformed

    private void btnMostrarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecetaActionPerformed
        new Recetas(contReceta1, contReceta2, contReceta3, contReceta4, contador1, contador2, contador3, contador4).setVisible(true);

    }//GEN-LAST:event_btnMostrarRecetaActionPerformed

    private void btnMostrarEIQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEIQActionPerformed
        EiqFormu pasar = new EiqFormu();
        pasar.setVisible(true);
    }//GEN-LAST:event_btnMostrarEIQActionPerformed

    private void desplegar(String principio) {

        modelo1.clear();

        lstPrincipioActivo.setModel(modelo1);
        lblResultadoVidaMedia.setText("-");
        lblResultadoKoc.setText("-");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bddgus", "root", "");
            Statement comando = con.createStatement();

            if (principio.equals("")) { //Cargo todos los principios activos si no se colocaron caracteres de búsqueda en el txtPrincipio
                ps = con.prepareStatement("select * from principios_activos");
            } else {  //Cargo sólo los que comienzan con los caracteres seleccionadps
                ps = con.prepareStatement("select * from principios_activos where principio_activo like '" + principio + "%'");//
            }

            rs = ps.executeQuery();

            while (rs.next()) {

                modelo1.addElement(rs.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println("error de carga en la base de datos. " + ex.getMessage());

        }

        lstPrincipioActivo.setModel(modelo1);

    }

    public boolean esNumero(String cadena) {
        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

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
            java.util.logging.Logger.getLogger(CalculoGusBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoGusBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoGusBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoGusBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoGusBaseDeDatos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFila;
    private javax.swing.JButton btnMostrarEIQ;
    private javax.swing.JButton btnMostrarReceta;
    private javax.swing.JButton btnQuitarFila;
    private javax.swing.JComboBox<String> cmbRecetas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAoel;
    private javax.swing.JLabel lblArfd;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblBfc;
    private javax.swing.JLabel lblCarcinogen;
    private javax.swing.JLabel lblCholinesteraseInhibidor;
    private javax.swing.JLabel lblCt;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblDatoAoel;
    private javax.swing.JLabel lblDatoArfd;
    private javax.swing.JLabel lblDatoBfc;
    private javax.swing.JLabel lblDatoCarcinogen;
    private javax.swing.JLabel lblDatoCholinesteraseInhibidor;
    private javax.swing.JLabel lblDatoCt;
    private javax.swing.JLabel lblDatoDegradacion;
    private javax.swing.JLabel lblDatoDl50IA;
    private javax.swing.JLabel lblDatoDtAgua;
    private javax.swing.JLabel lblDatoEbullicion;
    private javax.swing.JLabel lblDatoEndocrineDisrupter;
    private javax.swing.JLabel lblDatoEyeIrritant;
    private javax.swing.JLabel lblDatoFusion;
    private javax.swing.JLabel lblDatoGrupoCQO;
    private javax.swing.JLabel lblDatoIda;
    private javax.swing.JLabel lblDatoInhalacion;
    private javax.swing.JLabel lblDatoKh;
    private javax.swing.JLabel lblDatoKow;
    private javax.swing.JLabel lblDatoMasaMolec;
    private javax.swing.JLabel lblDatoModoAccion;
    private javax.swing.JLabel lblDatoMutagen;
    private javax.swing.JLabel lblDatoNeurotoxicant;
    private javax.swing.JLabel lblDatoNoelRatas;
    private javax.swing.JLabel lblDatoPhototoxicant;
    private javax.swing.JLabel lblDatoPka;
    private javax.swing.JLabel lblDatoPresionVapor;
    private javax.swing.JLabel lblDatoRDE;
    private javax.swing.JLabel lblDatoRespirantTractIrritant;
    private javax.swing.JLabel lblDatoSensPH;
    private javax.swing.JLabel lblDatoSkinIrritant;
    private javax.swing.JLabel lblDatoSkinSensitiser;
    private javax.swing.JLabel lblDatoSolubH2O;
    private javax.swing.JLabel lblDatoTipoPlagu;
    private javax.swing.JLabel lblDatoToxAcuatica;
    private javax.swing.JLabel lblDegradacion;
    private javax.swing.JLabel lblDl50IA;
    private javax.swing.JLabel lblDtAgua;
    private javax.swing.JLabel lblEbullicion;
    private javax.swing.JLabel lblEndocrineDisrupter;
    private javax.swing.JLabel lblEyeIrritant;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblFusion;
    private javax.swing.JLabel lblGrupoQCO;
    private javax.swing.JLabel lblGus;
    private javax.swing.JLabel lblIda;
    private javax.swing.JLabel lblInhalacion;
    private javax.swing.JLabel lblKOC;
    private javax.swing.JLabel lblKh;
    private javax.swing.JLabel lblKow;
    private javax.swing.JLabel lblMasaMolec;
    private javax.swing.JLabel lblModoAccion;
    private javax.swing.JLabel lblMutagen;
    private javax.swing.JLabel lblNeurotoxicant;
    private javax.swing.JLabel lblNoelRatas;
    private javax.swing.JLabel lblPI1;
    private javax.swing.JLabel lblPI2;
    private javax.swing.JLabel lblPhototoxicant;
    private javax.swing.JLabel lblPka;
    private javax.swing.JLabel lblPresionVapor;
    private javax.swing.JLabel lblRDE;
    private javax.swing.JLabel lblRespirantTractIrritant;
    private javax.swing.JLabel lblResultadoGus;
    private javax.swing.JLabel lblResultadoKoc;
    private javax.swing.JLabel lblResultadoToxicidadAbejas;
    private javax.swing.JLabel lblResultadoToxicidadAves;
    private javax.swing.JLabel lblResultadoToxicidadDermal;
    private javax.swing.JLabel lblResultadoToxicidadLombrices;
    private javax.swing.JLabel lblResultadoToxicidadPeces;
    private javax.swing.JLabel lblResultadoVidaMedia;
    private javax.swing.JLabel lblSelecReceta;
    private javax.swing.JLabel lblSensPH;
    private javax.swing.JLabel lblSkinIrritant;
    private javax.swing.JLabel lblSkinSensitiser;
    private javax.swing.JLabel lblSolubH2O;
    private javax.swing.JLabel lblTaBien;
    private javax.swing.JLabel lblTaMal;
    private javax.swing.JLabel lblTaMal1;
    private javax.swing.JLabel lblTaMal10;
    private javax.swing.JLabel lblTaMal11;
    private javax.swing.JLabel lblTaMal12;
    private javax.swing.JLabel lblTaMal13;
    private javax.swing.JLabel lblTaMal14;
    private javax.swing.JLabel lblTaMal15;
    private javax.swing.JLabel lblTaMal16;
    private javax.swing.JLabel lblTaMal17;
    private javax.swing.JLabel lblTaMal18;
    private javax.swing.JLabel lblTaMal19;
    private javax.swing.JLabel lblTaMal2;
    private javax.swing.JLabel lblTaMal20;
    private javax.swing.JLabel lblTaMal3;
    private javax.swing.JLabel lblTaMal4;
    private javax.swing.JLabel lblTaMal5;
    private javax.swing.JLabel lblTaMal6;
    private javax.swing.JLabel lblTaMal7;
    private javax.swing.JLabel lblTaMal8;
    private javax.swing.JLabel lblTaMal9;
    private javax.swing.JLabel lblTaMasoMenos;
    private javax.swing.JLabel lblTipoPlagu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblToxAbejas;
    private javax.swing.JLabel lblToxAcuatica;
    private javax.swing.JLabel lblToxAves;
    private javax.swing.JLabel lblToxDermal;
    private javax.swing.JLabel lblToxLombrices;
    private javax.swing.JLabel lblToxPeces;
    private javax.swing.JLabel lblVidaMedia;
    private javax.swing.JLabel lblZ;
    private javax.swing.JList<String> lstPrincipioActivo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlGus;
    private javax.swing.JPanel pnlInfoColores;
    private javax.swing.JPanel pnlMasDatos;
    private javax.swing.JTable tblPrincipios;
    private javax.swing.JTextField txtPrincipio;
    // End of variables declaration//GEN-END:variables
}
