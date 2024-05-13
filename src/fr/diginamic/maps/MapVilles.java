package fr.diginamic.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapVilles {
  public static void main(String[] args) throws FileNotFoundException {
    HashMap<String, String[]> villes = new HashMap<String, String[]>();
    File file = new File("src/fr/diginamic/maps/files/recensement.csv");
    Scanner scanner = new Scanner(file);

    scanner.nextLine();

    while (scanner.hasNextLine()) {
      String[] line = scanner.nextLine().split(";");
      villes.put(String.valueOf(villes.size() + 1), line);
    }

    System.out.println(Arrays.toString(villes.get("1")));

    String smallestCity = "1";
    for (Entry<String, String[]> ville : villes.entrySet()) {
      if (Integer.parseInt(ville.getValue()[9].replaceAll(" ", "")) < Integer
          .parseInt(villes.get(smallestCity)[9].replaceAll(" ", ""))) {
        smallestCity = ville.getKey();
      }
    }

    System.out.println("La ville la plus petite est : " + villes.get(smallestCity)[6]);
    villes.remove(smallestCity);
  }
}
