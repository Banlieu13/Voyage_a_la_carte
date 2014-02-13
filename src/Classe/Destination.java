/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author MrBenrhouma
 */
public class Destination {
    private int IdDest;
    private String trajet;
    private String hebergement;
    private String programme;
    private String MoyTransp;
    private double budget;

    public Destination(String trajet, String hebergement, String programme, String MoyTransp, double budget) {
       
        this.trajet = trajet;
        this.hebergement = hebergement;
        this.programme = programme;
        this.MoyTransp = MoyTransp;
        this.budget = budget;
    }
    
    
    

    public int getIdDest() {
        return IdDest;
    }

    public String getTrajet() {
        return trajet;
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

    public void setTrajet(String trajet) {
        this.trajet = trajet;
    }

    public void setHebergement(String hebergement) {
        this.hebergement = hebergement;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setMoyTransp(String MoyTransp) {
        this.MoyTransp = MoyTransp;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Destination{" + "IdDest=" + IdDest + ", trajet=" + trajet + ", hebergement=" + hebergement + ", programme=" + programme + ", MoyTransp=" + MoyTransp + ", budget=" + budget + '}';
    }
    
    
    
}
