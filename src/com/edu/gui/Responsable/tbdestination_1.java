/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;
import com.edu.DAO.CommentaireDAO;
import com.edu.DAO.DestinationDAO;
import com.edu.DAO.ReservationDAO;
import com.edu.entities.Commentaire;
import com.edu.entities.Destination;
import com.edu.entities.Table.TableDestination;
import com.edu.entities.Table.TableReservation;
import com.edu.gui.Client.ConsulterAnnonces;
import com.edu.gui.Client.InfoAnnonce;
import com.edu.gui.Client.MesDestinations;
import com.edu.gui.Client.acceuilclient;
import static com.edu.gui.Responsable.OffreResponsable.idcom;
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
 * @author LENOVO
 */
public class tbdestination_1 extends javax.swing.JFrame {
public static int Id_dest;
public static int idcom;

    /**
     * Creates new form tbdestinantion
     */
    public tbdestination_1() {
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
        tbdestination = new javax.swing.JTable();
        msg1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        destlist = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mssg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSignaler = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        btnsupp = new javax.swing.JLabel();
        arriére = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbdestination.setBackground(new java.awt.Color(76, 75, 75));
        tbdestination.setModel(new com.edu.entities.Table.TableDestination());
        tbdestination.setSelectionBackground(new java.awt.Color(255, 90, 0));
        tbdestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdestinationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbdestinationMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbdestination);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 630, 300));

        msg1.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 330, 30));

        destlist.setBackground(new java.awt.Color(76, 75, 75));
        destlist.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        destlist.setForeground(new java.awt.Color(255, 255, 255));
        destlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                destlistMousePressed(evt);
            }
        });
        destlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                destlistValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(destlist);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 230, 380));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Programme");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 90, -1));

        res.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 420, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 90, 0));
        jLabel2.setText("Destinations");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        mssg.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(mssg, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 250, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 90, 0));
        jLabel3.setText("Commentaires");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

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
        getContentPane().add(btnSignaler, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 123, 35));

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
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 30, 30));

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
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

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
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 50));

        btnsupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsuppMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsuppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsuppMouseExited(evt);
            }
        });
        getContentPane().add(btnsupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 50, 50));

        arriére.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(arriére, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdestinationMouseClicked

        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdestinationMouseClicked

    private void tbdestinationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdestinationMousePressed

        DestinationDAO od = new DestinationDAO();
        
        CommentaireDAO cde = new CommentaireDAO();
        //Destination ac = new Destination();
        TableDestination td = new TableDestination();
        int x=tbdestination.getSelectedRow();
        Id_dest = (int)td.getValueAt(x, 0);
        System.out.println(Id_dest);
        destlist.setModel(cde.AffichCommDest(Id_dest));
        res.setText(od.findDestinationById(Id_dest));
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdestinationMousePressed

    private void destlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_destlistValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_destlistValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        authentification a = new authentification();
        this.setLocationRelativeTo(null);
        this.setSize(950, 600);
        this.setResizable(false);
        
        BufferedImage imgHome = null;
        try {
            imgHome = ImageIO.read(new File("res/arriere.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ri = imgHome.getScaledInstance(arriére.getWidth(), arriére.getHeight(), 0);
          arriére.setIcon(new ImageIcon(ri));
          
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
          
             BufferedImage imgs = null;
        try {
            imgs = ImageIO.read(new File("res/signaler off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rids = imgs.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
          btnSignaler.setIcon(new ImageIcon(rids));
          
          BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(AjouterAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image resizedImage = img.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
          Home.setIcon(new ImageIcon(resizedImage));
          
           BufferedImage imgsupp = null;
        try {
            imgsupp = ImageIO.read(new File("res/supp off.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridsupp = imgsupp.getScaledInstance(btnsupp.getWidth(), btnsupp.getHeight(), 0);
          btnsupp.setIcon(new ImageIcon(ridsupp));
   
    }//GEN-LAST:event_formWindowOpened

    private void destlistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destlistMousePressed
        CommentaireDAO cd = new CommentaireDAO();
        authentification a = new authentification();
        tbdestination_1 or = new tbdestination_1();
        int c = destlist.getSelectedIndex();
        List <String> l = new ArrayList<String>();
        l=cd.DisplayIdcommDest(or.Id_dest);
        String ma = l.get(c);
        idcom = Integer.parseInt(ma);
    }//GEN-LAST:event_destlistMousePressed

    private void btnSignalerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseClicked
         if (destlist.isSelectionEmpty()) {
            mssg.setText("Veuillez sélectioner un commentaire");
        }
        else
        {
        SignalercommRes scg = new SignalercommRes();
        scg.setVisible(true);
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

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked
            
    }//GEN-LAST:event_x1MouseClicked

    private void x1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseEntered
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseEntered

    private void x1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseExited
        BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
        x1.setIcon(new ImageIcon(ridxr));
    
    }//GEN-LAST:event_x1MouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.setVisible(false);
    
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x2.png"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
        x.setIcon(new ImageIcon(ridx));
    
    }//GEN-LAST:event_xMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Acceuil_Responsable ac = new Acceuil_Responsable();
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

    private void btnsuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuppMouseClicked
          TableDestination td = new TableDestination();
        int x = tbdestination.getSelectedRow();
        if(x==-1){
            msg1.setText("Veuillez sélectioné une Destination");
        }
        else
        {
            msg1.setText(null); 
            int IdDes;
    IdDes = (int) td.getValueAt(x, 0);
            System.out.println(IdDes);
            new DestinationDAO().deleteDestination(IdDes);
            td.listDestination = new DestinationDAO().DisplayAllDestination();
            tbdestination.setModel(td);
            msg1.setText("Suppression effectuée avec succée");
        }
    }//GEN-LAST:event_btnsuppMouseClicked

    private void btnsuppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuppMouseEntered
        BufferedImage imgsupp = null;
        try {
            imgsupp = ImageIO.read(new File("res/supp on.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridsupp = imgsupp.getScaledInstance(btnsupp.getWidth(), btnsupp.getHeight(), 0);
        btnsupp.setIcon(new ImageIcon(ridsupp));
    }//GEN-LAST:event_btnsuppMouseEntered

    private void btnsuppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuppMouseExited
        BufferedImage imgsupp = null;
        try {
            imgsupp = ImageIO.read(new File("res/supp off.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridsupp = imgsupp.getScaledInstance(btnsupp.getWidth(), btnsupp.getHeight(), 0);
        btnsupp.setIcon(new ImageIcon(ridsupp));
    }//GEN-LAST:event_btnsuppMouseExited

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
            java.util.logging.Logger.getLogger(tbdestination_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tbdestination_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tbdestination_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tbdestination_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tbdestination_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel arriére;
    private javax.swing.JLabel btnSignaler;
    private javax.swing.JLabel btnsupp;
    private javax.swing.JList destlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel mssg;
    private javax.swing.JLabel res;
    private javax.swing.JTable tbdestination;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}