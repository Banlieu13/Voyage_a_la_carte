/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.entities;

/**
 *
 * @author Commando
 */
public class privilegeAdmin {
     private int priv_annonce;
     private int priv_offre;
     private int priv_consulterfacture;
     private int priv_gererfacture;
     private int priv_responsable;
     private int priv_client;
     private int priv_alerte;
     private int priv_rapport;
     private int priv_stat;
     private int id_admin;
    
    
    public privilegeAdmin(){
        
    }

    public privilegeAdmin(int priv_annonce, int priv_offre, int priv_consulterfacture, int priv_gererfacture, int priv_responsable, int priv_client, int priv_alerte, int priv_rapport, int priv_stat, int id_admin) {
        this.priv_annonce = priv_annonce;
        this.priv_offre = priv_offre;
        this.priv_consulterfacture = priv_consulterfacture;
        this.priv_gererfacture = priv_gererfacture;
        this.priv_responsable = priv_responsable;
        this.priv_client = priv_client;
        this.priv_alerte = priv_alerte;
        this.priv_rapport = priv_rapport;
        this.priv_stat = priv_stat;
        this.id_admin = id_admin;
    }

    public int getPriv_annonce() {
        return priv_annonce;
    }

    public void setPriv_annonce(int priv_annonce) {
        this.priv_annonce = priv_annonce;
    }

    public int getPriv_offre() {
        return priv_offre;
    }

    public void setPriv_offre(int priv_offre) {
        this.priv_offre = priv_offre;
    }

    public int getPriv_consulterfacture() {
        return priv_consulterfacture;
    }

    public void setPriv_consulterfacture(int priv_consulterfacture) {
        this.priv_consulterfacture = priv_consulterfacture;
    }

    public int getPriv_gererfacture() {
        return priv_gererfacture;
    }

    public void setPriv_gererfacture(int priv_gererfacture) {
        this.priv_gererfacture = priv_gererfacture;
    }

    public int getPriv_responsable() {
        return priv_responsable;
    }

    public void setPriv_responsable(int priv_responsable) {
        this.priv_responsable = priv_responsable;
    }

    public int getPriv_client() {
        return priv_client;
    }

    public void setPriv_client(int priv_client) {
        this.priv_client = priv_client;
    }

    public int getPriv_alerte() {
        return priv_alerte;
    }

    public void setPriv_alerte(int priv_alerte) {
        this.priv_alerte = priv_alerte;
    }

    public int getPriv_rapport() {
        return priv_rapport;
    }

    public void setPriv_rapport(int priv_rapport) {
        this.priv_rapport = priv_rapport;
    }

    public int getPriv_stat() {
        return priv_stat;
    }

    public void setPriv_stat(int priv_stat) {
        this.priv_stat = priv_stat;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    
}
