/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;

import com.edu.gui.Client.*;
import com.edu.DAO.CommentaireDAO;
import com.edu.DAO.SignalerDAO;
import com.edu.entities.Signalisation;
import com.edu.gui.authentification;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author MrBenrhouma
 */
public class SignalercommRes extends javax.swing.JFrame {

    /**
     * Creates new form SignalercommRes
     */
    public SignalercommRes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbtype = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtsujet = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        mssg = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        btnValid = new javax.swing.JLabel();
        Accueil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signaler un commentaire");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 35, -1, -1));

        cbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Politique", "Faux profil", "Impoli", " ", " ", " " }));
        getContentPane().add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 35, -1, -1));

        jtsujet.setBackground(new java.awt.Color(76, 75, 75));
        jtsujet.setColumns(20);
        jtsujet.setForeground(new java.awt.Color(255, 255, 255));
        jtsujet.setRows(5);
        jScrollPane1.setViewportView(jtsujet);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 105, 310, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 90, 0));
        jLabel2.setText("Sujet");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 105, -1, -1));

        mssg.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(mssg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, 20));

        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x1MouseExited(evt);
            }
        });
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        btnValid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidMouseExited(evt);
            }
        });
        getContentPane().add(btnValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 123, 35));

        Accueil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Accueil.setIcon(new javax.swing.ImageIcon("D:\\Cours\\3A20\\Semestre 2\\PI\\Images\\arriere.jpg")); // NOI18N
        getContentPane().add(Accueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked

    }//GEN-LAST:event_x1MouseClicked

    private void x1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseEntered
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseEntered

    private void x1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseExited
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x2.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseExited

    private void btnValidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidMouseClicked
       Signalisation s = new Signalisation();
        CommentaireDAO cd = new CommentaireDAO();
        SignalerDAO sd = new SignalerDAO();
        OffreResponsable info = new OffreResponsable();
        annonce ide = new  annonce();
        tbdestination_1 ides = new tbdestination_1();
        authentification a = new authentification();
        
        s.setE_mailR(a.identifiant);
        s.setSujet(jtsujet.getText());
        s.setType((String) cbtype.getSelectedItem());
        
        if(info.idcom != 0){  
        s.setId_com(info.idcom);
        System.out.println(info.idcom);
        info.idcom = 0;
        }
       
        if(ide.idcom != 0){
            s.setId_com(ide.idcom);
            System.out.println(ide.idcom); 
            ide.idcom = 0;
        }
        if (ides.idcom != 0) {
           s.setId_com(ides.idcom);
           System.out.println(ides.idcom);
           ides.idcom = 0;
        }
      
        sd.insertSignalcomC(s);
        jtsujet.setText(null);
        mssg.setText("Your signaling are send to THE_LEGEND Group");
    }//GEN-LAST:event_btnValidMouseClicked

    private void btnValidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidMouseEntered

        BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridv = imgv.getScaledInstance(btnValid.getWidth(), btnValid.getHeight(), 0);
        btnValid.setIcon(new ImageIcon(ridv));
    }//GEN-LAST:event_btnValidMouseEntered

    private void btnValidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidMouseExited

        BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridv = imgv.getScaledInstance(btnValid.getWidth(), btnValid.getHeight(), 0);
        btnValid.setIcon(new ImageIcon(ridv));
    }//GEN-LAST:event_btnValidMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         this.setLocationRelativeTo(null);
        this.setSize(600, 300);
        
           BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridv = imgv.getScaledInstance(btnValid.getWidth(), btnValid.getHeight(), 0);
          btnValid.setIcon(new ImageIcon(ridv));
          
             BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
          
          BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
          x1.setIcon(new ImageIcon(ridxr));
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
            java.util.logging.Logger.getLogger(SignalercommRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignalercommRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignalercommRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignalercommRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignalercommRes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accueil;
    private javax.swing.JLabel btnValid;
    private javax.swing.JComboBox cbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtsujet;
    private javax.swing.JLabel mssg;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
