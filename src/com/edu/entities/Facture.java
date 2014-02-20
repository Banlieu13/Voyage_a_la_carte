/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.entities;


/**
 *
 * @author wael ben jemaa
 */

public class Facture {
  // Nombre maximum de lignes par défaut
  private static int NB_MAX_LIGNES = 10;
  private static int numeroCourant = 0;
  private String client, date;
  private Ligne[] lignes;
  /** Nombre de lignes dans la facture */
  private int nbLignes = 0;
  /** Numéro de la facture */
  private int numero = 0;

    public Facture() {
    }


  public Facture(String client, String date, int nbLignes) {
    this.client = client;
    this.date = date;
    this.lignes = new Ligne[nbLignes];
    numero = ++numeroCourant;
  }

  public Facture(String client, String date) {
    this(client, date, NB_MAX_LIGNES);
  }

  public void ajouterLigne(Offre offre, int quantite) {
    lignes[nbLignes++] = new Ligne(offre, quantite);
  }

  public double getPrixTotal() {
    double pt = 0;
    for (int i = 0; i < nbLignes; i++) {
      pt += lignes[i].prixTotal();
    }
    return pt;
  }

  // Nécessite le JDK 5
  public void afficheToi() {
    System.out.printf("Facture numéro %d ; Client : %s ; Date : %s %n",
		       numero, client, date);
    System.out.printf("%7s | %6s | %20s | %20s | %10s | %10s %n",
		       "Quant.", "Réf.", "Nom", "Marque", "PU", "PT");
    for (int i = 0; i < nbLignes; i++) {
      lignes[i].afficheToi();
    }
    System.out.printf("%56s Prix total facture : %10.2f", "", getPrixTotal());
  }

  @Override
  public String toString() {
    String descript = 
      "Facture " + numero + ";Client=" + client + ";Date=" + date + "\n";
    for (int i = 0; i < nbLignes; i++) {
      descript += lignes[i] + "\n";
    }
    descript += "Prix total Facture=" + getPrixTotal();
    return descript;
  }
}
class Ligne {
  private Offre offre;
  private int npers;

  Ligne(Offre offre, int npers ) {
    this.offre = offre;
    this.npers = npers;
  }

  Offre getOffre() {
    return offre;
  }

  int getNpres() {
    return npers;
  }

  // Nécessite le JDK 5
  void afficheToi() {
    System.out.printf("%7d | %6s | %20.20s | %20.20s | %10.2f | %10.2f %n",
		      npers, offre.getCircuit(), 
		      offre.getDate(), 
		      offre.getHotel(), 
                      offre.getPrix(), prixTotal());
  }

  double prixTotal() {
    return offre.getPrix() * npers;
  }
    
  @Override
  public String toString() {
    return npers + " " + offre;
  }   
}