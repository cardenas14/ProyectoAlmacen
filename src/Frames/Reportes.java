
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JPanel {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    private String nombre[] = new String[10000];
    private String apellido[] = new String[10000];
    private String dni[] = new String[10000];
    private String nombres[] = new String[10000];
    private String sst[] = new String[10000];
    private double monto[] = new double[10000];

    public Reportes() {
        initComponents();
        lblTrabajador.setVisible(false);
        cboNombre.setVisible(false);
        separador2.setVisible(false);
        ComboBoxTipoReporte();
        ComboBoxTrabajador();
    }
    
    public void ComboBoxTipoReporte(){
        cboTipoReporte.addItem("Elegir el tipo de reporte que desee");
        cboTipoReporte.addItem("Para Gerencia");
        cboTipoReporte.addItem("Para Trabajador");
    }
    
    public void Gerencial(){
        int i=0;
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call ReporteGerencial();");
            while (resultado.next()) {                
                nombres[i] = resultado.getString(1);
                sst[i] = resultado.getString(2);
                monto[i] = Double.parseDouble(resultado.getString(3));
                i++;
            }
            i--;
        } catch (Exception e) {
        }
    }
    
    public void ListarDataGerencial(){
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("Nombre del trabajador");
        tcliente.addColumn("SST - N de obra");
        tcliente.addColumn("Monto en deuda");
        jTable1.setModel(tcliente);
        String datos[] = new String[4];
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call ReporteGerencial();");
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);
        } catch (Exception e) {
        }
    }
    
    public void ListarDataTrabajador(){
        if (lbldni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Eliga el nombre del trabajador");
        } else {
        DefaultTableModel tcliente = new DefaultTableModel();        
        tcliente.addColumn("SST - N de obra");
        tcliente.addColumn("MATRICULA");
        tcliente.addColumn("DESCRIPCION");
        tcliente.addColumn("CANT. DEUDA");
        jTable1.setModel(tcliente);
        String datos[] = new String[4];       
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call ReporteTrabajador("+ lbldni.getText() +");");
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);
        } catch (Exception e) {
        }
        }
        
        
        
        
        
    }
    
    public void ComboBoxTrabajador(){
        //cboTrabajadores.addItem("Elegir personal a despachar");
        int i=0;        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select name,last_name,dni,id from employee order by last_name asc;");
            while (resultado.next()) {                            
                nombre[i] = resultado.getString(1);
                apellido[i] = resultado.getString(2);
                dni[i] = resultado.getString(3);
                i++;
            }
            i--;
            for (int j = 0; j <=i ; j++) {                
                cboNombre.addItem(apellido[j]+", "+nombre[j]+" - "+dni[j]);                
            }                    
        } catch (Exception e) {
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DespacharMaterialPanel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTrabajador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        tblGerencial = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tblCapataz = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnLimpiarDatos = new javax.swing.JPanel();
        lblLimpiarDatos = new javax.swing.JLabel();
        btnExtraer = new javax.swing.JPanel();
        lblExtraer = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        separador3 = new javax.swing.JSeparator();
        cboNombre = new javax.swing.JComboBox<>();
        cboTipoReporte = new javax.swing.JComboBox<>();
        lbldni = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 580));

        DespacharMaterialPanel.setBackground(new java.awt.Color(255, 255, 255));
        DespacharMaterialPanel.setPreferredSize(new java.awt.Dimension(1050, 580));
        DespacharMaterialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Reportes de materiales pendientes");
        DespacharMaterialPanel.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 710, 60));

        lblTrabajador.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTrabajador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajador.setText("Nombre Trabajador :");
        DespacharMaterialPanel.add(lblTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 200, 40));
        DespacharMaterialPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 710, 30));

        lblFecha.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Tipo de reporte  :");
        DespacharMaterialPanel.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 200, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Matrícula", "Descripción", "Cantidad", "Cant. Liquidada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGerencial.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(600);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        DespacharMaterialPanel.add(tblGerencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1010, 210));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Matrícula", "Descripción", "Cantidad", "Cant. Liquidada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCapataz.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(600);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        DespacharMaterialPanel.add(tblCapataz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1010, 210));

        btnGuardar.setBackground(new java.awt.Color(13, 71, 161));
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGuardar.setFont(new java.awt.Font("Roboto Black", 1, 27)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Imprimir");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        btnGuardar.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        DespacharMaterialPanel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 280, 80));

        btnLimpiarDatos.setBackground(new java.awt.Color(13, 71, 161));
        btnLimpiarDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLimpiarDatos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblLimpiarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiarDatos.setText("Nuevo Reporte");
        lblLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarDatos.add(lblLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        DespacharMaterialPanel.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 160, 60));

        btnExtraer.setBackground(new java.awt.Color(18, 90, 173));
        btnExtraer.setToolTipText("");
        btnExtraer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExtraer.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        lblExtraer.setForeground(new java.awt.Color(255, 255, 255));
        lblExtraer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExtraer.setText("Generar Reporte");
        lblExtraer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExtraer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExtraerMouseClicked(evt);
            }
        });
        btnExtraer.add(lblExtraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        DespacharMaterialPanel.add(btnExtraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 180, 150, 40));
        DespacharMaterialPanel.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 140, 10));
        DespacharMaterialPanel.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 310, 20));

        cboNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion" }));
        cboNombre.setBorder(null);
        cboNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNombreItemStateChanged(evt);
            }
        });
        cboNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboNombreMouseReleased(evt);
            }
        });
        cboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNombreActionPerformed(evt);
            }
        });
        DespacharMaterialPanel.add(cboNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 310, 40));

        cboTipoReporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cboTipoReporte.setBorder(null);
        cboTipoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoReporteActionPerformed(evt);
            }
        });
        DespacharMaterialPanel.add(cboTipoReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 310, 40));

        lbldni.setForeground(new java.awt.Color(255, 255, 255));
        lbldni.setText("jLabel1");
        DespacharMaterialPanel.add(lbldni, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DespacharMaterialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DespacharMaterialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoReporteActionPerformed
        // TODO add your handling code here:
        if (cboTipoReporte.getSelectedItem().equals("Para Gerencia")) {
            cboNombre.setVisible(false);
            lblTrabajador.setVisible(false);
            //cboNombre.removeAllItems();
        } else if (cboTipoReporte.getSelectedItem().equals("Para Trabajador")){
            cboNombre.setVisible(true);
            lblTrabajador.setVisible(true);
        } else if(cboTipoReporte.getSelectedItem().equals("Elegir el tipo de reporte que desee")){
            cboNombre.setVisible(false);
            lblTrabajador.setVisible(false);
        }
    }//GEN-LAST:event_cboTipoReporteActionPerformed

    private void lblExtraerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExtraerMouseClicked
        // TODO add your handling code here:        
        if (cboTipoReporte.getSelectedItem().equals("Para Gerencia")) {
            ListarDataGerencial();
        } else if(cboTipoReporte.getSelectedItem().equals("Para Trabajador")){
                    ListarDataTrabajador();
        }
        

    }//GEN-LAST:event_lblExtraerMouseClicked

    private void cboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNombreActionPerformed
        // TODO add your handling code here:
        if (cboNombre.getSelectedItem().equals("Elige una opcion")) {
                    lbldni.setText("");
                    DefaultTableModel tcliente = new DefaultTableModel();        
                    tcliente.addColumn("SST - N de obra");
        tcliente.addColumn("MATRICULA");
        tcliente.addColumn("DESCRIPCION");
        tcliente.addColumn("CANT. DEUDA");
        jTable1.setModel(tcliente);
                    
        }        
        try {           
                for (int i = 0; i < 10000; i++) {
                  if (cboNombre.getSelectedItem().equals(apellido[i]+", "+nombre[i]+" - "+dni[i])) {
                      lbldni.setText(dni[i]);
                        }
                }
                
                
                    
        } catch (Exception e) {            
        }   
    }//GEN-LAST:event_cboNombreActionPerformed

    private void cboNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNombreItemStateChanged
 
