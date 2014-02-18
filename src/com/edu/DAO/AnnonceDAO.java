/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;
import com.edu.connection.ConnectionBD;
import com.edu.entities.Annonce;
import com.edu.entities.Destination;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wassim
 */
public class AnnonceDAO {
    

    
    

     @SuppressWarnings("empty-statement")
    public List<Annonce> DisplayAllAnnonce(){
       List<Annonce> listedepots = new ArrayList<>();
        String requete = "select dateAn,trajet,HotelA,prixA from annonce ";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                
                Annonce an1 =new   Annonce (); 
                
              // destination.setHebergement(resultat.getString(1)); 
              //  System.out.println(1233+" "+resultat.getString("Moy_transport"));
                an1. setDatean(resultat.getDate("dateAn")); 
                an1. setTrajet(resultat.getString("trajet"));
                an1. setHotel(resultat.getString("HotelA"));
                an1. setPrix(resultat.getInt("prixA"));
                
              
               // System.out.println(listedepots+" "+123456);
                listedepots.add(an1);
                
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}

   


    


