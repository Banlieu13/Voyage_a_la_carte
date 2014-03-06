/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.io.InputStream;

/**
 *
 * @author MrBenrhouma
 */
public class Client {
    private String email;
   
    private String nom ;
    private String prenom ;
    private String ville;
    private String password;
    private static String fbem;
    private static String fbid;
    private static String fbnom;
    private InputStream photo;

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }
    
    
    
    public static String getFbnom() {
        return fbnom;
    }

    public static void setFbnom(String fbnom) {
        Client.fbnom = fbnom;
    }
    public static String getFbid() {
        return fbid;
    }

    public static void setFbid(String fbid) {
        Client.fbid = fbid;
    }
    public static void setFbem(String fbem) {
        Client.fbem = fbem;
    }

    public static String getFbem() {
        return fbem;
    }


   
    
    public Client(String email, String nom, String prenom, String ville, String password) {
        this.email = email;
        
       
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.password = password;
    }

    public Client() {
        
    }

    public String getEmail() {
        return email;
    }

   

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" + "email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", password=" + password + '}';
    }

    public void getPrenom(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
