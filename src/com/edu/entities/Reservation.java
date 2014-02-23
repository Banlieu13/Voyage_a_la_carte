/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author MrBenrhouma
 */
public class Reservation {
   private int IdRes;
   private Date date = new Date();
   private String E_mail;
   private String typeDeCarte;
   private int numCarte ;
   private Date DateValidité ;
   private String Cryptogrammevisuel ;
   private int Id_offre ;

    public Reservation() {
        
    }



    
    
    public String getE_mail() {
        return E_mail;
    }

    public int getId_offre() {
        return Id_offre;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setId_offre(int Id_offre) {
        this.Id_offre = Id_offre;
    }

    
    
    public String getTypeDeCarte() {
        return typeDeCarte;
    }

    public   void setTypeDeCarte(String typeDeCarte) {
        this.typeDeCarte = typeDeCarte;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public Date getDateValidité() {
        return DateValidité;
    }

    public void setDateValidité(Date DateValidité) {
        this.DateValidité = DateValidité;
    }

  
    public String getCryptogrammevisuel() {
        return Cryptogrammevisuel;
    }

    public void setCryptogrammevisuel(String Cryptogrammevisuel) {
        this.Cryptogrammevisuel = Cryptogrammevisuel;
    }
    
    

    public int getIdRes() {
        return IdRes;
    }

    public Date getDate() {
        return date;
    }

    public void setIdRes(int IdRes) {
        this.IdRes = IdRes;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" + "IdRes=" + IdRes + ", date=" + date + '}';
    }

    
}
