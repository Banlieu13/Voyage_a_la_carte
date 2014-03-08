/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Annonce;
import com.edu.gui.authentification;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nada
 */
public class StatistiquesResponsableDAO {
    
      public int AfficherNbrAnnonces(String id){
        int res=0;
        String requete = "select count(id_annonce) from annonce where E_mailR ='"+id+"'";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                res= resultat.getInt(1);
                
            }
            return res;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces "+ex.getMessage());
            return 0;
}
      }
         public int AfficherNbrOffres (String id){
        int res=0;
        String requete = "select count(id_offre) from offre where E_mailR ='"+id+"'";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                res= resultat.getInt(1);
                
            }
            return res;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces "+ex.getMessage());
            return 0;
}
         }
         public double CalculerTotalPrix (String id){
        double res=0;
        String requete = "select Sum(Total) from facture f,annonce a,responsable r where f.id_annonce=a.id_annonce and a.E_mailR=r.E_mailR and r.E_mailR ='"+id+"'";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                res= resultat.getDouble(1);
                
            }
            return res;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces "+ex.getMessage());
            return 0;
}
         }
         
         public double CalculerTotalPrixOffre (String id){
        double res=0;
        String requete = "select Sum(Total) from facture f,offre o,responsable r where f.id_offre = o.id_offre and o.E_mailR='"+id+"'";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                res= resultat.getDouble(1);
                
            }
            return res;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des offres "+ex.getMessage());
            return 0;
}
      }
}
