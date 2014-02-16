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
            public void deleteStock(String mail){

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
    
}
