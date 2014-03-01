/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;
import com.edu.connection.ConnectionBD;
import com.edu.entities.Destination;
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
public class DestinationDAO {
     public void insertDestination(Destination d1){

        String requete = "insert into destination (id_dest,trajetD,Hebergement,Moy_transport,programme,Budget,E_mail)  values (?,?,?,?,?)";
        try {
          
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
          //  ps.setString(2, d1.getTrajet());
             ps.setInt(1, d1.getIdDest());
             ps.setString(2, d1.getTrajetD());
             ps.setString(3, d1.getHebergement());
             ps.setString(4, d1.getMoyTransp());
             ps.setString(5, d1.getProgramme());
             ps.setDouble(6, d1.getBudget());
             ps.setString(7, d1.getE_mail());
              
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
            
             ps.setInt(1, d1.getIdDest());
             ps.setString(2, d1.getTrajetD());
             ps.setString(3, d1.getHebergement());
             ps.setString(4, d1.getMoyTransp());
             ps.setString(5, d1.getProgramme());
             ps.setDouble(6, d1.getBudget());
             ps.setString(7, d1.getE_mail());
              
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteDestination(int IdDest){
        String requete = "delete from destination where id_dest =?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, IdDest);
            ps.executeUpdate();
            System.out.println("Destination supprimée");
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
                destination.setIdDest(resultat.getInt(1));
                
                destination.setHebergement(resultat.getString(3));
                
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
    public List<Destination> DisplayAllDestination (){
        List<Destination> listedestination;
         listedestination = new ArrayList<>();
        String requete = "select * from destination ";
        
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Destination d1 =new Destination();
                d1.setIdDest(resultat.getInt(1));
                d1.setTrajetD(resultat.getString(2));
                d1.setHebergement(resultat.getString(3));
                 d1.setProgramme(resultat.getString(4));
                d1.setMoyTransp(resultat.getString(5));
                d1.setBudget(resultat.getDouble(6));
                
               
                d1.setE_mail(resultat.getString(7));
                
                

                listedestination.add(d1);
            }
            return listedestination;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

   
    }

    



   


    

