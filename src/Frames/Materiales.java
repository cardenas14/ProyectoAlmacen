
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Materiales extends javax.swing.JFrame {
    private int xmouse,ymouse;
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    private int id;    
    private String tipo;
    
    public Materiales() {
        initComponents();
        setLocationRelativeTo(null);
        ActualID();
        txtmatricula.requestFocus();
    }
    
    public void guardardatos(){        
        try {            
            PreparedStatement guardar = conect.prepareCall("insert into material(enrollment,description,price) values ('"+txtmatricula.getText()+"','"+txtdescripcion.getText()+"',"+ txtprecio.getText()+");");
            guardar.execute();
            //MostrarData n = new MostrarData();
            //n.DataMateriales();
            JOptionPane.showMessageDialog(null,"Material guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
    }

    public void ActualID(){
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select max(id)+1 from material;");            
            while (resultado.next()) {                            
                id= Integer.parseInt(resultado.getString(1));                    
            }  
        } catch (Exception e) {
        }
        if (id==0) {
                id=1;
            } 
        txtid.setText(String.valueOf(id));
    }
    
    public void LimpiarDatos(){
        txtmatricula.setText("");
        txtdescripcion.setText("");
        txtprecio.setText("");
        txtfechacreacion.setText("");
        txtfechamodificacion.setText("");
        txtmatricula.requestFocus();
        ActualID();
    }    
    
    public void IDMaterial(String x){        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from material where id = "+ x +";");            
            while (resultado.next()) {                
                txtid.setText(resultado.getString(1));
                txtmatricula.setText(resultado.getString(2));
                txtdescripcion.setText(resultado.getString(3));
                txtprecio.setText(resultado.getString(4));
                txtfechacreacion.setText(resultado.getString(5));
                txtfechamodificacion.setText(resultado.getString(6));                        
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarDatos(){
        try {
            PreparedStatement guardar = conect.prepareCall("call ActualizarMaterial("+ txtid.getText() +",'"+ txtmatricula.getText() +"','"+  txtdescripcion.getText() +"',"+ txtprecio.getText() +");");
            guardar.execute();
            JOptionPane.showMessageDialog(null,"Material Actualizado con exito");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void Tipo(String x){
        tipo = x;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmatricula = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtfechacreacion = new javax.swing.JTextField();
        txtfechamodificacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        panelBarraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 509));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 165, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Matricula ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 165, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripcion ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 165, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 165, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha Creacion ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 165, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ultima Modificacion ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 165, 20));

        txtid.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setBorder(null);
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 50, 20));

        txtmatricula.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtmatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatricula.setBorder(null);
        txtmatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatriculaKeyTyped(evt);
            }
        });
        jPanel1.add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 75, 20));

        txtdescripcion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtdescripcion.setBorder(null);
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 500, 20));

        txtprecio.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprecio.setBorder(null);
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 60, 20));

        txtfechacreacion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfechacreacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfechacreacion.setBorder(null);
        txtfechacreacion.setEnabled(false);
        jPanel1.add(txtfechacreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 20));

        txtfechamodificacion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfechamodificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfechamodificacion.setBorder(null);
        txtfechamodificacion.setEnabled(false);
        jPanel1.add(txtfechamodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 20));

        jButton1.setText("Cerrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 245, 130, 50));

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 245, 130, 50));

        jButton3.setText("Limpiar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 245, 130, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 500, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 60, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 10));

        panelBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelBarraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(panelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void panelBarraSuperiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseClicked

    }//GEN-LAST:event_panelBarraSuperiorMouseClicked

    private void panelBarraSuperiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseEntered
        panelBarraSuperior.setBackground(Color.black);
    }//GEN-LAST:event_panelBarraSuperiorMouseEntered

    private void panelBarraSuperiorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseExited
        panelBarraSuperior.setBackground(Color.white);
    }//GEN-LAST:event_panelBarraSuperiorMouseExited

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        LimpiarDatos();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if ( txtid.getText().equals("") || txtmatricula.getText().equals("") || txtdescripcion.getText().equals("") 
                || txtprecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Falta ingresar datos");
        } else if(tipo.equals("actualizar")) {
            ActualizarDatos();
            LimpiarDatos();            
        } else if (tipo.equals("nuevo")){
            guardardatos();
            LimpiarDatos();
        }        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void txtmatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculaKeyTyped
        // TODO add your handling code here:
        if (txtmatricula.getText().length()>7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmatriculaKeyTyped

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
            java.util.logging.Logger.getLogger(Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Materiales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfechacreacion;
    private javax.swing.JTextField txtfechamodificacion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

   
}
