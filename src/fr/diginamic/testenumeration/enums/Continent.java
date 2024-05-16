package fr.diginamic.testenumeration.enums;

public enum Continent {
  EUROPE("Europe"), AFRICA("Afrique"), ASIA("Asie"), AMERICA("Amerique"), OCEANIA("Oceanie");

  private String label;

  Continent(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
