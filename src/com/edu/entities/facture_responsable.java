/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

import java.util.Date;

/**
 *
 * @author omar
 */
public class facture_responsable {
    private int id ;
    private Date  date;
    private  int TVA;
    private  Double Total;
    private  int id_offre;
    private String id_agence;
  private String id_client;

   public facture_responsable() {
    }
     
  
    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public String getId_client() {
        return id_client;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTVA() {
        return TVA;
    }

    public void setTVA(int TVA) {
        this.TVA = TVA;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getId_agence() {
        return id_agence;
    }

    public void setId_agence(String id_agence) {
        this.id_agence = id_agence;
    }

    
    
    
     public facture_responsable(int id, Date  date, int TVA, Double Total, int id_offre, String id_agence,String id_client) {
        this.id = id;
        this.date = date;
        this.TVA =TVA;
        this.Total = Total;
        this.id_offre = id_offre;
        this.id_agence = id_agence;
    }

   
    
}
