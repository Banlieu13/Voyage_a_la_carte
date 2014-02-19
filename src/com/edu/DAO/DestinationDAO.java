/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;
import com.edu.connection.ConnectionBD;
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
public class DestinationDAO {
     public void insertDestination(Destination d1){

        String requete = "insert into destination (Hebergement,Moy_transport,programme,Budget,E_mail)  values (?,?,?,?,?)";
        try {
          
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
          //  ps.setString(2, d1.getTrajet());
             
             ps.setString(1, d1.getHebergement());
             ps.setString(2, d1.getMoyTransp());
             ps.setString(3, d1.getProgramme());
             ps.setDouble(4, d1.getBudget());
             ps.setString(5, d1.getE_mail());
              
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateDestination(Destination d1){
        String requete = "update destination set Hebergement =? where  	id_dest=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            
            ps.setString(1, d1.getHebergement());
            ps.setString(2, d1.getMoyTransp());
              ps.setString(3, d1.getProgramme());
               ps.setDouble(4,d1.getBudget());
              
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteDestination(int id){
        String requete = "delete from destination where id_dest =?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Pays supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Destination findDestinationById(int id){
    Destination destination = new Destination();
     String requete = "select * from destination where id_dest=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                destination.setHebergement(resultat.getString(1));
                
                Destination.setMoyTransp(resultat.getString(2));
                Destination.setProgramme(resultat.getString(3));
                 Destination.setBudget(resultat.getDouble(4));
            }
            return destination;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

   
     @SuppressWarnings("empty-statement")
    public List<String> DisplayAllDestination (){
        List<String> listedestination;
         listedestination = new ArrayList<>();
        String requete = "select Moy_transport from destination ";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                
                Destination destination =new Destination(); 
              // destination.setHebergement(resultat.getString(1)); 
              //  System.out.println(1233+" "+resultat.getString("Moy_transport"));
                Destination.setMoyTransp(resultat.getString("Moy_transport")); 
               // System.out.println(listedepots+" "+123456);
                listedestination.add(destination.getMoyTransp());
                
            }
            return listedestination;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}

   


    

