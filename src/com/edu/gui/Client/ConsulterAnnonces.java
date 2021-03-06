/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Client;

import com.edu.DAO.AnnonceDAO;
import com.edu.entities.Table.TableAffichageAnnonceClient;
import com.edu.entities.Table.TableOffre;
import static com.edu.gui.Client.acceuilclient.circuit;
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

/**
 *
 * @author MrBenrhouma
 */
public class ConsulterAnnonces extends javax.swing.JFrame {
    public static int idannonce;
    public static String mailresp;
    public static int nbr;
    public static String circuit;
    /**
     * Creates new form ConsulterAnnonces
     */
    public ConsulterAnnonces() {
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
        jTable1 = new javax.swing.JTable();
        msg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        btnSignaler = new javax.swing.JLabel();
        btnprog = new javax.swing.JLabel();
        Reserver = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Accueil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Annonces");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(76, 75, 75));
        jTable1.setModel(new com.edu.entities.Table.TableAffichageAnnonceClient());
        jTable1.setGridColor(new java.awt.Color(255, 90, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 90, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 218));

        msg.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 250, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Annonces");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        pic4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 90, 0), 2));
        getContentPane().add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 100, 100));

        pic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 90, 0), 2));
        getContentPane().add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 100));

        pic2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 90, 0), 2));
        getContentPane().add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 100, 100));

        pic3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 90, 0), 2));
        getContentPane().add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 100, 100));

        btnSignaler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignalerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignalerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignalerMouseExited(evt);
            }
        });
        getContentPane().add(btnSignaler, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 123, 35));

        btnprog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnprogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnprogMouseExited(evt);
            }
        });
        getContentPane().add(btnprog, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 123, 35));

        Reserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReserverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReserverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReserverMouseExited(evt);
            }
        });
        getContentPane().add(Reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 123, 35));

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
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x1MouseExited(evt);
            }
        });
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 30, 30));

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
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 50));

        Accueil.setIcon(new javax.swing.ImageIcon("D:\\Cours\\3A20\\Semestre 2\\PI\\Images\\arriere.jpg")); // NOI18N
        getContentPane().add(Accueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        authentification a = new authentification();
        this.setLocationRelativeTo(null);
        this.setSize(900, 490);
        this.setResizable(false);
        
         BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/programme off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridbtnp = imgbtnp.getScaledInstance(btnprog.getWidth(), btnprog.getHeight(), 0);
          btnprog.setIcon(new ImageIcon(ridbtnp));
          
           BufferedImage imgr = null;
        try {
            imgr = ImageIO.read(new File("res/reserver off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridr = imgr.getScaledInstance(Reserver.getWidth(), Reserver.getHeight(), 0);
          Reserver.setIcon(new ImageIcon(ridr));
          
          BufferedImage imgs = null;
        try {
            imgs = ImageIO.read(new File("res/signaler off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rids = imgs.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
          btnSignaler.setIcon(new ImageIcon(rids));
          
          BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
          
          BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
          x1.setIcon(new ImageIcon(ridxr));
          
           BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image resizedImage = img.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
          Home.setIcon(new ImageIcon(resizedImage));
          
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
         TableAffichageAnnonceClient to = new TableAffichageAnnonceClient();
       
           int x = jTable1.getSelectedRow();
           if(x==-1){
              msg.setText("Veuillez sélectioner une annonce");
           }
           else
           {   
        idannonce = (int) to.getValueAt(x, 0);
        AnnonceDAO ado = new AnnonceDAO();
        
        List<ImageIcon> l = new ArrayList<ImageIcon>();
        l = ado.chercherPicAnnonce(idannonce);
        //ImageIcon ima1 = new ImageIcon();
        System.err.println("Debut liste");
        System.out.println(l.size());
        pic1.setIcon(l.get(0));
        pic2.setIcon(l.get(1));
        pic3.setIcon(l.get(2));
        pic4.setIcon(l.get(3));
        //an.setPhoto1();
           }
    
            
    }//GEN-LAST:event_jTable1MousePressed

    private void btnSignalerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseClicked
          TableAffichageAnnonceClient to = new TableAffichageAnnonceClient();

        int x = jTable1.getSelectedRow();
        if(x==-1){
            msg.setText("Veuillez sélectioner une annonce");
        }
        else
        {

            idannonce = (int) to.getValueAt(x, 0);

            SignalerAnn s = new SignalerAnn();
            s.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSignalerMouseClicked

    private void btnSignalerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseEntered
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/signaler on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
        btnSignaler.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_btnSignalerMouseEntered

    private void btnSignalerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseExited
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/signaler off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
        btnSignaler.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_btnSignalerMouseExited

    private void btnprogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprogMouseClicked
        TableAffichageAnnonceClient to = new TableAffichageAnnonceClient();
            
           int x = jTable1.getSelectedRow();
           
           if(x==-1){
              msg.setText("Veuillez sélectioner une annonce");
           }
           else
           {
           
           idannonce = (int) to.getValueAt(x, 0);
           circuit = (String) to.getValueAt(x, 3);
           InfoAnnonce ino = new InfoAnnonce(); 
           System.out.println(idannonce);
           System.out.println(circuit);
            ino.setVisible(true);
            this.setVisible(false);
             }

    }//GEN-LAST:event_btnprogMouseClicked

    private void btnprogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprogMouseEntered
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/programme on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(btnprog.getWidth(), btnprog.getHeight(), 0);
        btnprog.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_btnprogMouseEntered

    private void btnprogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprogMouseExited
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/programme off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(btnprog.getWidth(), btnprog.getHeight(), 0);
        btnprog.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_btnprogMouseExited

    private void ReserverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReserverMouseClicked
         TableAffichageAnnonceClient af = new TableAffichageAnnonceClient();
        int x = jTable1.getSelectedRow();
           if(x==-1){
              msg.setText("Veuillez sélectioner une annonce");
           }
           else
           {
            msg.setText("");
            nbr = (int) af.getValueAt(x, 4);
            idannonce = (int) af.getValueAt(x, 0);
            mailresp =  (String) af.getValueAt(x, 7);
            ReservationAnnonce pc = new  ReservationAnnonce();
            pc.setVisible(true);
            this.setVisible(false);
           }
    }//GEN-LAST:event_ReserverMouseClicked

    private void ReserverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReserverMouseEntered
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/reserver on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(Reserver.getWidth(), Reserver.getHeight(), 0);
        Reserver.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_ReserverMouseEntered

    private void ReserverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReserverMouseExited
        BufferedImage imgbtnp = null;
        try {
            imgbtnp = ImageIO.read(new File("res/reserver off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridbtnp = imgbtnp.getScaledInstance(Reserver.getWidth(), Reserver.getHeight(), 0);
        Reserver.setIcon(new ImageIcon(ridbtnp));
    }//GEN-LAST:event_ReserverMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x2.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseExited

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked

    }//GEN-LAST:event_x1MouseClicked

    private void x1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseEntered
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseEntered

    private void x1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseExited
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(acceuilclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseExited

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
            java.util.logging.Logger.getLogger(ConsulterAnnonces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterAnnonces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterAnnonces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterAnnonces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterAnnonces().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accueil;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Reserver;
    private javax.swing.JLabel btnSignaler;
    private javax.swing.JLabel btnprog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
