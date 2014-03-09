package com.edu.gui;


import FacebookConnector.FacebookTestClient;
import FacebookConnector.MainFacebook;
import static MD5Crypter.Md5.getEncodedPassword;
import com.edu.gui.SuperAdmin.acceuilSuper;
import com.edu.gui.Client.acceuilclient;
import com.edu.gui.Responsable.Acceuil_Responsable;
import com.edu.DAO.authentificationDAO;
import com.edu.entities.Client;

import com.edu.entities.privilegeAdmin;
import com.edu.gui.Admin.acceuilAdmin;
import com.edu.gui.Inscription.addClient;
import com.edu.gui.Inscription.addResponsable;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class authentification extends javax.swing.JFrame {
    public static String identifiant; 
    /**
     * Creates new form authentification
     */
    
    public authentification() {
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

        tfLogin = new javax.swing.JTextField();
        Connexion = new javax.swing.JButton();
        tfpassword = new javax.swing.JPasswordField();
        msg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InscriptionAgence = new javax.swing.JButton();
        Inscriptionclient = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenue");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        getContentPane().add(tfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 120, 30));

        Connexion.setText("Connexion");
        Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionActionPerformed(evt);
            }
        });
        getContentPane().add(Connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 30));
        getContentPane().add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 120, 30));

        msg.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("TH£ L£G£ND Group");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        InscriptionAgence.setText("Inscription Responsable d'Agence");
        InscriptionAgence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscriptionAgenceActionPerformed(evt);
            }
        });
        getContentPane().add(InscriptionAgence, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 30));

        Inscriptionclient.setText("Inscription Client");
        Inscriptionclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscriptionclientActionPerformed(evt);
            }
        });
        getContentPane().add(Inscriptionclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        jButton1.setText("Facebook");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionActionPerformed
        String log =tfLogin.getText();
        String ch = "admin";
        String pswd = getEncodedPassword(tfpassword.getText());
        
        System.out.println(log);
        String reqrespo="select * from responsable where E_mailR='"+log+"' and mot_de_passeR='"+pswd+"' and valide=1";
        String reqclient="select * from client where E_mail='"+log+"' and mot_de_passe='"+pswd+"'";
        String reqAdmin="select * from administrateur where E_mailA='"+log+"' and mot_de_passeA='"+pswd+"'";
        authentificationDAO auth = new authentificationDAO();
        
        System.out.println(log);
        if ((tfLogin.getText().equals(ch))&&(pswd.equals(getEncodedPassword(ch)))) {
            acceuilSuper ac = new acceuilSuper();
            ac.setVisible(true);
            this.setVisible(false);
            identifiant = tfLogin.getText();
        }
        else try {
            if (auth.connect(reqrespo)>0)
            {
              Acceuil_Responsable acc = new Acceuil_Responsable();
              acc.setVisible(true);
              this.setVisible(false);
              identifiant = tfLogin.getText();
            }
            else if (auth.connect(reqclient)>0) 
            {
                acceuilclient accclient = new acceuilclient();
                accclient.setVisible(true);
                this.setVisible(false);
               identifiant = tfLogin.getText();
            }
            else if (auth.connect(reqAdmin)>0){
                acceuilAdmin accadmin = new acceuilAdmin();
                privilegeAdmin pa = new privilegeAdmin();
                identifiant = tfLogin.getText();
                pa.setconnected(identifiant);
                accadmin.setVisible(true);
                this.setVisible(false);
                
               
            }
            else
            {
                msg.setText("Identifiant et/ou mot de passe incorrecte !!");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(authentification.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_ConnexionActionPerformed

   
    
    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
    }//GEN-LAST:event_formComponentAdded

    private void InscriptionAgenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscriptionAgenceActionPerformed
        // TODO add your handling code here:
        addResponsable ar = new addResponsable();
        ar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_InscriptionAgenceActionPerformed

    private void InscriptionclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscriptionclientActionPerformed
        // TODO add your handling code here:
        addClient ac = new addClient();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InscriptionclientActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String[] args = null;
        try{
           this.setVisible(false);
          MainFacebook.main(args);
         
       }catch (Exception e){
           System.out.println("err"+e);
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Client.setFbem(null);
         this.setLocationRelativeTo(null);
         
         BufferedImage imgHome = null;
        try {
            imgHome = ImageIO.read(new File("res/authentificationM.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(authentification.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ri = imgHome.getScaledInstance(fond.getWidth(), fond.getHeight(), 0);
          fond.setIcon(new ImageIcon(ri));
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
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new authentification().setVisible(true);
             
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connexion;
    private javax.swing.JButton InscriptionAgence;
    private javax.swing.JButton Inscriptionclient;
    private javax.swing.JLabel fond;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
