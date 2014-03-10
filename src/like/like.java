/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package like;

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
public class like {
    public like(){
        
    }
    
    public void addlike(int id,String id_client,String source){
        try {
            System.out.println("id source: "+id);
            System.err.println("source: "+source);
            String req="";
            if (source=="annonce"){
                req="INSERT INTO `like`(`count`, `id_annonce`, `id_client`) VALUES ("+1+", "+id+", '"+id_client+"')";
                
            }else if (source=="offre"){
                req="INSERT INTO `like`(`count`, `id_offre`, `id_client`) VALUES ("+1+", "+id+", '"+id_client+"')";
            } else{
                req="INSERT INTO `like`(`count`, `id_dest`, `id_client`) VALUES ("+1+", "+id+", '"+id_client+"')";
            }
            
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    public long getlike(int id,String source){
        int l=0;
        try {
            System.out.println("id source: "+id);
            System.out.println("source: "+source);
            String req="";
            
            if (source=="annonce"){
                req="SELECT SUM(`count`) FROM `like` WHERE `id_annonce`="+id;
            }else if (source=="offre"){
                req="SELECT SUM(`count`) FROM `like` WHERE `id_offre`="+id;
            } else{
                req="SELECT SUM(`count`) FROM `like` WHERE `id_dest`="+id;
            }
            
              Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            
             while(resultat.next()){
               l=resultat.getInt(1);
                System.out.println("le count: "+l);
            }
            
         return l;
            
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
             return l;
        }
       
    }
    
      public long getlikeMesDest(String id){
        int l=0;
        try {
            System.out.println("id source: "+id);
            String req="SELECT SUM(`count`) FROM `like` WHERE `id_client`="+id;
            
            
              Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            
             while(resultat.next()){
               l=resultat.getInt(1);
                System.out.println("le count: "+l);
            }
            
         return l;
            
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
             return l;
        }
       
    }
    
    
    
    public boolean isliked(String id_client,int id,String source){
        boolean etat = false;
        try {
            
            int l =0;
            String req="";
            System.out.println("id client:"+id_client);
            System.out.println("id liked"+id);
            if (source=="annonce"){
                req="SELECT `count` FROM `like` WHERE `id_annonce`="+id+" AND `id_client`='"+id_client+"'";
                
            }else if (source=="offre"){
                req="SELECT `count` FROM `like` WHERE `id_offre`="+id+" AND `id_client`='"+id_client+"'";
            } else{
                req="SELECT `count` FROM `like` WHERE `id_dest`="+id+" AND `id_client`='"+id_client+"'";
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
                l=resultat.getInt(1);
            }
            if (l>0){
                etat=true;
            }else{
                etat=false;
            }
            return etat;
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
            return etat;
        }
    }
  
}
