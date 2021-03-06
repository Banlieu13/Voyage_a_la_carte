/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Client;

import com.edu.DAO.AnnonceDAO;
import com.edu.DAO.ReservationDAO;
import com.edu.DAO.offreDAO;
import com.edu.entities.ControleDeSaisie;
import com.edu.entities.Reservation;
import com.edu.entities.Table.TableAffichageAnnonceClient;
import com.edu.gui.authentification;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MrBenrhouma
 */
public class ReservationAnnonce extends javax.swing.JFrame {
    public static int nbrvoya;
    
    /**
     * Creates new form ReservationAnnonce
     */
    public ReservationAnnonce() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfnumCarte = new javax.swing.JTextField();
        txfCryptogramme = new javax.swing.JTextField();
        cmbCarte = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nbrvoyageur = new javax.swing.JComboBox();
        jCalendar1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        xx = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 90, 0));
        jLabel2.setText("Type de carte");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 90, 0));
        jLabel3.setText("Numéro de carte");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 90, 0));
        jLabel4.setText("Date de fin de validité");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 90, 0));
        jLabel5.setText("Cryptogramme visuel");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        getContentPane().add(txfnumCarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 104, -1));
        getContentPane().add(txfCryptogramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 104, -1));

        cmbCarte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "visa", "MasterCard", "Pay Pal " }));
        getContentPane().add(cmbCarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 104, -1));

        jButton1.setLabel("Payer et generer facture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 90, 0));
        jLabel6.setText("Nombre de(s) voyageur(s)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, -1));

        getContentPane().add(nbrvoyageur, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Reservation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

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
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        xx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xxMouseExited(evt);
            }
        });
        getContentPane().add(xx, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 50));

        label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 750, 500));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ControleDeSaisie cds = new ControleDeSaisie();
        if (txfnumCarte.getText().isEmpty() || txfCryptogramme.getText().isEmpty()){
            label.setText("Veuillez Remplir tous les champs");
        }else if (!cds.ControleNumDeCarte(txfnumCarte.getText())){
            label.setText("Le numero de la carte doit contenir 14 chiffres");
        }else if (!cds.ControleCrypto(txfCryptogramme.getText())){
            label.setText("le Crypto doit avoir 3 chiffres");
        }else{
            
        
        authentification a = new authentification();
        Reservation d1 = new  Reservation ();
        AnnonceDAO ad = new AnnonceDAO();
        ConsulterAnnonces can = new ConsulterAnnonces();
        TableAffichageAnnonceClient ta = new TableAffichageAnnonceClient();
        
        nbrvoya = (int) nbrvoyageur.getSelectedItem();
        offreDAO od = new offreDAO();
        //TableOffre to = new TableOffre();

        ReservationDAO rd = new ReservationDAO();
        System.err.println(authentification.identifiant);

        d1.setNumCarte(Integer.parseInt(txfnumCarte.getText()));
        d1.setTypeDeCarte((String) cmbCarte.getSelectedItem());
        d1.setDateValidité(jCalendar1.getDate());
        d1.setCryptogrammevisuel(txfCryptogramme.getText());
        d1.setE_mail(authentification.identifiant);
        d1.setId_annonce(can.idannonce);
        d1.setNbrvoyageur((int) nbrvoyageur.getSelectedItem());

        System.err.println(authentification.identifiant);
        rd.insertReservationAn(d1);
        ad.updatenbrPlace(nbrvoya, can.idannonce);
        
       ta.listStock = new AnnonceDAO().DisplayAllAnnonce();
        
       JOptionPane.showMessageDialog(this, "Paiement effectué avec succée");
        FactureAnnonce fp = new FactureAnnonce();
        fp.setVisible(true);
        this.setVisible(false);

        System.out.println(d1);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        this.setSize(550, 500);
        this.setResizable(false); 
        ConsulterAnnonces ac = new ConsulterAnnonces();
        List<Integer> l = new ArrayList<Integer>();
            
               for (int i = 1; i <=ac.nbr ; i++) {
                  nbrvoyageur.addItem(i);
               }
               
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
          Image ridxr = imgxr.getScaledInstance(xx.getWidth(), xx.getHeight(), 0);
          xx.setIcon(new ImageIcon(ridxr));
          
              BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Destinations.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image resizedImage = img.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
          Home.setIcon(new ImageIcon(resizedImage));
    }//GEN-LAST:event_formWindowOpened

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
            BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x2.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
          
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
           BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
          
    }//GEN-LAST:event_xMouseExited

    private void xxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xxMouseEntered
         BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(xx.getWidth(), xx.getHeight(), 0);
          xx.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_xxMouseEntered

    private void xxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xxMouseExited
         BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(EditPassowrd.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(xx.getWidth(), xx.getHeight(), 0);
          xx.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_xxMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        acceuilclient ac = new acceuilclient();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("res/accueil-on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image resizedImage = img2.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
        Home.setIcon(new ImageIcon(resizedImage));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image resizedImage = img2.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
        Home.setIcon(new ImageIcon(resizedImage));
    }//GEN-LAST:event_HomeMouseExited

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
            java.util.logging.Logger.getLogger(ReservationAnnonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationAnnonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationAnnonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationAnnonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationAnnonce().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JComboBox cmbCarte;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label;
    private javax.swing.JComboBox nbrvoyageur;
    private javax.swing.JTextField txfCryptogramme;
    private javax.swing.JTextField txfnumCarte;
    private javax.swing.JLabel x;
    private javax.swing.JLabel xx;
    // End of variables declaration//GEN-END:variables
}
