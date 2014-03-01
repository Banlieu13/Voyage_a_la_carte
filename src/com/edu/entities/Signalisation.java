/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

/**
 *
 * @author MrBenrhouma
 */
public class Signalisation {
    private int IdSig;
    private String sujet;
    private String type;
    private String E_mail;
    private String E_mailR;
    private int id_offre;
    private int id_annonce;
    private int id_dest;
    private int id_com;

    public Signalisation(String sujet, String type) {
        this.sujet = sujet;
        this.type = type;
    }

    public Signalisation() {
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }
    
    
    

    public int getId_offre() {
        return id_offre;
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public int getId_dest() {
        return id_dest;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    public void setId_dest(int id_dest) {
        this.id_dest = id_dest;
    }
    
    
    

    public String getE_mail() {
        return E_mail;
    }

    public String getE_mailR() {
        return E_mailR;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setE_mailR(String E_mailR) {
        this.E_mailR = E_mailR;
    }
   
    

    public int getIdSig() {
        return IdSig;
    }

    public String getSujet() {
        return sujet;
    }

    public String getType() {
        return type;
    }

    public void setIdSig(int IdSig) {
        this.IdSig = IdSig;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Signalisation{" + "IdSig=" + IdSig + ", sujet=" + sujet + ", type=" + type + '}';
    }
    
    
    
}
