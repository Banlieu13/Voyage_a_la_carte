/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeux;

import javax.swing.ImageIcon;

/**
 *
 * @author MrBenrhouma
 */
public class Carte extends javax.swing.JPanel {

    private String urlFace;
    private String urlDos;
    private int id ;

    public Carte(){}
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUrlFace(String urlFace) {
        this.urlFace = urlFace;
    }

    public void setUrlDos(String urlDos) {
        this.urlDos = urlDos;
    }

    public String getUrlFace() {
        return urlFace;
    }

    public String getUrlDos() {
        return urlDos;
    }
    // Méthode métier
     private void affichePhoto (String tmp){
        ImageIcon icone = new ImageIcon(tmp);
        photolbl.setIcon(icone);
        
    }
    
    public void tournerversFace (){
        affichePhoto(urlFace);
        
    }
    
      public void tournerversDos (){
        affichePhoto(urlDos);
        
    }
    
    
    public Carte(String urlF,String urlD,int id) {
        setUrlFace(urlF);
        setUrlDos(urlD);
        setId(id);
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

        jLabel1 = new javax.swing.JLabel();
        photolbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel photolbl;
    // End of variables declaration//GEN-END:variables
}