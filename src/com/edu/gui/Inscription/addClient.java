/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Inscription;

import com.edu.DAO.ClientDAO;
import com.edu.entities.Client;
import com.edu.gui.authentification;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;



/**
 *
 * @author MrBenrhouma
 */
public class addClient extends javax.swing.JFrame {
    public static File pics;
    public FileInputStream fistream;
    /**
     * Creates new form addClient
     */
    public addClient() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        res = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        tfmail = new javax.swing.JTextField();
        tfnom = new javax.swing.JTextField();
        tfprenom = new javax.swing.JTextField();
        tfville = new javax.swing.JTextField();
        tfpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jlImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajout Client");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        res.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscription Client", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        tfmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmailActionPerformed(evt);
            }
        });
        jPanel1.add(tfmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 50, 170, 25));
        jPanel1.add(tfnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 25));
        jPanel1.add(tfprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 25));
        jPanel1.add(tfville, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 25));
        jPanel1.add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, 25));

        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 130, 20));

        jLabel4.setText("Nom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 20));

        jLabel5.setText("Prénom");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 20));

        jLabel6.setText("Ville");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        jLabel7.setText("Mot de passe");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 20));

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jButton3.setText("Retour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 243, 256, -1));

        jlImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel8.setText("Image");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton4.setText("Parcourir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if ((tfmail.getText().isEmpty())||(tfnom.getText().isEmpty())||(tfprenom.getText().isEmpty())||(tfpassword.getPassword().toString().isEmpty())||(tfville.getText().isEmpty())) {
            label.setText("Veuillez saisir toutes les champs");
        }
        else
        {
            Client c = new Client();
            ClientDAO cdao = new ClientDAO();
            
            c.setEmail(tfmail.getText());
           
            c.setNom(tfnom.getText());
            c.setPrenom(tfprenom.getText());
            c.setVille(tfville.getText());
            c.setPassword(tfpassword.getText());
            c.setPhoto(fistream);
            
            cdao.insertclient(c);
            
            label.setText("Ajout avec succée");
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                
                tfmail.setText(null);
                tfnom.setText(null);
                tfprenom.setText(null);
                tfpassword.setText(null);
                tfville.setText(null);
                label.setText(null);
        

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 authentification au = new authentification();
        au.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jlImage.setSize(100, 100);
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try{
          JFileChooser picchooser = new JFileChooser();
          int returnval = picchooser.showOpenDialog(null);
          File file = null;
          if(returnval == JFileChooser.APPROVE_OPTION){
              file = picchooser.getSelectedFile();
              String filename = file.getAbsolutePath();
              pics = new File(filename);
              ImageIcon ima = new ImageIcon(filename);
              fistream = new FileInputStream (pics);
              jlImage.setIcon(ima);
          }
      } catch(Exception e){
          e.printStackTrace();
      }
      
    
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(addClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlImage;
    private javax.swing.JLabel label;
    private javax.swing.JLabel res;
    private javax.swing.JTextField tfmail;
    private javax.swing.JTextField tfnom;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField tfprenom;
    private javax.swing.JTextField tfville;
    // End of variables declaration//GEN-END:variables
}
