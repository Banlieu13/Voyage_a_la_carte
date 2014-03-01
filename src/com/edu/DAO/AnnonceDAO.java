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
    

    
    

    public List<Annonce> DisplayAllAnnonce(){
       List<Annonce> listedepots = new ArrayList<>();
        String requete = "select * from annonce ";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                
                Annonce an1 =new   Annonce (); 
               
                an1.setIdAnnonce(resultat.getInt(1));
                an1.setDatean(resultat.getDate(2)); 
                an1.setDatecreation(resultat.getDate(3));
                an1.setProgramme(resultat.getString(4));
                an1.setCircuit(resultat.getString(5));
                an1.setNbrplace(resultat.getInt(6));
                an1.setHotel(resultat.getString(7));
                an1.setPrix(resultat.getInt(8));
                an1.setEmailR(resultat.getString(9));
                
                
              
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
    
       public void updatenbrPlace(int place, int id){
        String requete = "update annonce set nbrplace=nbrplace-"+place+" where id_annonce="+id;
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

}

   


    


