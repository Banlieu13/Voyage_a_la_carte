/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Reservation;
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
public class PrivilegeListAdministrateurDAO {
    
    public PrivilegeListAdministrateurDAO(){
        
    }
    
    public String[] ListAdministrateur (){
        String[] list = new String[500];
        int i=0;
        String requete = "select NomA from administrateur";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                list[i]= resultat.getString(1);
                i++;
            }
            
            return list;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
    
    public int[] getprivilege(String nom){
        String req="select * from privilegeadmin where id_admin=(select E_mailA from "
                + "administrateur where nomA="+nom+")";
        int[] p = new int[10];
        try{
                Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet res = statement.executeQuery(req);
             while(res.next()){  
                p[0]= res.getInt(2);
                 System.out.println(p[0]);
                p[1]= res.getInt(3);
                p[2]= res.getInt(4);
                p[3]= res.getInt(5);
                p[4]= res.getInt(6);
                p[5]= res.getInt(7);
                p[6]= res.getInt(8);
                p[7]= res.getInt(9);
                p[8]= res.getInt(10);
                
                        
             }
                return p;
            
       
                }catch(Exception e){
                    System.out.println(e);
                    return null;
                }
        
    }
    
    public void saveprivilege(int[] p,String nom){
         String req ="update privilegeAdmin set priv_annonce="+p[0]
                 +",priv_offre="+p[1]
                 + ",priv_consulterfacture="+p[2]
                 + ",priv_gererfacture="+p[3]
                 + ",priv_responsable="+p[4]
                 + ",priv_client="+p[5]
                 + ",priv_alerte="+p[6]
                 + ",priv_rapport="+p[7]
                 + ",priv_stat="+p[8]
                 + " where id_admin=(select E_mailA from "
                + "administrateur where nomA="+nom+")";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }
    
}
