/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author MrBenrhouma
 */
public class ClientDAO {
    public ClientDAO()
    {  
    }
    
    public void insertclient (Client c){
        String req ="insert into client (E_mail,Nom,Prénom,Ville,mot_de_passe) values (?,?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getEmail());
            ps.setString(2,c.getNom());
            ps.setString(3,c.getPrenom());
            ps.setString(4,c.getVille());
            ps.setString(5,c.getPassword());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
       public List<Client> AfficherClient (){


        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                client.setEmail(resultat.getString(1));
                
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setVille(resultat.getString(4));
                client.setPassword(resultat.getString(5));

                listeClient.add(client);
            }
            return listeClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
            public void deleteClient(String mail){

          String requete = "delete from client where E_mail=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
            
                public Client chercherClient(String mail){
                    Client c = new Client();
                    String requete = "select * from client where E_mail='"+mail+"'";
                    try {
                        PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
                        
                        ResultSet resultat = ps.executeQuery();
                        while (resultat.next())
                        {
                            c.setEmail(resultat.getString(1));
                            c.setNom(resultat.getString(2));
                            c.setPrenom(resultat.getString(3));
                            c.setVille(resultat.getString(4));
                            c.setPassword(resultat.getString(5));
                        }
                        return c;

                    } catch (SQLException ex) {
                       //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("erreur lors de la recherche du client "+ex.getMessage());
                        return null;
                    }
    }
                
                 public ImageIcon chercherImageClient(String mail){
        ImageIcon format = null;
                    Client c = new Client();
                    String requete = "select photo from client where E_mail='"+mail+"'";
                    try {
                        PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
                        
                        ResultSet resultat = ps.executeQuery();
                        while (resultat.next())
                        {
                            byte [] imagedata = resultat.getBytes(1);
                            format = new ImageIcon(imagedata);
                            
                        }
                        
                           return format;
                    } catch (SQLException ex) {
                       //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
                        return null;
                    }
                    
    }            
                
    
     public void updateClient(String mail,String CIN,String nom,String prenom,String ville,InputStream ip){
        
        String requete = "update client set E_mail=?,Nom=?,Prénom=?,Ville=?,photo=? where E_mail='"+mail+"'";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setString(4, ville);
            ps.setBinaryStream(5, ip);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    
     public void updatePassword(String mail,String password){
        String requete = "update client set mot_de_passe=? where E_mail='"+mail+"'";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, password);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
}
