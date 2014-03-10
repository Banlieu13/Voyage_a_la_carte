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
    
    public void addRating(int id,int rat,String source,String id_client){
        try {
            System.out.println("id objet:"+id);
            System.out.println("value rating:"+rat);
            System.out.println("source:"+source);
            System.out.println("id_client rating:"+id_client);
            String req="";
            if (source=="annonce"){
                req="INSERT INTO `rating`(`count`, `id_annonce`, `id_client`) VALUES ("+rat+", "+id+", '"+id_client+"')";
                
            }else if (source=="offre"){
                req="INSERT INTO `rating`(`count`, `id_offre`, `id_client`) VALUES ("+rat+", "+id+", '"+id_client+"')";
            }else{
                req="INSERT INTO `rating`(`count`, `id_dest`, `id_client`) VALUES ("+rat+", "+id+", '"+id_client+"')";
            }
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public int getNbrClient(int id, String source){
         int nbrclient=0;
        try {
            String req="";
           
            if (source=="annonce"){
                req="select count(id_client) from rating where id_annonce="+id;
            }else if(source=="offre"){
                req="select count(id_client) from rating where id_offre="+id;
            }else{
                req="select count(id_client) from rating where id_dest="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                nbrclient=resultat.getInt(1);
            }
            
            return nbrclient;
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            return nbrclient;
        }
    }
    
    public int getRating(int id,String source){
        boolean etat=false;
        int count=0;
         try {
            String req="";
           
            if (source=="annonce"){
                req="SELECT SUM(`count`) FROM `rating` WHERE `id_annonce`="+id;
            }else if(source=="offre"){
                req="SELECT SUM(`count`) FROM `rating` WHERE `id_offre`="+id;
            }else{
                req="SELECT SUM(`count`) FROM `rating` WHERE `id_dest`="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                count=resultat.getInt(1);
            }
            
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
            return count;
        }
   }
   
    public float calculeRating(int id,String source){
        float somme=0;
        int nbrclient=getNbrClient(id, source);
        System.out.println("le nombre de client= "+nbrclient);
        int count = getRating(id, source);
        System.out.println("Nbr de value= "+count);
        if (nbrclient!=0){
            somme = count / nbrclient;
        }else{
            somme = 0;
        }
        return somme;
    }
    
    public boolean isRated(int id,String id_client,String source){
       int exist=0;
        try {
            String req="";
            if (source=="annonce"){
                req="SELECT id_rating FROM `rating` WHERE `id_annonce`="+id+" AND id_client='"+id_client+"'";
            }else if(source=="offre"){
                req="SELECT id_rating FROM `rating` WHERE `id_offre`="+id+" AND id_client='"+id_client+"'";
            }else{
                req="SELECT id_rating FROM `rating` WHERE `id_dest`="+id+" AND id_client='"+id_client+"'";
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                exist=resultat.getInt(1);
            }
            if (exist>0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println("aucun champ"+ex);
            return false;
        }
    }
    
    
}
