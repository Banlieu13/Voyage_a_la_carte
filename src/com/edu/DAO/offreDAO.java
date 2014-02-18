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
    
    public void insertOffre(Offre o1){

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


    public void updateOffre(Offre o1){
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

    


   

   
     public List<String> DisplayAllOffre (){
        List<String> listeOffre;
         listeOffre = new ArrayList<>();
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
                listeOffre.add(offre.getHotel());
                
            }
            return listeOffre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
     
}
