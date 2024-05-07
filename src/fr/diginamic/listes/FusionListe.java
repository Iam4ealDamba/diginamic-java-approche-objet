package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
  public static void main(String args[]) {
    List<String> liste1 = new ArrayList<String>();
    List<String> liste2 = new ArrayList<String>();
    List<String> liste3 = new ArrayList<String>();

    liste1.add("Rouge");
    liste1.add("Vert");
    liste1.add("Orange");

    liste2.add("Blanc");
    liste2.add("Bleu");
    liste2.add("Orange");

    for (int i = 0; i < 3; i++) {
      liste3.add(liste1.get(i));
      liste3.add(liste2.get(i));
    }

    System.out.println(liste3);
  }
}