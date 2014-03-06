/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Signalisation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrBenrhouma
 */
public class GererAlerteDAO {
    private static int ID;
    private static String source;

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public static int getID() {
        return ID;
    }
    public static void setID(int ID) {
        GererAlerteDAO.ID = ID;
    } 
    public GererAlerteDAO()
    {
        
    }  
       public List<Signalisation> AfficherAlerteOffre (){


        List<Signalisation> listeoffre = new ArrayList<Signalisation>();

        String requete = "select * from signalisation where id_offre > 0";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Signalisation s =new Signalisation();
                s.setIdSig(resultat.getInt(1));
                s.setSujet(resultat.getString(2));
                s.setType(resultat.getString(3));
                s.setE_mail(resultat.getString(4));
                s.setE_mailR(resultat.getString(5));
                s.setId_offre(resultat.getInt(6));
                listeoffre.add(s);
            }
            return listeoffre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur recuperation alerte offre "+ex.getMessage());
            return null;
        }
    }       
     public List<Signalisation> AfficherAlerteAnnonce (){


        List<Signalisation> listeannonce = new ArrayList<Signalisation>();

        String requete = "select * from signalisation where id_annonce > 0";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Signalisation s =new Signalisation();
                s.setIdSig(resultat.getInt(1));
                s.setSujet(resultat.getString(2));
                s.setType(resultat.getString(3));
                s.setE_mail(resultat.getString(4));
                s.setE_mailR(resultat.getString(5));
                s.setId_annonce(resultat.getInt(7));

                listeannonce.add(s);
            }
            return listeannonce;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur recuperation alerte annonce "+ex.getMessage());
            return null;
        }
    }     
    public List<Signalisation> AfficherAlerteCommentaire (){
        List<Signalisation> listeCommentaire = new ArrayList<Signalisation>();

        String requete = "select * from signalisation where id_com > 0";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Signalisation s =new Signalisation();
                s.setIdSig(resultat.getInt(1));
                s.setSujet(resultat.getString(2));
                s.setType(resultat.getString(3));
                s.setE_mail(resultat.getString(4));
                s.setE_mailR(resultat.getString(5));
                 s.setId_com(resultat.getInt(9));

                listeCommentaire.add(s);
            }
            return listeCommentaire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur recuperation alerte commentaire "+ex.getMessage());
            return null;
        }
    }    
     public List<Signalisation> AfficherAlerteDestination (){


        List<Signalisation> listeDistination = new ArrayList<Signalisation>();

        String requete = "select * from signalisation where id_dest > 0";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Signalisation s =new Signalisation();
                s.setIdSig(resultat.getInt(1));
                s.setSujet(resultat.getString(2));
                s.setType(resultat.getString(3));
                s.setE_mail(resultat.getString(4));
                s.setE_mailR(resultat.getString(5));
                 s.setId_dest(resultat.getInt(8));

                listeDistination.add(s);
            }
            return listeDistination;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur recuperation alerte Distination "+ex.getMessage());
            return null;
        }
    }
    public void deleteAlerte(int id){

          String requete = "delete from signalisation where id_sig=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }           
   public String AfficherOffre (int id){
         String contenue = null ;
         String requete = "select * from offre where id_offre="+id;
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                contenue="Date: "+resultat.getDate(2)+
                        "\n Circuit: "+resultat.getString(4)+
                        "\n Nombre de place: "+resultat.getInt(5)+
                        "\n Programme: "+resultat.getString(6)+
                        "\n hotel: "+resultat.getString(7)+
                        "\n Prix: "+resultat.getDouble(8);
            }
            return contenue;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur detail offre "+ex.getMessage());
            return null;
        }
    }
   public String AfficherAnnonce(int id){
        String contenue = null ;
         String requete = "select * from annonce where id_annonce="+id;
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                contenue="Date: "+resultat.getDate(2)+
                        "\n Programme: "+resultat.getString(4)+
                        "\n Circuit: "+resultat.getInt(5)+
                        "\n Nombre de place: "+resultat.getString(6)+
                        "\n Hotel: "+resultat.getString(7)+
                        "\n Prix: "+resultat.getDouble(8);
            }
            return contenue;
        } catch (SQLException ex) {
            System.out.println("erreur detail annonce "+ex.getMessage());
            return null;
        }}
   public String AfficherCommentaire(int id){
       String contenue = null ;
         String requete = "select * from commentaire where id="+id;
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                contenue= "\n Commentaire : "+resultat.getString(2);
                      
            }
            return contenue;
        } catch (SQLException ex) {
            System.out.println("erreur detail annonce "+ex.getMessage());
            return null;
        }
   }
   public String AfficherDestination(int id){
       String contenue = null ;
    String requete = "select * from destination where id_dest="+id;
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
               contenue="Trajet: "+resultat.getString(2)+
                        "\n Hebergement: "+resultat.getString(3)+
                        "\n Programme: "+resultat.getString(4)+
                        "\n Moyenne de transport: "+resultat.getString(5)+
                        "\n Budget: "+resultat.getDouble(6);
            }
            return contenue;
        } catch (SQLException ex) {
            System.out.println("erreur detail destination "+ex.getMessage());
            return null;
        }
   }
   
}
