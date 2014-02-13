/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author MrBenrhouma
 */
public class Agence {
    private int IdAg;
    private String adresse;
    private String matFiscale;

    public Agence(String adresse, String matFiscale) {
       
        this.adresse = adresse;
        this.matFiscale = matFiscale;
    }

    
    
    
    public int getIdAg() {
        return IdAg;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMatFiscale() {
        return matFiscale;
    }

    public void setIdAg(int IdAg) {
        this.IdAg = IdAg;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMatFiscale(String matFiscale) {
        this.matFiscale = matFiscale;
    }

    @Override
    public String toString() {
        return "Agence{" + "IdAg=" + IdAg + ", adresse=" + adresse + ", matFiscale=" + matFiscale + '}';
    }
    
    
}
