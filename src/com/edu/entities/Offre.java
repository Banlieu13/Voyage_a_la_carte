/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author MrBenrhouma
 */
public class Offre {
    private int IdOffre;
    private Date date = new Date();
    private Date dateCreation = new Date();
    private String programme ;
    private String circuit;
    private String hotel;
    private double prix;
    private int places;
    private String E_mailR;
    private InputStream photo1;
    private InputStream photo2;
    private InputStream photo3;
    private InputStream photo4;

    public InputStream getPhoto1() {
        return photo1;
    }

    public void setPhoto1(InputStream photo1) {
        this.photo1 = photo1;
    }

    public InputStream getPhoto2() {
        return photo2;
    }

    public void setPhoto2(InputStream photo2) {
        this.photo2 = photo2;
    }

    public InputStream getPhoto3() {
        return photo3;
    }

    public void setPhoto3(InputStream photo3) {
        this.photo3 = photo3;
    }

    public InputStream getPhoto4() {
        return photo4;
    }

    public void setPhoto4(InputStream photo4) {
        this.photo4 = photo4;
    }
     
   
    public Offre(String circuit, String hotel, double prix) {
    
        this.circuit = circuit;
        this.hotel = hotel;
        this.prix = prix;
    }

    public Offre() {
        
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    
    public String getE_mailR() {
        return E_mailR;
    }

    public void setE_mailR(String E_mailR) {
        this.E_mailR = E_mailR;
    }

    
    
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    
    
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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
