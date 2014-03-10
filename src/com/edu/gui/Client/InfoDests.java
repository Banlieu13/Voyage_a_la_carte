/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Client;

import MapCircuit.launch;
import com.edu.DAO.CommentaireDAO;
import com.edu.DAO.DestinationDAO;
import com.edu.entities.Commentaire;
import static com.edu.gui.Client.InfoOffre.idcom;
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
import like.like;
import rating.rating;

/**
 *
 * @author MrBenrhouma
 */
public class InfoDests extends javax.swing.JFrame {
    public static int idcom;
    
    public static boolean etat=true;

    /**
     * Creates new form InfoDests
     */
    public InfoDests() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listcomm = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtsujet = new javax.swing.JTextArea();
        res = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        msage = new javax.swing.JLabel();
        nbrj = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        btnSignaler = new javax.swing.JLabel();
        btnvalider = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        mapp = new javax.swing.JLabel();
        Likee = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Accueil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programme Destination");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 90, 0));
        jLabel2.setText("Programme");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        listcomm.setBackground(new java.awt.Color(76, 75, 75));
        listcomm.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        listcomm.setForeground(new java.awt.Color(255, 255, 255));
        listcomm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listcommMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listcomm);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 300, 360));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 90, 0));
        jLabel3.setText("Commentaire");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jtsujet.setColumns(20);
        jtsujet.setRows(5);
        jScrollPane1.setViewportView(jtsujet);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 240, 80));

        res.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 90, 0));
        jLabel1.setText("Commenter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        msage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msage.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(msage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 250, 30));

        nbrj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nbrj.setForeground(new java.awt.Color(255, 90, 0));
        getContentPane().add(nbrj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 40, 20));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eMouseExited(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 20));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dMouseExited(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cMouseExited(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMouseExited(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aMouseExited(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

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
        getContentPane().add(btnSignaler, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 123, 35));

        btnvalider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvaliderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnvaliderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnvaliderMouseExited(evt);
            }
        });
        getContentPane().add(btnvalider, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 123, 35));

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
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

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
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 30));

        mapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mappMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mappMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mappMouseExited(evt);
            }
        });
        getContentPane().add(mapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 50, 50));

        Likee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LikeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LikeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LikeeMouseExited(evt);
            }
        });
        getContentPane().add(Likee, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 40, 40));

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
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        Accueil.setIcon(new javax.swing.ImageIcon("D:\\Cours\\3A20\\Semestre 2\\PI\\Images\\arriere.jpg")); // NOI18N
        getContentPane().add(Accueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        InfoDests.etat=true;
        authentification a = new authentification();
        Destinations d = new Destinations();
        CommentaireDAO cd = new CommentaireDAO();
        this.setLocationRelativeTo(null);
        this.setSize(800, 500);
        this.setResizable(false);
        
        DestinationDAO od = new DestinationDAO();
        res.setText(od.findDestinationById(d.idDests));
        listcomm.setModel(cd.AffichCommDest(d.idDests));
        
          BufferedImage imgs = null;
        try {
            imgs = ImageIO.read(new File("res/signaler off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rids = imgs.getScaledInstance(btnSignaler.getWidth(), btnSignaler.getHeight(), 0);
          btnSignaler.setIcon(new ImageIcon(rids));
          
          BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridv = imgv.getScaledInstance(btnvalider.getWidth(), btnvalider.getHeight(), 0);
          btnvalider.setIcon(new ImageIcon(ridv));
          
           BufferedImage imgx = null;
        try {
            imgx = ImageIO.read(new File("res/x1.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridx = imgx.getScaledInstance(x.getWidth(), x.getHeight(), 0);
          x.setIcon(new ImageIcon(ridx));
          
          BufferedImage imgxr = null;
        try {
            imgxr = ImageIO.read(new File("res/-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridxr = imgxr.getScaledInstance(x1.getWidth(), x1.getHeight(), 0);
          x1.setIcon(new ImageIcon(ridxr));
          
                BufferedImage imgmap = null;
        try {
            imgmap = ImageIO.read(new File("res/map offf.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image ridmap = imgmap.getScaledInstance(mapp.getWidth(), mapp.getHeight(), 0);
          mapp.setIcon(new ImageIcon(ridmap));
          
            BufferedImage imglike = null;
        try {
            imglike = ImageIO.read(new File("res/like off.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image rilike = imglike.getScaledInstance(Likee.getWidth(), Likee.getHeight(), 0);
          Likee.setIcon(new ImageIcon(rilike));
          
              BufferedImage img = null;
        try {
            img = ImageIO.read(new File("res/accueil-off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Destinations.class.getName()).log(Level.SEVERE, null, ex);
        }
          Image resizedImage = img.getScaledInstance(Home.getWidth(), Home.getHeight(), 0);
          Home.setIcon(new ImageIcon(resizedImage));
           rating r = new rating();
         
          like l =new like();
          long nb = l.getlike(Destinations.idDests, "destination");
          nbrj.setText(""+nb);
          boolean etattt = l.isliked(authentification.identifiant,Destinations.idDests,"destination");
          if (etattt==true){
              Likee.setEnabled(false);
          }
          
          float value = r.calculeRating(Destinations.idDests,"destination");
          System.out.println("la valeur de value est "+value);
          if (r.isRated(ConsulterAnnonces.idannonce,authentification.identifiant,"annonce")){
              if (value==1){
                  aMouseEntered(null);
                  System.out.println("el a");
              } else
              if (value==2){
                  bMouseEntered(null);
                  System.out.println("el b");
              } else
              if (value==3){
                  cMouseEntered(null);
                  System.out.println("el c");
              } else
              if (value==4){
                  dMouseEntered(null);
                  System.out.println("el d");
              } else
              if (value==5){
                  eMouseEntered(null);
                  System.out.println("el e");
              }
              InfoDests.etat=false;
          }else{
              InfoDests.etat=true;
              
          }
     
    }//GEN-LAST:event_formWindowOpened

    private void listcommMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcommMousePressed
        CommentaireDAO cd = new CommentaireDAO();
        authentification a = new authentification();
        Destinations can = new Destinations();
        int c = listcomm.getSelectedIndex();
        List <String> l = new ArrayList<String>();
        l=cd.DisplayIdcommDest(can.idDests);
        String ma = l.get(c);
        idcom = Integer.parseInt(ma);
        if(cd.AffichCommmail(idcom).equals(a.identifiant)){
            btnSignaler.setVisible(false);
            
                
            }
        else
        {
            btnSignaler.setVisible(true);
        }  
    }//GEN-LAST:event_listcommMousePressed

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
        if (InfoDests.etat==true){
        int tot=1;
        System.out.println("of");
        rating r = new rating();
        r.addRating(Destinations.idDests,tot,"destination",authentification.identifiant);
            
        }
    }//GEN-LAST:event_aMouseClicked

    private void aMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseEntered
        if (InfoDests.etat==true){
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIconOne);
            b.setIcon(imageIcontwo);
            c.setIcon(imageIcontwo);
            d.setIcon(imageIcontwo);
            e.setIcon(imageIcontwo);
        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_aMouseEntered

    private void aMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseExited
        if (InfoDests.etat==true){
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIcontwo);

        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_aMouseExited

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        if (InfoDests.etat==true){  
        int tot=2;
        System.out.println("of");
        rating r = new rating();
        r.addRating(Destinations.idDests,tot,"destination",authentification.identifiant);
        }
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        if (InfoDests.etat==true){  
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIconOne);
            b.setIcon(imageIconOne);
            c.setIcon(imageIcontwo);
            d.setIcon(imageIcontwo);
            e.setIcon(imageIcontwo);
        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited

    }//GEN-LAST:event_bMouseExited

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        if (InfoDests.etat==true){
        int tot=3;
        System.out.println("of");
        rating r = new rating();
        r.addRating(Destinations.idDests,tot,"destination",authentification.identifiant);
        }
    }//GEN-LAST:event_cMouseClicked

    private void cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseEntered
      if (InfoDests.etat==true){
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIconOne);
            b.setIcon(imageIconOne);
            c.setIcon(imageIconOne);
            d.setIcon(imageIcontwo);
            e.setIcon(imageIcontwo);
        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_cMouseEntered

    private void cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseExited

    }//GEN-LAST:event_cMouseExited

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        if (InfoDests.etat==true){
        int tot=4;
        System.out.println("of");
        rating r = new rating();
       r.addRating(Destinations.idDests,tot,"destination",authentification.identifiant);
        }
    }//GEN-LAST:event_dMouseClicked

    private void dMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseEntered
        if (InfoDests.etat==true){
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIconOne);
            b.setIcon(imageIconOne);
            c.setIcon(imageIconOne);
            d.setIcon(imageIconOne);
            e.setIcon(imageIcontwo);
        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_dMouseEntered

    private void dMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseExited

    }//GEN-LAST:event_dMouseExited

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        if (InfoDests.etat==true){
        int tot=5;
        System.out.println("of");
        rating r = new rating();
       r.addRating(Destinations.idDests,tot,"destination",authentification.identifiant);
        }
    }//GEN-LAST:event_eMouseClicked

    private void eMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseEntered
      if (InfoDests.etat==true){
        try {
            BufferedImage imgtwo=null;
            imgtwo = ImageIO.read(new File("res/b.png"));
            final ImageIcon imageIcontwo = new ImageIcon(imgtwo);
            BufferedImage imgOne=null;
            imgOne = ImageIO.read(new File("res/a.png"));
            final ImageIcon imageIconOne = new ImageIcon(imgOne);
            a.setIcon(imageIconOne);
            b.setIcon(imageIconOne);
            c.setIcon(imageIconOne);
            d.setIcon(imageIconOne);
            e.setIcon(imageIconOne);
        } catch (IOException ex) {
            Logger.getLogger(InfoOffre.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_eMouseEntered

    private void eMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseExited

    }//GEN-LAST:event_eMouseExited

    private void btnSignalerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignalerMouseClicked
         if (listcomm.isSelectionEmpty()) {
            msage.setText("Veuillez sélectioner un commentaire");
        }
        else
        {
        Signalercomm scg = new Signalercomm();
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

    private void btnvaliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvaliderMouseClicked
         authentification a = new authentification();
        Commentaire c = new Commentaire();
        CommentaireDAO cd = new CommentaireDAO();
        Destinations md = new Destinations();
        c.setComm(jtsujet.getText());
        c.setE_mail(a.identifiant);
        c.setId_dest(md.idDests);
        cd.insertcomDest(c);
        listcomm.setModel(cd.AffichCommDest(md.idDests));
        jtsujet.setText(null);
    }//GEN-LAST:event_btnvaliderMouseClicked

    private void btnvaliderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvaliderMouseEntered
        BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider on.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridv = imgv.getScaledInstance(btnvalider.getWidth(), btnvalider.getHeight(), 0);
        btnvalider.setIcon(new ImageIcon(ridv));

    }//GEN-LAST:event_btnvaliderMouseEntered

    private void btnvaliderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvaliderMouseExited
        BufferedImage imgv = null;
        try {
            imgv = ImageIO.read(new File("res/valider off.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridv = imgv.getScaledInstance(btnvalider.getWidth(), btnvalider.getHeight(), 0);
        btnvalider.setIcon(new ImageIcon(ridv));

    }//GEN-LAST:event_btnvaliderMouseExited

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

    private void mappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mappMouseClicked
       String ch = Destinations.circuit;
        String[] args = null;
        System.out.println(ch);
        String c[] = ch.split(",");
        System.out.println("pays:"+c[0]+" "+c[1]);
        launch.setA(c[0]);
        launch.setB(c[1]);
        launch.main(args);
    }//GEN-LAST:event_mappMouseClicked

    private void mappMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mappMouseEntered
        BufferedImage imgmap = null;
        try {
            imgmap = ImageIO.read(new File("res/map on.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridmap = imgmap.getScaledInstance(mapp.getWidth(), mapp.getHeight(), 0);
        mapp.setIcon(new ImageIcon(ridmap));
    }//GEN-LAST:event_mappMouseEntered

    private void mappMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mappMouseExited
        BufferedImage imgmap = null;
        try {
            imgmap = ImageIO.read(new File("res/map offf.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image ridmap = imgmap.getScaledInstance(mapp.getWidth(), mapp.getHeight(), 0);
        mapp.setIcon(new ImageIcon(ridmap));
    }//GEN-LAST:event_mappMouseExited

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

    private void LikeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LikeeMouseClicked
         like l = new like();
        l.addlike(Destinations.idDests,authentification.identifiant,"dest");
        long n = l.getlike(Destinations.idDests,"dest");
        nbrj.setText(""+n);
       Likee.setEnabled(false);
    }//GEN-LAST:event_LikeeMouseClicked

    private void LikeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LikeeMouseEntered
        BufferedImage imglike = null;
        try {
            imglike = ImageIO.read(new File("res/like on.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image rilike = imglike.getScaledInstance(Likee.getWidth(), Likee.getHeight(), 0);
        Likee.setIcon(new ImageIcon(rilike));
    }//GEN-LAST:event_LikeeMouseEntered

    private void LikeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LikeeMouseExited
        BufferedImage imglike = null;
        try {
            imglike = ImageIO.read(new File("res/like off.png"));
        } catch (IOException ex) {
            Logger.getLogger(InfoAnnonce.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image rilike = imglike.getScaledInstance(Likee.getWidth(), Likee.getHeight(), 0);
        Likee.setIcon(new ImageIcon(rilike));
    }//GEN-LAST:event_LikeeMouseExited

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
            java.util.logging.Logger.getLogger(InfoDests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoDests().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accueil;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Likee;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel btnSignaler;
    private javax.swing.JLabel btnvalider;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtsujet;
    private javax.swing.JList listcomm;
    private javax.swing.JLabel mapp;
    private javax.swing.JLabel msage;
    private javax.swing.JLabel nbrj;
    private javax.swing.JLabel res;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
