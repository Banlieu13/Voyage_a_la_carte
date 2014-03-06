/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Signalisation;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author MrBenrhouma
 */
public class SignalerDAO {
       public void insertSignaloffre (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mail,id_offre) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mail());
            ps.setInt(4, s.getId_offre());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
  
       
           public void insertSignalannonce (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mail,id_annonce) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mail());
            ps.setInt(4, s.getId_annonce());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
           
               public void insertSignaldestC (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mail,id_dest) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mail());
            ps.setInt(4, s.getId_dest());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
                   public void insertSignalcomC (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mail,id_com) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mail());
            ps.setInt(4, s.getId_com());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
   public void insertSignalcomR (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mailR,id_com) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mailR());
            ps.setInt(4, s.getId_com());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
                public void insertSignaldestR (Signalisation s){
        String req ="insert into signalisation (Sujet,Type,E_mailR,id_dest) values (?,?,?,?)";

        try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,s.getSujet());
            ps.setString(2,s.getType());
            ps.setString(3,s.getE_mailR());
            ps.setInt(4, s.getId_dest());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
}
