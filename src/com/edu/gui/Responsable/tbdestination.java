/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;
import com.edu.DAO.DestinationDAO;
import com.edu.DAO.ReservationDAO;
import com.edu.entities.Table.TableDestination;
import com.edu.entities.Table.TableReservation;
/**
 *
 * @author LENOVO
 */
public class tbdestination extends javax.swing.JFrame {

    /**
     * Creates new form tbdestinantion
     */
    public tbdestination() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdestination = new javax.swing.JTable();
        supdestination = new javax.swing.JButton();
        msg1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Reservation = new javax.swing.JMenu();
        Notification = new javax.swing.JMenu();
        Destination = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deconnexion.setText("Deconnexion");
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 11, -1, -1));

        tbdestination.setModel(new com.edu.entities.Table.TableDestination());
        jScrollPane1.setViewportView(tbdestination);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 540, 320));

        supdestination.setText("Supprimer");
        supdestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supdestinationMouseClicked(evt);
            }
        });
        supdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supdestinationActionPerformed(evt);
            }
        });
        getContentPane().add(supdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));
        getContentPane().add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 210, 30));

        Reservation.setText("Reservation");
        Reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationMouseClicked(evt);
            }
        });
        jMenuBar1.add(Reservation);

        Notification.setText("Notification");
        jMenuBar1.add(Notification);

        Destination.setText("Destination");
        Destination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DestinationMouseClicked(evt);
            }
        });
        jMenuBar1.add(Destination);

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

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationMouseClicked
        reservation re = new reservation();
        re.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationMouseClicked

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

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_DeconnexionActionPerformed

    private void DestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DestinationMouseClicked

        tbdestination de = new tbdestination();
        de.setVisible(true);
        this.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationMouseClicked

    private void supdestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supdestinationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supdestinationMouseClicked

    private void supdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supdestinationActionPerformed
TableDestination td = new TableDestination();
        int x = tbdestination.getSelectedRow();
        if(x==-1){
            msg1.setText("Veuillez sélectioné une Destination");
        }
        else
        {
             
            int IdDes;
    IdDes = (int) td.getValueAt(x, 0);
            System.out.println(IdDes);
            new DestinationDAO().deleteDestination(IdDes);
            td.listDestination = new DestinationDAO().DisplayAllDestination();
            tbdestination.setModel(td);
            msg1.setText("Suppression effectuée avec succée");
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_supdestinationActionPerformed

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
            java.util.logging.Logger.getLogger(tbdestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tbdestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tbdestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tbdestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tbdestination().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deconnexion;
    private javax.swing.JMenu Destination;
    private javax.swing.JMenu Notification;
    private javax.swing.JMenu Reservation;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msg1;
    private javax.swing.JButton supdestination;
    private javax.swing.JTable tbdestination;
    // End of variables declaration//GEN-END:variables
}
