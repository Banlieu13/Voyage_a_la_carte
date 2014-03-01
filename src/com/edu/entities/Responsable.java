/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

/**
 *
 * @author MrBenrhouma
 */
public class Responsable {
    private String email;
    private String cin;
    private String nom ;
    private String prenom ;
    private String ville;
    private String password;
    private String MatAgence;
    private int valide;

    public int getValide() {
        return valide;
    }

    public void setValide(int valide) {
        this.valide = valide;
    }

    public Responsable() {
    }
    
    
    
    
    public Responsable(String email, String cin, String nom, String prenom, String ville, String password, String MatAgence, int valide) {
        this.email = email;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.password = password;
        this.MatAgence = MatAgence;
        this.valide = valide;
    }

    public String getMatAgence() {
        return MatAgence;
    }

    public void setMatAgence(String MatAgence) {
        this.MatAgence = MatAgence;
    }
    
    public String getEmail() {
        return email;
    }

    public String getCin() {
        return cin;
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

    public void setCin(String cin) {
        this.cin = cin;
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
        return "Responsable{" + "email=" + email + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", password=" + password + '}';
    }
    
}
