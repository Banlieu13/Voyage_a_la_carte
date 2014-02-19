/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import com.edu.entities.Signalisation;
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
public class AlerteDAO {
    public AlerteDAO()
    {
        
    }
    
    public void insertalerte (Signalisation s ){
        String req ="insert into signalisation (Sujet,Type,E_mail,E_mailR) values (?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mail());
            ps.setString(4,s.getE_mailR());
        

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
       public List<Signalisation> AfficherAlerte (){


        List<Signalisation> listeAlerte = new ArrayList<Signalisation>();

        String requete = "select * from signalisation";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Signalisation s =new Signalisation();
                s.setIdSig(resultat.getInt(1));
                s.setSujet(resultat.getString(2));
                s.setType(resultat.getString(3));
                s.setE_mail(resultat.getString(4));
                s.setE_mailR(resultat.getString(5));
                

                listeAlerte.add(s);
            }
            return listeAlerte;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
            public void deleteAlerte(int id){

          String requete = "delete from signalisation where id_sig=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
}
