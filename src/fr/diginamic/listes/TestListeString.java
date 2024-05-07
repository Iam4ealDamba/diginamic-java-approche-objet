package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class TestListeString {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>(
        Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

    // Affichez le mots le plus long de la liste
    String largest = "";
    for (String string : arr) {
      if (string.length() > largest.length()) {
        largest = string;
      }
    }
    System.out.println(largest);

    // Modifiez le contenu de la liste de manière à mettre tous les noms de villes
    // en majuscules.
    arr = (ArrayList<String>) arr.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println(arr);

    // Supprimez de la liste les villes dont le nom commence par la lettre N.
    Iterator<String> iterator = arr.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().charAt(0) == 'N') {
        iterator.remove();
      }
    }
    System.out.println(arr);
  }
}
