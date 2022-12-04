
package Frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import Metodos_sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrincipalTablero extends javax.swing.JFrame {

    
    //DECLARAR X,Y PARA MOVER TABLERO
    private int xmouse,ymouse;
 
    //CONEXIONES
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    private String user;
    private int tipo;
    
    
    public PrincipalTablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        FechaActual();
        
       Presentacion p = new Presentacion();
       p.setSize(1050, 580);
       p.setLocation(0, 0);
       panelCambios.removeAll();
       panelCambios.add(p,BorderLayout.CENTER);
       panelCambios.revalidate();
       panelCambios.repaint();
    }
    
    
    public void usuario(String x){
        user=x;
    }
    
    public void ingresar1boton(){
        lblIngresar.setForeground(Color.white);
        imgIngresar.setVisible(false);
        imgIngresarMov.setVisible(true);
        btnIngresarMaterial.setBackground(new Color(21, 101, 192));
    }
    
    public void ingresar2boton(){
        lblIngresar.setForeground(new Color(204, 204, 204));
        imgIngresarMov.setVisible(false);
        imgIngresar.setVisible(true);
        btnIngresarMaterial.setBackground(new Color(18, 90, 173));
        
    }
    
    public void salida1boton(){
        lblDespachar.setForeground(Color.white);
        imgDespachar.setVisible(false);
        imgDespacharMov.setVisible(true);
        btnEntregarMaterial.setBackground(new Color(21, 101, 192));
    }
    
    public void salida2boton(){
        lblDespachar.setForeground(new Color(204, 204, 204));
        imgDespacharMov.setVisible(false);
        imgDespachar.setVisible(true);
        btnEntregarMaterial.setBackground(new Color(18, 90, 173));
    }
       
    public void usuario1boton(){
        lblUsuario.setForeground(Color.white);
        imgUsuario.setVisible(false);
        imgUsuarioMov.setVisible(true);
        btnRegistrarUsuario.setBackground(new Color(21, 101, 192));
    }
    
    public void usuario2boton(){
        lblUsuario.setForeground(new Color(204, 204, 204));
        imgUsuarioMov.setVisible(false);
        imgUsuario.setVisible(true);
        btnRegistrarUsuario.setBackground(new Color(18, 90, 173));
    }
    
    public void liquidar1boton(){
        lblLiquidar.setForeground(Color.white);
        imgLiquidar.setVisible(false);
        imgLiquidarMov.setVisible(true);
        btnLiquidarMaterial.setBackground(new Color(21, 101, 192));
    }
  
    public void liquidar2boton(){
        lblLiquidar.setForeground(new Color(204, 204, 204));
        imgLiquidarMov.setVisible(false);
        imgLiquidar.setVisible(true);
        btnLiquidarMaterial.setBackground(new Color(18, 90, 173));
    }
  
    public void reporte1boton(){
        lblReporte.setForeground(Color.white);
        imgReporte.setVisible(false);
        imgReporteMov.setVisible(true);
        btnGenerarReporte.setBackground(new Color(21, 101, 192));
    }
    
    public void reporte2boton(){
        lblReporte.setForeground(new Color(204, 204, 204));
        imgReporteMov.setVisible(false);
        imgReporte.setVisible(true);
        btnGenerarReporte.setBackground(new Color(18, 90, 173));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormularioTotal = new javax.swing.JPanel();
        panelCambios = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnGenerarReporte = new javax.swing.JPanel();
        imgReporte = new javax.swing.JLabel();
        imgReporteMov = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();
        btnLiquidarMaterial = new javax.swing.JPanel();
        imgLiquidar = new javax.swing.JLabel();
        imgLiquidarMov = new javax.swing.JLabel();
        lblLiquidar = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        imgUsuarioMov = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnEntregarMaterial = new javax.swing.JPanel();
        imgDespachar = new javax.swing.JLabel();
        imgDespacharMov = new javax.swing.JLabel();
        lblDespachar = new javax.swing.JLabel();
        btnIngresarMaterial = new javax.swing.JPanel();
        imgIngresar = new javax.swing.JLabel();
        imgIngresarMov = new javax.swing.JLabel();
        lblIngresar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBarraSuperior = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblCerrarX = new javax.swing.JLabel();
        Cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1450, 850));
        setResizable(false);
        setSize(new java.awt.Dimension(1450, 850));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelFormularioTotal.setBackground(new java.awt.Color(255, 255, 255));
        panelFormularioTotal.setPreferredSize(new java.awt.Dimension(1450, 850));
        panelFormularioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelFormularioTotalKeyReleased(evt);
            }
        });
        panelFormularioTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCambios.setBackground(new java.awt.Color(255, 255, 255));
        panelCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCambiosMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelCambiosLayout = new javax.swing.GroupLayout(panelCambios);
        panelCambios.setLayout(panelCambiosLayout);
        panelCambiosLayout.setHorizontalGroup(
            panelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        panelCambiosLayout.setVerticalGroup(
            panelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        panelFormularioTotal.add(panelCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 1050, 580));

        panelMenu.setBackground(new java.awt.Color(13, 71, 161));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerarReporte.setBackground(new java.awt.Color(18, 90, 173));
        btnGenerarReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG/REPORTE IMG.png"))); // NOI18N
        btnGenerarReporte.add(imgReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 100));

        imgReporteMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgReporteMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOV/REPORTE.gif"))); // NOI18N
        btnGenerarReporte.add(imgReporteMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 100));

        lblReporte.setBackground(new java.awt.Color(255, 255, 255));
        lblReporte.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        lblReporte.setForeground(new java.awt.Color(204, 204, 204));
        lblReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporte.setText("                  Generar Reporte");
        lblReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReporteMousePressed(evt);
            }
        });
        btnGenerarReporte.add(lblReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -12, 400, 110));

        panelMenu.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 400, 100));

        btnLiquidarMaterial.setBackground(new java.awt.Color(18, 90, 173));
        btnLiquidarMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLiquidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLiquidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG/LIQUIDAR IMG.png"))); // NOI18N
        btnLiquidarMaterial.add(imgLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 90));

        imgLiquidarMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLiquidarMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOV/LIQUIDAR.gif"))); // NOI18N
        btnLiquidarMaterial.add(imgLiquidarMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 90));

        lblLiquidar.setBackground(new java.awt.Color(255, 255, 255));
        lblLiquidar.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        lblLiquidar.setForeground(new java.awt.Color(204, 204, 204));
        lblLiquidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLiquidar.setText("                   Liquidar Material");
        lblLiquidar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLiquidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLiquidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLiquidarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLiquidarMousePressed(evt);
            }
        });
        btnLiquidarMaterial.add(lblLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 400, 100));

        panelMenu.add(btnLiquidarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 400, 100));

        btnRegistrarUsuario.setBackground(new java.awt.Color(18, 90, 173));
        btnRegistrarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG/USUARIO IMG.png"))); // NOI18N
        btnRegistrarUsuario.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 100));

        imgUsuarioMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUsuarioMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOV/USUARIO REGISTRO.gif"))); // NOI18N
        btnRegistrarUsuario.add(imgUsuarioMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 100));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("                  Agregar Usuario");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUsuarioMousePressed(evt);
            }
        });
        btnRegistrarUsuario.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -12, 400, 110));

        panelMenu.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 400, 100));

        btnEntregarMaterial.setBackground(new java.awt.Color(18, 90, 173));
        btnEntregarMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgDespachar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDespachar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG/DESPACHAR IMG.png"))); // NOI18N
        btnEntregarMaterial.add(imgDespachar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 100));

        imgDespacharMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDespacharMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOV/DESPACHAR.gif"))); // NOI18N
        btnEntregarMaterial.add(imgDespacharMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 100));

        lblDespachar.setBackground(new java.awt.Color(255, 255, 255));
        lblDespachar.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        lblDespachar.setForeground(new java.awt.Color(204, 204, 204));
        lblDespachar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDespachar.setText("                 Despachar");
        lblDespachar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDespachar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDespacharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDespacharMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDespacharMousePressed(evt);
            }
        });
        btnEntregarMaterial.add(lblDespachar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 400, 100));

        panelMenu.add(btnEntregarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 400, 100));

        btnIngresarMaterial.setBackground(new java.awt.Color(18, 90, 173));
        btnIngresarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMaterialMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMaterialMousePressed(evt);
            }
        });
        btnIngresarMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG/INGRESAR IMG.png"))); // NOI18N
        btnIngresarMaterial.add(imgIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 100));

        imgIngresarMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIngresarMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOV/INGRESAR.gif"))); // NOI18N
        btnIngresarMaterial.add(imgIngresarMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 100));

        lblIngresar.setBackground(new java.awt.Color(255, 255, 255));
        lblIngresar.setFont(new java.awt.Font("Roboto Black", 1, 26)); // NOI18N
        lblIngresar.setForeground(new java.awt.Color(204, 204, 204));
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("                   Ingresar Material");
        lblIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIngresarMousePressed(evt);
            }
        });
        btnIngresarMaterial.add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        panelMenu.add(btnIngresarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 400, 100));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cotecon S.A.C");
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 270, 80));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 350, 30));

        panelFormularioTotal.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 810));

        panelBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseDragged(evt);
            }
        });
        panelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMousePressed(evt);
            }
        });
        panelBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        lblCerrar.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        lblCerrarX.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblCerrarX.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarX.setText("X");
        lblCerrarX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrarX.setMaximumSize(new java.awt.Dimension(12, 24));
        lblCerrarX.setMinimumSize(new java.awt.Dimension(12, 24));
        lblCerrarX.setName(""); // NOI18N
        lblCerrarX.setPreferredSize(new java.awt.Dimension(12, 24));

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCerrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblCerrarX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCerrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblCerrarX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelBarraSuperior.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, 50, 40));

        panelFormularioTotal.add(panelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 40));

        Cabecera.setBackground(new java.awt.Color(21, 101, 192));
        Cabecera.setToolTipText("");
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALMACEN CONTRATISTA");
        Cabecera.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 460, 50));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SISTEMA DE GESTIÓN");
        Cabecera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 410, 50));

        panelFormularioTotal.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 1050, 170));

        lblfecha.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("Hoy es 12 de Junio del 2022 - 3:25 pm");
        panelFormularioTotal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 370, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFormularioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFormularioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void FechaActual(){           
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre","Octubre","Noviembre","Diciemrbre"};
        lblfecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);      
    }
    
    
    
    //BOTON SALIR
    
    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
     
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
      
    }//GEN-LAST:event_btnCerrarMouseExited

    //PONE BLANCO EL TEXTO CUANDO INGRESA EL MOUSE
    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        lblCerrar.setForeground(Color.white);
        btnCerrar.setBackground(Color.red);
        lblCerrarX.setVisible(true);
    }//GEN-LAST:event_lblCerrarMouseEntered

    //PONE EN NEGRO EL TEXTO CUANDO SALE EL MOUSE
    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setForeground(Color.black);
        btnCerrar.setBackground(Color.white);
        lblCerrarX.hide();
    }//GEN-LAST:event_lblCerrarMouseExited

    
    //CONTROL DE PANEL
    private void panelBarraSuperiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseClicked

        
    }//GEN-LAST:event_panelBarraSuperiorMouseClicked

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    
    private void panelBarraSuperiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseEntered
        panelBarraSuperior.setBackground(Color.black);
    }//GEN-LAST:event_panelBarraSuperiorMouseEntered

    private void panelBarraSuperiorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseExited
        panelBarraSuperior.setBackground(Color.white);
    }//GEN-LAST:event_panelBarraSuperiorMouseExited

    
    //BOTONES DEL PANEL MENU
    private void btnIngresarMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMaterialMouseEntered
        // AUN SIN ASIGNAR
    }//GEN-LAST:event_btnIngresarMaterialMouseEntered
    //BOTONES DEL PANEL MENU
    private void lblIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseEntered
        ingresar1boton();
    }//GEN-LAST:event_lblIngresarMouseEntered

    
    
    private void lblIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseExited
  
        //PONER UNA CONDICION CUANDO EL CONTENIDO ESTA ACTIVO Y RECHAZAR EL EVENTO        
        ingresar2boton();  
    }//GEN-LAST:event_lblIngresarMouseExited

    private void lblDespacharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDespacharMouseEntered
        salida1boton();
    }//GEN-LAST:event_lblDespacharMouseEntered

    private void lblDespacharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDespacharMouseExited
        salida2boton();
    }//GEN-LAST:event_lblDespacharMouseExited

    private void lblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseEntered
        usuario1boton();
    }//GEN-LAST:event_lblUsuarioMouseEntered

    private void lblUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseExited
        usuario2boton();
    }//GEN-LAST:event_lblUsuarioMouseExited

    private void lblLiquidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiquidarMouseEntered
        liquidar1boton();
    }//GEN-LAST:event_lblLiquidarMouseEntered

    private void lblLiquidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiquidarMouseExited
        liquidar2boton();
        
    }//GEN-LAST:event_lblLiquidarMouseExited

    private void lblReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseEntered
        reporte1boton();
    }//GEN-LAST:event_lblReporteMouseEntered

    private void lblReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseExited
        reporte2boton();
    }//GEN-LAST:event_lblReporteMouseExited

    private void btnIngresarMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMaterialMousePressed
                
    }//GEN-LAST:event_btnIngresarMaterialMousePressed

    private void lblIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMousePressed
        
        IngresoMaterial ing = new IngresoMaterial();
        ing.setSize(1050, 580);
        ing.setLocation(0, 0);
        ing.usuario(user);
        panelCambios.removeAll();
        panelCambios.add(ing, BorderLayout.CENTER);
        panelCambios.revalidate();
        panelCambios.repaint();
        tipo=1;

    }//GEN-LAST:event_lblIngresarMousePressed

    private void panelCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCambiosMouseEntered
        
        if (tipo==1) {
            ingresar1boton();            
            salida2boton();
            usuario2boton();
            liquidar2boton();
            reporte2boton();            
        } else  if(tipo==2){
            salida1boton();
            ingresar2boton();
            usuario2boton();
            liquidar2boton();
            reporte2boton();
        } else if(tipo==3){
            usuario1boton();
            ingresar2boton();
            salida2boton();
            liquidar2boton();
            reporte2boton();
        } else if(tipo==4){
            liquidar1boton();
            ingresar2boton();
            salida2boton();
            usuario2boton();
            reporte2boton();
        } else if(tipo==5){
            reporte1boton();
            ingresar2boton();
            salida2boton();
            usuario2boton();
            liquidar2boton();
        }
            
    
  
    }//GEN-LAST:event_panelCambiosMouseEntered

    private void lblDespacharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDespacharMousePressed
        
        DespacharMaterial ing = new DespacharMaterial();
        ing.setSize(1050, 580);
        ing.setLocation(0, 0);
        ing.usuario(user);
        panelCambios.removeAll();
        panelCambios.add(ing, BorderLayout.CENTER);
        panelCambios.revalidate();
        panelCambios.repaint();
        tipo=2;
        
    }//GEN-LAST:event_lblDespacharMousePressed

    private void lblUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMousePressed
        Trabajador ing = new Trabajador();
        ing.setSize(1050, 580);
        ing.setLocation(0, 0);
        panelCambios.removeAll();
        panelCambios.add(ing, BorderLayout.CENTER);
        panelCambios.revalidate();
        panelCambios.repaint();
        tipo=3;
    }//GEN-LAST:event_lblUsuarioMousePressed

    private void lblLiquidarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiquidarMousePressed
        
        LiquidarMaterial ing = new LiquidarMaterial();
        ing.setSize(1050, 580);
        ing.setLocation(0, 0);
        panelCambios.removeAll();
        panelCambios.add(ing, BorderLayout.CENTER);
        panelCambios.revalidate();
        panelCambios.repaint();
        tipo=4;          
    }//GEN-LAST:event_lblLiquidarMousePressed

    private void lblReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMousePressed
        Reportes ing = new Reportes();
        ing.setSize(1050, 580);
        ing.setLocation(0, 0);
        panelCambios.removeAll();
        panelCambios.add(ing, BorderLayout.CENTER);
        panelCambios.revalidate();
        panelCambios.repaint();
        tipo=5;
    }//GEN-LAST:event_lblReporteMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowActivated

    private void panelFormularioTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelFormularioTotalKeyReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_panelFormularioTotalKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
                            
    //*******************************************/
    
    
    
    
    
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnEntregarMaterial;
    private javax.swing.JPanel btnGenerarReporte;
    private javax.swing.JPanel btnIngresarMaterial;
    private javax.swing.JPanel btnLiquidarMaterial;
    private javax.swing.JPanel btnRegistrarUsuario;
    private javax.swing.JLabel imgDespachar;
    private javax.swing.JLabel imgDespacharMov;
    private javax.swing.JLabel imgIngresar;
    private javax.swing.JLabel imgIngresarMov;
    private javax.swing.JLabel imgLiquidar;
    private javax.swing.JLabel imgLiquidarMov;
    private javax.swing.JLabel imgReporte;
    private javax.swing.JLabel imgReporteMov;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel imgUsuarioMov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCerrarX;
    private javax.swing.JLabel lblDespachar;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblLiquidar;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelCambios;
    private javax.swing.JPanel panelFormularioTotal;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables






}
