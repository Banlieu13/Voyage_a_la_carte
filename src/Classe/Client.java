/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author MrBenrhouma
 */
public class Client {
    private String email;
    private long cin;
    private String nom ;
    private String prenom ;
    private String ville;
    private String password;
    
    
    public Client(String email, long cin, String nom, String prenom, String ville, String password) {
        this.email = email;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public long getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" + "email=" + email + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", password=" + password + '}';
    }
    
    
    
}
