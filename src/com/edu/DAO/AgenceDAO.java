/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Agence;
import com.edu.entities.Responsable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Commando
 */
public class AgenceDAO {
    
    public AgenceDAO(){
        
    }
    
     public void insertAgence (Agence a){
        String req ="insert into agence (NomAg,adresse,mat_fiscale) values (?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,a.getnom());
            ps.setString(2,a.getAdresse());
            ps.setString(3,a.getMatFiscale());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    
}
