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
     public void insertReservation(Reservation r){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into reservation (typeDeCarte,numCarte,DateValidité,Cryptogrammevisuel,E_mail,id_offre,nbrVoyageur) values (?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = ConnectionBD .getInstance().prepareStatement(requete);
            ps.setString(1, r.getTypeDeCarte());
            ps.setInt(2, r.getNumCarte());
            java.util.Calendar cal = Calendar.getInstance();
            cal.setTime(r.getDateValidité());
            ps.setDate(3, new Date(cal.getTime().getTime()));
            ps.setString(4, r.getCryptogrammevisuel());
            ps.setString(5, r.getE_mail());
            ps.setInt(6, r.getId_offre());
            ps.setInt(7, r.getNbrvoyageur());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
     }
         public void insertReservationAn(Reservation r){
        String requete = "insert into reservation (typeDeCarte,numCarte,DateValidité,Cryptogrammevisuel,E_mail,id_annonce,nbrVoyageur) values (?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = ConnectionBD .getInstance().prepareStatement(requete);
            ps.setString(1, r.getTypeDeCarte());
            ps.setInt(2, r.getNumCarte());
            java.util.Calendar cal = Calendar.getInstance();
            cal.setTime(r.getDateValidité());
            ps.setDate(3, new Date(cal.getTime().getTime()));
            ps.setString(4, r.getCryptogrammevisuel());
            ps.setString(5, r.getE_mail());
            ps.setInt(6, r.getId_annonce());
            ps.setInt(7, r.getNbrvoyageur());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

   
   

     
       public List<Reservation> DisplayAllReservation (){
         List<Reservation> listeRes = new ArrayList<Reservation>();

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
            public void deleteres(String mail){

          String requete = "delete from reservation where id_res=?";
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
