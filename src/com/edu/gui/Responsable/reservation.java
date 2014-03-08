/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;

import com.edu.DAO.ReservationDAO;
import com.edu.entities.Table.TableReservation;

/**
 *
 * @author LENOVO
 */
public class reservation extends javax.swing.JFrame {

    /**
     * Creates new form reservation
     */
    public reservation() {
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

        Deconnexion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbresrvation = new javax.swing.JTable();
        supreservation = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        Reservation = new javax.swing.JMenu();
        Destination = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deconnexion.setText("Deconnexion");
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 11, -1, -1));

        tbresrvation.setModel(new com.edu.entities.Table.TableReservation());
        jScrollPane2.setViewportView(tbresrvation);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 570, 370));

        supreservation.setText("supprimer");
        supreservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supreservationMouseClicked(evt);
            }
        });
        supreservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supreservationActionPerformed(evt);
            }
        });
        getContentPane().add(supreservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));
        getContentPane().add(msg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 434, 310, 40));

        jMenu9.setText("Acceuil");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu9);

        Reservation.setText("Reservation");
        Reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationMouseClicked(evt);
            }
        });
        jMenuBar4.add(Reservation);

        Destination.setText("Destination");
        Destination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DestinationMouseClicked(evt);
            }
        });
        jMenuBar4.add(Destination);

        jMenu1.setText("Factures");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Liste des Factures");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar4.add(jMenu1);

        jMenu3.setText("Ajouter Offre");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu3);

        jMenu4.setText("Annonce");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu4);

        jMenu2.setText("Ajouter annonce");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu2);

        jMenu5.setText("Offre");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu5);

        setJMenuBar(jMenuBar4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_DeconnexionActionPerformed
 
    private void supreservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supreservationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supreservationMouseClicked

    private void supreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supreservationActionPerformed
        TableReservation tr = new TableReservation();
        int x = tbresrvation.getSelectedRow();
        if(x==-1){
            msg2.setText("Veuillez sélectioné une Reservation");
        }
        else
        {
            int IdRes = (int) tr.getValueAt(x, 0);
            System.out.println(IdRes);
            new ReservationDAO().deleteres(IdRes);
            tr.listeRes = new ReservationDAO().DisplayAllReservation();
            tbresrvation.setModel(tr);
            msg2.setText("Suppression effectuée avec succée");
        }
        
        // TODO add your handling code here:
        
        // TODO add your handling code here:
    }//GEN-LAST:event_supreservationActionPerformed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        Acceuil_Responsable ar = new Acceuil_Responsable();
        ar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu9MouseClicked

    private void ReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationMouseClicked
        reservation re = new reservation();
        re.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationMouseClicked

    private void DestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DestinationMouseClicked
        tbdestination_1 de = new tbdestination_1();
        de.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //List_des_Factures cd=new List_des_Factures();
        // cd.setVisible(true);
        ListeFacture_Responsable cd = new ListeFacture_Responsable();
        cd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

        //  List_des_Factures cd=new List_des_Factures();
        // this.dispose();

        //cd.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        AjouterOffre ao = new AjouterOffre();
        ao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        annonce a = new annonce();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        AjouterAnnonce aa = new AjouterAnnonce();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        OffreResponsable or = new OffreResponsable();
        or.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deconnexion;
    private javax.swing.JMenu Destination;
    private javax.swing.JMenu Reservation;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msg2;
    private javax.swing.JButton supreservation;
    private javax.swing.JTable tbresrvation;
    // End of variables declaration//GEN-END:variables
}
