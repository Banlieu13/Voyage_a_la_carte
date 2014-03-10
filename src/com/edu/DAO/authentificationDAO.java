/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Commando
 */
public class authentificationDAO {
    
    public authentificationDAO(){
        
    }
    
    public int connect(String req) throws SQLException{
       int nbrlignes=0;
        try{ 
        Statement statement = ConnectionBD.getInstance().createStatement();
        ResultSet resultat = statement.executeQuery(req);
        resultat.last();
        nbrlignes =resultat.getRow();
        System.out.println(resultat.getRow());
       }catch(SQLException e){
           System.out.println(e);
       }
       return nbrlignes;
    }

    public int exist(String email){
        int nbrlignes=0;
        try {
            
            String req="select * from client, responsable where E_mailR='"+email+"' or E_mail='"+email+"'";
            Statement statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            resultat.last();
            nbrlignes =resultat.getRow();
          
        } catch (SQLException ex) {
            Logger.getLogger(authentificationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nbrlignes;
    }
    
}
