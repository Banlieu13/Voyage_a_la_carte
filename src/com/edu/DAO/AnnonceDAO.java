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
    
public void insertDepot(Destination d1){

        String requete = "insert into annonce  values (?,?,?,?)";
        try {
          
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
             
            ps.setString(1,d1.getHebergement());
             // ps.setInt(3,st.getDepot().getId_dep() );
             ps.setString(2, d1.getMoyTransp());
             System.out.println("eee");
              ps.setString(3, d1.getProgramme());
               ps.setDouble(4, d1.getBudget());
              
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateDepot(Destination d1){
        String requete = "update annonce set trajet =? where  	id_annonce =?";
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

    public void deleteDepot(int id){
        String requete = "delete from annonce where  	id_annonce =?";
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


    public Destination findDepotById(int id){
    Destination destination = new Destination();
     String requete = "select * from annonce where id_annonce =?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                destination.setHebergement(resultat.getString(1));
                
                destination.setMoyTransp(resultat.getString(2));
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

    public Destination findDepotByAdresse(String adr){
    Destination destination = new Destination();
     String requete = "select * from annonce where  id_annonce = ?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, adr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                destination.setHebergement(resultat.getString(1));
                System.out.println("testttttttt"+destination.getHebergement());
                destination.setMoyTransp(resultat.getString(2));
                System.out.println(resultat.getString(2));
                Destination.setProgramme(resultat.getString(3));
                 System.out.println(resultat.getString(3));
                 Destination.setBudget(resultat.getDouble(4));
                 System.out.println(resultat.getDouble(4));
                 
            }
            return destination;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

     @SuppressWarnings("empty-statement")
    public List<Annonce> DisplayAllDepots (){
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

   


    


