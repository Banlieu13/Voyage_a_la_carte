/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Responsable;

import com.edu.DAO.AnnonceDAO;
import com.edu.DAO.CommentaireDAO;
import com.edu.entities.Table.TableAnnonce;
import com.edu.gui.Client.ConsulterAnnonces;
import com.edu.gui.Client.InfoAnnonce;
import com.edu.gui.Client.acceuilclient;

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
        msg4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listcomannonce = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        mssge = new javax.swing.JLabel();
        prog = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        btnSignaler = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsupp = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        modifier = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        arriére = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 610, 190));

        msg4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msg4.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(msg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 250, 20));

        listcomannonce.setBackground(new java.awt.Color(76, 75, 75));
        listcomannonce.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        listcomannonce.setForeground(new java.awt.Color(255, 255, 255));
        listcomannonce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listcomannonceMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listcomannonce);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 219, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Programme");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 90, 0));
        jLabel2.setText("Annonces");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        res.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 300, 130));

        mssge.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(mssge, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 250, 20));

        prog.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

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
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 30));

        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x1MouseExited(evt);
            }
        });
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

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
        getContentPane().add(btnSignaler, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 123, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 90, 0));
        jLabel3.setText("Commentaires");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

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
        getContentPane().add(btnsupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 50, 50));

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

        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifierMouseExited(evt);
            }
        });
        getContentPane().add(modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 123, 35));

        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterMouseExited(evt);
            }
        });
        getContentPane().add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 123, 35));

        arriére.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(arriére, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbannonceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbannonceMousePressed
        CommentaireDAO cd = new CommentaireDAO();
        AnnonceDAO od = new AnnonceDAO();
        TableAnnonce t1= new TableAnnonce();
        int x=tbannonce.getSelectedRow();
        IdAnnonce = (int) t1.getValueAt(x, 0);
        listcomannonce.setModel(cd.AffichCommAnn(IdAnnonce)); 
        prog.setText(od.FindannonceById(IdAnnonce));

    }//GEN-LAST:event_tbannonceMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           this.setLocationRelativeTo(null);
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
          
                   BufferedImage imgsupp = null;
        try {
            imgsupp = ImageIO.read(new File("res/supp off.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridsupp = imgsupp.getScaledInstance(btnsupp.getWidth(), btnsupp.getHeight(), 0);
          btnsupp.setIcon(new ImageIcon(ridsupp));
          
          BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(AjouterAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image resizedImage = img.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
          Home.setIcon(new ImageIcon(resizedImage));
          
              BufferedImage imgmod = null;
        try {
            imgmod = ImageIO.read(new File("res/modifier off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridmod = imgmod.getScaledInstance(modifier.getWidth(), modifier.getHeight(), 0);
          modifier.setIcon(new ImageIcon(ridmod));
          
        BufferedImage imgaj = null;
        try {
            imgaj = ImageIO.read(new File("res/ajout off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridaj = imgaj.getScaledInstance(ajouter.getWidth(), ajouter.getHeight(), 0);
          ajouter.setIcon(new ImageIcon(ridaj));
          
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

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
            BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x2.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
            BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
    }//GEN-LAST:event_xMouseExited

    private void x1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseEntered
          BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
          x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseEntered

    private void x1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseExited
          BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
          x1.setIcon(new ImageIcon(ridxr));
    }//GEN-LAST:event_x1MouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_xMouseClicked

    private void btnSignalerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseEntered
        BufferedImage imgs = null;
        try {
            imgs = ImageIO.read(new File("res/signaler on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rids = imgs.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
          btnSignaler.setIcon(new ImageIcon(rids));
    }//GEN-LAST:event_btnSignalerMouseEntered

    private void btnSignalerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseExited
         BufferedImage imgs = null;
        try {
            imgs = ImageIO.read(new File("res/signaler off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rids = imgs.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
          btnSignaler.setIcon(new ImageIcon(rids));
    }//GEN-LAST:event_btnSignalerMouseExited

    private void btnSignalerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseClicked
           if (listcomannonce.isSelectionEmpty()) {
            mssge.setText("Veuillez sélectioner un commentaire");
        }
        else
        {
        SignalercommRes scg = new SignalercommRes();
        scg.setVisible(true);
        
        }
    }//GEN-LAST:event_btnSignalerMouseClicked

    private void btnsuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuppMouseClicked
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

    private void modifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseExited
       BufferedImage imgmod = null;
        try {
            imgmod = ImageIO.read(new File("res/modifier off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridmod = imgmod.getScaledInstance(modifier.getWidth(), modifier.getHeight(), 0);
          modifier.setIcon(new ImageIcon(ridmod));
    }//GEN-LAST:event_modifierMouseExited

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked
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
            
            
            
        }
    }//GEN-LAST:event_modifierMouseClicked

    private void modifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseEntered
           BufferedImage imgmod = null;
        try {
            imgmod = ImageIO.read(new File("res/modifier on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridmod = imgmod.getScaledInstance(modifier.getWidth(), modifier.getHeight(), 0);
          modifier.setIcon(new ImageIcon(ridmod));
    }//GEN-LAST:event_modifierMouseEntered

    private void ajouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseExited
        BufferedImage imgaj = null;
        try {
            imgaj = ImageIO.read(new File("res/ajout off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridaj = imgaj.getScaledInstance(ajouter.getWidth(), ajouter.getHeight(), 0);
          ajouter.setIcon(new ImageIcon(ridaj));
    }//GEN-LAST:event_ajouterMouseExited

    private void ajouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseEntered
        BufferedImage imgaj = null;
        try {
            imgaj = ImageIO.read(new File("res/ajout on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ConsulterAnnonces.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridaj = imgaj.getScaledInstance(ajouter.getWidth(), ajouter.getHeight(), 0);
          ajouter.setIcon(new ImageIcon(ridaj));
    }//GEN-LAST:event_ajouterMouseEntered

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
            AjouterAnnonce ad=new AjouterAnnonce();
            ad.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ajouterMouseClicked

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
    private javax.swing.JLabel Home;
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel arriére;
    private javax.swing.JLabel btnSignaler;
    private javax.swing.JLabel btnsupp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listcomannonce;
    private javax.swing.JLabel modifier;
    private javax.swing.JLabel msg4;
    private javax.swing.JLabel mssge;
    private javax.swing.JLabel prog;
    private javax.swing.JLabel res;
    private javax.swing.JTable tbannonce;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
