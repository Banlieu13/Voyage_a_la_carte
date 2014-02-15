/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.util.Date;

/**
 *
 * @author MrBenrhouma
 */
public class Annonce {
    private int IdAnnonce;
    private Date datean = new Date();
    private String trajet;
    private String Hotel ;
    private double prix;

    public Annonce(String trajet, String Hotel, double prix) {

        this.trajet = trajet;
        this.Hotel = Hotel;
        this.prix = prix;
    }

    
    
    public int getIdAnnonce() {
        return IdAnnonce;
    }

    public Date getDatean() {
        return datean;
    }

    public String getTrajet() {
        return trajet;
    }

    public String getHotel() {
        return Hotel;
    }

    public double getPrix() {
        return prix;
    }

    public void setIdAnnonce(int IdAnnonce) {
        this.IdAnnonce = IdAnnonce;
    }

    public void setDatean(Date datean) {
        this.datean = datean;
    }

    public void setTrajet(String trajet) {
        this.trajet = trajet;
    }

    public void setHotel(String Hotel) {
        this.Hotel = Hotel;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Annonce{" + "IdAnnonce=" + IdAnnonce + ", datean=" + datean + ", trajet=" + trajet + ", Hotel=" + Hotel + ", prix=" + prix + '}';
    }
    
    
    
}
