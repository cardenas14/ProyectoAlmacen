
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MostrarData extends javax.swing.JFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar(); 
    private int xmouse,ymouse;
    String valor;
    private String ingreso,despacho,trabajador,material;

    
    public MostrarData() {
        initComponents();
        setLocationRelativeTo(null);
        btnAgregar.setVisible(false);
        btnModificar.setVisible(false);
        btnActualizar.setVisible(false);
        buscarID.setVisible(false);
        buscarMatricula.setVisible(false);
        buscarDescripcion.setVisible(false);
        btnEliminarIngreso.setVisible(false);
        btnEliminarDespacho.setVisible(false);
        btnEliminarMaterial.setVisible(false);
        btnEliminarTrabajador.setVisible(false);
    }  
    
    public void Ingreso(String x){
        ingreso = x;        
    }
    
    public void Despacho(String x){
        despacho = x;        
    }
    
    public void Trabajador(String x){
        trabajador = x;        
    }
    
    public void Material(String x){
        material = x;        
    }    
         
    //AREA DE INGRESAR MATERIAL
    public void DataGuiasIngresadas(){
        btnEliminarIngreso.setVisible(true);
        lblTitulo.setText("HISTORIAL - GUIAS INGRESADAS");
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("N Doc");
        tcliente.addColumn("Administrador");
        tcliente.addColumn("SST");
        tcliente.addColumn("MATRICULA");
        tcliente.addColumn("DESCRIPCION");
        tcliente.addColumn("CANTIDAD");
        jTable1.setModel(tcliente);      
        String datos[] = new String[6];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call DataGuiasIngreso();");
            
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }   
        
    }
    
    public void EliminarGuiaIngreso(){
        int fila = jTable1.getSelectedRow();
        String valor = jTable1.getValueAt(fila, 0).toString();         
        try {
            PreparedStatement eliminar = conect.prepareCall("delete from input_guide where n_document = "+valor+";");
            eliminar.execute();
            DataGuiasIngresadas();
            JOptionPane.showMessageDialog(null,"Guia N:"+ valor+" eliminada con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar, porque existe registros");
        }
    }
    
    //AREA DE DESPACHAR MATERIAL
    
    public void DataGuiasDespachadas(){
        btnEliminarDespacho.setVisible(true);
        lblTitulo.setText("HISTORIAL - GUIAS DESPACHADAS");
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("N Documento");
        tcliente.addColumn("Administrador");
        tcliente.addColumn("SST");
        tcliente.addColumn("Nombre Trabajador");        
        tcliente.addColumn("Matricula");
        tcliente.addColumn("Descripcion");
        tcliente.addColumn("Cantidad");
        tcliente.addColumn("Fecha Despachada");
        jTable1.setModel(tcliente);      
        String datos[] = new String[8];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call DataGuiasDespachadas();");            
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }  
    }
    
    public void EliminarGuiasDespachar(){        
         int fila = jTable1.getSelectedRow();
         String valor = jTable1.getValueAt(fila, 0).toString();         
         try {
            PreparedStatement eliminar = conect.prepareCall("delete from output_guide where n_document = "+valor+";");
            eliminar.execute();
            DataGuiasDespachadas();
            JOptionPane.showMessageDialog(null, "Guia N:"+ valor +" eliminada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar, porque existe registros");
        }        
    }
    
    //AREA DE LOS DATOS DEL MATERIAL
    
    public void DataMateriales(){
        btnEliminarMaterial.setVisible(true);
        btnAgregar.setVisible(true);
        btnModificar.setVisible(true);
        btnActualizar.setVisible(true);
        buscarID.setVisible(true);
        buscarMatricula.setVisible(true);
        buscarDescripcion.setVisible(true);
        lblTitulo.setText("DATA DE MATERIALES");
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("ID Material");
        tcliente.addColumn("Matricula");
        tcliente.addColumn("Descripcion");        
        tcliente.addColumn("Precio");
        tcliente.addColumn("Fecha Creacion");
        tcliente.addColumn("Fecha Modificacion");        
        jTable1.setModel(tcliente);      
        String datos[] = new String[6];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from material");            
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void AgregarDataMateriales(){
        Materiales nuevo = new Materiales();
        nuevo.Tipo("nuevo");
        nuevo.setVisible(true);
    }
    
    public void ModificarDataMateriales(){
        try {
            idMaterial();
            Materiales n = new Materiales();
            n.IDMaterial(valor);
            n.Tipo("actualizar");
            n.setVisible(true);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eliga el material que desea modificar");
        }        
    }
    
    public void idMaterial(){        
        int fila = jTable1.getSelectedRow();
        valor = jTable1.getValueAt(fila, 0).toString();     
        //JOptionPane.showMessageDialog(null, valor);
    }
    
    public void EliminarDataMateriales(){
        int fila = jTable1.getSelectedRow();
        String valor = jTable1.getValueAt(fila, 0).toString();         
        try {
            PreparedStatement eliminar = conect.prepareCall("delete from material where id = "+valor+";");
            eliminar.execute();
            DataMateriales();
            JOptionPane.showMessageDialog(null,"Material eliminado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar un material");
        }
    }    
    
    public void BuscarID(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID Material");
        tabla.addColumn("Matricula");
        tabla.addColumn("Descripcion");        
        tabla.addColumn("Precio");
        tabla.addColumn("Fecha Creacion");
        tabla.addColumn("Fecha Modificacion");
        jTable1.setModel(tabla);
        String datos[] = new String[6];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from material where id = "+ buscarID.getText() +";");
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tabla.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        
    }
    
    public void BuscarMatricula(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID Material");
        tabla.addColumn("Matricula");
        tabla.addColumn("Descripcion");        
        tabla.addColumn("Precio");
        tabla.addColumn("Fecha Creacion");
        tabla.addColumn("Fecha Modificacion");
        jTable1.setModel(tabla);
        String datos[] = new String[6];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from material where enrollment like '"+ buscarMatricula.getText() +"%';");
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tabla.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BuscarDescripcion(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID Material");
        tabla.addColumn("Matricula");
        tabla.addColumn("Descripcion");        
        tabla.addColumn("Precio");
        tabla.addColumn("Fecha Creacion");
        tabla.addColumn("Fecha Modificacion");
        jTable1.setModel(tabla);
        String datos[] = new String[6];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from material where description like '"+ buscarDescripcion.getText() +"%';");
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tabla.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
   
    //AREA DE LOS TRABAJADORES
    
    public void DataTrabajadores(){
        btnEliminarTrabajador.setVisible(true);
        lblTitulo.setText("DATA DE LOS TRABAJADORES");
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("ID");
        tcliente.addColumn("Nombres");
        tcliente.addColumn("Apellidos");        
        tcliente.addColumn("DNI");
        tcliente.addColumn("Direccion");
        tcliente.addColumn("Cargo");
        tcliente.addColumn("Area");
        tcliente.addColumn("Fecha Creacion");
        tcliente.addColumn("Fecha Modificacion");        
        jTable1.setModel(tcliente);      
        String datos[] = new String[11];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from employee");            
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                tcliente.addRow(datos);
            }
            jTable1.setModel(tcliente);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }        
    }
    
    public void EliminarDataTrabajadores(){
        int fila = jTable1.getSelectedRow();
        String valor = jTable1.getValueAt(fila, 3).toString();         
        try {
            PreparedStatement eliminar = conect.prepareCall("delete from employee where dni = "+valor+";");
            eliminar.execute();
            DataTrabajadores();
            JOptionPane.showMessageDialog(null,"Trabajador eliminado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar al trabajador");
        }
    }
    
    // AREA DE MOSTRAR MATERIALES LIQUIDADOS
    
    public void DataLiquidaciones(){
        lblTitulo.setText("HISTORIAL - LIQUIDACIONES DE LOS TRABAJADORES");
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("ID");
        tcliente.addColumn("N Documento");
        tcliente.addColumn("Fecha Liquidada");        
        tcliente.addColumn("Nombre Trabajador");
        tcliente.addColumn("SST");
        tcliente.addColumn("Matricula");
        tcliente.addColumn("Descripcion");
        tcliente.addColumn("Cant. Despachada");
        tcliente.addColumn("Cant. Liquidada");        
        jTable1.setModel(tcliente);      
        String datos[] = new String[11];        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call DataLiquidaciones();");            
            while (resultado.next()) {                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                tcliente.addRow(datos);
            }
            //jTable1.setAlignmentY(CENTER_ALIGNMENT);
            jTable1.setModel(tcliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }        
    }   
  
    //*****************
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        buscarID = new javax.swing.JTextField();
        buscarMatricula = new javax.swing.JTextField();
        buscarDescripcion = new javax.swing.JTextField();
        btnEliminarMaterial = new javax.swing.JButton();
        btnEliminarIngreso = new javax.swing.JButton();
        btnEliminarDespacho = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(panelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(" Ver listado");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 10));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N Doc", "SST", "MATRICULA", "DESCRIPCION", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(650);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 400));

        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 150, 50));

        btnCerrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 150, 50));

        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 150, 50));

        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 150, 50));

        buscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarIDKeyReleased(evt);
            }
        });
        jPanel1.add(buscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 109, 50, 20));

        buscarMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarMatriculaKeyReleased(evt);
            }
        });
        jPanel1.add(buscarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 109, 100, 20));

        buscarDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarDescripcionKeyReleased(evt);
            }
        });
        jPanel1.add(buscarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 109, 850, 20));

        btnEliminarMaterial.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEliminarMaterial.setText("Eliminar");
        btnEliminarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMaterialMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 50));

        btnEliminarIngreso.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEliminarIngreso.setText("Eliminar");
        btnEliminarIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarIngresoMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminarIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 50));

        btnEliminarDespacho.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEliminarDespacho.setText("Eliminar");
        btnEliminarDespacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarDespachoMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminarDespacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 50));

        btnEliminarTrabajador.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEliminarTrabajador.setText("Eliminar");
        btnEliminarTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarTrabajadorMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
        ModificarDataMateriales();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

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

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        AgregarDataMateriales();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jScrollPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseEntered
        // TODO add your handling code here:
        //DataMateriales();
    }//GEN-LAST:event_jScrollPane1MouseEntered

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
        // TODO add your handling code here:
        //DataMateriales();
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //DataMateriales();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        DataMateriales();
        JOptionPane.showMessageDialog(null,"Data de Materiales Actualizados");
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMaterialMouseClicked
        // TODO add your handling code here:

