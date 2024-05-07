package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestListeInt {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
    System.out.println(arr);
    System.out.println(arr.size());
    System.out.println(arr.stream().mapToInt(v -> v).max().getAsInt());

    // Supprimez le plus petit élément de la liste et affichez le résultat
    System.out.println(arr.remove(arr.indexOf(arr.stream().mapToInt(v -> v).min().getAsInt())));

    // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils
    // deviennent positifs.
    arr = (ArrayList<Integer>) arr.stream().map(v -> v < 0 ? v * -1 : v).collect(Collectors.toList());

    System.out.println(arr);
  }
}
