package com.edu.gui.Client;
import com.edu.gui.Client.acceuilclient;
import com.edu.entities.Destination;
import com.edu.DAO.DestinationDAO;
import com.edu.gui.authentification;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wassim
 */
public class ProposerDestinationClient extends javax.swing.JFrame {

    /**
     * Creates new form ProposerDestinationClient
     */
     List<String> maliste;
     // Liste des offres récupérés
    
    public ProposerDestinationClient() {
        maliste = new ArrayList<>();
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
        jLabel8 = new javax.swing.JLabel();
        cmbHotel = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfBudget = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfhebergement = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAprogramme = new javax.swing.JTextArea();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proposition !");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Proposer Destination");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        cmbHotel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avion", "Bateau ", "Train", "Bus" }));
        getContentPane().add(cmbHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 105, -1));

        jLabel5.setText("Programme");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel3.setText("Moyen de transport");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txfBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBudgetActionPerformed(evt);
            }
        });
        getContentPane().add(txfBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 125, -1));

        jLabel7.setText("Budget");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel2.setText("Hebergement");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        getContentPane().add(txfhebergement, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 105, -1));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 313, 39, -1));

        txtAprogramme.setColumns(20);
        txtAprogramme.setRows(5);
        jScrollPane1.setViewportView(txtAprogramme);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jMenu2.setText("Acceuil");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu2);

        jMenu8.setText("Proposer offre");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu8);

        jMenu3.setText("Annonces");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu3);

        jMenu1.setText("Paramètres");

        jMenuItem1.setText("Profil");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Changer Mot de passe");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Déconnexion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar3.add(jMenu1);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if ((txfhebergement.getText().isEmpty())||(txtAprogramme.getText().isEmpty())||(txfBudget.getText().isEmpty())){
             JOptionPane.showMessageDialog(this, "Veuillez saisir toutes les champs");
    
        }  
       else {
        authentification a = new authentification();
        System.out.println(authentification.identifiant);
        Destination d1 = new Destination ();
        DestinationDAO dd = new DestinationDAO();
      // d1.setHebergement(txfTrajet.getText());
        d1.setHebergement(txfhebergement.getText());
        Destination.setMoyTransp((String)cmbHotel.getItemAt(cmbHotel.getSelectedIndex()));
        Destination.setProgramme(txtAprogramme.getText());
        Destination.setBudget(Float.parseFloat(txfBudget.getText()));
        d1.setE_mail(authentification.identifiant);
         //System.out.println(d1);
          //Préparer le Stock a créer
       // Destination st = new Destination();
      
        dd.insertDestination(d1);
        //Afficher un message de confirmation
        JOptionPane.showMessageDialog(this, "Ajout effectué avec succès");
      
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void txfBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBudgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBudgetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        authentification a = new authentification();
        this.setLocationRelativeTo(null);
        this.setSize(440, 540);
        // TODO add your handling code here:
         // Lors de l'ouverture de la fenetre
        // Remplissage du ComboBox avec la liste des dépots
      //  Destination d;
     //    d = new Destination();
     //       DestinationDAO   DestinationDAO = new   DestinationDAO();
        
    //    maliste=DestinationDAO.DisplayAllDepots();
    //    System.out.println(maliste);
    //    for(int i=0 ;i<maliste.size();i++){
    //        cmbHotel.addItem(maliste.toArray()[i]);           
    }//GEN-LAST:event_formWindowOpened

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        ProposerDestinationClient po = new ProposerDestinationClient();
        po.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        ConsulterAnnonces ca = new ConsulterAnnonces();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Profil p = new Profil();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        EditPassowrd ep = new EditPassowrd();
        ep.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        authentification a = new authentification();
        a.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       acceuilclient ac = new acceuilclient();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked
    
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
            java.util.logging.Logger.getLogger(ProposerDestinationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProposerDestinationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProposerDestinationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProposerDestinationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProposerDestinationClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbHotel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField txfBudget;
    private javax.swing.JTextField txfhebergement;
    private javax.swing.JTextArea txtAprogramme;
    // End of variables declaration//GEN-END:variables
}
