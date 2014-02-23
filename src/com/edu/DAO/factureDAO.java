/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author omar
 */
public class factureDAO {
    
    public factureDAO(){
        
    }
   public void insertFacture (facture_responsable f){
        String req ="insert into facture (Id,TVA,Total,Id_offre,Id_agence,id_Client) values (?,?,?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setInt(1,f.getId());
            ps.setInt(2,f.getTVA());
            ps.setDouble(3,f.getTotal());
            ps.setInt(4,f.getId_offre());
            ps.setInt(5,f.getId_agence());
            ps.setString(6,f.getId_client());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
   
    
   
      public List<facture_responsable> AfficherFacture (){


        List<facture_responsable> listeFacture = new ArrayList<facture_responsable>();

        String requete = "select * from facture";
        try {
           Statement statement = ConnectionBD.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                facture_responsable facture =new facture_responsable();
                facture.setId(resultat.getInt(1));
                facture.setDate(resultat.getTimestamp(2));
                facture.setTVA(resultat.getInt(3));
                facture.setTotal(resultat.getDouble(4));
                facture.setId_offre(resultat.getInt(5));
                facture.setId_agence(resultat.getInt(6));
                facture.setId_client(resultat.getString(7));

                listeFacture.add(facture);
            }
            return listeFacture;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
     
            public void deleteFacture(int id){

          String requete = "delete from facture where Id=?";
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
            
   
}
