package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import fr.diginamic.listes.models.Ville;

public class TestVilles {
  public static void main(String[] args) {
    ArrayList<Ville> villes = new ArrayList<Ville>(Arrays.asList(
        new Ville("Nice", 343000),
        new Ville("Carcassonne", 47800),
        new Ville("Narbonne", 53400),
        new Ville("Lyon", 484000),
        new Ville("Foix", 9700),
        new Ville("Pau", 77200),
        new Ville("Marseille", 850700),
        new Ville("Tarbes", 40600)));

    // Affichez la ville la plus peuplée
    Ville plusPopulee = villes.get(0);
    for (Ville ville : villes) {
      if (ville.getNg_habitant() > plusPopulee.getNg_habitant()) {
        plusPopulee = ville;
      }
    }
    System.out.println(plusPopulee);

    // Suppriomer la ville ma moins peuplée
    Ville moinsPopulee = villes.get(0);
    for (Ville ville : villes) {
      if (ville.getNg_habitant() < moinsPopulee.getNg_habitant()) {
        moinsPopulee = ville;
      }
    }
    villes.remove(moinsPopulee);
    System.out.println(villes);

    // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en
    // majuscules
    Iterator<Ville> iterator = villes.iterator();

    while (iterator.hasNext()) {
      Ville ville = iterator.next();
      if (ville.getNg_habitant() > 100000) {
        ville.setNom(ville.getNom().toUpperCase());
        villes.set(villes.indexOf(ville),ville);
      }
    }
    System.out.println(villes);
  }
}
