
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;


public class IngresoMaterial extends javax.swing.JPanel {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar(); 
    private int id;
    private int idm[] = new int[10000];
    private int idmatricula[] = new int[100000];
    private String matricula[] = new String[100000];
    private String descripcion[] = new String[100000];
    private String user;
    private int idusuario;
    private int material1;
    private int material2;
    private int material3;
    private int material4;
    private int material5;
    private int material6;
    private int material7;
    private int material8;
    private int material9;
    private int material10;
    private int material11;
    private int material12;
    

    public IngresoMaterial() {
        initComponents();        
        actualID();
        FechaActual();
        materiales();
    }
    
    public void FechaActual(){             
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MM / yyyy");
        txtFecha.setText(dtf.format(LocalDateTime.now())); 
    }
    
    public void actualID(){   
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select max(n_document)+1 from input_guide;");            
            while (resultado.next()) {                            
                id= Integer.parseInt(resultado.getString(1));                    
            }  
        } catch (Exception e) {
            //int actual=0;
            //JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        if (id==0) {
                id=1;
            } 
        txtndocument.setText("001-0000"+id);
        
    }
    
    public void materiales(){
        int i=0;        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select id,enrollment,description from material;");           
            while (resultado.next()) {
                idmatricula[i] = Integer.parseInt(resultado.getString(1));
                matricula[i]=resultado.getString(2);
                descripcion[i]=resultado.getString(3);
                i++;
            }        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }   
    }
    
    public void usuario(String x){
        user=x;
    }
    
    public void idusuario(){
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select id from users where users.user like '"+user+"';");
            
            while (resultado.next()) {                
                idusuario = Integer.parseInt(resultado.getString(1));
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }        
    }
    
    public void guardardatos(){
        idusuario();                
        try {   
    
            if (txtmatricula1!=null && lbldescripcion1!=null) {
                PreparedStatement guardar1 = conect.prepareCall("call IngresarMaterial"
                        + "("+idusuario+","+material1+","+id+","+ txtSST.getText() +","+ txtcantidad1.getText() +")"); 
                guardar1.execute();                
            }
            
            if (txtmatricula2!=null && lbldescripcion2!=null) {
                PreparedStatement guardar2 = conect.prepareCall("call IngresarMaterial"
                        + "("+idusuario+","+material2+","+id+","+ txtSST.getText() +","+ txtcantidad2.getText() +")"); 
                guardar2.execute();                
            }
            
            if (txtmatricula3!=null && lbldescripcion3!=null) {
                PreparedStatement guardar3 = conect.prepareCall("call IngresarMaterial"
                        + "("+idusuario+","+material3+","+id+","+ txtSST.getText() +","+ txtcantidad3.getText() +")"); 
                guardar3.execute();                
            }
            
            if (txtmatricula4!=null && lbldescripcion4!=null) {
   PreparedStatement guardar4 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material4+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad4.getText() +")"); 
                     guardar4.execute();                
            }
            
            if (txtmatricula5!=null && lbldescripcion5!=null) {
   PreparedStatement guardar5 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material5+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad5.getText() +")"); 
                     guardar5.execute();                
            }
            
            if (txtmatricula6!=null && lbldescripcion6!=null) {
   PreparedStatement guardar6 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material6+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad6.getText() +")"); 
                     guardar6.execute();                
            }
            
            if (txtmatricula7!=null && lbldescripcion7!=null) {
   PreparedStatement guardar7 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material7+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad7.getText() +")"); 
                     guardar7.execute();                
            }
            
            if (txtmatricula8!=null && lbldescripcion8!=null) {
   PreparedStatement guardar8 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material8+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad8.getText() +")"); 
                     guardar8.execute();                
            }
            
            if (txtmatricula9!=null && lbldescripcion9!=null) {
   PreparedStatement guardar9 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material9+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad9.getText() +")"); 
                     guardar9.execute();                
            }
            
            if (txtmatricula10!=null && lbldescripcion10!=null) {
   PreparedStatement guardar10 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material10+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad10.getText() +")"); 
                     guardar10.execute();                
            }
            
            if (txtmatricula11!=null && lbldescripcion11!=null) {
   PreparedStatement guardar11 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material11+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad11.getText() +")"); 
                     guardar11.execute();                
            }
            
            if (txtmatricula12!=null && lbldescripcion12!=null) {
   PreparedStatement guardar12 = conect.prepareCall("call IngresarMaterial"
+ "("+idusuario+","+material12+","+id+","+ txtSST.getText() +","+ 
                 txtcantidad12.getText() +")"); 
                     guardar12.execute();                
            }
  
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }

    public void LimpiarDatos(){
        txtSST.setText("");
        txtmatricula1.setText("");
        txtmatricula2.setText("");
        txtmatricula3.setText("");
        txtmatricula4.setText("");
        txtmatricula5.setText("");
        txtmatricula6.setText("");
        txtmatricula7.setText("");
        txtmatricula8.setText("");
        txtmatricula9.setText("");
        txtmatricula10.setText("");
        txtmatricula11.setText("");
        txtmatricula12.setText("");
        
        lbldescripcion1.setText("");
        lbldescripcion2.setText("");
        lbldescripcion3.setText("");
        lbldescripcion4.setText("");
        lbldescripcion5.setText("");
        lbldescripcion6.setText("");
        lbldescripcion7.setText("");
        lbldescripcion8.setText("");
        lbldescripcion9.setText("");
        lbldescripcion10.setText("");
        lbldescripcion11.setText("");
        lbldescripcion12.setText("");
        
        txtcantidad1.setText("");
        txtcantidad2.setText("");
        txtcantidad3.setText("");
        txtcantidad4.setText("");
        txtcantidad5.setText("");
        txtcantidad6.setText("");
        txtcantidad7.setText("");
        txtcantidad8.setText("");
        txtcantidad9.setText("");
        txtcantidad10.setText("");
        txtcantidad11.setText("");
        txtcantidad12.setText("");  
        txtSST.requestFocus();
        actualID();
    }
    
    public void ImprimirData(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresoMaterialPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblusuario1 = new javax.swing.JLabel();
        txtSST = new javax.swing.JTextField();
        lblusuario2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnLimpiarDatos = new javax.swing.JPanel();
        lblLimpiarDatos = new javax.swing.JLabel();
        txtndocument = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        PanelMateriales = new javax.swing.JScrollPane();
        materiales = new javax.swing.JPanel();
        vertical1 = new javax.swing.JSeparator();
        vertical2 = new javax.swing.JSeparator();
        txtmatricula1 = new javax.swing.JTextField();
        lbldescripcion1 = new javax.swing.JLabel();
        txtcantidad1 = new javax.swing.JTextField();
        txtmatricula2 = new javax.swing.JTextField();
        lbldescripcion2 = new javax.swing.JLabel();
        txtcantidad2 = new javax.swing.JTextField();
        txtmatricula3 = new javax.swing.JTextField();
        lbldescripcion3 = new javax.swing.JLabel();
        txtcantidad3 = new javax.swing.JTextField();
        txtmatricula4 = new javax.swing.JTextField();
        lbldescripcion4 = new javax.swing.JLabel();
        txtcantidad4 = new javax.swing.JTextField();
        txtmatricula5 = new javax.swing.JTextField();
        lbldescripcion5 = new javax.swing.JLabel();
        txtcantidad5 = new javax.swing.JTextField();
        txtmatricula6 = new javax.swing.JTextField();
        lbldescripcion6 = new javax.swing.JLabel();
        txtcantidad6 = new javax.swing.JTextField();
        txtmatricula7 = new javax.swing.JTextField();
        lbldescripcion7 = new javax.swing.JLabel();
        txtcantidad7 = new javax.swing.JTextField();
        txtmatricula8 = new javax.swing.JTextField();
        txtcantidad8 = new javax.swing.JTextField();
        lbldescripcion8 = new javax.swing.JLabel();
        txtcantidad9 = new javax.swing.JTextField();
        txtmatricula9 = new javax.swing.JTextField();
        lbldescripcion9 = new javax.swing.JLabel();
        txtmatricula10 = new javax.swing.JTextField();
        lbldescripcion10 = new javax.swing.JLabel();
        txtcantidad10 = new javax.swing.JTextField();
        txtcantidad11 = new javax.swing.JTextField();
        txtmatricula11 = new javax.swing.JTextField();
        lbldescripcion11 = new javax.swing.JLabel();
        txtmatricula12 = new javax.swing.JTextField();
        txtcantidad12 = new javax.swing.JTextField();
        lbldescripcion12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnHistorial = new javax.swing.JPanel();
        lblHistorial = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 580));

        IngresoMaterialPanel.setBackground(new java.awt.Color(255, 255, 255));
        IngresoMaterialPanel.setPreferredSize(new java.awt.Dimension(1050, 580));
        IngresoMaterialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setText("Ingresar nuevos materiales al almacén");
        IngresoMaterialPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 710, 60));

        lblusuario.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("N° SST");
        IngresoMaterialPanel.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 160, 40));

        txtFecha.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setText("15/04/1995");
        txtFecha.setBorder(null);
        txtFecha.setEnabled(false);
        txtFecha.setPreferredSize(new java.awt.Dimension(200, 20));
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        IngresoMaterialPanel.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, 20));
        IngresoMaterialPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 130, 20));

        lblusuario1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblusuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario1.setText("N° Documento");
        IngresoMaterialPanel.add(lblusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 140, 40));

        txtSST.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtSST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSST.setBorder(null);
        txtSST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSSTMousePressed(evt);
            }
        });
        txtSST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSTActionPerformed(evt);
            }
        });
        txtSST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSSTKeyTyped(evt);
            }
        });
        IngresoMaterialPanel.add(txtSST, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 110, 40));

        lblusuario2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblusuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario2.setText("Fecha de Ingreso");
        IngresoMaterialPanel.add(lblusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 40));

        btnGuardar.setBackground(new java.awt.Color(13, 71, 161));
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGuardar.setFont(new java.awt.Font("Roboto Black", 1, 27)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar datos");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblGuardarMousePressed(evt);
            }
        });
        btnGuardar.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        IngresoMaterialPanel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 280, 80));

        btnLimpiarDatos.setBackground(new java.awt.Color(13, 71, 161));
        btnLimpiarDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLimpiarDatos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblLimpiarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiarDatos.setText("Limpiar ");
        lblLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLimpiarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLimpiarDatosMouseEntered(evt);
            }
        });
        btnLimpiarDatos.add(lblLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        IngresoMaterialPanel.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 160, 60));

        txtndocument.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtndocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtndocument.setText("001-00001");
        txtndocument.setEnabled(false);
        IngresoMaterialPanel.add(txtndocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 110, 30));
        IngresoMaterialPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 710, 30));
        IngresoMaterialPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, 20));
        IngresoMaterialPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 130, 20));

        PanelMateriales.setToolTipText("");
        PanelMateriales.setPreferredSize(new java.awt.Dimension(200, 400));

        materiales.setBackground(new java.awt.Color(255, 255, 255));
        materiales.setPreferredSize(new java.awt.Dimension(970, 1000));
        materiales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vertical1.setBackground(new java.awt.Color(102, 102, 102));
        vertical1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 0, -1, 1000));

        vertical2.setBackground(new java.awt.Color(102, 102, 102));
        vertical2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 0, -1, 1000));

        txtmatricula1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula1.setBorder(null);
        txtmatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula1ActionPerformed(evt);
            }
        });
        txtmatricula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula1KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 120, 26));

        lbldescripcion1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 3, 680, 26));

        txtcantidad1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad1.setBorder(null);
        txtcantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad1ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 3, 120, 26));

        txtmatricula2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula2.setBorder(null);
        txtmatricula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula2ActionPerformed(evt);
            }
        });
        txtmatricula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula2KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 120, 25));

        lbldescripcion2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 34, 680, 25));

        txtcantidad2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad2.setBorder(null);
        txtcantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad2ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 34, 120, 25));

        txtmatricula3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula3.setBorder(null);
        txtmatricula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula3ActionPerformed(evt);
            }
        });
        txtmatricula3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula3KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 120, 25));

        lbldescripcion3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 64, 680, 25));

        txtcantidad3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad3.setBorder(null);
        txtcantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad3ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 64, 120, 25));

        txtmatricula4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula4.setBorder(null);
        txtmatricula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula4ActionPerformed(evt);
            }
        });
        txtmatricula4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula4KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 120, 25));

        lbldescripcion4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 94, 680, 25));

        txtcantidad4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad4.setBorder(null);
        txtcantidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad4ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 94, 120, 25));

        txtmatricula5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula5.setBorder(null);
        txtmatricula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula5ActionPerformed(evt);
            }
        });
        txtmatricula5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula5KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 120, 25));

        lbldescripcion5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 124, 680, 25));

        txtcantidad5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad5.setBorder(null);
        txtcantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad5ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 124, 120, 25));

        txtmatricula6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula6.setBorder(null);
        txtmatricula6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula6ActionPerformed(evt);
            }
        });
        txtmatricula6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula6KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, 120, 25));

        lbldescripcion6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 154, 680, 25));

        txtcantidad6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad6.setBorder(null);
        txtcantidad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad6ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 154, 120, 25));

        txtmatricula7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula7.setBorder(null);
        txtmatricula7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula7ActionPerformed(evt);
            }
        });
        txtmatricula7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula7KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 120, 25));

        lbldescripcion7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 184, 680, 25));

        txtcantidad7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad7.setBorder(null);
        txtcantidad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad7ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 184, 120, 25));

        txtmatricula8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula8.setBorder(null);
        txtmatricula8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula8ActionPerformed(evt);
            }
        });
        txtmatricula8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula8KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, 120, 25));

        txtcantidad8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad8.setBorder(null);
        txtcantidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad8ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 214, 120, 25));

        lbldescripcion8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 214, 680, 25));

        txtcantidad9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad9.setBorder(null);
        txtcantidad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad9ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 244, 120, 25));

        txtmatricula9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula9.setBorder(null);
        txtmatricula9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula9ActionPerformed(evt);
            }
        });
        txtmatricula9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula9KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, 120, 25));

        lbldescripcion9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 244, 680, 25));

        txtmatricula10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula10.setBorder(null);
        txtmatricula10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula10ActionPerformed(evt);
            }
        });
        txtmatricula10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula10KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, 120, 25));

        lbldescripcion10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 274, 680, 25));

        txtcantidad10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad10.setBorder(null);
        txtcantidad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad10ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 274, 120, 25));

        txtcantidad11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad11.setBorder(null);
        txtcantidad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad11ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 304, 120, 25));

        txtmatricula11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula11.setBorder(null);
        txtmatricula11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula11ActionPerformed(evt);
            }
        });
        txtmatricula11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula11KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, 120, 25));

        lbldescripcion11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 304, 680, 25));

        txtmatricula12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtmatricula12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula12.setBorder(null);
        txtmatricula12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula12ActionPerformed(evt);
            }
        });
        txtmatricula12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatricula12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula12KeyTyped(evt);
            }
        });
        materiales.add(txtmatricula12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 120, 25));

        txtcantidad12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad12.setBorder(null);
        txtcantidad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad12ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 334, 120, 25));

        lbldescripcion12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 334, 680, 25));

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 990, 3));

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator11.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 990, 3));

        jSeparator12.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 990, 3));

        jSeparator13.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 990, 3));

        jSeparator14.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator14.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 990, 3));

        jSeparator15.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 990, 3));

        jSeparator16.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator16.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 990, 3));

        jSeparator17.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator17.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 990, 3));

        jSeparator18.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator18.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 990, 3));

        jSeparator19.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator19.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 990, 3));

        jSeparator20.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator20.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 990, 3));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 990, 3));

        PanelMateriales.setViewportView(materiales);

        IngresoMaterialPanel.add(PanelMateriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 990, 180));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setText("Cantidad");
        IngresoMaterialPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 80, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setText("Matrícula");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        IngresoMaterialPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setText("Descripción");
        IngresoMaterialPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 90, 20));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        IngresoMaterialPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 20, 20));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        IngresoMaterialPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 20));

        btnHistorial.setBackground(new java.awt.Color(13, 71, 161));
        btnHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHistorial.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setText("Ver Guias");
        lblHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHistorialMouseEntered(evt);
            }
        });
        btnHistorial.add(lblHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        IngresoMaterialPanel.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresoMaterialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresoMaterialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
       
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtSSTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSSTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSTMousePressed

    private void txtSSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSTActionPerformed

    private void lblLimpiarDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarDatosMouseEntered
        
    }//GEN-LAST:event_lblLimpiarDatosMouseEntered

    private void txtSSTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSTKeyTyped
        if (txtSST.getText().length()>7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSSTKeyTyped

    private void lblGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMousePressed
  
        //AGREGAR AQUI PARA GUARDAR
        
        
        
    }//GEN-LAST:event_lblGuardarMousePressed

    private void txtcantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad1ActionPerformed

    private void txtmatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula1ActionPerformed

    private void txtmatricula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula2ActionPerformed

    private void txtcantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad2ActionPerformed

    private void txtmatricula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula3ActionPerformed

    private void txtcantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad3ActionPerformed

    private void txtmatricula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula4ActionPerformed

    private void txtcantidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad4ActionPerformed

    private void txtmatricula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula5ActionPerformed

    private void txtcantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad5ActionPerformed

    private void txtmatricula6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula6ActionPerformed

    private void txtcantidad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad6ActionPerformed

    private void txtmatricula7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula7ActionPerformed

    private void txtcantidad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad7ActionPerformed

    private void txtmatricula8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula8ActionPerformed

    private void txtcantidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad8ActionPerformed

    private void txtcantidad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad9ActionPerformed

    private void txtmatricula9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula9ActionPerformed

    private void txtmatricula10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula10ActionPerformed

    private void txtcantidad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad10ActionPerformed

    private void txtcantidad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad11ActionPerformed

    private void txtmatricula11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula11ActionPerformed

    private void txtmatricula12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula12ActionPerformed

    private void txtcantidad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad12ActionPerformed

    private void txtmatricula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula1KeyTyped
        // TODO add your handling code here:
        if (txtmatricula1.getText().length()>=10) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtmatricula1KeyTyped

    private void txtmatricula2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula2KeyTyped
        // TODO add your handling code here:
        if (txtmatricula2.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula2KeyTyped

    private void txtmatricula3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula3KeyTyped
        // TODO add your handling code here:
        if (txtmatricula3.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula3KeyTyped

    private void txtmatricula4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula4KeyTyped
        // TODO add your handling code here:
        if (txtmatricula4.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula4KeyTyped

    private void txtmatricula5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula5KeyTyped
        // TODO add your handling code here:
        if (txtmatricula5.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula5KeyTyped

    private void txtmatricula6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula6KeyTyped
        // TODO add your handling code here:
        if (txtmatricula6.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula6KeyTyped

    private void txtmatricula7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula7KeyTyped
        // TODO add your handling code here:
        if (txtmatricula7.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula7KeyTyped

    private void txtmatricula8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula8KeyTyped
        // TODO add your handling code here:
        if (txtmatricula8.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula8KeyTyped

    private void txtmatricula9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula9KeyTyped
        // TODO add your handling code here:
        if (txtmatricula9.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula9KeyTyped

    private void txtmatricula10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula10KeyTyped
        // TODO add your handling code here:
        if (txtmatricula10.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula10KeyTyped

    private void txtmatricula11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula11KeyTyped
        // TODO add your handling code here:
        if (txtmatricula11.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula11KeyTyped

    private void txtmatricula12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula12KeyTyped
        // TODO add your handling code here:
        if (txtmatricula12.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatricula12KeyTyped

    private void txtmatricula1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula1KeyReleased
        // TODO add your handling code here:
        
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula1.getText().equals(matricula[i])) {
                lbldescripcion1.setText(descripcion[i]);
                material1=idmatricula[i];
            } else if(txtmatricula1.getText().equals("")){
                lbldescripcion1.setText("");
            }                
        } 
    }//GEN-LAST:event_txtmatricula1KeyReleased

    private void txtmatricula2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula2KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula2.getText().equals(matricula[i])) {
                lbldescripcion2.setText(descripcion[i]);
                material2=idmatricula[i];
            } else if(txtmatricula2.getText().equals("")){
                lbldescripcion2.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula2KeyReleased

    private void txtmatricula3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula3KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula3.getText().equals(matricula[i])) {
                lbldescripcion3.setText(descripcion[i]);                
                material3=idmatricula[i];
            } else if(txtmatricula3.getText().equals("")){
                lbldescripcion3.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula3KeyReleased

    private void txtmatricula4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula4KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula4.getText().equals(matricula[i])) {
                lbldescripcion4.setText(descripcion[i]);
                material4=idmatricula[i];
            } else if(txtmatricula4.getText().equals("")){
                lbldescripcion4.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula4KeyReleased

    private void txtmatricula5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula5KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula5.getText().equals(matricula[i])) {
              lbldescripcion5.setText(descripcion[i]);
              material5=idmatricula[i];
      } else if(txtmatricula5.getText().equals("")){
              lbldescripcion5.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula5KeyReleased

    private void txtmatricula6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula6KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula6.getText().equals(matricula[i])) {
              lbldescripcion6.setText(descripcion[i]);
              material6=idmatricula[i];
      } else if(txtmatricula6.getText().equals("")){
              lbldescripcion6.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula6KeyReleased

    private void txtmatricula7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula7KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula7.getText().equals(matricula[i])) {
              lbldescripcion7.setText(descripcion[i]);
              material7=idmatricula[i];
      } else if(txtmatricula7.getText().equals("")){
              lbldescripcion7.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula7KeyReleased

    private void txtmatricula8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula8KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula8.getText().equals(matricula[i])) {
              lbldescripcion8.setText(descripcion[i]);
              material8=idmatricula[i];
      } else if(txtmatricula8.getText().equals("")){
              lbldescripcion8.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula8KeyReleased

    private void txtmatricula9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula9KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula9.getText().equals(matricula[i])) {
              lbldescripcion9.setText(descripcion[i]);
              material9=idmatricula[i];
      } else if(txtmatricula9.getText().equals("")){
              lbldescripcion9.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula9KeyReleased

    private void txtmatricula10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula10KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula10.getText().equals(matricula[i])) {
              lbldescripcion10.setText(descripcion[i]);
              material10=idmatricula[i];
      } else if(txtmatricula10.getText().equals("")){
              lbldescripcion10.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula10KeyReleased

    private void txtmatricula11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula11KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula11.getText().equals(matricula[i])) {
              lbldescripcion11.setText(descripcion[i]);
              material11=idmatricula[i];
      } else if(txtmatricula11.getText().equals("")){
              lbldescripcion11.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula11KeyReleased

    private void txtmatricula12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula12KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < matricula.length; i++) {
            if (txtmatricula12.getText().equals(matricula[i])) {
              lbldescripcion12.setText(descripcion[i]);
              material12=idmatricula[i];
      } else if(txtmatricula12.getText().equals("")){
              lbldescripcion12.setText("");
            }                
        }
    }//GEN-LAST:event_txtmatricula12KeyReleased

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
        if (txtSST.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar el numero de obra");
        } else {
            guardardatos();
            LimpiarDatos();
            JOptionPane.showMessageDialog(null,"Guia Registrada con Exito");
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblLimpiarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarDatosMouseClicked
        // TODO add your handling code here:
        LimpiarDatos();
    }//GEN-LAST:event_lblLimpiarDatosMouseClicked

    private void lblHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseClicked
        // TODO add your handling code here:
        MostrarData d = new MostrarData();       
        d.DataGuiasIngresadas();
        d.Ingreso("ingreso");
        d.setVisible(true);
    }//GEN-LAST:event_lblHistorialMouseClicked

    private void lblHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHistorialMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        MostrarData d = new MostrarData();       
        d.DataMateriales();
        d.Material("material");
        d.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IngresoMaterialPanel;
    private javax.swing.JScrollPane PanelMateriales;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnHistorial;
    private javax.swing.JPanel btnLimpiarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblLimpiarDatos;
    private javax.swing.JLabel lbldescripcion1;
    private javax.swing.JLabel lbldescripcion10;
    private javax.swing.JLabel lbldescripcion11;
    private javax.swing.JLabel lbldescripcion12;
    private javax.swing.JLabel lbldescripcion2;
    private javax.swing.JLabel lbldescripcion3;
    private javax.swing.JLabel lbldescripcion4;
    private javax.swing.JLabel lbldescripcion5;
    private javax.swing.JLabel lbldescripcion6;
    private javax.swing.JLabel lbldescripcion7;
    private javax.swing.JLabel lbldescripcion8;
    private javax.swing.JLabel lbldescripcion9;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuario1;
    private javax.swing.JLabel lblusuario2;
    private javax.swing.JPanel materiales;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtSST;
    private javax.swing.JTextField txtcantidad1;
    private javax.swing.JTextField txtcantidad10;
    private javax.swing.JTextField txtcantidad11;
    private javax.swing.JTextField txtcantidad12;
    private javax.swing.JTextField txtcantidad2;
    private javax.swing.JTextField txtcantidad3;
    private javax.swing.JTextField txtcantidad4;
    private javax.swing.JTextField txtcantidad5;
    private javax.swing.JTextField txtcantidad6;
    private javax.swing.JTextField txtcantidad7;
    private javax.swing.JTextField txtcantidad8;
    private javax.swing.JTextField txtcantidad9;
    private javax.swing.JTextField txtmatricula1;
    private javax.swing.JTextField txtmatricula10;
    private javax.swing.JTextField txtmatricula11;
    private javax.swing.JTextField txtmatricula12;
    private javax.swing.JTextField txtmatricula2;
    private javax.swing.JTextField txtmatricula3;
    private javax.swing.JTextField txtmatricula4;
    private javax.swing.JTextField txtmatricula5;
    private javax.swing.JTextField txtmatricula6;
    private javax.swing.JTextField txtmatricula7;
    private javax.swing.JTextField txtmatricula8;
    private javax.swing.JTextField txtmatricula9;
    private javax.swing.JLabel txtndocument;
    private javax.swing.JSeparator vertical1;
    private javax.swing.JSeparator vertical2;
    // End of variables declaration//GEN-END:variables
}
