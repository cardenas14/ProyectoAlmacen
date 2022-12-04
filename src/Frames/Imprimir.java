
package Frames;

import Metodos_sql.Conexion;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashSet;
import javax.swing.JOptionPane;


public class Imprimir extends javax.swing.JFrame implements Printable{
    
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    private String tipo;
    private String dni;
    private String nombre[] = new String[10000];
    private String sst[] = new String[10000];
    private double monto[] = new double[10000];
    

    public Imprimir() {
        initComponents();
        setLocationRelativeTo(null);
//        lblnumero1.setVisible(false);
//        lblnumero2.setVisible(false);
//        lblnumero3.setVisible(false);
//        lblnumero4.setVisible(false);
//        lblnumero5.setVisible(false);
//        lblnumero6.setVisible(false);
//        lblnumero7.setVisible(false);
//        lblnumero8.setVisible(false);
//        lblnumero9.setVisible(false);
//        lblnumero10.setVisible(false);
        
    }

    public void TipoReporte(String x){
        DecimalFormat df = new DecimalFormat("S/###,###,###.00");
        
        tipo=x;
        if (tipo.equals("Para Gerencia")) {
            lblTitulo.setText("Tipo de reporte: Gerencial");            
            DataGerencial();
            try {                
          
            lblnombre1.setText(nombre[0]);
            lblnombre2.setText(nombre[1]);
            lblnombre3.setText(nombre[2]);
            lblnombre4.setText(nombre[3]);
            lblnombre5.setText(nombre[4]);
            lblnombre6.setText(nombre[5]);
            lblnombre7.setText(nombre[6]);
            lblnombre8.setText(nombre[7]);
            lblnombre9.setText(nombre[8]);
            lblnombre10.setText(nombre[9]);
            
            lblsst1.setText(sst[0]);
            lblsst2.setText(sst[1]);
            lblsst3.setText(sst[2]);
            lblsst4.setText(sst[3]);
            lblsst5.setText(sst[4]);
            lblsst6.setText(sst[5]);
            lblsst7.setText(sst[6]);
            lblsst8.setText(sst[7]);
            lblsst9.setText(sst[8]);
            lblsst10.setText(sst[9]);
            
            lblmonto1.setText(String.valueOf(df.format(monto[0])));
            lblmonto2.setText(String.valueOf(df.format(monto[1])));
            lblmonto3.setText(String.valueOf(df.format(monto[2])));
            lblmonto4.setText(String.valueOf(df.format(monto[3])));
            lblmonto5.setText(String.valueOf(df.format(monto[4])));
            lblmonto6.setText(String.valueOf(df.format(monto[5])));
            lblmonto7.setText(String.valueOf(df.format(monto[6])));
            lblmonto8.setText(String.valueOf(df.format(monto[7])));
            lblmonto9.setText(String.valueOf(df.format(monto[8])));
            lblmonto10.setText(String.valueOf(df.format(monto[9])));            
            Monto0();
            Numeros();
            Resumen();
            Conteo();
            //Suma();
            
            } catch (Exception e) {
            }
            
  
        } 
        
    }
    
    public void DNI(String x){
        dni=x;        
    }
    
