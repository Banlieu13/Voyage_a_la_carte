/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author MrBenrhouma
 */
public class Annonce {
    private int IdAnnonce;
    private Date datean = new Date();
    private Date datecreation;
    private String programme ;
    private String circuit;
    private int nbrplace;
    private String Hotel ;
    private double prix;
    private String EmailR;

  

    public Annonce() {
        
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public String getProgramme() {
        return programme;
    }

    public String getCircuit() {
        return circuit;
    }

    public int getNbrplace() {
        return nbrplace;
    }

    public String getEmailR() {
        return EmailR;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public void setNbrplace(int nbrplace) {
        this.nbrplace = nbrplace;
    }

    public void setEmailR(String EmailR) {
        this.EmailR = EmailR;
    }
   
    
    
    public int getIdAnnonce() {
        return IdAnnonce;
    }

    public Date getDatean() {
        return datean;
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


    public void setHotel(String Hotel) {
        this.Hotel = Hotel;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    
    
    
}
