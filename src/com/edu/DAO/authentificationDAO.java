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

    
}
