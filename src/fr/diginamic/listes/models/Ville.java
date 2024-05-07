package fr.diginamic.listes.models;

public class Ville {
  private String nom;
  private int ng_habitant;

  public Ville(String nom, int ng_habitant) {
    this.nom = nom;
    this.ng_habitant = ng_habitant;
  }

  public String getNom() {
    return nom;
  }

  public int getNg_habitant() {
    return ng_habitant;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setNg_habitant(int ng_habitant) {
    this.ng_habitant = ng_habitant;
  }

  @Override
  public String toString() {
    return "Ville [nom=" + nom + ", ng_habitant=" + ng_habitant + "]\n";
  }

}
