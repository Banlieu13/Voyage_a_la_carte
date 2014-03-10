/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeux;

import com.edu.gui.Responsable.Acceuil_Responsable;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MrBenrhouma
 */
public class Main extends javax.swing.JFrame {
    

    /**
     * Creates new form Main
     */
    public Main() {
        
        setBounds(50,50,470,380);
        initComponents();
        initcarte();
        
       /* for (int i=0;i<48;i++)

        }*/
    }
    private int auHazardEntre(int min, int max){
        double t=Math.random();
        int resultat = (int) ((max-min)*t+min);
        return resultat;
    }
    
    private void melanger(){
        
        for (int i=0;i<listecarte.length;i++){
            int alea = auHazardEntre(0, listecarte.length);
            Carte tmp = listecarte[i];
            listecarte[i] = listecarte[alea];
            listecarte[alea] = tmp ;   
        }
    }
    
    private void initcarte (){
        listecarte = new Carte [nbcarte];
        int cptr =0;
       
        for (int i=0;i<nbcarte;i++){
            listecarte[i]=new Carte("C:/Users/MrBenrhouma/Documents/NetBeansProjects/Jeux/photos/l"+cptr+".png","C:/Users/MrBenrhouma/Documents/NetBeansProjects/Jeux/photos/dos.png",cptr);
            cptr++ ;
            listecarte[i].tournerversDos();
            if(cptr == nbcarte/2){
                cptr = 0;
            }
        } 
            melanger();
            afficherlescarte();   
    }   

    private void afficherlescarte(){
        
        for (int i=0;i<nbcarte;i++){
            BoitePhotos.add(listecarte[i]);
            listecarte[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseReleased (java.awt.event.MouseEvent evt){
                    carteMouseReleased(evt);
                }
            });
        }
 
    }
    private void retournerlescartes (){
        for(int i=0;i<nbcarte;i++){
            listecarte[i].tournerversDos();
        }
    }
    public void carteMouseReleased (java.awt.event.MouseEvent evt){
       
        carteCliquee = (Carte) evt.getSource();

        if (aretourner==true)
        {
           premiere.tournerversDos();
           seconde.tournerversDos();
           aretourner=false;
        }
        if(nbClick==0){
            nbClick=1;
            premiere = carteCliquee;
            premiere.tournerversFace();
            // Supprimer l'ecouteur d'evenement pr la 1ere carte
            premiere.removeMouseListener(premiere.getMouseListeners()[0]);
        }
        else{
        if (nbClick == 1){
            nbClick=0;
            seconde = carteCliquee;
            seconde.tournerversFace();
            if(seconde.getId()!=premiere.getId())
            {
            aretourner = true ;
            s = s-1;
            scor.setText(""+s);
            //Activer l'ecouteur d'evennement pe la 1ere carte 
            premiere.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseReleased (java.awt.event.MouseEvent evt){
                    carteMouseReleased(evt);
                }
            });
            }
            else
            {
                // Supprimer l'ecouteur d'evenement pr la 2eme carte
                seconde.removeMouseListener(seconde.getMouseListeners()[0]);
                s = s+10;
                scor.setText(""+s);
                nbpaires +=2;
                
                if(nbpaires ==nbcarte)
                {
                     new Message(this, true);
                    retournerlescartes();
                    nbpaires=0;
                    s=0;
                    scor.setText(""+s);
                    BoitePhotos.removeAll();
                    initcarte();
                     
                    
                }
            }
            
            
        }
           
    }
    }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoitePhotos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Acceuil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jeu de Carte");
        setFocusableWindowState(false);
        setForeground(new java.awt.Color(51, 255, 51));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BoitePhotos.setBackground(new java.awt.Color(76, 75, 75));
        BoitePhotos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cartes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 90, 0))); // NOI18N
        BoitePhotos.setForeground(new java.awt.Color(255, 90, 0));
        BoitePhotos.setMinimumSize(new java.awt.Dimension(470, 364));
        BoitePhotos.setPreferredSize(new java.awt.Dimension(470, 364));
        BoitePhotos.setLayout(new java.awt.GridLayout(4, 12));
        getContentPane().add(BoitePhotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 800, 400));
        BoitePhotos.getAccessibleContext().setAccessibleName("Jeux de Cartes");

        jPanel1.setBackground(new java.awt.Color(76, 75, 75));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 90, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        scor.setForeground(new java.awt.Color(255, 90, 0));
        scor.setText("0");
        scor.setName("scor"); // NOI18N
        jPanel1.add(scor, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 51, 80, 79));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 107, -1, -1));

        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLabel1.setText("Copyright Benrhouma Becem");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 446, -1, -1));
        getContentPane().add(Acceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        BufferedImage imgHome = null;
        try {
            imgHome = ImageIO.read(new File("res/arriere.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ri = imgHome.getScaledInstance(Acceuil.getWidth(), Acceuil.getHeight(), 0);
          Acceuil.setIcon(new ImageIcon(ri));
          
    
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Main().setVisible(true);
            }
        });
       
    }
    private Carte [] listecarte ;
    private static int nbcarte = 48;
    Carte carteCliquee,premiere,seconde ;
    int nbClick = 0 ;    
    int nbpaires =0 ;
    boolean aretourner=false;
    public int s =0;
    //private boolean coteDos=true ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acceuil;
    private javax.swing.JPanel BoitePhotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel scor;
    // End of variables declaration//GEN-END:variables
}
