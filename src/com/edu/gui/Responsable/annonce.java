/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;

import com.edu.DAO.AnnonceDAO;
import com.edu.DAO.CommentaireDAO;
import com.edu.entities.Table.TableAnnonce;

import com.edu.gui.authentification;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class annonce extends javax.swing.JFrame {

    public static  int idcom;
    public static  int IdAnnonce;
    /**
     * Creates new form annonce
     */
    public annonce() {
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
        tbannonce = new javax.swing.JTable();
        btnajouterannonce = new javax.swing.JButton();
        supannonce = new javax.swing.JButton();
        msg4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listcomannonce = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mssge = new javax.swing.JLabel();
        prog = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbannonce.setModel(new TableAnnonce());
        tbannonce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbannonceMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbannonce);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 490, 161));

        btnajouterannonce.setText("Ajouter Annonce");
        btnajouterannonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterannonceActionPerformed(evt);
            }
        });
        getContentPane().add(btnajouterannonce, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        supannonce.setText("Supprimer");
        supannonce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supannonceMouseClicked(evt);
            }
        });
        supannonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supannonceActionPerformed(evt);
            }
        });
        getContentPane().add(supannonce, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        getContentPane().add(msg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 422, 292, -1));

        listcomannonce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listcomannonceMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listcomannonce);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 40, 219, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Programme");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Commentaires");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jButton1.setText("Signaler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));
        getContentPane().add(mssge, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));
        getContentPane().add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

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

    private void btnajouterannonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterannonceActionPerformed
     AjouterAnnonce ad=new AjouterAnnonce();
     ad.setVisible(true);
     this.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnajouterannonceActionPerformed

    private void supannonceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supannonceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supannonceMouseClicked

    private void supannonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supannonceActionPerformed
    TableAnnonce ta = new TableAnnonce();
        int x = tbannonce.getSelectedRow();
        if(x==-1){
            msg4.setText("Veuillez sélectioné une Annonce");
        }
        else
        {
             
            
            IdAnnonce = (int) ta.getValueAt(x, 0);
            System.out.println(IdAnnonce);
            new AnnonceDAO().deleteAnnonce(IdAnnonce);
            ta.listAnnonce = new AnnonceDAO().DisplayAllAnnonce();
            tbannonce.setModel(ta);
            msg4.setText("Suppression effectuée avec succée");
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_supannonceActionPerformed

    private void tbannonceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbannonceMousePressed
        CommentaireDAO cd = new CommentaireDAO();
        AnnonceDAO od = new AnnonceDAO();
        TableAnnonce t1= new TableAnnonce();
        int x=tbannonce.getSelectedRow();
        IdAnnonce = (int) t1.getValueAt(x, 0);
        listcomannonce.setModel(cd.AffichCommAnn(IdAnnonce)); 
        prog.setText(od.FindannonceById(IdAnnonce));

    }//GEN-LAST:event_tbannonceMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TableAnnonce ta = new TableAnnonce();
        int x = tbannonce.getSelectedRow();
        if(x==-1){
            msg4.setText("Veuillez sélectioné une Annonce");
        }
        else
        {
             
            
            IdAnnonce = (int) ta.getValueAt(x, 0);
            System.out.println(IdAnnonce);
            ModifierAnn mda = new ModifierAnn();
            mda.setVisible(true);
            this.setVisible(false);
            
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void listcomannonceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcomannonceMousePressed
          CommentaireDAO cd = new CommentaireDAO();
        authentification a = new authentification();
        annonce or = new annonce();
        int c = listcomannonce.getSelectedIndex();
        List <String> l = new ArrayList<String>();
        l=cd.DisplayIdcommAnn(or.IdAnnonce);
        String ma = l.get(c);
        idcom = Integer.parseInt(ma);
    }//GEN-LAST:event_listcomannonceMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (listcomannonce.isSelectionEmpty()) {
            mssge.setText("Veuillez sélectioner un commentaire");
        }
        else
        {
        SignalercommRes scg = new SignalercommRes();
        scg.setVisible(true);
        this.setVisible(false);
        }
      
                   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(annonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(annonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(annonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(annonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new annonce().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Destination;
    private javax.swing.JMenu Reservation;
    private javax.swing.JButton btnajouterannonce;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listcomannonce;
    private javax.swing.JLabel msg4;
    private javax.swing.JLabel mssge;
    private javax.swing.JLabel prog;
    private javax.swing.JLabel res;
    private javax.swing.JButton supannonce;
    private javax.swing.JTable tbannonce;
    // End of variables declaration//GEN-END:variables
}
