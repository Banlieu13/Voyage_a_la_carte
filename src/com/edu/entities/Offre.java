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
public class Offre {
    private int IdOffre;
    private Date date = new Date();
    private String circuit;
    private String hotel;
    private double prix;

    public Offre(String circuit, String hotel, double prix) {
    
        this.circuit = circuit;
        this.hotel = hotel;
        this.prix = prix;
    }

    public Offre() {
        
    }

    
    
    public int getIdOffre() {
        return IdOffre;
    }

    public Date getDate() {
        return date;
    }

    public String getCircuit() {
        return circuit;
    }

    public String getHotel() {
        return hotel;
    }

    public double getPrix() {
        return prix;
    }

    public void setIdOffre(int IdOffre) {
        this.IdOffre = IdOffre;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Offre{" + "IdOffre=" + IdOffre + ", date=" + date + ", circuit=" + circuit + ", hotel=" + hotel + ", prix=" + prix + '}';
    }
    
    
    
}
