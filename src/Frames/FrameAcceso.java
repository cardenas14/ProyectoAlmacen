
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FrameAcceso extends javax.swing.JFrame {

    
    int xMouse, yMouse;
    private String contras;
    private String user;
    
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    
    
    public FrameAcceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public void UsuariosContra(){       
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select password from users where user like '"+ txtUsuario.getText() +"';");            
            while (resultado.next()) {             
                  contras = resultado.getString(1);                  
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO");
        }        
    }
    
    public String ContinuarDatos() {        
        user = txtUsuario.getText();   
        return user;            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        lblTituloInicioSesion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imgHangar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblContra = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        btnMoverPanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1450, 850));
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFondo.setMinimumSize(new java.awt.Dimension(1450, 850));
        PanelFondo.setPreferredSize(new java.awt.Dimension(1450, 850));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("USUARIO");
        PanelFondo.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 40));

        lblTituloInicioSesion.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lblTituloInicioSesion.setText("INICIAR SESION");
        PanelFondo.add(lblTituloInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 250, 50));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dimensiones personalizadas 810x200 px.png"))); // NOI18N
        PanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 770, 140));

        imgHangar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hangar almacen.gif"))); // NOI18N
        imgHangar.setToolTipText("");
        imgHangar.setAutoscrolls(true);
        imgHangar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgHangar.setName(""); // NOI18N
        imgHangar.setPreferredSize(new java.awt.Dimension(800, 1004));
        imgHangar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelFondo.add(imgHangar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 890, 810));

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 20));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        PanelFondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 410, 40));
        PanelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 400, 10));

        lblContra.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContra.setText("CONTRASEÑA");
        PanelFondo.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 130, 40));
        PanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 400, 10));

        txtContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("**********");
        txtContraseña.setBorder(null);
        txtContraseña.setMinimumSize(new java.awt.Dimension(70, 20));
        txtContraseña.setPreferredSize(new java.awt.Dimension(200, 20));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });
        PanelFondo.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 410, 40));

        btnEntrar.setBackground(new java.awt.Color(13, 71, 161));
        btnEntrar.setToolTipText("");
        btnEntrar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });

        lblEntrar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEntrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelFondo.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 120, 70));

        btnSalir.setBackground(new java.awt.Color(13, 71, 161));
        btnSalir.setToolTipText("");
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 50));

        lblSalir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        PanelFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 120, 50));

        btnMoverPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnMoverPanel.setForeground(new java.awt.Color(0, 204, 204));
        btnMoverPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMoverPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnMoverPanelMouseDragged(evt);
            }
        });
        btnMoverPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoverPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoverPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMoverPanelMousePressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout btnMoverPanelLayout = new javax.swing.GroupLayout(btnMoverPanel);
        btnMoverPanel.setLayout(btnMoverPanelLayout);
        btnMoverPanelLayout.setHorizontalGroup(
            btnMoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMoverPanelLayout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1454, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMoverPanelLayout.setVerticalGroup(
            btnMoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMoverPanelLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelFondo.add(btnMoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO EMPRESA.png"))); // NOI18N
        PanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoverPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverPanelMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();        
        
        
        
        
    }//GEN-LAST:event_btnMoverPanelMousePressed

    private void btnMoverPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverPanelMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
        
        
        
    }//GEN-LAST:event_btnMoverPanelMouseDragged

    //BOTON SALIR
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        btnSalir.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        btnSalir.setBackground(new Color(13,71,161 ));//PONER EL COLOR ORIGINAL
    }//GEN-LAST:event_lblSalirMouseExited
//********************************************************************
    
    
    //CUADROS DE TEXTO
    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
//QUITAR DATOS AL APRETAR CLICK EN LA BARRA DONDE SE ESCRIBE EL USUARIO

        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            txtContraseña.setText("**********");
            txtContraseña.setForeground(Color.gray);
        }     
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        //QUITAR CONTRASEÑA EN LA BARRA DEL CONTRASEÑA
        if (String.valueOf(txtContraseña.getPassword()).equals("**********")) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
              
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }     
    }//GEN-LAST:event_txtContraseñaMousePressed
    //********************************************************************
    
    
    
    //BOTON MOVER PANEL
    private void btnMoverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverPanelMouseEntered
        btnMoverPanel.setBackground(Color.black);
    }//GEN-LAST:event_btnMoverPanelMouseEntered

    private void btnMoverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverPanelMouseExited
        btnMoverPanel.setBackground(Color.white);
    }//GEN-LAST:event_btnMoverPanelMouseExited
//********************************************************************
    
    
    
    //BOTON ENTRAR
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
       //PROGRAMAR PARA INGRESAR A AL SISTEMA
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(new Color(13,71,161));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void lblEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMousePressed

        String user = txtUsuario.getText();
        String password = String.valueOf(txtContraseña.getPassword());        
        UsuariosContra();      
        if (password.equals(contras)) {
            ContinuarDatos();//AGREGAR METODO PARA CONTINUAR EN EL OTRO FORMULARIO
            PrincipalTablero p = new PrincipalTablero();
            p.usuario(user);
            p.setVisible(true);
            dispose();                                      
        } else{
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
            txtContraseña.setText("");                
            txtContraseña.requestFocus();            
        }  
    }//GEN-LAST:event_lblEntrarMousePressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtContraseñaKeyReleased
//********************************************************************
    
    
    
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel btnMoverPanel;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel imgHangar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTituloInicioSesion;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables




}