//        if (ingreso.equals("ingreso")) {
//            EliminarGuiaIngreso();
//        }
//
//        if (despacho.equals("despacho")) {
//            EliminarGuiasDespachar();
//        }
//
//        if (trabajador.equals("trabajador")) {
//            EliminarDataTrabajadores();
//        }
//        
        if (material.equals("material")) {
            EliminarDataMateriales();
        }

        
    }//GEN-LAST:event_btnEliminarMaterialMouseClicked

    private void buscarIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarIDKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {            
            if (buscarID.getText().equals("")) {
                DataMateriales();
            } else {
                try {
            BuscarID();
                } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
                }
            }           
        }
    }//GEN-LAST:event_buscarIDKeyReleased

    private void buscarMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarMatriculaKeyReleased

        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {            
            if (buscarMatricula.getText().equals("")) {
                DataMateriales();
            } else {
                try {
            BuscarMatricula();
                } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
                }
            }           
        }
    }//GEN-LAST:event_buscarMatriculaKeyReleased

    private void buscarDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarDescripcionKeyReleased
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {            
            if (buscarDescripcion.getText().equals("")) {
                DataMateriales();
            } else {
                try {
            BuscarDescripcion();
                } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
                }
            }           
        }
    }//GEN-LAST:event_buscarDescripcionKeyReleased

    private void btnEliminarIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarIngresoMouseClicked
        if (ingreso.equals("ingreso")) {
            EliminarGuiaIngreso();
        }

    }//GEN-LAST:event_btnEliminarIngresoMouseClicked

    private void btnEliminarDespachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarDespachoMouseClicked

        if (despacho.equals("despacho")) {
            EliminarGuiasDespachar();
        }
   
    }//GEN-LAST:event_btnEliminarDespachoMouseClicked

    private void btnEliminarTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorMouseClicked

        if (trabajador.equals("trabajador")) {
            EliminarDataTrabajadores();
        }

    }//GEN-LAST:event_btnEliminarTrabajadorMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarDespacho;
    private javax.swing.JButton btnEliminarIngreso;
    private javax.swing.JButton btnEliminarMaterial;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField buscarDescripcion;
    private javax.swing.JTextField buscarID;
    private javax.swing.JTextField buscarMatricula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBarraSuperior;
    // End of variables declaration//GEN-END:variables
}
