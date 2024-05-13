package fr.diginamic.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreationMap {
  public static void main(String[] args) {
    Map<String, Integer> mapSalaires = new HashMap<String, Integer>() {
      {
        put("Paul", 1750);
        put("Hicham", 1825);
        put("Yu ", 2250);
        put("Ingrid ", 2015);
        put("Chantal ", 2418);
      }
    };

    System.out.println(mapSalaires.size());
  }
}
