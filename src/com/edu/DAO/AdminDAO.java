/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.DAO;

import com.edu.connection.ConnectionBD;
import com.edu.entities.Administrateur;
import com.edu.entities.privilegeAdmin;
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
public class AdminDAO {
    
    public AdminDAO(){
        
    }
    
    public void insertAdmin (Administrateur a){
        String req ="insert into Administrateur (E_mailA,CINA,NomA,PrénomA,VilleA,mot_de_passeA) values (?,?,?,?,?,?)";
           try { 
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(req);
            ps.setString(1,a.getEmail());
            ps.setString(2,a.getCin());
            ps.setString(3,a.getNom());
            ps.setString(4,a.getPrenom());
            ps.setString(5,a.getVille());
            ps.setString(6,a.getPassword());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    public List<Administrateur> AfficherAdmin (){


        List<Administrateur> listeAdmin = new ArrayList<Administrateur>();

        String requete = "select * from Administrateur";
        try {
           Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Administrateur Admin =new Administrateur();
                Admin.setEmail(resultat.getString(1));
                Admin.setCin(resultat.getString(2));
                Admin.setNom(resultat.getString(3));
                Admin.setPrenom(resultat.getString(4));
                Admin.setVille(resultat.getString(5));
                Admin.setPassword(resultat.getString(6));
                
                listeAdmin.add(Admin);
            }
            return listeAdmin;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
            public void deleteAdmin(String mail){

          String requete = "delete from administrateur where E_mailA=?";
        try {
            PreparedStatement ps = ConnectionBD.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
            public void getprivilege(String email){
                String req="select * from privilegeadmin where id_admin ="+email;
                try {
                         Statement statement = ConnectionBD.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                privilegeAdmin pa =new privilegeAdmin();
                pa.setPriv_annonce(resultat.getInt(1));
                pa.setPriv_offre(resultat.getInt(2));
                pa.setPriv_consulterfacture(resultat.getInt(3));
                pa.setPriv_gererfacture(resultat.getInt(4));
                pa.setPriv_responsable(resultat.getInt(5));
                pa.setPriv_client(resultat.getInt(6));
                pa.setPriv_alerte(resultat.getInt(7));
                pa.setPriv_rapport(resultat.getInt(8));
                pa.setPriv_stat(resultat.getInt(9));
                pa.setId_admin(resultat.getInt(10));
            }   
            }catch(Exception e){
                    System.out.println("privilege error");
                    }
            }
    
}
