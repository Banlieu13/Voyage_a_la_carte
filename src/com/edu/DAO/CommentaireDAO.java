/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import com.edu.entities.Commentaire;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MrBenrhouma
 */
public class CommentaireDAO {
    public void insertcomoffre (Commentaire c){
        String req ="insert into commentaire (com,E_mail,id_offre) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getComm());
            ps.setString(2,c.getE_mail());
            ps.setInt(3,c.getId_offre());
     
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    

      public void insertcomann (Commentaire c){
        String req ="insert into commentaire (com,E_mail,id_annonce) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,c.getComm());
            ps.setString(2,c.getE_mail());
            ps.setInt(3,c.getId_annonce());
            
         

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
      }
}
