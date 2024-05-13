package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class CreationEtManipulationMap {
  public static void main(String[] args) {
    HashMap<Integer, String> mapVilles = new HashMap<>() {
      {
        put(13, "Marseille");
        put(34, "Montpellier");
        put(44, "Nantes");
        put(75, "Paris");
        put(31, "Toulouse");
        put(59, "Lille");
        put(69, "Lyon");
        put(33, "Bordeaux");
      }
    };

    for (Entry<Integer, String> entry : mapVilles.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println("Taille: " + mapVilles.size());

  }
}
