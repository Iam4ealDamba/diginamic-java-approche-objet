package fr.diginamic.maps.models;

public class Pays {
  private String Pays;
  private String nbHabitants;
  private String continent;

  public Pays(String pays, String nbHabitants, String continent) {
    Pays = pays;
    this.nbHabitants = nbHabitants;
    this.continent = continent;
  }

  public String getPays() {
    return Pays;
  }

  public String getNbHabitants() {
    return nbHabitants;
  }

  public String getContinent() {
    return continent;
  }

  public void setPays(String pays) {
    Pays = pays;
  }

  public void setNbHabitants(String nbHabitants) {
    this.nbHabitants = nbHabitants;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

}
