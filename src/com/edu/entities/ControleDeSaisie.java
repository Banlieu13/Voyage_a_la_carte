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
public class ControleDeSaisie {

    public ControleDeSaisie() {
    }
    
    public boolean ControleEmail(String email){
        if (email.contains("@")&&email.contains(".")){
            return true;
        }else{
            return false;
        }
       
    }
    
    public boolean ControleCin(String cin){
        int c=1;
        try{
            c = Integer.parseInt(cin);
        }catch(Exception e){
            
        }
        if (cin.length()==8 && c>0 ){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ControleCrypto(String crypto){
        int c=1;
        try{
            c = Integer.parseInt(crypto);
        }catch(Exception e){
            
        }
        if (crypto.length()==3 && c>0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ControleNumDeCarte(String num){
         int c=1;
        try{
            c = Integer.parseInt(num);
        }catch(Exception e){
            
        }
        if (num.length()<14 && c>0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ControleBudget(String budg){
         int c=1;
        try{
            c = Integer.parseInt(budg);
        }catch(Exception e){
            
        }
        if (c>0){
            return true;
        }else{
            return false;
        }
    }
    
    
}
