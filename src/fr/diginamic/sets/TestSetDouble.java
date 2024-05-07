package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {
  public static void main(String[] args) {
    HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
    System.out.println(set);

    // Afficher le plus grand
    System.out.println(set.stream().mapToDouble(v -> v).max().getAsDouble());

    // Supprimer le plus petit
    set.remove(set.stream().mapToDouble(v -> v).min().getAsDouble());
    System.out.println(set);
  }
}
