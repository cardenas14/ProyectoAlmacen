
package Frames;

import ProgressBar.Transparencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.*;


public class CargaFrame extends javax.swing.JFrame {
    
    private Timer t;
    private ActionListener ac;
    private int x=0;
    

    public CargaFrame() {
        
        
        
        new Transparencia().BorrarFondo(this);
         initComponents();
        this.setLocationRelativeTo(null);
        IniciarBarra();
        IniciarSonido();
       
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Animacion final.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 791, 526));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(102, 153, 255));
        jProgressBar1.setBorder(null);
        jProgressBar1.setPreferredSize(new java.awt.Dimension(790, 5));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 528, -1, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

   public void IniciarBarra(){
       ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=9;
                jProgressBar1.setValue(x);
                if (jProgressBar1.getValue()==100) {
                    dispose();
                    t.stop();
                    FrameAcceso f = new FrameAcceso();
                    f.setVisible(true);
                }
            }
        };
       t=new Timer(100,ac);
        t.start();
       
   }
   
   public void IniciarSonido(){
       
       AudioClip Sound;
       Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/SONIDO-DE-INICIO.wav"));//MEJORAR SONIDO AQUI                  
       Sound.play();
       
   }
   

   
   
   
   

}
