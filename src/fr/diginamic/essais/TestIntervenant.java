package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
  public static void main(String[] args) {
    Salarie salarie = new Salarie("Dupont", "Jean", 2000, "CDI");
    Pigiste pigiste = new Pigiste("Durand", "Pierre", 20, 150);
    System.out.println("*******************");
    salarie.afficherDonnees();
    System.out.println("*******************");
    pigiste.afficherDonnees();
  }
}
