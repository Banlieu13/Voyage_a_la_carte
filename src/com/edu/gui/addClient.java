/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui;

import com.edu.DAO.ClientDAO;
import com.edu.entities.Client;

/**
 *
 * @author MrBenrhouma
 */
public class addClient extends javax.swing.JFrame {

    /**
     * Creates new form addClient
     */
    public addClient() {
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
        tfnom = new javax.swing.JTextField();
        tfcin = new javax.swing.JTextField();
        tfprenom = new javax.swing.JTextField();
        tfville = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        res = new javax.swing.JLabel();
        tfpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
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
        setTitle("Ajout Client");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Déconnexion");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 0, -1, -1));
        getContentPane().add(tfmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 170, -1));
        getContentPane().add(tfnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, -1));
        getContentPane().add(tfcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, -1));
        getContentPane().add(tfprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 170, -1));
        getContentPane().add(tfville, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, -1));

        btnadd.setText("Valider");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        res.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        res.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));
        getContentPane().add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Cours\\3A20\\Semestre 2\\PI\\Arriére\\AddClient_Maq.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        jMenu1.setText("Comptes");

        jMenuItem1.setText("Client");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Responsable");
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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        Client c = new Client();
        ClientDAO cdao = new ClientDAO();
        c.setEmail(tfmail.getText());
        c.setCin(tfcin.getText());
        c.setNom(tfnom.getText());
        c.setPrenom(tfprenom.getText());
        c.setVille(tfville.getText());
        c.setPassword(tfpassword.getText());
        cdao.insertclient(c);
        res.setText("Ajout avec succée");
    }//GEN-LAST:event_btnaddActionPerformed

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
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField tfcin;
    private javax.swing.JTextField tfmail;
    private javax.swing.JTextField tfnom;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField tfprenom;
    private javax.swing.JTextField tfville;
    // End of variables declaration//GEN-END:variables
}
