package fr.diginamic.listes;

import java.util.ArrayList;

/**
 * CreationListe
 */
public class CreationListe {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 1; i <= 100; i++) {
      arr.add(i);
    }

    System.out.println(arr);
  }
}