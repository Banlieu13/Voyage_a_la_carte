/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrBenrhouma
 */
public class ClientDAO {
    public ClientDAO()
    {  
    }
    
    public void insertclient (Client c){
        String req ="insert into client (E_mail,CIN,Nom,Prénom,Ville,mot_de_passe) values (?,?,?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getEmail());
            ps.setString(2,c.getCin());
            ps.setString(3,c.getNom());
            ps.setString(4,c.getPrenom());
            ps.setString(5,c.getVille());
            ps.setString(6,c.getPassword());

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
                client.setCin(resultat.getString(2));
                client.setNom(resultat.getString(3));
                client.setPrenom(resultat.getString(4));
                client.setVille(resultat.getString(5));
                client.setPassword(resultat.getString(6));

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
                            c.setCin(resultat.getString(2));
                            c.setNom(resultat.getString(3));
                            c.setPrenom(resultat.getString(4));
                            c.setVille(resultat.getString(5));
                            c.setPassword(resultat.getString(6));
                        }
                        return c;

                    } catch (SQLException ex) {
                       //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
                        return null;
                    }
    }
    
    public void updateClient(String mail,String CIN,String nom,String prenom,String ville){
        String requete = "update client set E_mail=?,CIN=?,Nom=?,Prénom=?,Ville=? where E_mail='"+mail+"'";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ps.setString(2, CIN);
            ps.setString(3, nom);
            ps.setString(4, prenom);
             ps.setString(5, ville);
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
