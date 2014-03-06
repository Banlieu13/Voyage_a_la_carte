/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;
 
import com.edu.entities.Offre;
import com.edu.connection.ConnectionBD;
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
public class offreDAO {
    
    public void insertoffre (Offre o){
        String req ="insert into offre (dateOf,Circuit,nbrplace,programme,Hotel,prix,E_mailR,pic1,pic2,pic3,pic4) values (?,?,?,?,?,?,?,?,?,?,?)";
        
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            java.util.Calendar cal = Calendar.getInstance();
            cal.setTime(o.getDate());
            ps.setDate(1, new Date(cal.getTime().getTime()));
            ps.setString(2,o.getCircuit());
            ps.setInt(3,o.getPlaces());
            ps.setString(4,o.getProgramme());
            ps.setString(5,o.getHotel());
            ps.setDouble(6,o.getPrix());
            ps.setString(7, o.getE_mailR());
            ps.setBinaryStream(8, o.getPhoto1());
            ps.setBinaryStream(9, o.getPhoto2());
            ps.setBinaryStream(10, o.getPhoto3());
            ps.setBinaryStream(11, o.getPhoto4());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateOffre(Offre o1){
        String requete = "update offre set prix=? where id_offre=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, o1.getCircuit());
            ps.setString(2, o1.getHotel());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

     public List<Offre> DisplayAllOffre (){
        List<Offre> listeOffre;
         listeOffre = new ArrayList<>();
        String requete = "select * from offre where nbrplace>0";
        
        try {
            ConnectionBD my=new ConnectionBD();
           Statement statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                
                Offre offre =new Offre(); 
                offre.setIdOffre(resultat.getInt(1));
                offre.setDate(resultat.getDate(2));
                offre.setDateCreation(resultat.getDate(3));
                offre.setCircuit(resultat.getString(4));
                offre.setPlaces(resultat.getInt(5));
                offre.setProgramme(resultat.getString(6));
                offre.setHotel(resultat.getString(7)); 
                offre.setPrix(resultat.getDouble(8));
                offre.setE_mailR(resultat.getString(9));
              
                listeOffre.add(offre);
                
            }
            return listeOffre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offres "+ex.getMessage());
            return null;
        }
    }
     
      public void deleteOffre(int id){

          String requete = "delete from offre where id_offre=?";
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
     
      public List<Offre> chercherOffreBycircuit (String circuit){
        List<Offre> listeOffre = new ArrayList<>();
        String requete = "select * from offre where Circuit='"+circuit+"' and nbrplace>0" ;
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ResultSet resultat;
            resultat = ps.executeQuery(requete);
             while (resultat.next())
            {
                Offre offre =new Offre(); 
                offre.setIdOffre(resultat.getInt(1));
                offre.setDate(resultat.getDate(2));
                offre.setDateCreation(resultat.getDate(3));
                offre.setCircuit(resultat.getString(4));
                offre.setPlaces(resultat.getInt(5));
                offre.setProgramme(resultat.getString(6));
                offre.setHotel(resultat.getString(7)); 
                offre.setPrix(resultat.getDouble(8));
                offre.setE_mailR(resultat.getString(9));
              
                listeOffre.add(offre);
              
            }
            
            return listeOffre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Offres "+ex.getMessage());
            return null;
        }
       }
       
       public String FindOffreById (int id){
        
        String prog=""; 
        String requete = "select programme from offre where id_offre="+id;
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
        public void updatenbrPlace(int place, int id){
        String requete = "update offre set nbrplace=nbrplace-"+place+" where id_offre="+id;
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
        
        public List<ImageIcon> chercherPicOffre(int id){
                ImageIcon i1= null;
                ImageIcon i2= null;
                ImageIcon i3= null;
                ImageIcon i4= null;
                    List<ImageIcon> l = new ArrayList<ImageIcon>();
                    String requete = "select pic1,pic2,pic3,pic4 from offre where id_offre="+id;
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
