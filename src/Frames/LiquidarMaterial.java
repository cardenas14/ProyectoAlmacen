
package Frames;

import Metodos_sql.Conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class LiquidarMaterial extends javax.swing.JPanel {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar(); 
    private int iddocumento;
    private String nombre[] = new String[10000];
    private String apellido[] = new String[10000];
    private String dni[] = new String[10000];
    
    
    public LiquidarMaterial() {
        initComponents();
         FechaActual();
         actualID();
         //ComboBoxTrabajadores();
         cboTrabajadores.addItem("Ingrese primero un numero de SST");
    }
    
    public void FechaActual(){             
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MM / yyyy");
        txtFecha.setText(dtf.format(LocalDateTime.now())); 
    }
    
    public void actualID(){          
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("select count(output_guide.update_at) from output_guide;");            
            while (resultado.next()) {                            
                iddocumento= Integer.parseInt(resultado.getString(1));                    
            }  
        } catch (Exception e) {
        }
        if (iddocumento==0) {
                iddocumento=1;
            } 
        txtNdoc.setText("001-0000"+iddocumento);        
    }
    
    public void ComboBoxTrabajadores(){
        cboTrabajadores.removeAllItems();
        cboTrabajadores.addItem("Elegir personal a liquidar");
        int i=0;        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call trabajadoresdespachados("+ txtSST.getText() +");");
            while (resultado.next()) {                               
                nombre[i] = resultado.getString(1);
                apellido[i] = resultado.getString(2);
                dni[i] = resultado.getString(3);
                i++;
            }
            i--;
            for (int j = 0; j <=i ; j++) {                
                cboTrabajadores.addItem(apellido[j]+", "+nombre[j]+" - "+dni[j]);                
            }                    
        } catch (Exception e) {
        }   
    } 
    
    public void LimpiarTabla(){
       
        lbln1.setText("");
        lbln2.setText("");
        lbln3.setText("");
        lbln4.setText("");
        lbln5.setText("");
        lbln6.setText("");
        lbln7.setText("");
        lbln8.setText("");
        lbln9.setText("");
        lbln10.setText("");
        lbln11.setText("");
        lbln12.setText("");
        lbln13.setText("");
        lbln14.setText("");
        lbln15.setText("");
        lbln16.setText("");
        lbln17.setText("");
        lbln18.setText("");
        lbln19.setText("");
        lbln20.setText("");
        lbln21.setText("");
        lbln22.setText("");
        lbln23.setText("");
        lbln24.setText("");
        lbln25.setText("");
        lbln26.setText("");
        lbln27.setText("");
        lbln28.setText("");
        lbln29.setText("");
        lbln30.setText("");
        lbln31.setText("");
        lbln32.setText("");
        lbln33.setText("");
        lbln34.setText("");
        lbln35.setText("");
        lbln36.setText("");
        lbln37.setText("");
        lbln38.setText("");
        lbln39.setText("");
        lbln40.setText("");
        lbln41.setText("");
        lbln42.setText("");
        lbln43.setText("");
        lbln44.setText("");
        lbln45.setText("");
        lbln46.setText("");
        lbln47.setText("");
        lbln48.setText("");
        lbln49.setText("");
        lbln50.setText("");
        lbln51.setText("");
        lbln52.setText("");
        lbln53.setText("");
        lbln54.setText("");
        lbln55.setText("");
        lbln56.setText("");
        
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
        lbldescripcion13.setText("");
        lbldescripcion14.setText("");
        lbldescripcion15.setText("");
        lbldescripcion16.setText("");
        lbldescripcion17.setText("");
        lbldescripcion18.setText("");
        lbldescripcion19.setText("");
        lbldescripcion20.setText("");
        lbldescripcion21.setText("");
        lbldescripcion22.setText("");
        lbldescripcion23.setText("");
        lbldescripcion24.setText("");
        lbldescripcion25.setText("");
        lbldescripcion26.setText("");
        lbldescripcion27.setText("");
        lbldescripcion28.setText("");
        
        lblstock1.setText("");
        lblstock2.setText("");
        lblstock3.setText("");
        lblstock4.setText("");
        lblstock5.setText("");
        lblstock6.setText("");
        lblstock7.setText("");
        lblstock8.setText("");
        lblstock9.setText("");
        lblstock10.setText("");
        lblstock11.setText("");
        lblstock12.setText("");
        lblstock13.setText("");
        lblstock14.setText("");
        lblstock15.setText("");
        lblstock16.setText("");
        lblstock17.setText("");
        lblstock18.setText("");
        lblstock19.setText("");
        lblstock20.setText("");
        lblstock21.setText("");
        lblstock22.setText("");
        lblstock23.setText("");
        lblstock24.setText("");
        lblstock25.setText("");
        lblstock26.setText("");
        lblstock27.setText("");
        lblstock28.setText("");     
        
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
        txtcantidad13.setText("");
        txtcantidad14.setText("");
        txtcantidad15.setText("");
        txtcantidad16.setText("");
        txtcantidad17.setText("");
        txtcantidad18.setText("");
        txtcantidad19.setText("");
        txtcantidad20.setText("");
        txtcantidad21.setText("");
        txtcantidad22.setText("");
        txtcantidad23.setText("");
        txtcantidad24.setText("");
        txtcantidad25.setText("");
        txtcantidad26.setText("");
        txtcantidad27.setText("");
        txtcantidad28.setText(""); 
        
        lblnombre1.setText("");
        lblnombre2.setText("");
        lblnombre3.setText("");
        lblnombre4.setText("");
        lblnombre5.setText("");
        lblnombre6.setText("");
        lblnombre7.setText("");
        lblnombre8.setText("");
        lblnombre9.setText("");
        lblnombre10.setText("");
        lblnombre11.setText("");
        lblnombre12.setText("");
        lblnombre13.setText("");
        lblnombre14.setText("");
        lblnombre15.setText("");
        lblnombre16.setText("");
        lblnombre17.setText("");
        lblnombre18.setText("");
        lblnombre19.setText("");
        lblnombre20.setText("");
        lblnombre21.setText("");
        lblnombre22.setText("");
        lblnombre23.setText("");
        lblnombre24.setText("");
        lblnombre25.setText("");
        lblnombre26.setText("");
        lblnombre27.setText("");
        lblnombre28.setText("");             
        
        
    }
  
    public void ExtraerMaterial(){
        String nombre;
        int obra;
        obra = Integer.parseInt(txtSST.getText());
        nombre = lbldni.getText();
        
        String trabajador[] = new String[10000];
        String matricula[] = new String[10000];
        String descripcion[] = new String[10000];
        String cantidad[] = new String[10000]; 
        String liquidado[] = new String[10000];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("call mostrar_guia_liquidada("+obra+","+nombre+");");
            int i=0;
            while (resultado.next()) {
                trabajador[i]=resultado.getString(1);
                matricula[i] = resultado.getString(2);
                descripcion[i] = resultado.getString(3);
                cantidad[i] = resultado.getString(4);
                liquidado[i]=resultado.getString(5);
                i++;
            }            
        } catch (Exception e) {            
        }

        if (matricula[0]==null) {
            lbln1.setText("");
            lblstock1.setText("");
        } else {
            lbln1.setText("1");
            lbln29.setText(matricula[0]);
            lbldescripcion1.setText(descripcion[0]);
            lblstock1.setText(cantidad[0]);
            lblnombre1.setText(trabajador[0]);
            txtcantidad1.setText(liquidado[0]);
        } 
        
        if (matricula[1]==null) {
            lbln2.setText("");
            lblstock2.setText("");
        } else {
            lbln2.setText("2");
            lbln30.setText(matricula[1]);
            lbldescripcion2.setText(descripcion[1]);
            lblstock2.setText((cantidad[1]));
            lblnombre2.setText(trabajador[1]);
            txtcantidad2.setText(liquidado[1]);
        }
        
        if (matricula[2]==null) {
            lbln3.setText("");
            lblstock3.setText("");
        } else {
            lbln3.setText("3");
            lbln31.setText(matricula[2]);
            lbldescripcion3.setText(descripcion[2]);
            lblstock3.setText((cantidad[2]));
            lblnombre3.setText(trabajador[2]);
            txtcantidad3.setText(liquidado[2]);
        }
                
        if (matricula[3]==null) {
                  lbln4.setText("");
              lblstock4.setText("");
        } else {
                  lbln4.setText
                    ("4");
            lbln32.setText(matricula[3]);
        lbldescripcion4.setText(descripcion[3]);
              lblstock4.setText((cantidad[3]));
              lblnombre4.setText(trabajador[3]);
            txtcantidad4.setText(liquidado[3]);
        }
        
        if (matricula[4]==null) {
                  lbln5.setText("");
              lblstock5.setText("");
        } else {
                  lbln5.setText
                    ("5");
            lbln33.setText(matricula[4]);
        lbldescripcion5.setText(descripcion[4]);
              lblstock5.setText((cantidad[4]));
              lblnombre5.setText(trabajador[4]);
            txtcantidad5.setText(liquidado[4]);
        }
        
        if (matricula[5]==null) {
                  lbln6.setText("");
              lblstock6.setText("");
        } else {
                  lbln6.setText
                    ("6");
            lbln34.setText(matricula[5]);
        lbldescripcion6.setText(descripcion[5]);
              lblstock6.setText((cantidad[5]));
              lblnombre6.setText(trabajador[5]);
            txtcantidad6.setText(liquidado[5]);
        }
        
        if (matricula[6]==null) {
                  lbln7.setText("");
              lblstock7.setText("");
        } else {
                  lbln7.setText
                    ("7");
            lbln35.setText(matricula[6]);
        lbldescripcion7.setText(descripcion[6]);
              lblstock7.setText((cantidad[6]));
              lblnombre7.setText(trabajador[6]);
            txtcantidad7.setText(liquidado[6]);
        }
        
        if (matricula[7]==null) {
                  lbln8.setText("");
              lblstock8.setText("");
        } else {
                  lbln8.setText
                    ("8");
            lbln36.setText(matricula[7]);
        lbldescripcion8.setText(descripcion[7]);
              lblstock8.setText((cantidad[7]));
              lblnombre8.setText(trabajador[7]);
            txtcantidad8.setText(liquidado[7]);
        }
        
        if (matricula[8]==null) {
                  lbln9.setText("");
              lblstock9.setText("");
        } else {
                  lbln9.setText
                    ("9");
            lbln37.setText(matricula[8]);
        lbldescripcion9.setText(descripcion[8]);
              lblstock9.setText((cantidad[8]));
              lblnombre9.setText(trabajador[8]);
            txtcantidad9.setText(liquidado[8]);
        }
        
        if (matricula[9]==null) {
                  lbln10.setText("");
              lblstock10.setText("");
        } else {
                  lbln10.setText
                    ("10");
            lbln38.setText(matricula[9]);
        lbldescripcion10.setText(descripcion[9]);
              lblstock10.setText((cantidad[9]));
              lblnombre10.setText(trabajador[9]);
            txtcantidad10.setText(liquidado[9]);
        }
        
        if (matricula[10]==null) {
                  lbln11.setText("");
              lblstock11.setText("");
        } else {
                  lbln11.setText
                    ("11");
            lbln39.setText(matricula[10]);
        lbldescripcion11.setText(descripcion[10]);
              lblstock11.setText((cantidad[10]));
              lblnombre11.setText(trabajador[10]);
            txtcantidad11.setText(liquidado[10]);
        }
        
        if (matricula[11]==null) {
                  lbln12.setText("");
              lblstock12.setText("");
        } else {
                  lbln12.setText
                    ("12");
            lbln40.setText(matricula[11]);
        lbldescripcion12.setText(descripcion[11]);
              lblstock12.setText((cantidad[11]));
              lblnombre12.setText(trabajador[11]);
            txtcantidad12.setText(liquidado[11]);
        }
   
        if (matricula[12]==null) {
                  lbln13.setText("");
              lblstock13.setText("");
        } else {
                  lbln13.setText
                    ("13");
            lbln41.setText(matricula[12]);
        lbldescripcion13.setText(descripcion[12]);
              lblstock13.setText((cantidad[12]));
              lblnombre13.setText(trabajador[12]);
            txtcantidad13.setText(liquidado[12]);
        }
   
        if (matricula[13]==null) {
                  lbln14.setText("");
              lblstock14.setText("");
        } else {
                  lbln14.setText
                    ("14");
            lbln42.setText(matricula[13]);
        lbldescripcion14.setText(descripcion[13]);
              lblstock14.setText((cantidad[13]));
              lblnombre14.setText(trabajador[13]);
            txtcantidad14.setText(liquidado[13]);
        }
   
        if (matricula[14]==null) {
                  lbln15.setText("");
              lblstock15.setText("");
        } else {
                  lbln15.setText
                    ("15");
            lbln43.setText(matricula[14]);
        lbldescripcion15.setText(descripcion[14]);
              lblstock15.setText((cantidad[14]));
        }
        
        if (matricula[15]==null) {
                  lbln16.setText("");
              lblstock16.setText("");
        } else {
                  lbln16.setText
                    ("16");
            lbln44.setText(matricula[15]);
        lbldescripcion16.setText(descripcion[15]);
              lblstock16.setText((cantidad[15]));
        }
   
        if (matricula[16]==null) {
                  lbln17.setText("");
              lblstock17.setText("");
        } else {
                  lbln17.setText
                    ("17");
            lbln45.setText(matricula[16]);
        lbldescripcion17.setText(descripcion[16]);
              lblstock17.setText((cantidad[16]));
        }
   
        if (matricula[17]==null) {
                  lbln18.setText("");
              lblstock18.setText("");
        } else {
                  lbln18.setText
                    ("18");
            lbln46.setText(matricula[17]);
        lbldescripcion18.setText(descripcion[17]);
              lblstock18.setText((cantidad[17]));
        }
   
        if (matricula[18]==null) {
                  lbln19.setText("");
              lblstock19.setText("");
        } else {
                  lbln19.setText
                    ("19");
            lbln47.setText(matricula[18]);
        lbldescripcion19.setText(descripcion[18]);
              lblstock19.setText((cantidad[18]));
        }
   
        if (matricula[19]==null) {
                  lbln20.setText("");
              lblstock20.setText("");
        } else {
                  lbln20.setText
                    ("20");
            lbln48.setText(matricula[19]);
        lbldescripcion20.setText(descripcion[19]);
              lblstock20.setText((cantidad[19]));
        }
    
        if (matricula[20]==null) {
                  lbln21.setText("");
              lblstock21.setText("");
        } else {
                  lbln21.setText
                    ("21");
            lbln49.setText(matricula[20]);
        lbldescripcion21.setText(descripcion[20]);
              lblstock21.setText((cantidad[20]));
        }
        
        if (matricula[21]==null) {
                  lbln22.setText("");
              lblstock22.setText("");
        } else {
                  lbln22.setText
                    ("22");
            lbln50.setText(matricula[21]);
        lbldescripcion22.setText(descripcion[21]);
              lblstock22.setText((cantidad[21]));
        }
        
        if (matricula[22]==null) {
                  lbln23.setText("");
              lblstock23.setText("");
        } else {
                  lbln23.setText
                    ("23");
            lbln51.setText(matricula[22]);
        lbldescripcion23.setText(descripcion[22]);
              lblstock23.setText((cantidad[22]));
        }
        
        if (matricula[23]==null) {
                  lbln24.setText("");
              lblstock24.setText("");
        } else {
                  lbln24.setText
                    ("24");
            lbln52.setText(matricula[23]);
        lbldescripcion24.setText(descripcion[23]);
              lblstock24.setText((cantidad[23]));
        }
        
        if (matricula[24]==null) {
                  lbln25.setText("");
              lblstock25.setText("");
        } else {
                  lbln25.setText
                    ("25");
            lbln53.setText(matricula[24]);
        lbldescripcion25.setText(descripcion[24]);
              lblstock25.setText((cantidad[24]));
        }
        
        if (matricula[25]==null) {
                  lbln26.setText("");
              lblstock26.setText("");
        } else {
                  lbln26.setText
                    ("26");
            lbln54.setText(matricula[25]);
        lbldescripcion26.setText(descripcion[25]);
              lblstock26.setText((cantidad[25]));
        }
        
        if (matricula[26]==null) {
                  lbln27.setText("");
              lblstock27.setText("");
        } else {
                  lbln27.setText
                    ("27");
            lbln55.setText(matricula[26]);
        lbldescripcion27.setText(descripcion[26]);
              lblstock27.setText((cantidad[26]));
        }
        
        if (matricula[27]==null) {
                  lbln28.setText("");
              lblstock28.setText("");
        } else {
                  lbln28.setText
                    ("28");
            lbln56.setText(matricula[27]);
        lbldescripcion28.setText(descripcion[27]);
              lblstock28.setText((cantidad[27]));
        }
        
        TextoCantidad();
        
    }
    
    public void TextoCantidad(){
        
        if        (lbln1.getText().equals("")) {
            txtcantidad1.setText("");            
        } else{
            txtcantidad1.setText("0");
            txtcantidad1.setForeground(Color.gray);
        }
        
        if        (lbln2.getText().equals("")) {
            txtcantidad2.setText("");            
        } else{
            txtcantidad2.setText("0");
            txtcantidad2.setForeground(Color.gray);
        }
        
        if        (lbln3.getText().equals("")) {
            txtcantidad3.setText("");            
        } else{
            txtcantidad3.setText("0");
            txtcantidad3.setForeground(Color.gray);
        }
        
        if        (lbln4.getText().equals("")) {
            txtcantidad4.setText("");            
        } else{
            txtcantidad4.setText("0");
            txtcantidad4.setForeground(Color.gray);
        }
        
        if        (lbln5.getText().equals("")) {
            txtcantidad5.setText("");            
        } else{
            txtcantidad5.setText("0");
            txtcantidad5.setForeground(Color.gray);
        }
        
        if        (lbln6.getText().equals("")) {
            txtcantidad6.setText("");            
        } else{
            txtcantidad6.setText("0");
            txtcantidad6.setForeground(Color.gray);
        }
        
        if        (lbln7.getText().equals("")) {
            txtcantidad7.setText("");            
        } else{
            txtcantidad7.setText("0");
            txtcantidad7.setForeground(Color.gray);
        }
        
        if        (lbln8.getText().equals("")) {
            txtcantidad8.setText("");            
        } else{
            txtcantidad8.setText("0");
            txtcantidad8.setForeground(Color.gray);
        }
        
        if        (lbln9.getText().equals("")) {
            txtcantidad9.setText("");            
        } else{
            txtcantidad9.setText("0");
            txtcantidad9.setForeground(Color.gray);
        }
        
        if        (lbln10.getText().equals("")) {
            txtcantidad10.setText("");            
        } else{
            txtcantidad10.setText("0");
            txtcantidad10.setForeground(Color.gray);
        }
        
        if        (lbln11.getText().equals("")) {
            txtcantidad11.setText("");            
        } else{
            txtcantidad11.setText("0");
            txtcantidad11.setForeground(Color.gray);
        }
        
        if        (lbln12.getText().equals("")) {
            txtcantidad12.setText("");            
        } else{
            txtcantidad12.setText("0");
            txtcantidad12.setForeground(Color.gray);
        }
        
        if        (lbln13.getText().equals("")) {
            txtcantidad13.setText("");            
        } else{
            txtcantidad13.setText("0");
            txtcantidad13.setForeground(Color.gray);
        }
        
        if        (lbln14.getText().equals("")) {
            txtcantidad14.setText("");            
        } else{
            txtcantidad14.setText("0");
            txtcantidad14.setForeground(Color.gray);
        }
        
        if        (lbln15.getText().equals("")) {
            txtcantidad15.setText("");            
        } else{
            txtcantidad15.setText("0");
            txtcantidad15.setForeground(Color.gray);
        }
        
        if        (lbln16.getText().equals("")) {
            txtcantidad16.setText("");            
        } else{
            txtcantidad16.setText("0");
            txtcantidad16.setForeground(Color.gray);
        }
        
        if        (lbln17.getText().equals("")) {
            txtcantidad17.setText("");            
        } else{
            txtcantidad17.setText("0");
            txtcantidad17.setForeground(Color.gray);
        }
        
        if        (lbln18.getText().equals("")) {
            txtcantidad18.setText("");            
        } else{
            txtcantidad18.setText("0");
            txtcantidad18.setForeground(Color.gray);
        }
        
        if        (lbln19.getText().equals("")) {
            txtcantidad19.setText("");            
        } else{
            txtcantidad19.setText("0");
            txtcantidad19.setForeground(Color.gray);
        }
        
        if        (lbln20.getText().equals("")) {
            txtcantidad20.setText("");            
        } else{
            txtcantidad20.setText("0");
            txtcantidad20.setForeground(Color.gray);
        }
        
        if        (lbln21.getText().equals("")) {
            txtcantidad21.setText("");            
        } else{
            txtcantidad21.setText("0");
            txtcantidad21.setForeground(Color.gray);
        }
        
        if        (lbln22.getText().equals("")) {
            txtcantidad22.setText("");            
        } else{
            txtcantidad22.setText("0");
            txtcantidad22.setForeground(Color.gray);
        }
        
        if        (lbln23.getText().equals("")) {
            txtcantidad23.setText("");            
        } else{
            txtcantidad23.setText("0");
            txtcantidad23.setForeground(Color.gray);
        }
        
        if        (lbln24.getText().equals("")) {
            txtcantidad24.setText("");            
        } else{
            txtcantidad24.setText("0");
            txtcantidad24.setForeground(Color.gray);
        }
        
        if        (lbln25.getText().equals("")) {
            txtcantidad25.setText("");            
        } else{
            txtcantidad25.setText("0");
            txtcantidad25.setForeground(Color.gray);
        }
        
        if        (lbln26.getText().equals("")) {
            txtcantidad26.setText("");            
        } else{
            txtcantidad26.setText("0");
            txtcantidad26.setForeground(Color.gray);
        }
        
        if        (lbln27.getText().equals("")) {
            txtcantidad27.setText("");            
        } else{
            txtcantidad27.setText("0");
            txtcantidad27.setForeground(Color.gray);
        }
        
        if        (lbln28.getText().equals("")) {
            txtcantidad28.setText("");            
        } else{
            txtcantidad28.setText("0");
            txtcantidad28.setForeground(Color.gray);
        }
          
                
//        if        (lbln2.equals("")) {
//            txtcantidad2.setText("0");
//            txtcantidad2.setForeground(Color.gray);
//        }
//        
//        if        (lbln3.equals("")) {
//            txtcantidad3.setText("0");
//            txtcantidad3.setForeground(Color.gray);
//        }
//        
//        if        (lbln4.equals("")) {
//            txtcantidad4.setText("0");
//            txtcantidad4.setForeground(Color.gray);
//        }
//        
//        if        (lbln5.equals("")) {
//            txtcantidad5.setText("0");
//            txtcantidad5.setForeground(Color.gray);
//        }
//        
//        if        (lbln6.equals("")) {
//            txtcantidad6.setText("0");
//            txtcantidad6.setForeground(Color.gray);
//        }
//        
//        if        (lbln7.equals("")) {
//            txtcantidad7.setText("0");
//            txtcantidad7.setForeground(Color.gray);
//        }
//        
//        if        (lbln8.equals("")) {
//            txtcantidad8.setText("0");
//            txtcantidad8.setForeground(Color.gray);
//        }
//        
//        if        (lbln9.equals("")) {
//            txtcantidad9.setText("0");
//            txtcantidad9.setForeground(Color.gray);
//        }
//        
//        if        (lbln10.equals("")) {
//            txtcantidad10.setText("0");
//            txtcantidad10.setForeground(Color.gray);
//        }
//        
//        if        (lbln11.equals("")) {
//            txtcantidad11.setText("0");
//            txtcantidad11.setForeground(Color.gray);
//        }
//        
//        if        (lbln12.equals("")) {
//            txtcantidad12.setText("0");
//            txtcantidad12.setForeground(Color.gray);
//        }
//        
//        if        (lbln13.equals("")) {
//            txtcantidad13.setText("0");
//            txtcantidad13.setForeground(Color.gray);
//        }
//        
//        if        (lbln14.equals("")) {
//            txtcantidad14.setText("0");
//            txtcantidad14.setForeground(Color.gray);
//        }
//        
//        if        (lbln15.equals("")) {
//            txtcantidad15.setText("0");
//            txtcantidad15.setForeground(Color.gray);
//        }
//        
//        if        (lbln16.equals("")) {
//            txtcantidad16.setText("0");
//            txtcantidad16.setForeground(Color.gray);
//        }
//        
//        if        (lbln17.equals("")) {
//            txtcantidad17.setText("0");
//            txtcantidad17.setForeground(Color.gray);
//        }
//        
//        if        (lbln18.equals("")) {
//            txtcantidad18.setText("0");
//            txtcantidad18.setForeground(Color.gray);
//        }
//        
//        if        (lbln19.equals("")) {
//            txtcantidad19.setText("0");
//            txtcantidad19.setForeground(Color.gray);
//        }
//        
//        if        (lbln20.equals("")) {
//            txtcantidad20.setText("0");
//            txtcantidad20.setForeground(Color.gray);
//        }
//        
//        if        (lbln21.equals("")) {
//            txtcantidad21.setText("0");
//            txtcantidad21.setForeground(Color.gray);
//        }
//        
//        if        (lbln22.equals("")) {
//            txtcantidad22.setText("0");
//            txtcantidad22.setForeground(Color.gray);
//        }
//        
//        if        (lbln23.equals("")) {
//            txtcantidad23.setText("0");
//            txtcantidad23.setForeground(Color.gray);
//        }
//        
//        if        (lbln24.equals("")) {
//            txtcantidad24.setText("0");
//            txtcantidad24.setForeground(Color.gray);
//        }
//        
//        if        (lbln25.equals("")) {
//            txtcantidad25.setText("0");
//            txtcantidad25.setForeground(Color.gray);
//        }
//        
//        if        (lbln26.equals("")) {
//            txtcantidad26.setText("0");
//            txtcantidad26.setForeground(Color.gray);
//        }
//        
//        if        (lbln27.equals("")) {
//            txtcantidad27.setText("0");
//            txtcantidad27.setForeground(Color.gray);
//        }
//        
//        if        (lbln28.equals("")) {
//            txtcantidad28.setText("0");
//            txtcantidad28.setForeground(Color.gray);
//        }
        
        
    }

    public void ID_Materiales(){
        String idmaterial[] = new String[10000];
        String cantidad[] = new String[10000];
        try {
            Statement leer = conect.createStatement();            
            ResultSet resultado1 = leer.executeQuery("call id_liquidacion("+ txtSST.getText() +", "+ lbldni.getText() +");");
            
            int i=0;
            while (resultado1.next()) {                
                idmaterial[i]=resultado1.getString(1);
                cantidad[i]=resultado1.getString(6);
                i++;
            }            
            txtcantidad1.setText(cantidad[0]);
            txtcantidad2.setText(cantidad[1]);            
            txtcantidad3.setText(cantidad[2]);
            txtcantidad4.setText(cantidad[3]);            
            txtcantidad5.setText(cantidad[4]);
            txtcantidad6.setText(cantidad[5]);            
            txtcantidad7.setText(cantidad[6]);
            txtcantidad8.setText(cantidad[7]);            
            txtcantidad9.setText(cantidad[8]);
            txtcantidad10.setText(cantidad[9]);            
            txtcantidad11.setText(cantidad[10]);
            txtcantidad12.setText(cantidad[11]);            
            txtcantidad13.setText(cantidad[12]);
            txtcantidad14.setText(cantidad[13]);            
            txtcantidad15.setText(cantidad[14]);
            txtcantidad16.setText(cantidad[15]);            
            txtcantidad17.setText(cantidad[16]);
            txtcantidad19.setText(cantidad[17]);
            txtcantidad20.setText(cantidad[18]);
            txtcantidad21.setText(cantidad[19]);
            txtcantidad22.setText(cantidad[20]);            
            txtcantidad23.setText(cantidad[21]);
            txtcantidad24.setText(cantidad[22]);            
            txtcantidad25.setText(cantidad[23]);
            txtcantidad26.setText(cantidad[24]);            
            txtcantidad27.setText(cantidad[25]);
            txtcantidad28.setText(cantidad[26]);           
        } catch (Exception e) {
        }        
    }
    
    public void ExtraerCantidadLiquidacion(){
        ID_Materiales();        
    }
    
    public void ActualizarDatos(){
        
        String idmaterial[] = new String[10000];
        String cantidad[] = new String[10000];
        
        try {
            Statement leer = conect.createStatement();            
            ResultSet resultado1 = leer.executeQuery("call id_liquidacion("+ txtSST.getText() +", "+ lbldni.getText() +");");
            
            int i=0;
            while (resultado1.next()) {                
                idmaterial[i]=resultado1.getString(1);
                cantidad[i]=resultado1.getString(6);
                i++;
            }
            } catch (Exception e) {
        } 
        
        try {
            PreparedStatement guardar1 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[0] +", "+ txtcantidad1.getText() +")");
            guardar1.execute();
            PreparedStatement guardar2 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[1] +", "+ txtcantidad2.getText() +")");
            guardar2.execute();
            PreparedStatement guardar3 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[2] +", "+ txtcantidad3.getText() +")");
            guardar3.execute();
            PreparedStatement guardar4 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[3] +", "+ txtcantidad4.getText() +")");
            guardar4.execute();
            PreparedStatement guardar5 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[4] +", "+ txtcantidad5.getText() +")");
            guardar5.execute();
            PreparedStatement guardar6 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[5] +", "+ txtcantidad6.getText() +")");
            guardar6.execute();
            PreparedStatement guardar7 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[6] +", "+ txtcantidad7.getText() +")");
            guardar7.execute();
            PreparedStatement guardar8 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[7] +", "+ txtcantidad8.getText() +")");
            guardar8.execute();
            PreparedStatement guardar9 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[8] +", "+ txtcantidad9.getText() +")");
            guardar9.execute();
            PreparedStatement guardar10 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[9] +", "+ txtcantidad10.getText() +")");
            guardar10.execute();
            PreparedStatement guardar11 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[10] +", "+ txtcantidad11.getText() +")");
            guardar11.execute();
            PreparedStatement guardar12 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[11] +", "+ txtcantidad12.getText() +")");
            guardar12.execute();            
            PreparedStatement guardar13 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[12] +", "+ txtcantidad13.getText() +")");
            guardar13.execute();
            PreparedStatement guardar14 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[13] +", "+ txtcantidad14.getText() +")");
            guardar14.execute();
            PreparedStatement guardar15 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[14] +", "+ txtcantidad15.getText() +")");
            guardar15.execute();
            PreparedStatement guardar16 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[15] +", "+ txtcantidad16.getText() +")");
            guardar16.execute();
            PreparedStatement guardar17 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[16] +", "+ txtcantidad17.getText() +")");
            guardar17.execute();
            PreparedStatement guardar18 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[17] +", "+ txtcantidad18.getText() +")");
            guardar18.execute();
            PreparedStatement guardar19 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[18] +", "+ txtcantidad19.getText() +")");
            guardar19.execute();
            PreparedStatement guardar20 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[19] +", "+ txtcantidad20.getText() +")");
            guardar20.execute();
            PreparedStatement guardar21 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[20] +", "+ txtcantidad21.getText() +")");
            guardar21.execute();
            PreparedStatement guardar22 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[21] +", "+ txtcantidad22.getText() +")");
            guardar22.execute();
            PreparedStatement guardar23 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[22] +", "+ txtcantidad23.getText() +")");
            guardar23.execute();
            PreparedStatement guardar24 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[23] +", "+ txtcantidad24.getText() +")");
            guardar24.execute();
            PreparedStatement guardar25 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[24] +", "+ txtcantidad25.getText() +")");
            guardar25.execute();
            PreparedStatement guardar26 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[25] +", "+ txtcantidad26.getText() +")");
            guardar26.execute();
            PreparedStatement guardar27 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[26] +", "+ txtcantidad27.getText() +")");
            guardar27.execute();
            PreparedStatement guardar28 = conect.prepareCall("call IngresarLiquidacion("+ idmaterial[27] +", "+ txtcantidad28.getText() +")");
            guardar28.execute();
        } catch (Exception e) {
        }
        
    }
    
    public void LimpiarDatos(){        
        lbldni.setText("");
        LimpiarTabla();
        cboTrabajadores.removeAllItems();
        cboTrabajadores.addItem("Ingrese primero un numero de SST");
        //ComboBoxTrabajadores();
        txtSST.setText("");
        txtSST.requestFocus();
        actualID();    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DespacharMaterialPanel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSST = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNdoc = new javax.swing.JLabel();
        txtSST = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtNdoc = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        btnLimpiarDatos = new javax.swing.JPanel();
        lblLimpiarDatos = new javax.swing.JLabel();
        btnExtraer = new javax.swing.JPanel();
        lblExtraer = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cboTrabajadores = new javax.swing.JComboBox<>();
        lbldni = new javax.swing.JLabel();
        PanelMateriales = new javax.swing.JScrollPane();
        materiales = new javax.swing.JPanel();
        lbln1 = new javax.swing.JLabel();
        lbln2 = new javax.swing.JLabel();
        lbln3 = new javax.swing.JLabel();
        lbln4 = new javax.swing.JLabel();
        lbln5 = new javax.swing.JLabel();
        lbln6 = new javax.swing.JLabel();
        lbln7 = new javax.swing.JLabel();
        lbln8 = new javax.swing.JLabel();
        lbln9 = new javax.swing.JLabel();
        lbln10 = new javax.swing.JLabel();
        lbln11 = new javax.swing.JLabel();
        lbln12 = new javax.swing.JLabel();
        lbln13 = new javax.swing.JLabel();
        lbln14 = new javax.swing.JLabel();
        lbln15 = new javax.swing.JLabel();
        lbln16 = new javax.swing.JLabel();
        lbln17 = new javax.swing.JLabel();
        lbln18 = new javax.swing.JLabel();
        lbln19 = new javax.swing.JLabel();
        lbln20 = new javax.swing.JLabel();
        lbln21 = new javax.swing.JLabel();
        lbln22 = new javax.swing.JLabel();
        lbln23 = new javax.swing.JLabel();
        lbln24 = new javax.swing.JLabel();
        lbln25 = new javax.swing.JLabel();
        lbln26 = new javax.swing.JLabel();
        lbln27 = new javax.swing.JLabel();
        lbln28 = new javax.swing.JLabel();
        lbldescripcion1 = new javax.swing.JLabel();
        lbldescripcion2 = new javax.swing.JLabel();
        lbldescripcion3 = new javax.swing.JLabel();
        lbldescripcion4 = new javax.swing.JLabel();
        lbldescripcion5 = new javax.swing.JLabel();
        lbldescripcion6 = new javax.swing.JLabel();
        lbldescripcion7 = new javax.swing.JLabel();
        lbldescripcion8 = new javax.swing.JLabel();
        lbldescripcion9 = new javax.swing.JLabel();
        lbldescripcion10 = new javax.swing.JLabel();
        lbldescripcion11 = new javax.swing.JLabel();
        lbldescripcion12 = new javax.swing.JLabel();
        lbldescripcion13 = new javax.swing.JLabel();
        lbldescripcion14 = new javax.swing.JLabel();
        lbldescripcion15 = new javax.swing.JLabel();
        lbldescripcion16 = new javax.swing.JLabel();
        lbldescripcion17 = new javax.swing.JLabel();
        lbldescripcion18 = new javax.swing.JLabel();
        lbldescripcion19 = new javax.swing.JLabel();
        lbldescripcion20 = new javax.swing.JLabel();
        lbldescripcion21 = new javax.swing.JLabel();
        lbldescripcion22 = new javax.swing.JLabel();
        lbldescripcion23 = new javax.swing.JLabel();
        lbldescripcion24 = new javax.swing.JLabel();
        lbldescripcion25 = new javax.swing.JLabel();
        lbldescripcion26 = new javax.swing.JLabel();
        lbldescripcion27 = new javax.swing.JLabel();
        lbldescripcion28 = new javax.swing.JLabel();
        lblstock1 = new javax.swing.JLabel();
        lblstock2 = new javax.swing.JLabel();
        lblstock3 = new javax.swing.JLabel();
        lblstock4 = new javax.swing.JLabel();
        lblstock5 = new javax.swing.JLabel();
        lblstock6 = new javax.swing.JLabel();
        lblstock7 = new javax.swing.JLabel();
        lblstock8 = new javax.swing.JLabel();
        lblstock9 = new javax.swing.JLabel();
        lblstock10 = new javax.swing.JLabel();
        lblstock11 = new javax.swing.JLabel();
        lblstock12 = new javax.swing.JLabel();
        lblstock13 = new javax.swing.JLabel();
        lblstock14 = new javax.swing.JLabel();
        lblstock15 = new javax.swing.JLabel();
        lblstock16 = new javax.swing.JLabel();
        lblstock17 = new javax.swing.JLabel();
        lblstock18 = new javax.swing.JLabel();
        lblstock19 = new javax.swing.JLabel();
        lblstock20 = new javax.swing.JLabel();
        lblstock21 = new javax.swing.JLabel();
        lblstock22 = new javax.swing.JLabel();
        lblstock23 = new javax.swing.JLabel();
        lblstock24 = new javax.swing.JLabel();
        lblstock25 = new javax.swing.JLabel();
        lblstock26 = new javax.swing.JLabel();
        lblstock27 = new javax.swing.JLabel();
        lblstock28 = new javax.swing.JLabel();
        txtcantidad1 = new javax.swing.JTextField();
        txtcantidad2 = new javax.swing.JTextField();
        txtcantidad3 = new javax.swing.JTextField();
        txtcantidad4 = new javax.swing.JTextField();
        txtcantidad5 = new javax.swing.JTextField();
        txtcantidad6 = new javax.swing.JTextField();
        txtcantidad7 = new javax.swing.JTextField();
        txtcantidad8 = new javax.swing.JTextField();
        txtcantidad9 = new javax.swing.JTextField();
        txtcantidad10 = new javax.swing.JTextField();
        txtcantidad11 = new javax.swing.JTextField();
        txtcantidad12 = new javax.swing.JTextField();
        txtcantidad13 = new javax.swing.JTextField();
        txtcantidad14 = new javax.swing.JTextField();
        txtcantidad15 = new javax.swing.JTextField();
        txtcantidad16 = new javax.swing.JTextField();
        txtcantidad17 = new javax.swing.JTextField();
        txtcantidad18 = new javax.swing.JTextField();
        txtcantidad19 = new javax.swing.JTextField();
        txtcantidad20 = new javax.swing.JTextField();
        txtcantidad21 = new javax.swing.JTextField();
        txtcantidad22 = new javax.swing.JTextField();
        txtcantidad23 = new javax.swing.JTextField();
        txtcantidad24 = new javax.swing.JTextField();
        txtcantidad25 = new javax.swing.JTextField();
        txtcantidad26 = new javax.swing.JTextField();
        txtcantidad27 = new javax.swing.JTextField();
        txtcantidad28 = new javax.swing.JTextField();
        vertical1 = new javax.swing.JSeparator();
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
        jSeparator21 = new javax.swing.JSeparator();
        vertical3 = new javax.swing.JSeparator();
        vertical4 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        vertical2 = new javax.swing.JSeparator();
        lbln29 = new javax.swing.JLabel();
        lbln30 = new javax.swing.JLabel();
        lbln31 = new javax.swing.JLabel();
        lbln32 = new javax.swing.JLabel();
        lbln33 = new javax.swing.JLabel();
        lbln34 = new javax.swing.JLabel();
        lbln35 = new javax.swing.JLabel();
        lbln36 = new javax.swing.JLabel();
        lbln37 = new javax.swing.JLabel();
        lbln38 = new javax.swing.JLabel();
        lbln39 = new javax.swing.JLabel();
        lbln40 = new javax.swing.JLabel();
        lbln41 = new javax.swing.JLabel();
        lbln42 = new javax.swing.JLabel();
        lbln43 = new javax.swing.JLabel();
        lbln44 = new javax.swing.JLabel();
        lbln45 = new javax.swing.JLabel();
        lbln46 = new javax.swing.JLabel();
        lbln47 = new javax.swing.JLabel();
        lbln48 = new javax.swing.JLabel();
        lbln49 = new javax.swing.JLabel();
        lbln50 = new javax.swing.JLabel();
        lbln51 = new javax.swing.JLabel();
        lbln52 = new javax.swing.JLabel();
        lbln53 = new javax.swing.JLabel();
        lbln54 = new javax.swing.JLabel();
        lbln55 = new javax.swing.JLabel();
        lbln56 = new javax.swing.JLabel();
        vertical5 = new javax.swing.JSeparator();
        lblnombre1 = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        lblnombre4 = new javax.swing.JLabel();
        lblnombre5 = new javax.swing.JLabel();
        lblnombre6 = new javax.swing.JLabel();
        lblnombre7 = new javax.swing.JLabel();
        lblnombre8 = new javax.swing.JLabel();
        lblnombre9 = new javax.swing.JLabel();
        lblnombre10 = new javax.swing.JLabel();
        lblnombre11 = new javax.swing.JLabel();
        lblnombre12 = new javax.swing.JLabel();
        lblnombre13 = new javax.swing.JLabel();
        lblnombre14 = new javax.swing.JLabel();
        lblnombre15 = new javax.swing.JLabel();
        lblnombre16 = new javax.swing.JLabel();
        lblnombre17 = new javax.swing.JLabel();
        lblnombre18 = new javax.swing.JLabel();
        lblnombre19 = new javax.swing.JLabel();
        lblnombre20 = new javax.swing.JLabel();
        lblnombre21 = new javax.swing.JLabel();
        lblnombre22 = new javax.swing.JLabel();
        lblnombre23 = new javax.swing.JLabel();
        lblnombre24 = new javax.swing.JLabel();
        lblnombre25 = new javax.swing.JLabel();
        lblnombre26 = new javax.swing.JLabel();
        lblnombre27 = new javax.swing.JLabel();
        lblnombre28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        btnHistorial = new javax.swing.JPanel();
        lblHistorial = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 580));

        DespacharMaterialPanel.setBackground(new java.awt.Color(255, 255, 255));
        DespacharMaterialPanel.setPreferredSize(new java.awt.Dimension(1050, 580));
        DespacharMaterialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Liquidación de Materiales en obra");
        DespacharMaterialPanel.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 710, 60));

        lblSST.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblSST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSST.setText("N° SST");
        DespacharMaterialPanel.add(lblSST, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 40));

        txtFecha.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
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
        DespacharMaterialPanel.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 140, 40));
        DespacharMaterialPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 710, 30));

        lblNdoc.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblNdoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdoc.setText("N° Operación");
        DespacharMaterialPanel.add(lblNdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 40));

        txtSST.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtSST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSST.setBorder(null);
        txtSST.setPreferredSize(new java.awt.Dimension(200, 20));
        txtSST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSSTMouseExited(evt);
            }
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSSTKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSSTKeyTyped(evt);
            }
        });
        DespacharMaterialPanel.add(txtSST, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 100, 40));

        lblFecha.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha de Liquidación");
        DespacharMaterialPanel.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 200, 40));

        txtNdoc.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNdoc.setForeground(new java.awt.Color(204, 204, 204));
        txtNdoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNdoc.setText("001-00001");
        txtNdoc.setBorder(null);
        txtNdoc.setEnabled(false);
        txtNdoc.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNdocMousePressed(evt);
            }
        });
        DespacharMaterialPanel.add(txtNdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, 40));

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
        });
        btnGuardar.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));

        DespacharMaterialPanel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 280, 80));

        btnLimpiarDatos.setBackground(new java.awt.Color(13, 71, 161));
        btnLimpiarDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLimpiarDatos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblLimpiarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiarDatos.setText("Limpiar ");
        lblLimpiarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarDatos.add(lblLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        DespacharMaterialPanel.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 160, 60));

        btnExtraer.setBackground(new java.awt.Color(18, 90, 173));
        btnExtraer.setToolTipText("");
        btnExtraer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExtraer.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        lblExtraer.setForeground(new java.awt.Color(255, 255, 255));
        lblExtraer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExtraer.setText("Importar Materiales");
        lblExtraer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblExtraer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExtraerMouseClicked(evt);
            }
        });
        btnExtraer.add(lblExtraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        DespacharMaterialPanel.add(btnExtraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, 40));
        DespacharMaterialPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 100, 10));
        DespacharMaterialPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 140, 20));
        DespacharMaterialPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, 20));

        cboTrabajadores.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cboTrabajadores.setBorder(null);
        cboTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrabajadoresActionPerformed(evt);
            }
        });
        DespacharMaterialPanel.add(cboTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 380, 40));

        lbldni.setBackground(new java.awt.Color(255, 255, 255));
        lbldni.setForeground(new java.awt.Color(255, 255, 255));
        DespacharMaterialPanel.add(lbldni, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 110, 20));

        PanelMateriales.setToolTipText("");
        PanelMateriales.setPreferredSize(new java.awt.Dimension(200, 400));

        materiales.setBackground(new java.awt.Color(255, 255, 255));
        materiales.setPreferredSize(new java.awt.Dimension(970, 1000));
        materiales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbln1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 3, 25, 26));

        lbln2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 34, 25, 25));

        lbln3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 64, 25, 25));

        lbln4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 25, 25));

        lbln5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 124, 25, 25));

        lbln6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 154, 25, 25));

        lbln7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 184, 25, 25));

        lbln8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 214, 25, 25));

        lbln9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 244, 25, 25));

        lbln10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 274, 25, 25));

        lbln11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 304, 25, 25));

        lbln12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 334, 25, 25));

        lbln13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 364, 25, 25));

        lbln14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 394, 25, 25));

        lbln15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 424, 25, 25));

        lbln16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln16, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 454, 25, 25));

        lbln17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln17, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 484, 25, 25));

        lbln18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 514, 25, 25));

        lbln19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 544, 25, 25));

        lbln20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 574, 25, 25));

        lbln21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 604, 25, 25));

        lbln22.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 634, 25, 25));

        lbln23.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 664, 25, 25));

        lbln24.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln24, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 694, 25, 25));

        lbln25.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln25, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 724, 25, 25));

        lbln26.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 754, 25, 25));

        lbln27.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln27, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 784, 25, 25));

        lbln28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln28, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 814, 25, 25));

        lbldescripcion1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 3, 545, 26));

        lbldescripcion2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 34, 545, 25));

        lbldescripcion3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 64, 545, 25));

        lbldescripcion4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 94, 545, 25));

        lbldescripcion5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 124, 545, 25));

        lbldescripcion6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 154, 545, 25));

        lbldescripcion7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 184, 545, 25));

        lbldescripcion8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 214, 545, 25));

        lbldescripcion9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 244, 545, 25));

        lbldescripcion10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 274, 545, 25));

        lbldescripcion11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 304, 545, 25));

        lbldescripcion12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 334, 545, 25));

        lbldescripcion13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion13, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 364, 545, 25));

        lbldescripcion14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion14, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 394, 545, 25));

        lbldescripcion15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion15, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 424, 545, 25));

        lbldescripcion16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion16, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 454, 545, 25));

        lbldescripcion17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion17, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 484, 545, 25));

        lbldescripcion18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion18, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 514, 545, 25));

        lbldescripcion19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion19, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 544, 545, 25));

        lbldescripcion20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion20, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 574, 545, 25));

        lbldescripcion21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion21, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 604, 545, 25));

        lbldescripcion22.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion22, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 634, 545, 25));

        lbldescripcion23.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion23, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 664, 545, 25));

        lbldescripcion24.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion24, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 694, 545, 25));

        lbldescripcion25.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion25, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 724, 545, 25));

        lbldescripcion26.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion26, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 754, 545, 25));

        lbldescripcion27.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion27, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 784, 545, 25));

        lbldescripcion28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        materiales.add(lbldescripcion28, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 814, 545, 25));

        lblstock1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 3, 60, 26));

        lblstock2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 34, 60, 25));

        lblstock3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 64, 60, 25));

        lblstock4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock4, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 94, 60, 25));

        lblstock5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock5, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 124, 60, 25));

        lblstock6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock6, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 154, 60, 25));

        lblstock7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock7, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 184, 60, 25));

        lblstock8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock8, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 214, 60, 25));

        lblstock9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock9, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 244, 60, 25));

        lblstock10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock10, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 274, 60, 25));

        lblstock11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock11, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 304, 60, 25));

        lblstock12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock12, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 334, 60, 25));

        lblstock13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock13, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 364, 60, 25));

        lblstock14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock14, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 394, 60, 25));

        lblstock15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock15, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 424, 60, 25));

        lblstock16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock16, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 454, 60, 25));

        lblstock17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock17, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 484, 60, 25));

        lblstock18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock18, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 514, 60, 25));

        lblstock19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock19, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 544, 60, 25));

        lblstock20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock20, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 574, 60, 25));

        lblstock21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock21, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 604, 60, 25));

        lblstock22.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock22, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 634, 60, 25));

        lblstock23.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock23, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 664, 60, 25));

        lblstock24.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock24, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 694, 60, 25));

        lblstock25.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock25, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 724, 60, 25));

        lblstock26.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock26, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 754, 60, 25));

        lblstock27.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock27, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 784, 60, 25));

        lblstock28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblstock28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblstock28, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 814, 60, 25));

        txtcantidad1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad1.setBorder(null);
        txtcantidad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad1MousePressed(evt);
            }
        });
        txtcantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad1ActionPerformed(evt);
            }
        });
        txtcantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidad1KeyTyped(evt);
            }
        });
        materiales.add(txtcantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 3, 60, 26));

        txtcantidad2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad2.setBorder(null);
        txtcantidad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad2MousePressed(evt);
            }
        });
        txtcantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad2ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 34, 60, 25));

        txtcantidad3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad3.setBorder(null);
        txtcantidad3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad3MousePressed(evt);
            }
        });
        txtcantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad3ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 64, 60, 25));

        txtcantidad4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad4.setBorder(null);
        txtcantidad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad4MousePressed(evt);
            }
        });
        txtcantidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad4ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 94, 60, 25));

        txtcantidad5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad5.setBorder(null);
        txtcantidad5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad5MousePressed(evt);
            }
        });
        txtcantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad5ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 124, 60, 25));

        txtcantidad6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad6.setBorder(null);
        txtcantidad6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcantidad6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcantidad6MousePressed(evt);
            }
        });
        txtcantidad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad6ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 154, 60, 25));

        txtcantidad7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad7.setBorder(null);
        txtcantidad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad7ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 184, 60, 25));

        txtcantidad8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad8.setBorder(null);
        txtcantidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad8ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 214, 60, 25));

        txtcantidad9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad9.setBorder(null);
        txtcantidad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad9ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 244, 60, 25));

        txtcantidad10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad10.setBorder(null);
        txtcantidad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad10ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 274, 60, 25));

        txtcantidad11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad11.setBorder(null);
        txtcantidad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad11ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad11, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 304, 60, 25));

        txtcantidad12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad12.setBorder(null);
        txtcantidad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad12ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 334, 60, 25));

        txtcantidad13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad13.setBorder(null);
        txtcantidad13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad13ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad13, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 364, 60, 25));

        txtcantidad14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad14.setBorder(null);
        txtcantidad14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad14ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad14, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 394, 60, 25));

        txtcantidad15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad15.setBorder(null);
        txtcantidad15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad15ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad15, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 424, 60, 25));

        txtcantidad16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad16.setBorder(null);
        txtcantidad16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad16ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad16, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 454, 60, 25));

        txtcantidad17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad17.setBorder(null);
        txtcantidad17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad17ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad17, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 484, 60, 25));

        txtcantidad18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad18.setBorder(null);
        txtcantidad18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad18ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad18, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 514, 60, 25));

        txtcantidad19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad19.setBorder(null);
        txtcantidad19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad19ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad19, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 544, 60, 25));

        txtcantidad20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad20.setBorder(null);
        txtcantidad20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad20ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad20, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 574, 60, 25));

        txtcantidad21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad21.setBorder(null);
        txtcantidad21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad21ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad21, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 604, 60, 25));

        txtcantidad22.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad22.setBorder(null);
        txtcantidad22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad22ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad22, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 634, 60, 25));

        txtcantidad23.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad23.setBorder(null);
        txtcantidad23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad23ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad23, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 664, 60, 25));

        txtcantidad24.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad24.setBorder(null);
        txtcantidad24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad24ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad24, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 694, 60, 25));

        txtcantidad25.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad25.setBorder(null);
        txtcantidad25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad25ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad25, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 724, 60, 25));

        txtcantidad26.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad26.setBorder(null);
        txtcantidad26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad26ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad26, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 754, 60, 25));

        txtcantidad27.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad27.setBorder(null);
        txtcantidad27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad27ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad27, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 784, 60, 25));

        txtcantidad28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtcantidad28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad28.setBorder(null);
        txtcantidad28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad28ActionPerformed(evt);
            }
        });
        materiales.add(txtcantidad28, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 814, 60, 25));

        vertical1.setBackground(new java.awt.Color(102, 102, 102));
        vertical1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 0, -1, 1000));

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

        jSeparator21.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator21.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 990, 3));

        vertical3.setBackground(new java.awt.Color(102, 102, 102));
        vertical3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, -1, 1000));

        vertical4.setBackground(new java.awt.Color(102, 102, 102));
        vertical4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical4, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 0, -1, 1000));

        jSeparator22.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator22.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 990, 3));

        jSeparator23.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator23.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 990, 3));

        jSeparator24.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator24.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 990, 3));

        jSeparator25.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator25.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 990, 3));

        jSeparator26.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator26.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 990, 3));

        jSeparator27.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator27.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 990, 3));

        jSeparator28.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator28.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 990, 3));

        jSeparator29.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator29.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 990, 3));

        jSeparator30.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator30.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 990, 3));

        jSeparator31.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator31.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 990, 3));

        jSeparator32.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator32.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 990, 3));

        jSeparator33.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator33.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 990, 3));

        jSeparator34.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator34.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 990, 3));

        jSeparator35.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator35.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 990, 3));

        jSeparator36.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator36.setPreferredSize(new java.awt.Dimension(50, 5));
        materiales.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 990, 3));

        vertical2.setBackground(new java.awt.Color(102, 102, 102));
        vertical2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 0, -1, 1000));

        lbln29.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln29, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 3, 95, 26));

        lbln30.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln30, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 34, 95, 25));

        lbln31.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln31, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 64, 95, 25));

        lbln32.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln32, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 94, 95, 25));

        lbln33.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln33, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 124, 95, 25));

        lbln34.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln34, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 154, 95, 25));

        lbln35.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln35, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 184, 95, 25));

        lbln36.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln36, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 214, 95, 25));

        lbln37.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln37, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 244, 95, 25));

        lbln38.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln38, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 274, 95, 25));

        lbln39.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln39, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 304, 95, 25));

        lbln40.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln40, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 334, 95, 25));

        lbln41.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln41, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 364, 95, 25));

        lbln42.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln42, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 394, 95, 25));

        lbln43.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln43, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 424, 95, 25));

        lbln44.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln44, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 454, 95, 25));

        lbln45.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln45, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 484, 95, 25));

        lbln46.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln46, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 514, 95, 25));

        lbln47.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln47, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 544, 95, 25));

        lbln48.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln48, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 574, 95, 25));

        lbln49.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln49, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 604, 95, 25));

        lbln50.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln50, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 634, 95, 25));

        lbln51.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln51, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 664, 95, 25));

        lbln52.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln52, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 694, 95, 25));

        lbln53.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln53, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 724, 95, 25));

        lbln54.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln54, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 754, 95, 25));

        lbln55.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln55, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 784, 95, 25));

        lbln56.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbln56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lbln56, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 814, 95, 25));

        vertical5.setBackground(new java.awt.Color(102, 102, 102));
        vertical5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materiales.add(vertical5, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 0, -1, 1000));

        lblnombre1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 3, 125, 26));

        lblnombre2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 34, 125, 25));

        lblnombre3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 64, 125, 25));

        lblnombre4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 94, 125, 25));

        lblnombre5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 124, 125, 25));

        lblnombre6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 154, 125, 25));

        lblnombre7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 184, 125, 25));

        lblnombre8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 214, 125, 25));

        lblnombre9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 244, 125, 25));

        lblnombre10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 274, 125, 25));

        lblnombre11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 304, 125, 25));

        lblnombre12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 334, 125, 25));

        lblnombre13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 364, 125, 25));

        lblnombre14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 394, 125, 25));

        lblnombre15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 424, 125, 25));

        lblnombre16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre16, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 454, 125, 25));

        lblnombre17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre17, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 484, 125, 25));

        lblnombre18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre18, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 514, 125, 25));

        lblnombre19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre19, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 544, 125, 25));

        lblnombre20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre20, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 574, 125, 25));

        lblnombre21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre21, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 604, 125, 25));

        lblnombre22.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre22, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 634, 125, 25));

        lblnombre23.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre23, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 664, 125, 25));

        lblnombre24.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre24, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 694, 125, 25));

        lblnombre25.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre25, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 724, 125, 25));

        lblnombre26.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre26, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 754, 125, 25));

        lblnombre27.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre27, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 784, 125, 25));

        lblnombre28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblnombre28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales.add(lblnombre28, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 814, 125, 25));

        PanelMateriales.setViewportView(materiales);

        DespacharMaterialPanel.add(PanelMateriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 990, 180));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setText("Desp.");
        DespacharMaterialPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 260, 40, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setText("N°");
        DespacharMaterialPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 20, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setText("Descripción");
        DespacharMaterialPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 90, 20));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        DespacharMaterialPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 10, 20));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        DespacharMaterialPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 10, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel5.setText("Trabajador");
        DespacharMaterialPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 260, 80, 20));

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        DespacharMaterialPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 10, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel6.setText("Liquid.");
        DespacharMaterialPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 260, 50, 20));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        DespacharMaterialPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 10, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel7.setText("Matrícula");
        DespacharMaterialPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 260, 70, 20));

        jSeparator37.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator37.setOrientation(javax.swing.SwingConstants.VERTICAL);
        DespacharMaterialPanel.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 10, 20));

        btnHistorial.setBackground(new java.awt.Color(13, 71, 161));
        btnHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHistorial.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorial.setText("Ver Historial");
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

        DespacharMaterialPanel.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 160, 60));

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

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
       
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtSSTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSSTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSTMousePressed

    private void txtNdocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNdocMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNdocMousePressed

    private void txtSSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSTActionPerformed
        // TODO add your handling code here:
        //ComboBoxTrabajadores();
    }//GEN-LAST:event_txtSSTActionPerformed

    private void cboTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrabajadoresActionPerformed
        try {
            for (int i = 0; i < 10000; i++) {
                if (cboTrabajadores.getSelectedItem().equals(apellido[i]+", "+nombre[i]+" - "+dni[i])) {
                    lbldni.setText(dni[i]);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboTrabajadoresActionPerformed

    private void txtcantidad1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad1MouseExited
        if (txtcantidad1.getText().equals("")) {
            txtcantidad1.setText("0.0");
            txtcantidad1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad1MouseExited

    private void txtcantidad1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad1MousePressed
        if (txtcantidad1.getText().equals("0.0")) {
            txtcantidad1.setText("");
            txtcantidad1.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad1MousePressed

    private void txtcantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad1ActionPerformed

    private void txtcantidad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidad1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcantidad1KeyReleased

    private void txtcantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidad1KeyTyped
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"SALIENDO DEL TEXTO");

    }//GEN-LAST:event_txtcantidad1KeyTyped

    private void txtcantidad2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad2MouseExited
        // TODO add your handling code here:
        if (txtcantidad2.getText().equals("")) {
            txtcantidad2.setText("0.0");
            txtcantidad2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad2MouseExited

    private void txtcantidad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad2MousePressed
        // TODO add your handling code here:
        if (txtcantidad2.getText().equals("0.0")) {
            txtcantidad2.setText("");
            txtcantidad2.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad2MousePressed

    private void txtcantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad2ActionPerformed

    private void txtcantidad3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad3MouseExited
        // TODO add your handling code here:
        if (txtcantidad3.getText().equals("")) {
            txtcantidad3.setText("0.0");
            txtcantidad3.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad3MouseExited

    private void txtcantidad3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad3MousePressed
        // TODO add your handling code here:
        if (txtcantidad3.getText().equals("0.0")) {
            txtcantidad3.setText("");
            txtcantidad3.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad3MousePressed

    private void txtcantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad3ActionPerformed

    private void txtcantidad4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad4MouseExited
        // TODO add your handling code here:
        if (txtcantidad4.getText().equals("")) {
            txtcantidad4.setText("0.0");
            txtcantidad4.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad4MouseExited

    private void txtcantidad4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad4MousePressed
        // TODO add your handling code here:
        if (txtcantidad4.getText().equals("0.0")) {
            txtcantidad4.setText("");
            txtcantidad4.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad4MousePressed

    private void txtcantidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad4ActionPerformed

    private void txtcantidad5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad5MouseExited
        // TODO add your handling code here:
        if (txtcantidad5.getText().equals("")) {
            txtcantidad5.setText("0.0");
            txtcantidad5.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad5MouseExited

    private void txtcantidad5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad5MousePressed
        // TODO add your handling code here:
        if (txtcantidad5.getText().equals("0.0")) {
            txtcantidad5.setText("");
            txtcantidad5.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad5MousePressed

    private void txtcantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad5ActionPerformed

    private void txtcantidad6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad6MouseExited
        // TODO add your handling code here:
        if (txtcantidad6.getText().equals("")) {
            txtcantidad6.setText("0.0");
            txtcantidad6.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcantidad6MouseExited

    private void txtcantidad6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcantidad6MousePressed
        // TODO add your handling code here:
        if (txtcantidad6.getText().equals("0.0")) {
            txtcantidad6.setText("");
            txtcantidad6.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcantidad6MousePressed

    private void txtcantidad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad6ActionPerformed

    private void txtcantidad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad7ActionPerformed

    private void txtcantidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad8ActionPerformed

    private void txtcantidad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad9ActionPerformed

    private void txtcantidad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad10ActionPerformed

    private void txtcantidad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad11ActionPerformed

    private void txtcantidad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad12ActionPerformed

    private void txtcantidad13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad13ActionPerformed

    private void txtcantidad14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad14ActionPerformed

    private void txtcantidad15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad15ActionPerformed

    private void txtcantidad16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad16ActionPerformed

    private void txtcantidad17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad17ActionPerformed

    private void txtcantidad18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad18ActionPerformed

    private void txtcantidad19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad19ActionPerformed

    private void txtcantidad20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad20ActionPerformed

    private void txtcantidad21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad21ActionPerformed

    private void txtcantidad22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad22ActionPerformed

    private void txtcantidad23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad23ActionPerformed

    private void txtcantidad24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad24ActionPerformed

    private void txtcantidad25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad25ActionPerformed

    private void txtcantidad26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad26ActionPerformed

    private void txtcantidad27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad27ActionPerformed

    private void txtcantidad28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad28ActionPerformed

    private void lblExtraerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExtraerMouseClicked
        // TODO add your handling code here:
        if (cboTrabajadores.getSelectedItem().equals("Elegir personal a liquidar")) {
            JOptionPane.showMessageDialog(null,"Falta elegir a personal");
        }else{
            LimpiarTabla();
            ExtraerMaterial();
            ExtraerCantidadLiquidacion();
        }        
    }//GEN-LAST:event_lblExtraerMouseClicked

    private void txtSSTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSTKeyTyped
        // TODO add your handling code here:
        if (txtSST.getText().length()>7) {            
            evt.consume();            
        }
    }//GEN-LAST:event_txtSSTKeyTyped

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:               
        if (txtSST.getText().equals("")  || cboTrabajadores.getSelectedItem().equals("Elegir personal a liquidar") ) {
            JOptionPane.showMessageDialog(null,"Ingrese o seleccione bien sus datos");
        } else {
            ActualizarDatos();
            LimpiarDatos();
            JOptionPane.showMessageDialog(null,"Datos guardados con exito");
        }  
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void txtSSTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSTKeyReleased
    
    }//GEN-LAST:event_txtSSTKeyReleased

    private void txtSSTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSSTMouseExited
        // TODO add your handling code here:
        ComboBoxTrabajadores();
    }//GEN-LAST:event_txtSSTMouseExited

    private void lblHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseClicked
        // TODO add your handling code here:
        MostrarData d = new MostrarData();
        d.DataLiquidaciones();
        //d.Liquidacion("liquidacion");
        d.setVisible(true);
    }//GEN-LAST:event_lblHistorialMouseClicked

    private void lblHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistorialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHistorialMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DespacharMaterialPanel;
    private javax.swing.JScrollPane PanelMateriales;
    private javax.swing.JPanel btnExtraer;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnHistorial;
    private javax.swing.JPanel btnLimpiarDatos;
    private javax.swing.JComboBox<String> cboTrabajadores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblExtraer;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblLimpiarDatos;
    private javax.swing.JLabel lblNdoc;
    private javax.swing.JLabel lblSST;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbldescripcion1;
    private javax.swing.JLabel lbldescripcion10;
    private javax.swing.JLabel lbldescripcion11;
    private javax.swing.JLabel lbldescripcion12;
    private javax.swing.JLabel lbldescripcion13;
    private javax.swing.JLabel lbldescripcion14;
    private javax.swing.JLabel lbldescripcion15;
    private javax.swing.JLabel lbldescripcion16;
    private javax.swing.JLabel lbldescripcion17;
    private javax.swing.JLabel lbldescripcion18;
    private javax.swing.JLabel lbldescripcion19;
    private javax.swing.JLabel lbldescripcion2;
    private javax.swing.JLabel lbldescripcion20;
    private javax.swing.JLabel lbldescripcion21;
    private javax.swing.JLabel lbldescripcion22;
    private javax.swing.JLabel lbldescripcion23;
    private javax.swing.JLabel lbldescripcion24;
    private javax.swing.JLabel lbldescripcion25;
    private javax.swing.JLabel lbldescripcion26;
    private javax.swing.JLabel lbldescripcion27;
    private javax.swing.JLabel lbldescripcion28;
    private javax.swing.JLabel lbldescripcion3;
    private javax.swing.JLabel lbldescripcion4;
    private javax.swing.JLabel lbldescripcion5;
    private javax.swing.JLabel lbldescripcion6;
    private javax.swing.JLabel lbldescripcion7;
    private javax.swing.JLabel lbldescripcion8;
    private javax.swing.JLabel lbldescripcion9;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lbln1;
    private javax.swing.JLabel lbln10;
    private javax.swing.JLabel lbln11;
    private javax.swing.JLabel lbln12;
    private javax.swing.JLabel lbln13;
    private javax.swing.JLabel lbln14;
    private javax.swing.JLabel lbln15;
    private javax.swing.JLabel lbln16;
    private javax.swing.JLabel lbln17;
    private javax.swing.JLabel lbln18;
    private javax.swing.JLabel lbln19;
    private javax.swing.JLabel lbln2;
    private javax.swing.JLabel lbln20;
    private javax.swing.JLabel lbln21;
    private javax.swing.JLabel lbln22;
    private javax.swing.JLabel lbln23;
    private javax.swing.JLabel lbln24;
    private javax.swing.JLabel lbln25;
    private javax.swing.JLabel lbln26;
    private javax.swing.JLabel lbln27;
    private javax.swing.JLabel lbln28;
    private javax.swing.JLabel lbln29;
    private javax.swing.JLabel lbln3;
    private javax.swing.JLabel lbln30;
    private javax.swing.JLabel lbln31;
    private javax.swing.JLabel lbln32;
    private javax.swing.JLabel lbln33;
    private javax.swing.JLabel lbln34;
    private javax.swing.JLabel lbln35;
    private javax.swing.JLabel lbln36;
    private javax.swing.JLabel lbln37;
    private javax.swing.JLabel lbln38;
    private javax.swing.JLabel lbln39;
    private javax.swing.JLabel lbln4;
    private javax.swing.JLabel lbln40;
    private javax.swing.JLabel lbln41;
    private javax.swing.JLabel lbln42;
    private javax.swing.JLabel lbln43;
    private javax.swing.JLabel lbln44;
    private javax.swing.JLabel lbln45;
    private javax.swing.JLabel lbln46;
    private javax.swing.JLabel lbln47;
    private javax.swing.JLabel lbln48;
    private javax.swing.JLabel lbln49;
    private javax.swing.JLabel lbln5;
    private javax.swing.JLabel lbln50;
    private javax.swing.JLabel lbln51;
    private javax.swing.JLabel lbln52;
    private javax.swing.JLabel lbln53;
    private javax.swing.JLabel lbln54;
    private javax.swing.JLabel lbln55;
    private javax.swing.JLabel lbln56;
    private javax.swing.JLabel lbln6;
    private javax.swing.JLabel lbln7;
    private javax.swing.JLabel lbln8;
    private javax.swing.JLabel lbln9;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre10;
    private javax.swing.JLabel lblnombre11;
    private javax.swing.JLabel lblnombre12;
    private javax.swing.JLabel lblnombre13;
    private javax.swing.JLabel lblnombre14;
    private javax.swing.JLabel lblnombre15;
    private javax.swing.JLabel lblnombre16;
    private javax.swing.JLabel lblnombre17;
    private javax.swing.JLabel lblnombre18;
    private javax.swing.JLabel lblnombre19;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre20;
    private javax.swing.JLabel lblnombre21;
    private javax.swing.JLabel lblnombre22;
    private javax.swing.JLabel lblnombre23;
    private javax.swing.JLabel lblnombre24;
    private javax.swing.JLabel lblnombre25;
    private javax.swing.JLabel lblnombre26;
    private javax.swing.JLabel lblnombre27;
    private javax.swing.JLabel lblnombre28;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lblnombre6;
    private javax.swing.JLabel lblnombre7;
    private javax.swing.JLabel lblnombre8;
    private javax.swing.JLabel lblnombre9;
    private javax.swing.JLabel lblstock1;
    private javax.swing.JLabel lblstock10;
    private javax.swing.JLabel lblstock11;
    private javax.swing.JLabel lblstock12;
    private javax.swing.JLabel lblstock13;
    private javax.swing.JLabel lblstock14;
    private javax.swing.JLabel lblstock15;
    private javax.swing.JLabel lblstock16;
    private javax.swing.JLabel lblstock17;
    private javax.swing.JLabel lblstock18;
    private javax.swing.JLabel lblstock19;
    private javax.swing.JLabel lblstock2;
    private javax.swing.JLabel lblstock20;
    private javax.swing.JLabel lblstock21;
    private javax.swing.JLabel lblstock22;
    private javax.swing.JLabel lblstock23;
    private javax.swing.JLabel lblstock24;
    private javax.swing.JLabel lblstock25;
    private javax.swing.JLabel lblstock26;
    private javax.swing.JLabel lblstock27;
    private javax.swing.JLabel lblstock28;
    private javax.swing.JLabel lblstock3;
    private javax.swing.JLabel lblstock4;
    private javax.swing.JLabel lblstock5;
    private javax.swing.JLabel lblstock6;
    private javax.swing.JLabel lblstock7;
    private javax.swing.JLabel lblstock8;
    private javax.swing.JLabel lblstock9;
    private javax.swing.JPanel materiales;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNdoc;
    private javax.swing.JTextField txtSST;
    private javax.swing.JTextField txtcantidad1;
    private javax.swing.JTextField txtcantidad10;
    private javax.swing.JTextField txtcantidad11;
    private javax.swing.JTextField txtcantidad12;
    private javax.swing.JTextField txtcantidad13;
    private javax.swing.JTextField txtcantidad14;
    private javax.swing.JTextField txtcantidad15;
    private javax.swing.JTextField txtcantidad16;
    private javax.swing.JTextField txtcantidad17;
    private javax.swing.JTextField txtcantidad18;
    private javax.swing.JTextField txtcantidad19;
    private javax.swing.JTextField txtcantidad2;
    private javax.swing.JTextField txtcantidad20;
    private javax.swing.JTextField txtcantidad21;
    private javax.swing.JTextField txtcantidad22;
    private javax.swing.JTextField txtcantidad23;
    private javax.swing.JTextField txtcantidad24;
    private javax.swing.JTextField txtcantidad25;
    private javax.swing.JTextField txtcantidad26;
    private javax.swing.JTextField txtcantidad27;
    private javax.swing.JTextField txtcantidad28;
    private javax.swing.JTextField txtcantidad3;
    private javax.swing.JTextField txtcantidad4;
    private javax.swing.JTextField txtcantidad5;
    private javax.swing.JTextField txtcantidad6;
    private javax.swing.JTextField txtcantidad7;
    private javax.swing.JTextField txtcantidad8;
    private javax.swing.JTextField txtcantidad9;
    private javax.swing.JSeparator vertical1;
    private javax.swing.JSeparator vertical2;
    private javax.swing.JSeparator vertical3;
    private javax.swing.JSeparator vertical4;
    private javax.swing.JSeparator vertical5;
    // End of variables declaration//GEN-END:variables
}
