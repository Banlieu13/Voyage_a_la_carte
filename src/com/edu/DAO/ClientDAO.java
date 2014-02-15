/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Client;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MrBenrhouma
 */
public class ClientDAO {
    public void insertclient (Client c){
        String req ="insert into Client (E_mail,CIN,Nom,Prénom,Ville,mot_de_passe)values(?,?,?,?,?,?)";
           try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1, c.getEmail());
            ps.setString(2, c.getCin());
            ps.setString(3,c.getNom());
            ps.setString(3,c.getPrenom());
            ps.setString(3,c.getVille());
            ps.setString(3,c.getPassword());
      
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
}
