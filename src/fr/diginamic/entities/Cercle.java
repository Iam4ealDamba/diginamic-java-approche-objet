package fr.diginamic.entities;

public class Cercle {
  double rayon;

  public Cercle(double rayon) {
    this.rayon = rayon;
  }

  public double getPerimetre() {
    double diametre = this.rayon * 2;
    return Math.PI * diametre;
  }

  public double getSurface() {
    return Math.PI * Math.pow(this.rayon, 2);
  }
}
