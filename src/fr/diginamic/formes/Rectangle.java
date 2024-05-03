package fr.diginamic.formes;

public class Rectangle extends Forme {
  private double longeur;
  private double largeur;

  public Rectangle(double longeur, double largeur) {
    super();
    this.longeur = longeur;
    this.largeur = largeur;
  }

  @Override
  public void calculerSurface() {
    System.out.println("Surface du rectangle : " + (longeur * largeur));
  }

  @Override
  public void calculerPerimetre() {
    System.out.println("Perimetre du rectangle : " + ((longeur + 2) + (largeur + 2)));
  }

}
