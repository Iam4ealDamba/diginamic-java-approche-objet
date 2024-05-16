package fr.diginamic.testenumeration;

import fr.diginamic.testenumeration.enums.Saison;

public class TestEnumeration {
  public static void main(String[] args) {
    String nom = "ETE";
    String libelle = "Hiver";

    for (int i = 0; i < 4; i++) {
      System.out.println(Saison.values()[i].toString());
    }

    System.out.print("\n********************\n");

    for (Saison saison : Saison.values()) {
      if (saison.toString().equals(nom)) {
        System.out.println(saison.toString());
      }
    }

    System.out.print("\n********************\n");

    if (Saison.generateSaison(libelle).equals(Saison.HIVER)) {
      System.out.println(Saison.generateSaison(libelle).toString());
    }

  }

}
