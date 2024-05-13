package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import fr.diginamic.maps.models.Pays;

public class ComptagePaysParContinent {
  public static void main(String[] args) {
    ArrayList<Pays> listePays = new ArrayList<>(Arrays.asList(
        new Pays("France", "65 millions", "Europe"), new Pays("Allemagne", "80 millions", "Europe"),
        new Pays("Belgique", "10 millions", "Europe"), new Pays("Russie", "150 millions", "Asie"),
        new Pays("Chine", "1.4 milliards", "Asie"), new Pays("Indonésie", "220 millions", "Océanie"),
        new Pays("Australie", "20 millions", "Océanie")));
    HashMap<String, Integer> pays_map = new HashMap<>();

    for (Pays pays : listePays) {
      int counter = (int) listePays.stream().filter(p -> p.getContinent() == pays.getContinent()).count();
      pays_map.put(pays.getContinent(), counter);
    }
    System.out.println(pays_map);
  }
}
