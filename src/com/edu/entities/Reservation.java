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

    public Reservation() {
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
