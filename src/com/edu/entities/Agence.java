/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

/**
 *
 * @author MrBenrhouma
 */
public class Agence {
    private String nom;
    private String adresse;
    private String matFiscale;
    
    public Agence(){
        
    }

    public Agence(String nom,String adresse, String matFiscale) {
        this.nom=nom;
        this.adresse = adresse;
        this.matFiscale = matFiscale;
    }

   
    public String nom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMatFiscale() {
        return matFiscale;
    }
    
     public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMatFiscale(String matFiscale) {
        this.matFiscale = matFiscale;
    }

    @Override
    public String toString() {
        return "Agence{" + "nom Agence=" + nom + ", adresse=" + adresse + ", matFiscale=" + matFiscale + '}';
    }
    
    
}
