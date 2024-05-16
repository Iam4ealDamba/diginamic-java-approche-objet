package fr.diginamic.testenumeration.models;

import fr.diginamic.testenumeration.enums.Continent;

public class Ville {
  private String nom;
  private String codeDepart;
  private String region;
  private String total_population;
  private Continent continent;

  public Ville(String nom, String codeDepart, String region, String total_population, Continent continent) {
    this.nom = nom;
    this.codeDepart = codeDepart;
    this.region = region;
    this.total_population = total_population;
    this.continent = continent;
  }

  @Override
  public String toString() {
    return "{ \"nom\": \"" + nom + "\", \"codeDepart\": \"" + codeDepart + "\", \"region\": \"" + region
        + "\", \"total_population\":"
        + total_population + ", \"continent\": " + continent.getLabel() + " }";
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setCodeDepart(String codeDepart) {
    this.codeDepart = codeDepart;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public void setTotal_population(int total_population) {
    this.total_population = String.valueOf(total_population);
  }

  public void setContinent(Continent continent) {
    this.continent = continent;
  }

  public String getNom() {
    return nom;
  }

  public String getCodeDepart() {
    return codeDepart;
  }

  public String getRegion() {
    return region;
  }

  public String getTotal_population() {
    return total_population;
  }

  public Continent getContinent() {
    return continent;
  }

}