//                      jTable1.removeAll();
//                      lbldni.setText("");
                  
    }//GEN-LAST:event_cboNombreItemStateChanged

    private void cboNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboNombreMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboNombreMouseReleased

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
        
        
        if (cboTipoReporte.getSelectedItem().equals("Para Gerencia")) {
            Imprimir imp = new Imprimir();
            imp.TipoReporte(cboTipoReporte.getSelectedItem().toString());
            imp.DNI(lbldni.getText());        
            imp.setVisible(true);
        } else if(cboTipoReporte.getSelectedItem().equals("Para Trabajador")){
            ImprimirTrabajador imp2 = new ImprimirTrabajador();
            imp2.TipoReporte(cboTipoReporte.getSelectedItem().toString());
            imp2.DNI(lbldni.getText());
            imp2.Nombre(cboNombre.getSelectedItem().toString());
            imp2.setVisible(true);                        
        }
        
        
        
    }//GEN-LAST:event_lblGuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DespacharMaterialPanel;
    private javax.swing.JPanel btnExtraer;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnLimpiarDatos;
    private javax.swing.JComboBox<String> cboNombre;
    private javax.swing.JComboBox<String> cboTipoReporte;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblExtraer;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblLimpiarDatos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajador;
    private javax.swing.JLabel lbldni;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JScrollPane tblCapataz;
    private javax.swing.JScrollPane tblGerencial;
    // End of variables declaration//GEN-END:variables
}
