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
    
    public void addlike(int id,String source){
        String req="";
        try {
            int test =isInitial(id,source);
            if (test==1){
            long back = getlike(id,source);
            back++;
            if(source=="annonce"){
                req="UPDATE `like` SET `count`="+back+" where `id_annonce`="+id;
            }else if (source=="offre"){
                req="UPDATE `like` SET `count`="+back+" where `id_offre`="+id;
            }else{
                req="UPDATE `like` SET `count`="+back+" where `id_dest`="+id;
            }
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
            }
            else{
                initialLike(id,source);
                if(source=="annonce"){
                     req="update like set count=1 where id_annonce="+id;
                }else if (source=="offre"){
                     req="UPDATE `like` SET `count`=1"
                             + " WHERE `id_offre`="+id;
                }else{
                      req="update like set count=1 where id_dest="+id;
                }   
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public long getlike(int id,String source){
       int l=0;
        try {
           
            String req="";
            if(source=="annonce"){
                req="select count from like where id_annonce="+id;
            }else if (source=="offre"){
                req="SELECT `count` FROM `like` WHERE `id_offre`="+id+"";
            }else{
                req="select count from like where id_dest="+id+"";
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            
            while(resultat.next()){
               l=resultat.getInt("count");
                System.out.println(l);
            }
            
         return l;      
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public void initialLike(int id, String source){
        try {
            String req="";
            if(source=="annonce"){
                req="insert into like (count) values ('0') where id_annonce"+id;
            }else if (source=="offre"){
                req="INSERT INTO `like`(`count`,id_offre) VALUES (0,"+id+")";
            }else{
                req="insert into like (count) values ('0')  where id_dest="+id;
            }
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int isInitial(int id, String source){
       long   l = 0;
        try {
            String req="";
            if(source=="annonce"){
                req="select * from like where id_annonce"+id;
            }else if (source=="offre"){
                req="SELECT `count` FROM `like` WHERE `id_offre`="+id;
            }else{
                req="select * from like where id_dest="+id;
            }
            Statement statement = ConnectionBD.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while(resultat.next()){
              l=resultat.getInt("count");
                
            }
            if (l>=0){
            return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
            
            return 0;
        }
    }
    
    
}
