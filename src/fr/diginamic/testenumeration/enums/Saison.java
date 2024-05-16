package fr.diginamic.testenumeration.enums;

public enum Saison {
  PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

  private String label;
  private int order;

  private Saison(String label, int ordre) {
    this.label = label;
    this.order = ordre;
  }

  public static Saison generateSaison(String label) {
    for (Saison s : Saison.values()) {
      if (s.label.equals(label)) {
        return s;
      }
    }
    return null;
  }
}
