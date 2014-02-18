/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrBenrhouma
 */
public class ResponsableDAO {

    public ResponsableDAO() {
    }
    
    public void insertclient (Responsable r){
        String req ="insert into responsable (E_mailR,CINR,NomR,PrénomR,VilleR,mot_de_passeR,id_agence) values (?,?,?,?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,r.getEmail());
            ps.setString(2,r.getCin());
            ps.setString(3,r.getNom());
            ps.setString(4,r.getPrenom());
            ps.setString(5,r.getVille());
            ps.setString(6,r.getPassword());
            ps.setInt(7, r.getIdAnnonce());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
       public List<Responsable> AfficherResponsable (){


        List<Responsable> listeResponsable = new ArrayList<Responsable>();

        String requete = "select * from responsable";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Responsable r = new Responsable();
                r.setEmail(resultat.getString(1));
                r.setCin(resultat.getString(2));
                r.setNom(resultat.getString(3));
                r.setPrenom(resultat.getString(4));
                r.setVille(resultat.getString(5));
                r.setPassword(resultat.getString(6));

                listeResponsable.add(r);
            }
            return listeResponsable;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
            public void deleteResponsable(String mail){

          String requete = "delete from responsable where E_mailR=?";
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
