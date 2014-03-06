/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;

/**
 *
 * @author MrBenrhouma
 */
public class Commentaire {
    private  int id;
    private String comm;
    private String E_mail;
    private int id_offre;
    private int id_annonce;
    private int id_dest;

    public int getId_dest() {
        return id_dest;
    }

    public void setId_dest(int id_dest) {
        this.id_dest = id_dest;
    }
    
    
    
    public Commentaire() {
    }

    public int getId() {
        return id;
    }

    public String getComm() {
        return comm;
    }

    public String getE_mail() {
        return E_mail;
    }

    public int getId_offre() {
        return id_offre;
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }
    
    
    
    
}
