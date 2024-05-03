package fr.diginamic.formes;

public class Carre extends Rectangle {
  private double longeur;

  public Carre(double longeur) {
    super(longeur, longeur);
    this.longeur = longeur;
  }
}
