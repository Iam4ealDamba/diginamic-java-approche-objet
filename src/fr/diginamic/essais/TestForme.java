package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
  public static void main(String[] args) {
    Cercle cercle = new Cercle(5);
    Rectangle rectangle = new Rectangle(2, 3);
    Carre carre = new Carre(5);
    AffichageForme affichageForme = new AffichageForme();

    affichageForme.afficher(cercle);
    affichageForme.afficher(rectangle);
    affichageForme.afficher(carre);
  }
}
