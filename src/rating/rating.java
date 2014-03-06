/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rating;

import com.edu.connection.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Commando
 */
public class rating {
    public rating(){
        
    }
    
    public void addRating(int id,int rat,String source){
        try {
            addclient(id,source);
            String req="";
            float c = getRating(id,source);
            float somme=c+rat;
            if (source=="annonce"){
                req="update rating set count="+somme+" where id_annonce="+id;
            }else if(source=="offre"){
                req="update rating set count="+somme+" where id_offre="+id;
            }else{
                req="update rating set count="+somme+" where id_dest="+id;
            }
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addclient(int id, String source){
        String req="";
        int test=isInitial(id,source);
        if (test==1){
            try {
                int nbr = getNbrClient(id,source);
                nbr++;
                if (source=="annonce"){
                    req="update rating set NbrClient="+nbr+" where id_annonce="+id;
                }else if(source=="offre"){
                    req="update rating set NbrClient="+nbr+" where id_offre="+id;
                }else{
                    req="update rating set NbrClient="+nbr+" where id_dest="+id;
                }
                PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            try {
                initialRating(id,source);
                  if (source=="annonce"){
                     req="update rating set NbrClient="+1+" where id_annonce="+id;
                 }else if(source=="offre"){
                       req="update rating set NbrClient="+1+" where id_offre="+id;
                }else{
                       req="update rating set NbrClient="+1+" where id_dest="+id;
                }
                PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int getNbrClient(int id, String source){
        try {
            String req="";
            int nbrclient=0;
            
            if (source=="annonce"){
                req="select NbrClient from rating where id_annonce="+id;
            }else if(source=="offre"){
                req="select NbrClient from rating where id_offre="+id;
            }else{
                req="select NbrClient from rating where id_dest="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                nbrclient=resultat.getInt(3);
            }
            
            return nbrclient;
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public float getRating(int id,String source){
        try {
            String req="";
            int count=0;
            
            if (source=="annonce"){
                req="select count from rating where id_annonce="+id;
            }else if(source=="offre"){
                req="select count from rating where id_offre="+id;
            }else{
                req="select count from rating where id_dest="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                count=resultat.getInt(3);
            }
            
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public void initialRating(int id, String source){
        try {
            String req="";
            if(source=="annonce"){
                req="insert into rating (count) values (0) where id_annonce"+id;
            }else if (source=="offre"){
                req="insert into rating (count) values (0) where id_offre="+id;
            }else{
                req="insert into rating (count) values (0)  where id_dest="+id;
            }
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int isInitial(int id, String source){
        try {
            String req="";
            if(source=="annonce"){
                req="select * from rating where id_annonce"+id;
            }else if (source=="offre"){
                req="select * from rating where id_offre="+id;
            }else{
                req="select * from rating where id_dest="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            
            return 0;
        }
    }
    
    public float calculeRating(int id,String source){
        float somme=0;
        int nbrclient=getNbrClient(id, source);
        float count = getRating(id, source);
        if (nbrclient!=0){
            somme = count / nbrclient;
        }else{
            somme = 0;
        }
        return somme;
    }
    
    
}
