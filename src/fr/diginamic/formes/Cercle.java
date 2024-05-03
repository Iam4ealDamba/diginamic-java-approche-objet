package fr.diginamic.formes;

public class Cercle extends Forme {
  private double rayon;

  public Cercle(double rayon) {
    super();
    this.rayon = rayon;
  }

  @Override
  public void calculerSurface() {
    System.out.println("Surface du cercle : " + Math.PI * Math.pow(rayon, 2));
  }

  @Override
  public void calculerPerimetre() {
    double diametre = rayon * 2;
    System.out.println("Perimetre du cercle : " + Math.PI * diametre);
  }
}
