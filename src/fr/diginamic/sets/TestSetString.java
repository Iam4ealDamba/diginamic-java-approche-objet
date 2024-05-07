package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {
  public static void main(String[] args) {
    HashSet<String> pays = new HashSet<String>(
        Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

    pays.remove(pays.stream().max((s1, s2) -> s1.length() - s2.length()).get());
    System.out.println(pays);
  }
}
