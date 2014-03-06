/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;
import com.edu.connection.ConnectionBD;
import com.edu.entities.Annonce;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author wassim
 */
public class AnnonceDAO {

    public void insertAnnonce (Annonce a){
        String req ="insert into annonce (dateAn,programme,circuit,nbrplace,HotelA,prixA,E_mailR,pic1,pic2,pic3,pic4) values (?,?,?,?,?,?,?,?,?,?,?)";
        
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            java.util.Calendar cal = Calendar.getInstance();
            cal.setTime(a.getDatean());
            ps.setDate(1, new Date(cal.getTime().getTime()));
            ps.setString(2,a.getProgramme());
            ps.setString(3,a.getCircuit());
            ps.setInt(4,a.getNbrplace());
            ps.setString(5,a.getHotel());
            ps.setDouble(6,a.getPrix());
            ps.setString(7, a.getEmailR());
            ps.setBinaryStream(8, a.getPhoto1());
            ps.setBinaryStream(9, a.getPhoto2());
            ps.setBinaryStream(10, a.getPhoto3());
            ps.setBinaryStream(11, a.getPhoto4());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    
    
    public List<Annonce> DisplayAllAnnonce(){
       List<Annonce> listedepots = new ArrayList<>();
        String requete = "select * from annonce ";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement;
            statement = ConnectionBD.getInstance()
          .createStatement();
            ResultSet resultat;
            resultat = statement.executeQuery(requete);
            while(resultat.next()){
                
                Annonce an1 =new   Annonce (); 
               
                an1.setIdAnnonce(resultat.getInt(1));
                an1.setDatean(resultat.getDate(2)); 
                an1.setDatecreation(resultat.getDate(3));
                an1.setProgramme(resultat.getString(4));
                an1.setCircuit(resultat.getString(5));
                an1.setNbrplace(resultat.getInt(6));
                an1.setHotel(resultat.getString(7));
                an1.setPrix(resultat.getInt(8));
                an1.setEmailR(resultat.getString(9));
                
                
              
               // System.out.println(listedepots+" "+123456);
                listedepots.add(an1);
                
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }  
       public void updatenbrPlace(int place, int id){
        String requete = "update annonce set nbrplace=nbrplace-"+place+" where id_annonce="+id;
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }     
       public String FindannonceById (int id){
        
        String prog=""; 
        String requete = "select programme from annonce where id_annonce="+id;
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
           
            ResultSet resultat;
            resultat = ps.executeQuery(requete);
             while (resultat.next())
            {
                prog = resultat.getString(1);
            }
            
            return prog;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offres "+ex.getMessage());
            return null;
        }
       }
      public void deleteAnnonce(int id){

          String requete = "delete from annonce where id_offre=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
      
      
       public List<ImageIcon> chercherPicAnnonce(int id){
                ImageIcon i1= null;
                ImageIcon i2= null;
                ImageIcon i3= null;
                ImageIcon i4= null;
                    List<ImageIcon> l = new ArrayList<ImageIcon>();
                    String requete = "select pic1,pic2,pic3,pic4 from annonce where id_annonce="+id;
                    try {
                        PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
                        ResultSet resultat = ps.executeQuery();
                         while (resultat.next())
                        {
                        
                            byte [] imagedata = resultat.getBytes(1);
                            byte [] imagedata2 = resultat.getBytes(2);
                            byte [] imagedata3 = resultat.getBytes(3);
                            byte [] imagedata4 = resultat.getBytes(4);
                             i1 = new ImageIcon(imagedata);
                             i2 = new ImageIcon(imagedata2);
                             i3 = new ImageIcon(imagedata3);
                             i4 = new ImageIcon(imagedata4);
                            l.add(i1);
                            l.add(i2);
                            l.add(i3);
                            l.add(i4);
                        }
                        return l;

                    } catch (SQLException ex) {
                       //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("erreur lors de la recherche des Annonces "+ex.getMessage());
                        return null;
                    }
                    
    }
      

}

   


    


