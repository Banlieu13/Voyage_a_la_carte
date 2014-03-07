/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.gui.Admin;

import com.edu.DAO.GererAlerteDAO;
import com.edu.DAO.PrivilegeListAdministrateurDAO;
import com.edu.entities.privilegeAdmin;
import com.edu.gui.authentification;

/**
 *
 * @author Commando
 */
public class ListeCommentaireAlertes extends javax.swing.JFrame {

    /**
     * Creates new form ListeCommentaireAlertes
     */
    public ListeCommentaireAlertes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCom = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        comptes = new javax.swing.JMenu();
        client = new javax.swing.JMenuItem();
        responsable = new javax.swing.JMenuItem();
        rapetstat = new javax.swing.JMenu();
        rapport = new javax.swing.JMenuItem();
        stat = new javax.swing.JMenuItem();
        alerte = new javax.swing.JMenu();
        OffreAlertes = new javax.swing.JMenuItem();
        AnnAlertes = new javax.swing.JMenuItem();
        ComAlertes = new javax.swing.JMenuItem();
        destAlerte = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableCom.setModel(new com.edu.entities.Table.TableCommentaireAlertes());
        jScrollPane1.setViewportView(tableCom);

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Commentaire Alertes :");

        comptes.setText("Comptes");

        client.setText("Client");
        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });
        comptes.add(client);

        responsable.setText("Responsable");
        responsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsableActionPerformed(evt);
            }
        });
        comptes.add(responsable);

        menu.add(comptes);

        rapetstat.setText("Rapport et statistiques");

        rapport.setText("Rapport");
        rapetstat.add(rapport);

        stat.setText("Statistique");
        rapetstat.add(stat);

        menu.add(rapetstat);

        alerte.setText("Gerer les alerts");

        OffreAlertes.setText("Offres Alertes");
        OffreAlertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffreAlertesActionPerformed(evt);
            }
        });
        alerte.add(OffreAlertes);

        AnnAlertes.setText("Annonces Alertes");
        AnnAlertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnAlertesActionPerformed(evt);
            }
        });
        alerte.add(AnnAlertes);

        ComAlertes.setText("Commentaire Alertes");
        ComAlertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComAlertesActionPerformed(evt);
            }
        });
        alerte.add(ComAlertes);

        destAlerte.setText("Destination Alertes");
        destAlerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destAlerteActionPerformed(evt);
            }
        });
        alerte.add(destAlerte);

        menu.add(alerte);

        jMenu4.setText("Notification");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        menu.add(jMenu4);

        jMenu9.setText("Paramétres");

        jMenuItem8.setText("Changer Mot de Passe");
        jMenu9.add(jMenuItem8);

        jMenuItem9.setText("Déconnexion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        menu.add(jMenu9);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267)
                        .addComponent(jButton1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        ListeClientAdmin lc = new ListeClientAdmin();
        lc.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_clientActionPerformed

    private void responsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableActionPerformed
        ListeResponsableAdmin lr = new ListeResponsableAdmin();
        lr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_responsableActionPerformed

    private void OffreAlertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffreAlertesActionPerformed
        ListeOffreAlertes loa = new ListeOffreAlertes();
        loa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OffreAlertesActionPerformed

    private void AnnAlertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnAlertesActionPerformed
        ListeAnnonceAlertes laa = new ListeAnnonceAlertes();
        laa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AnnAlertesActionPerformed

    private void ComAlertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComAlertesActionPerformed
        ListeCommentaireAlertes lca = new ListeCommentaireAlertes();
        lca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ComAlertesActionPerformed

    private void destAlerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destAlerteActionPerformed
        ListDistinationAlertes lda = new ListDistinationAlertes();
        lda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_destAlerteActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        notification n = new notification();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        authentification a = new authentification();
        a.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           int x = tableCom.getSelectedRow();
        if (x<0){
            msg.setText("Veuillez choisir une alerte");
        }else{
        
        GererAlerteDAO gad= new GererAlerteDAO();
        int i = (int) tableCom.getValueAt(0, 3);
        gad.setID(i);
        gad.setSource("commentaire");
        DetailsAlerte da = new DetailsAlerte();
        da.setVisible(true);
        this.setVisible(false);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     PrivilegeListAdministrateurDAO plad = new PrivilegeListAdministrateurDAO();
        privilegeAdmin pad = new privilegeAdmin();
        System.out.println("---->"+pad.getconnected());
        int[] p =plad.getConnectedPrivilege(pad.getconnected());
        
        if ((p[4]<1)&&(p[5]<1)){
            comptes.setEnabled(false);
            comptes.enableInputMethods(false);
            
        }
        if (p[4]<1){
            responsable.setEnabled(false);
            menu.remove(responsable);
        }else{
            responsable.setEnabled(true);
        }
        if (p[5]<1){
            client.setEnabled(false);
            menu.remove(client);
        }else{
            client.setEnabled(true);
        }
        if (p[6]<1){
            alerte.setEnabled(false);
            menu.remove(alerte);
        }else{
            alerte.setEnabled(true);
        }
        if ((p[7]<1)&&(p[8]<1)){
            rapetstat.setEnabled(false);
            rapetstat.enableInputMethods(false);
        }else{
            rapetstat.setEnabled(true);
        }
        if (p[7]<1){
            rapport.setEnabled(false);
            menu.remove(rapport);
        }else{
            rapport.setEnabled(true);
        }
        if (p[8]<1){
            stat.setEnabled(false);
            menu.remove(stat);
        }else{
            stat.setEnabled(true);
        }
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
            java.util.logging.Logger.getLogger(ListeCommentaireAlertes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeCommentaireAlertes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeCommentaireAlertes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeCommentaireAlertes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeCommentaireAlertes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AnnAlertes;
    private javax.swing.JMenuItem ComAlertes;
    private javax.swing.JMenuItem OffreAlertes;
    private javax.swing.JMenu alerte;
    private javax.swing.JMenuItem client;
    private javax.swing.JMenu comptes;
    private javax.swing.JMenuItem destAlerte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel msg;
    private javax.swing.JMenu rapetstat;
    private javax.swing.JMenuItem rapport;
    private javax.swing.JMenuItem responsable;
    private javax.swing.JMenuItem stat;
    private javax.swing.JTable tableCom;
    // End of variables declaration//GEN-END:variables
}
