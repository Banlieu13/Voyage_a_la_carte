/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.gui.Client;

import com.edu.gui.authentification;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;

/**
 *
 * @author MohamedAmine
 */
public class MailJframe extends javax.swing.JFrame {

    URL url;
    Mail mail = new Mail();
    
    
    /**
     * Creates new form MailJframe
     */
    public MailJframe() {
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

        jTextArearObject = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextMailAddressSender = new javax.swing.JTextField();
        jTextMailAddressReceiver = new javax.swing.JTextField();
        jPassworSender = new javax.swing.JPasswordField();
        jTextmailsubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSendMail = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelpieceJointe = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArearObject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("My Mail");
        jTextArearObject.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 11, 213, -1));

        jTextMailAddressSender.setEnabled(false);
        jTextMailAddressSender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailAddressSenderActionPerformed(evt);
            }
        });
        jTextArearObject.add(jTextMailAddressSender, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 89, 311, -1));
        jTextArearObject.add(jTextMailAddressReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 151, 311, -1));
        jTextArearObject.add(jPassworSender, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 120, 311, -1));
        jTextArearObject.add(jTextmailsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 182, 311, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArearObject.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 213, 311, 103));

        jLabel2.setText("Sender");
        jTextArearObject.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 69, -1));

        jLabel3.setText("Password");
        jTextArearObject.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel4.setText("Reciever");
        jTextArearObject.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel5.setText("Subject");
        jTextArearObject.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        jLabel6.setText("Body");
        jTextArearObject.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        jButtonSendMail.setText("Send");
        jButtonSendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendMailActionPerformed(evt);
            }
        });
        jTextArearObject.add(jButtonSendMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 356, 202, 50));

        jLabel7.setText("Add to Mail");
        jTextArearObject.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 327, -1, -1));
        jTextArearObject.add(jLabelpieceJointe, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 327, 311, 34));

        jButton1.setText("Choose a file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTextArearObject.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 383, 151, -1));

        getContentPane().add(jTextArearObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

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

        jMenu4.setText("Contact");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu4);

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
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                url = chooser.getSelectedFile().toURL();
                System.out.println(url);
                jLabelpieceJointe.setText(url.toString());
               
            }
            catch(MalformedURLException exception){
                System.out.println("The URL was malformed ... ");
              
            }
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendMailActionPerformed
        mail.setMailAddressRecipient(jTextMailAddressReceiver.getText());
        mail.setPwd(jPassworSender.getText());
        mail.setMailAddressSender(jTextMailAddressSender.getText());
        mail.setMailSubject(jTextmailsubject.getText());
        String[] lines = jTextArea1.getText().split("\\n");
        String msg="";
        for(String s:lines){
            msg = msg+s;
        }
        mail.setMailObject(msg);
        //System.out.println(jTextArearObject.getToolTipText());
        
        MailConstruction mc = new MailConstruction();
        mc.getMailProperties();
        
        String s = this.cleanUrl(url);
        mc.getMailMessage(s, mail);
        mc.SendMessage();
        
        
        
        
        
    }//GEN-LAST:event_jButtonSendMailActionPerformed

    private void jTextMailAddressSenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailAddressSenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailAddressSenderActionPerformed

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

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        MailJframe mj = new MailJframe();
        mj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        authentification a = new authentification();
        jTextMailAddressSender.setText(a.identifiant);
    }//GEN-LAST:event_formWindowOpened

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        acceuilclient ac = new acceuilclient();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    public String cleanUrl(URL url){
        
        String s = url.toString();
        System.out.println("Before Clean");
        System.out.println(s);
        String delims = "/";
        String[] tokens = s.split(delims);
        System.out.println("After Clean");
        String mailPart="";
        for (int i=1;i<tokens.length;i++){
            mailPart+=tokens[i]+"\\\\";
        }
        System.out.println(mailPart);
        return mailPart;
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailJframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSendMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelpieceJointe;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField jPassworSender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jTextArearObject;
    private javax.swing.JTextField jTextMailAddressReceiver;
    private javax.swing.JTextField jTextMailAddressSender;
    private javax.swing.JTextField jTextmailsubject;
    // End of variables declaration//GEN-END:variables
}
