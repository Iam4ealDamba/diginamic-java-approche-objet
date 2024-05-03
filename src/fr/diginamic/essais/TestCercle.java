package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {
  public static void main(String[] args) {
    Cercle cercle1 = new Cercle(5);
    Cercle cercle2 = new Cercle(10);

    System.out
        .println("Cercle 1 : { perimetre: " + cercle1.getPerimetre() + ", surface: " + cercle1.getSurface() + " }");
    System.out
        .println("Cercle 2 : { perimetre: " + cercle2.getPerimetre() + ", surface: " + cercle2.getSurface() + " }");
  }
}
