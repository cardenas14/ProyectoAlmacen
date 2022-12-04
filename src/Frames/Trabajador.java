
package Frames;

import Metodos_sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Trabajador extends javax.swing.JPanel {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar(); 
    private int id;
    
    public Trabajador() {
        initComponents();
        actualID();
    }

    public void actualID(){   
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select max(id)+1 from employee;");            
            while (resultado.next()) { 
                id= Integer.parseInt(resultado.getString(1));                             
            }           
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        if (id==0) {
                id=1;
            }         
        txtid.setText("001-0000"+id);
    }
    
    public void GuardarDatos(){      
        String  nombre, apellido,direccion,cargo,area;
        int dni;
        nombre = txtnombres.getText();
        apellido = txtapellidos.getText();
        direccion = txtdireccion.getText();
        cargo = String.valueOf(cbocargo.getSelectedItem());
        area = String.valueOf(cboarea.getSelectedItem());
        dni = Integer.parseInt(txtdni.getText());
        try {
            PreparedStatement guardar = conect.prepareCall("insert into employee(name,last_name,dni,direction,position,area) values"
                    + "( '"+ nombre +"','"+ apellido +"',"+ dni +",'"+ direccion +"','"+cargo+"','"+area+"'   )");
            guardar.executeUpdate();                      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
    }
    
    public void LimpiarDatos(){
        txtapellidos.setText("");
        txtdireccion.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        actualID();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuario = new javax.swing.JPanel();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        cbocargo = new javax.swing.JComboBox<>();
        cboarea = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JPanel();
        btnguardar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNdoc = new javax.swing.JLabel();
        lblNdoc1 = new javax.swing.JLabel();
        lblNdoc2 = new javax.swing.JLabel();
        lblNdoc3 = new javax.swing.JLabel();
        lblNdoc4 = new javax.swing.JLabel();
        lblNdoc5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtid = new javax.swing.JLabel();
        lblNdoc6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnLimpiar1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        panelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelUsuario.setPreferredSize(new java.awt.Dimension(1050, 580));
        panelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombres.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtnombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombres.setBorder(null);
        txtnombres.setPreferredSize(new java.awt.Dimension(200, 20));
        txtnombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombresMousePressed(evt);
            }
        });
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        panelUsuario.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 240, 40));

        txtapellidos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtapellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidos.setBorder(null);
        txtapellidos.setPreferredSize(new java.awt.Dimension(200, 20));
        txtapellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtapellidosMousePressed(evt);
            }
        });
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        panelUsuario.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 240, 40));

        txtdireccion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdireccion.setBorder(null);
        txtdireccion.setPreferredSize(new java.awt.Dimension(200, 20));
        txtdireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdireccionMousePressed(evt);
            }
        });
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        panelUsuario.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 440, 40));

        txtdni.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdni.setBorder(null);
        txtdni.setPreferredSize(new java.awt.Dimension(200, 20));
        txtdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdniMousePressed(evt);
            }
        });
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        panelUsuario.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, 40));

        cbocargo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cbocargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ayudante", "Operario", "Capataz", "Supervisor", "Conductor" }));
        cbocargo.setToolTipText("");
        cbocargo.setBorder(null);
        cbocargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocargoActionPerformed(evt);
            }
        });
        panelUsuario.add(cbocargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 40));

        cboarea.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cboarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja Tension", "Media Tension", "Alta Tension" }));
        cboarea.setToolTipText("");
        cboarea.setBorder(null);
        cboarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboareaActionPerformed(evt);
            }
        });
        panelUsuario.add(cboarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 150, 40));

        btnGuardar.setBackground(new java.awt.Color(13, 71, 161));
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardar.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnguardar.setText("Guardar Datos");
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnguardarMousePressed(evt);
            }
        });
        btnGuardar.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 100));

        panelUsuario.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 190, 100));

        btnLimpiar.setBackground(new java.awt.Color(13, 71, 161));
        btnLimpiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Limpiar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        btnLimpiar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        panelUsuario.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 100, 50));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registrar nuevo trabajador");
        panelUsuario.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 710, 60));
        panelUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 710, 30));

        lblNdoc.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc.setText("ID");
        panelUsuario.add(lblNdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 40));

        lblNdoc1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc1.setText("Dirección :");
        panelUsuario.add(lblNdoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 210, 40));

        lblNdoc2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc2.setText("Nombres:");
        panelUsuario.add(lblNdoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 40));

        lblNdoc3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc3.setText("DNI :");
        panelUsuario.add(lblNdoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 210, 40));

        lblNdoc4.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc4.setText("Cargo :");
        panelUsuario.add(lblNdoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 240, 40));

        lblNdoc5.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc5.setText("Área de trabajo :");
        panelUsuario.add(lblNdoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 240, 40));
        panelUsuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 400, 20));
        panelUsuario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, 20));
        panelUsuario.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 240, 20));
        panelUsuario.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 240, 20));

        txtid.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtid.setText("001-00001");
        txtid.setToolTipText("");
        txtid.setEnabled(false);
        panelUsuario.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 40));

        lblNdoc6.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc6.setText("Apellidos: ");
        panelUsuario.add(lblNdoc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 210, 40));
        panelUsuario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 240, 20));

        btnLimpiar1.setBackground(new java.awt.Color(13, 71, 161));
        btnLimpiar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        btnLimpiar1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        panelUsuario.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionMousePressed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtnombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombresMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresMousePressed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtdniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdniMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniMousePressed

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void btnguardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMousePressed
     
    }//GEN-LAST:event_btnguardarMousePressed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        
        if (txtdni.getText().length()>7) {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtapellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosMousePressed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void cbocargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocargoActionPerformed

    private void cboareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboareaActionPerformed

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        // TODO add your handling code here:
       // AQUI PROGRAMAR INGRESO DE DATA  cbocargo.getSelectedItem();
       
        if (txtid.getText().equals("") || txtapellidos.getText().equals("") || txtdireccion.getText().equals("") || 
                txtnombres.getText().equals("")  || cboarea.getSelectedItem().equals("") || cbocargo.getSelectedItem().equals("") ) {
            JOptionPane.showMessageDialog( null, "Falta ingresar datos");
        } else {
            GuardarDatos();
            LimpiarDatos();
            JOptionPane.showMessageDialog( null, "Registro exitoso datos");
        }
       
             
       
       
       
    }//GEN-LAST:event_btnguardarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        LimpiarDatos();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        MostrarData d = new MostrarData();
        d.DataTrabajadores();
        d.Trabajador("trabajador");
        d.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnLimpiar1;
    private javax.swing.JLabel btnguardar;
    private javax.swing.JComboBox<String> cboarea;
    private javax.swing.JComboBox<String> cbocargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblNdoc;
    private javax.swing.JLabel lblNdoc1;
    private javax.swing.JLabel lblNdoc2;
    private javax.swing.JLabel lblNdoc3;
    private javax.swing.JLabel lblNdoc4;
    private javax.swing.JLabel lblNdoc5;
    private javax.swing.JLabel lblNdoc6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
