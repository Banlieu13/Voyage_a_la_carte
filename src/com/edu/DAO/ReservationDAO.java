/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import com.edu.entities.Offre;
import com.edu.entities.Reservation;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author wassim
 */
public class ReservationDAO {
    private int id_res;
     public void insertReservation(Reservation r){
           // DepotDAO depdao=new DepotDAO();

         String requete;
        requete = "insert into reservation (id_res,typeDeCarte,numCarte,DateValidité,Cryptogrammevisuel,E_mail,id_offre,nbrVoyageur,id_annonce,date) values (?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = ConnectionBD .getInstance().prepareStatement(requete);
            ps.setInt(1, r.getIdRes());
            java.util.Calendar cal = Calendar.getInstance();
            cal.setTime(r.getDateValidité());
            ps.setDate(2, new Date(cal.getTime().getTime()));
            ps.setString(3, r.getE_mail());
            ps.setString(4, r.getTypeDeCarte());
            ps.setInt(5, r.getNumCarte());
            
            
            ps.setString(6, r.getCryptogrammevisuel());
            
            
            ps.setInt(7, r.getNbrvoyageur());
            ps.setInt(8, r.getId_offre());
            ps.setInt(9, r.getId_annonce());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

   
   

     
       public List<Reservation> DisplayAllReservation (){
         List<Reservation> listeRes = new ArrayList<>();

        String requete = "select * from reservation";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reservation r =new Reservation();
                r.setIdRes(resultat.getInt(1));
                r.setDate(resultat.getDate(2));
                r.setE_mail(resultat.getString(3));
                r.setTypeDeCarte(resultat.getString(4));
                r.setNumCarte(resultat.getInt(5));
                r.setDateValidité(resultat.getDate(6));
                r.setCryptogrammevisuel(resultat.getString(7));
                r.setId_offre(resultat.getInt(8));

                listeRes.add(r);
            }
            return listeRes;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
            public void deleteres(int id_res){

          String requete;
        requete = "delete from reservation where id_res=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id_res);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
     
}
