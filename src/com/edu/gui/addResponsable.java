/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui;

import com.edu.DAO.ResponsableDAO;
import com.edu.entities.Responsable;

/**
 *
 * @author MrBenrhouma
 */
public class addResponsable extends javax.swing.JFrame {

    /**
     * Creates new form addResponsable
     */
    public addResponsable() {
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

        jButton1 = new javax.swing.JButton();
        tfmail = new javax.swing.JTextField();
        tfcin = new javax.swing.JTextField();
        tfnom = new javax.swing.JTextField();
        tfprenom = new javax.swing.JTextField();
        tfville = new javax.swing.JTextField();
        tfpassword = new javax.swing.JPasswordField();
        btnadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        res = new javax.swing.JLabel();
        tfAnnonceId = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajout Responsable");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Déconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));
        getContentPane().add(tfmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 170, -1));
        getContentPane().add(tfcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));
        getContentPane().add(tfnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, -1));
        getContentPane().add(tfprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, -1));
        getContentPane().add(tfville, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 170, -1));
        getContentPane().add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 170, -1));

        btnadd.setText("Valider");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        res.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        getContentPane().add(tfAnnonceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 170, -1));

        jMenu1.setText("Comptes");

        jMenuItem1.setText("Client");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Responsable");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Administrateur");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Rapport et statistiques");

        jMenuItem4.setText("Rapport");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Statistique");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gerer les alerts");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Notification");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reservation");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Offres");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Annonces");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListeClient lc = new ListeClient();
        lc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if ((tfmail.getText().isEmpty())||(tfcin.getText().isEmpty())||(tfnom.getText().isEmpty())||(tfprenom.getText().isEmpty())||(tfpassword.getPassword().toString().isEmpty())||(tfville.getText().isEmpty())) {
            res.setText("Veuillez saisir toutes les champs");
        }
        else
        {
            Responsable r = new Responsable();
            ResponsableDAO rdao = new ResponsableDAO();
            r.setEmail(tfmail.getText());
            r.setCin(tfcin.getText());
            r.setNom(tfnom.getText());
            r.setPrenom(tfprenom.getText());
            r.setVille(tfville.getText());
            r.setPassword(tfpassword.getText());
            r.setIdAnnonce(Integer.parseInt(tfAnnonceId.getText()));
            rdao.insertclient(r);
            res.setText("Ajout avec succée");
    }//GEN-LAST:event_btnaddActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tfcin.setText(null);
        tfmail.setText(null);
        tfnom.setText(null);
        tfprenom.setText(null);
        tfpassword.setText(null);
        tfville.setText(null);
        res.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListeResponsable lr = new ListeResponsable();
        lr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        authentification a = new authentification();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
       ListeAlert la = new ListeAlert();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu3MenuSelected

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
            java.util.logging.Logger.getLogger(addResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addResponsable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel res;
    private javax.swing.JTextField tfAnnonceId;
    private javax.swing.JTextField tfcin;
    private javax.swing.JTextField tfmail;
    private javax.swing.JTextField tfnom;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField tfprenom;
    private javax.swing.JTextField tfville;
    // End of variables declaration//GEN-END:variables
}
