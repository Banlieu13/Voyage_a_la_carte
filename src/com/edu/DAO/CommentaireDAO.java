/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Commentaire;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author MrBenrhouma
 */
public class CommentaireDAO {
    public void insertcomoffre (Commentaire c){
        String req ="insert into commentaire (com,E_mail,id_offre) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getComm());
            ps.setString(2,c.getE_mail());
            ps.setInt(3,c.getId_offre());
     
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
        
     public void insertcomDest (Commentaire c){
        String req ="insert into commentaire (com,E_mail,id_dest) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getComm());
            ps.setString(2,c.getE_mail());
            ps.setInt(3,c.getId_dest());
     
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
      public void insertcomann (Commentaire c){
        String req ="insert into commentaire (com,E_mail,id_annonce) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getComm());
            ps.setString(2,c.getE_mail());
            ps.setInt(3,c.getId_annonce());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
      }
      
      public DefaultListModel<String> AffichCommoffre (int id){

          
         DefaultListModel<String> listecom = new DefaultListModel ();
         String req = "select Nom,Prénom,com from client c,commentaire com where com.id_offre="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
                listecom.addElement(resultat.getString(1)+" "+resultat.getString(2)+"  :  "+resultat.getString(3 ));   
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Commentaires "+ex.getMessage());
            return null;
        }
    }
      
      public DefaultListModel<String> AffichCommAnn (int id){

          
         DefaultListModel<String> listecom = new DefaultListModel ();
         String req = "select Nom,Prénom,com from client c,commentaire com where com.id_annonce="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
                listecom.addElement(resultat.getString(1)+" "+resultat.getString(2)+"  :  "+resultat.getString(3 ));   
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
      
       public List<String> DisplayIdcommAnn (int id){

          
         List<String> listecom = new ArrayList<>();
         String req = "select com.id from client c,commentaire com where com.id_annonce="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
              listecom.add(""+resultat.getInt(1));
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
              public List<String> DisplayIdcommOffre (int id){

          
         List<String> listecom = new ArrayList<>();
         String req = "select com.id from client c,commentaire com where com.id_offre="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
              listecom.add(""+resultat.getInt(1));
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
        public List<String> DisplayIdcommDest (int id){

          
         List<String> listecom = new ArrayList<>();
         String req = "select com.id from client c,commentaire com where com.id_dest="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
              listecom.add(""+resultat.getInt(1));
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
      public DefaultListModel<String> AffichCommDest (int id){

          
         DefaultListModel<String> listecom = new DefaultListModel ();
         String req = "select Nom,Prénom,com from client c,commentaire com where com.id_dest="+id+" and c.E_mail=com.E_mail";
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
                listecom.addElement(resultat.getString(1)+" "+resultat.getString(2)+"  :  "+resultat.getString(3 ));   
            }
           
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
      
      public String AffichCommmail (int id){
          String ma ="";
         String req = "select E_mail from commentaire where id="+id;
        
        try {
            
           Statement statement = ConnectionBD.getInstance().createStatement();
    
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                
                ma = resultat.getString(1);
            }
           
            return ma;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des email Clients "+ex.getMessage());
            return null;
        }
    }
      
      public void deleteCommentaire(int id){

          String requete = "delete from Commentaire where id=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
}
