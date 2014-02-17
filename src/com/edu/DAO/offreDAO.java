/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;
 
import com.edu.entities.Offre;
import com.edu.connection.ConnectionBD;
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
public class offreDAO {
    
    public void insertDepot(Offre o1){

        String requete = "insert into offre ( id_offre,dateOf,Circuit,Hotel,prix,E_mailR) values (?)";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, o1.getCircuit());
            ps.setString(2, o1.getHotel());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateDepot(Offre o1){
        String requete = "update offre set prix=? where id_offre=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, o1.getCircuit());
            ps.setString(2, o1.getHotel());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteDepot(int id){
        String requete = "delete from offre where id_offre=?";
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


    public Offre findDepotById(int id){
    Offre depot = new Offre();
     String requete = "select * from offre where id_offre =?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                depot.setCircuit(resultat.getString(1));
                depot.setHotel(resultat.getString(2));
            }
            return depot;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public Offre findDepotByAdresse(String adr){
    Offre depot = new Offre();
     String requete = "select * from offre where prix = ?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, adr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                depot.setCircuit(resultat.getString(1));
                System.out.println("testttttttt"+depot.getCircuit());
                depot.setHotel(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return depot;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

     public List<String> DisplayAllDepots (){
        List<String> listedepots;
         listedepots = new ArrayList<>();
        String requete = "select Hotel from offre ";
        
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
                offre.setHotel(resultat.getString("Hotel")); 
               // System.out.println(listedepots+" "+123456);
                listedepots.add(offre.getHotel());
                
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
     
}
