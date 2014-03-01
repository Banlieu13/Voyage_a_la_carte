/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.sql.Date;

/**
 *
 * @author MrBenrhouma
 */
public class Destination {
    private int IdDest;
    private String trajetD;
    private String hebergement;
   private static  String programme;
    private static String MoyTransp;
    private static double budget;
    private String E_mail;
    //private Destination Dest;

    public Destination(String trajet, String hebergement, String programme, String MoyTransp, double budget) {
       
        this.trajetD = trajetD;
        this.hebergement = hebergement;
        this.programme = programme;
        this.MoyTransp = MoyTransp;
        this.budget = budget;
    }

    public Destination() {
    
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }
    
    
    

    public int getIdDest() {
        return IdDest;
    }

    public String getTrajetD() {
        return trajetD;
    }

    public String getHebergement() {
        return hebergement;
    }

    public String getProgramme() {
        return programme;
    }

    public String getMoyTransp() {
        return MoyTransp;
    }

    public double getBudget() {
        return budget;
    }

    public void setIdDest(int IdDest) {
        this.IdDest = IdDest;
    }

    public void setTrajetD(String trajet) {
        this.trajetD = trajetD;
    }

    public void setHebergement(String hebergement) {
        this.hebergement = hebergement;
    }

    
     public static void setProgramme(String programme) {
        Destination.programme = programme;
    }

    public static void setMoyTransp(String MoyTransp) {
        Destination.MoyTransp = MoyTransp;
    }

    public static void setBudget(double budget) {
        Destination.budget = budget;
    }

   /* public Destination getDest() {
        return Dest;
    }

    public void setDest(Destination Dest) {
        this.Dest = Dest;
    }
*/
    @Override
    public String toString() {
        return "Destination{" + "IdDest=" + IdDest + ", trajet=" + trajetD + ", hebergement=" + hebergement + ", programme=" + programme + ", MoyTransp=" + MoyTransp + ", budget=" + budget + '}';
    }

    
    
}
