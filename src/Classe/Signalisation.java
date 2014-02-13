/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author MrBenrhouma
 */
public class Signalisation {
    private int IdSig;
    private String sujet;
    private String type;

    public Signalisation(String sujet, String type) {
        this.sujet = sujet;
        this.type = type;
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