    public void DataGerencial(){
        int i=0;
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call ReporteGerencial();");
            while (resultado.next()) {                
                nombre[i] = resultado.getString(1);
                sst[i] = resultado.getString(2);                
                monto[i] = Double.parseDouble(resultado.getString(3));                
                i++;
            }
            i--;
        } catch (Exception e) {
        }
    }
    
    public void Monto0(){
            if (monto[0]==0) {
                    lblmonto1.setText("");
            }
            if (monto[1]==0) {
                    lblmonto2.setText("");
            }
            if (monto[2]==0) {
                    lblmonto3.setText("");
            }
            if (monto[3]==0) {
                    lblmonto4.setText("");
            }
            if (monto[4]==0) {
                    lblmonto5.setText("");
            }
            if (monto[5]==0) {
                    lblmonto6.setText("");
            }
            if (monto[6]==0) {
                    lblmonto7.setText("");
            }
            if (monto[7]==0) {
                    lblmonto8.setText("");
            }
            if (monto[8]==0) {
                    lblmonto9.setText("");
            }
            if (monto[9]==0) {
                    lblmonto10.setText("");
            }
    }
    
    public void Numeros(){

        if (nombre[0]==null) {
            lblnumero1.setVisible(false);
        }
        if (nombre[1]==null) {
            lblnumero2.setVisible(false);
        }
        if (nombre[2]==null) {
            lblnumero3.setVisible(false);
        }
        if (nombre[3]==null) {
            lblnumero4.setVisible(false);
        }
        if (nombre[4]==null) {
            lblnumero5.setVisible(false);
        }
        if (nombre[5]==null) {
            lblnumero6.setVisible(false);
        }
        if (nombre[6]==null) {
            lblnumero7.setVisible(false);
        }
        if (nombre[7]==null) {
            lblnumero8.setVisible(false);
        }
        if (nombre[8]==null) {
            lblnumero9.setVisible(false);
        }
        
        if (nombre[9]==null) {
            lblnumero10.setVisible(false);
        }
        
        
        
    }

    public void Resumen(){
        
        //lblResumenNombre1.setText(lblnombre1.getText());
        String nombre[] = new String[10];
        int i=0;
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call ResumenNombre();");
            while (resultado.next()) {                
                nombre[i]=resultado.getString(1);
                i++;
            }
            i--;
            lblResumenNombre1.setText(nombre[0]);
            lblResumenNombre2.setText(nombre[1]);
            lblResumenNombre3.setText(nombre[2]);
            lblResumenNombre4.setText(nombre[3]);
            lblResumenNombre5.setText(nombre[4]);
            lblResumenNombre6.setText(nombre[5]);
            lblResumenNombre7.setText(nombre[6]);
            lblResumenNombre8.setText(nombre[7]);
            lblResumenNombre9.setText(nombre[8]);
            lblResumenNombre10.setText(nombre[9]);
            
        } catch (Exception e) {
        }
        
        
    }
    
    public void Conteo(){
        DecimalFormat df = new DecimalFormat("S/###,###,###.00");
        int j1=0;
        double a1=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre1.getText().equals(nombre[i])){
                j1=j1+1;
                a1 = monto[i]+a1;
            }                        
        }
        lblResumenMonto1.setText(String.valueOf(df.format(a1)));
        lblResumenCantidad1.setText(j1+" SST");
        
        int j2=0;
        double a2=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre2.getText().equals(nombre[i])){
                j2=j2+1;
                a2 = monto[i]+a2;
            }                        
        }
        lblResumenMonto2.setText(String.valueOf(df.format(a2)));
        lblResumenCantidad2.setText(j2+" SST");
        
        int j3=0;
        double a3=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre3.getText().equals(nombre[i])){
                j3=j3+1;
                a3 = monto[i]+a3;                
            }                        
        }
        lblResumenMonto3.setText(String.valueOf(df.format(a3)));
        lblResumenCantidad3.setText(j3+" SST");
        
        int j4=0;
        double a4=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre4.getText().equals(nombre[i])){
                j4=j4+1;
                a4 = monto[i]+a4;
            }                        
        }
        lblResumenMonto4.setText(String.valueOf(df.format(a4)));
        lblResumenCantidad4.setText(j4+" SST");
        
        int j5=0;
        double a5=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre5.getText().equals(nombre[i])){
                j5=j5+1;
                a5 = monto[i]+a5;
            }                        
        }
        lblResumenMonto5.setText(String.valueOf(df.format(a5)));
        lblResumenCantidad5.setText(j5+" SST");
        
        int j6=0;
        double a6=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre6.getText().equals(nombre[i])){
                j6=j6+1;
                a6 = monto[i]+a6;
            }                        
        }
        lblResumenMonto6.setText(String.valueOf(df.format(a6)));
        lblResumenCantidad6.setText(j6+" SST");
        
        int j7=0;
        double a7=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre7.getText().equals(nombre[i])){
                j7=j7+1;
                a7 = monto[i]+a7;
            }                        
        }
        lblResumenMonto7.setText(String.valueOf(df.format(a7)));
        lblResumenCantidad7.setText(j7+" SST");
        
        int j8=0;
        double a8=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre8.getText().equals(nombre[i])){
                j8=j8+1;
                a8 = monto[i]+a8;
            }                        
        }
        lblResumenMonto8.setText(String.valueOf(df.format(a8)));
        lblResumenCantidad8.setText(j8+" SST");
        
        int j9=0;
        double a9=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre9.getText().equals(nombre[i])){
                j9=j9+1;
                a9 = monto[i]+a9;
            }                        
        }
        lblResumenMonto9.setText(String.valueOf(df.format(a9)));
        lblResumenCantidad9.setText(j9+" SST");
        
        int j10=0;
        double a10=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre10.getText().equals(nombre[i])){
                j10=j10+1;
                a10 = monto[i]+a10;
            }                        
        }
        lblResumenMonto10.setText(String.valueOf(df.format(a10)));
        lblResumenCantidad10.setText(j10+" SST"); 
    }
    
    public void Suma(){        
        double a=0;
        for (int i = 0; i < 100; i++) {
            if (lblResumenNombre1.getText().equals(nombre[i])){
                a=monto[i]+a;
            }                        
        }
        lblResumenMonto1.setText(String.valueOf(a));
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lblnumero1 = new javax.swing.JLabel();
        lblnombre1 = new javax.swing.JLabel();
        lblsst1 = new javax.swing.JLabel();
        lblmonto1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        lblnumero2 = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        lblsst2 = new javax.swing.JLabel();
        lblmonto2 = new javax.swing.JLabel();
        lblnumero3 = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        lblsst3 = new javax.swing.JLabel();
        lblmonto3 = new javax.swing.JLabel();
        lblnumero4 = new javax.swing.JLabel();
        lblnombre4 = new javax.swing.JLabel();
        lblmonto4 = new javax.swing.JLabel();
        lblsst4 = new javax.swing.JLabel();
        lblsst5 = new javax.swing.JLabel();
        lblnombre5 = new javax.swing.JLabel();
        lblmonto5 = new javax.swing.JLabel();
        lblnumero5 = new javax.swing.JLabel();
        lblsst6 = new javax.swing.JLabel();
        lblnumero6 = new javax.swing.JLabel();
        lblnombre6 = new javax.swing.JLabel();
        lblmonto6 = new javax.swing.JLabel();
        lblsst7 = new javax.swing.JLabel();
        lblmonto7 = new javax.swing.JLabel();
        lblnumero7 = new javax.swing.JLabel();
        lblnombre7 = new javax.swing.JLabel();
        lblsst8 = new javax.swing.JLabel();
        lblmonto8 = new javax.swing.JLabel();
        lblnombre8 = new javax.swing.JLabel();
        lblnumero8 = new javax.swing.JLabel();
        lblmonto9 = new javax.swing.JLabel();
        lblsst9 = new javax.swing.JLabel();
        lblnumero9 = new javax.swing.JLabel();
        lblnombre9 = new javax.swing.JLabel();
        lblsst10 = new javax.swing.JLabel();
        lblnumero10 = new javax.swing.JLabel();
        lblmonto10 = new javax.swing.JLabel();
        lblnombre10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblResumenNombre1 = new javax.swing.JLabel();
        lblResumenNombre2 = new javax.swing.JLabel();
        lblResumenNombre3 = new javax.swing.JLabel();
        lblResumenNombre4 = new javax.swing.JLabel();
        lblResumenNombre5 = new javax.swing.JLabel();
        lblResumenCantidad1 = new javax.swing.JLabel();
        lblResumenCantidad2 = new javax.swing.JLabel();
        lblResumenCantidad3 = new javax.swing.JLabel();
        lblResumenCantidad4 = new javax.swing.JLabel();
        lblResumenCantidad5 = new javax.swing.JLabel();
        lblResumenMonto1 = new javax.swing.JLabel();
        lblResumenMonto2 = new javax.swing.JLabel();
        lblResumenMonto3 = new javax.swing.JLabel();
        lblResumenMonto4 = new javax.swing.JLabel();
        lblResumenMonto5 = new javax.swing.JLabel();
        lblResumenNombre6 = new javax.swing.JLabel();
        lblResumenNombre7 = new javax.swing.JLabel();
        lblResumenNombre8 = new javax.swing.JLabel();
        lblResumenNombre9 = new javax.swing.JLabel();
        lblResumenNombre10 = new javax.swing.JLabel();
        lblResumenCantidad6 = new javax.swing.JLabel();
        lblResumenCantidad7 = new javax.swing.JLabel();
        lblResumenCantidad8 = new javax.swing.JLabel();
        lblResumenCantidad9 = new javax.swing.JLabel();
        lblResumenCantidad10 = new javax.swing.JLabel();
        lblResumenMonto6 = new javax.swing.JLabel();
        lblResumenMonto7 = new javax.swing.JLabel();
        lblResumenMonto8 = new javax.swing.JLabel();
        lblResumenMonto9 = new javax.swing.JLabel();
        lblResumenMonto10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("X");
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 0, 40, 35));

        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 0, 80, 35));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TIPO DE REPORTE");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 610, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO EMPRESA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 3, 250, 108));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 611, 3));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 611, 3));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 611, 3));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 247, 611, 3));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 3, 402));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 3, 402));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 3, 402));

        lblnumero1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero1.setText("1");
        jPanel1.add(lblnumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 215, 42, 30));

        lblnombre1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 215, 300, 30));

        lblsst1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 215, 150, 30));

        lblmonto1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 215, 79, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("N");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 42, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Resumen General");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 610, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SST - N de obra");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 180, 150, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Monto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 180, 79, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 284, 611, 3));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 611, 3));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 358, 611, 3));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 395, 611, 3));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 432, 611, 3));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 469, 611, 3));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 506, 611, 3));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 543, 611, 3));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 611, 3));

        lblnumero2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero2.setText("2");
        jPanel1.add(lblnumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 252, 42, 30));

        lblnombre2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 252, 300, 30));

        lblsst2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 252, 150, 30));

        lblmonto2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 252, 79, 30));

        lblnumero3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero3.setText("3");
        jPanel1.add(lblnumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 289, 42, 30));

        lblnombre3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 289, 300, 30));

        lblsst3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 289, 150, 30));

        lblmonto3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 289, 79, 30));

        lblnumero4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero4.setText("4");
        jPanel1.add(lblnumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 326, 42, 30));

        lblnombre4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 326, 300, 30));

        lblmonto4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 326, 79, 30));

        lblsst4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 326, 150, 30));

        lblsst5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst5, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 363, 150, 30));

        lblnombre5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 363, 300, 30));

        lblmonto5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 363, 79, 30));

        lblnumero5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero5.setText("5");
        jPanel1.add(lblnumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 363, 42, 30));

        lblsst6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst6, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 400, 150, 30));

        lblnumero6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero6.setText("6");
        jPanel1.add(lblnumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 400, 42, 30));

        lblnombre6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 400, 300, 30));

        lblmonto6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 400, 79, 30));

        lblsst7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst7, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 437, 150, 30));

        lblmonto7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 437, 79, 30));

        lblnumero7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero7.setText("7");
        jPanel1.add(lblnumero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 437, 42, 30));

        lblnombre7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 437, 300, 30));

        lblsst8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst8, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 474, 150, 30));

        lblmonto8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 474, 79, 30));

        lblnombre8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 474, 300, 30));

        lblnumero8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero8.setText("8");
        jPanel1.add(lblnumero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 474, 42, 30));

        lblmonto9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 511, 79, 30));

        lblsst9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst9, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 511, 150, 30));

        lblnumero9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero9.setText("9");
        jPanel1.add(lblnumero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 511, 42, 30));

        lblnombre9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 511, 300, 30));

        lblsst10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblsst10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblsst10, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 548, 150, 30));

        lblnumero10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnumero10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero10.setText("10");
        jPanel1.add(lblnumero10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 548, 42, 30));

        lblmonto10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblmonto10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmonto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 548, 79, 30));

        lblnombre10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblnombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 548, 300, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nombre del Trabajador");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 180, 300, 30));

        lblResumenNombre1.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 630, 150, 25));

        lblResumenNombre2.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 660, 150, 25));

        lblResumenNombre3.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 690, 150, 25));

        lblResumenNombre4.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 720, 150, 25));

        lblResumenNombre5.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 750, 150, 25));

        lblResumenCantidad1.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 50, 25));

        lblResumenCantidad2.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 50, 25));

        lblResumenCantidad3.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 50, 25));

        lblResumenCantidad4.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 720, 50, 25));

        lblResumenCantidad5.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 750, 50, 25));

        lblResumenMonto1.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResumenMonto1.setToolTipText("");
        jPanel1.add(lblResumenMonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 630, 90, 25));

        lblResumenMonto2.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 660, 90, 25));

        lblResumenMonto3.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 690, 90, 25));

        lblResumenMonto4.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 720, 90, 25));

        lblResumenMonto5.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 750, 90, 25));

        lblResumenNombre6.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 630, 150, 25));

        lblResumenNombre7.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 660, 150, 25));

        lblResumenNombre8.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 690, 150, 25));

        lblResumenNombre9.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 720, 150, 25));

        lblResumenNombre10.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenNombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 750, 150, 25));

        lblResumenCantidad6.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 50, 25));

        lblResumenCantidad7.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 50, 25));

        lblResumenCantidad8.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, 50, 25));

        lblResumenCantidad9.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, 50, 25));

        lblResumenCantidad10.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenCantidad10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenCantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, 50, 25));

        lblResumenMonto6.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 630, 90, 25));

        lblResumenMonto7.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 660, 90, 25));

        lblResumenMonto8.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 690, 90, 25));

        lblResumenMonto9.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 720, 90, 25));

        lblResumenMonto10.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        lblResumenMonto10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblResumenMonto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 750, 90, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();        
        btnImprimir.setVisible(false);
        btnCerrar.setVisible(false);
        job.setPrintable(this);        
        if (job.printDialog()) {
            try {                
                job.print();
                btnImprimir.setVisible(true);
                btnCerrar.setVisible(true);    
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null,"La impresion se cancelo");
            btnImprimir.setVisible(true);
            btnCerrar.setVisible(true);
        }   
    }//GEN-LAST:event_btnImprimirMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imprimir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnImprimir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblResumenCantidad1;
    private javax.swing.JLabel lblResumenCantidad10;
    private javax.swing.JLabel lblResumenCantidad2;
    private javax.swing.JLabel lblResumenCantidad3;
    private javax.swing.JLabel lblResumenCantidad4;
    private javax.swing.JLabel lblResumenCantidad5;
    private javax.swing.JLabel lblResumenCantidad6;
    private javax.swing.JLabel lblResumenCantidad7;
    private javax.swing.JLabel lblResumenCantidad8;
    private javax.swing.JLabel lblResumenCantidad9;
    private javax.swing.JLabel lblResumenMonto1;
    private javax.swing.JLabel lblResumenMonto10;
    private javax.swing.JLabel lblResumenMonto2;
    private javax.swing.JLabel lblResumenMonto3;
    private javax.swing.JLabel lblResumenMonto4;
    private javax.swing.JLabel lblResumenMonto5;
    private javax.swing.JLabel lblResumenMonto6;
    private javax.swing.JLabel lblResumenMonto7;
    private javax.swing.JLabel lblResumenMonto8;
    private javax.swing.JLabel lblResumenMonto9;
    private javax.swing.JLabel lblResumenNombre1;
    private javax.swing.JLabel lblResumenNombre10;
    private javax.swing.JLabel lblResumenNombre2;
    private javax.swing.JLabel lblResumenNombre3;
    private javax.swing.JLabel lblResumenNombre4;
    private javax.swing.JLabel lblResumenNombre5;
    private javax.swing.JLabel lblResumenNombre6;
    private javax.swing.JLabel lblResumenNombre7;
    private javax.swing.JLabel lblResumenNombre8;
    private javax.swing.JLabel lblResumenNombre9;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblmonto1;
    private javax.swing.JLabel lblmonto10;
    private javax.swing.JLabel lblmonto2;
    private javax.swing.JLabel lblmonto3;
    private javax.swing.JLabel lblmonto4;
    private javax.swing.JLabel lblmonto5;
    private javax.swing.JLabel lblmonto6;
    private javax.swing.JLabel lblmonto7;
    private javax.swing.JLabel lblmonto8;
    private javax.swing.JLabel lblmonto9;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre10;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lblnombre6;
    private javax.swing.JLabel lblnombre7;
    private javax.swing.JLabel lblnombre8;
    private javax.swing.JLabel lblnombre9;
    private javax.swing.JLabel lblnumero1;
    private javax.swing.JLabel lblnumero10;
    private javax.swing.JLabel lblnumero2;
    private javax.swing.JLabel lblnumero3;
    private javax.swing.JLabel lblnumero4;
    private javax.swing.JLabel lblnumero5;
    private javax.swing.JLabel lblnumero6;
    private javax.swing.JLabel lblnumero7;
    private javax.swing.JLabel lblnumero8;
    private javax.swing.JLabel lblnumero9;
    private javax.swing.JLabel lblsst1;
    private javax.swing.JLabel lblsst10;
    private javax.swing.JLabel lblsst2;
    private javax.swing.JLabel lblsst3;
    private javax.swing.JLabel lblsst4;
    private javax.swing.JLabel lblsst5;
    private javax.swing.JLabel lblsst6;
    private javax.swing.JLabel lblsst7;
    private javax.swing.JLabel lblsst8;
    private javax.swing.JLabel lblsst9;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex==0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        } else{
            return NO_SUCH_PAGE;
        }
    }
}
