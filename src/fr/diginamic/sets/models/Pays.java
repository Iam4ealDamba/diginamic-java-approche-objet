package fr.diginamic.sets.models;

public class Pays {
  private String nom;
  private int nbHabitants;
  private double pibHabitant;

  public Pays(String nom, int nbHabitants, double pibHabitant) {
    this.nom = nom;
    this.nbHabitants = nbHabitants;
    this.pibHabitant = pibHabitant;
  }

  public String getNom() {
    return nom;
  }

  public int getNbHabitants() {
    return nbHabitants;
  }

  public double getPibHabitant() {
    return pibHabitant;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setNbHabitants(int nbHabitants) {
    this.nbHabitants = nbHabitants;
  }

  public void setPibHabitant(double pibHabitant) {
    this.pibHabitant = pibHabitant;
  }

  @Override
  public String toString() {
    return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibHabitant=" + pibHabitant + "]\n";
  }

}
