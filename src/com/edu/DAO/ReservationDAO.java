/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Offre;
import com.edu.entities.Reservation;
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
public class ReservationDAO {
     public void insertReservation(Reservation r){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into reservation ( typeDeCarte,numCarte,DateValidité,Cryptogrammevisuel) values (?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = ConnectionBD .getInstance().prepareStatement(requete);
            ps.setString(1, r.getTypeDeCarte());
            ps.setInt(2, r.getNumCarte());
            ps.setString(3,r.getDateValidité());
             ps.setString(4, r.getCryptogrammevisuel());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

   
   

     
       public List<String> DisplayAllDepots (){
        List<String> listeReservation;
         listeReservation = new ArrayList<>();
        String requete = "select typeDeCarte from reservation ";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                
                Offre offre =new Offre(); 
              // destination.setHebergement(resultat.getString(1)); 
              //  System.out.println(1233+" "+resultat.getString("Moy_transport"));
                offre.setHotel(resultat.getString("typeDeCarte")); 
               // System.out.println(listedepots+" "+123456);
                listeReservation.add(offre.getHotel());
                
            }
            return listeReservation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
     
}
