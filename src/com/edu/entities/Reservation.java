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
public class Reservation {
    private int IdRes;
    private Date date = new Date();
     private static String	typeDeCarte;
    private int numCarte ;
   private static String DateValidité;
  private String Cryptogrammevisuel ;

    public Reservation() {
    }

    public String getTypeDeCarte() {
        return typeDeCarte;
    }

    public static  void setTypeDeCarte(String typeDeCarte) {
        Reservation.typeDeCarte = typeDeCarte;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public String getDateValidité() {
        return DateValidité;
    }

    public static void setDateValidité(String DateValidité) {
       Reservation.DateValidité = DateValidité;
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
