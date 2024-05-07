package fr.diginamic.sets;

import java.util.HashSet;

import fr.diginamic.sets.models.Pays;

public class TestObjet {
  public static void main(String[] args) {
    HashSet<Pays> pays_list = new HashSet<>();
    pays_list.add(new Pays("USA", 325000000, 76329.58));
    pays_list.add(new Pays("France", 67000000, 40886.25));
    pays_list.add(new Pays("Allemagne", 83000000, 48717.99));
    pays_list.add(new Pays("UK", 65000000, 46125.26));
    pays_list.add(new Pays("Italie", 60000000, 34776.42));
    pays_list.add(new Pays("Japon", 125000000, 33823.57));
    pays_list.add(new Pays("Chine", 1400000000, 12720.22));
    pays_list.add(new Pays("Russie", 1400000000, 1527071));
    pays_list.add(new Pays("Inde", 1400000000, 2410.89));

    // Modifiez le pays qui a le PIB total le plus petit
    Pays paysLePlusPetit = pays_list.toArray(new Pays[0])[0];
    for (Pays pays : pays_list) {
      if (pays.getPibHabitant() < paysLePlusPetit.getPibHabitant()) {
        paysLePlusPetit = pays;
      }
    }
    System.out.println(paysLePlusPetit.getNom());

    // Supprimez le pays dont le PIB total est le plus petit
    pays_list.remove(paysLePlusPetit);
    System.out.println(pays_list);
  }
}
