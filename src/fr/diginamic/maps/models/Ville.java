package fr.diginamic.models;

public class Ville {
  private String nom;
  private String codeDepart;
  private String region;
  private String total_population;

  public Ville(String nom, String codeDepart, String region, String total_population) {
    this.nom = nom;
    this.codeDepart = codeDepart;
    this.region = region;
    this.total_population = total_population;
  }

  @Override
  public String toString() {
    return "{ \"nom\": \"" + nom + "\", \"codeDepart\": \"" + codeDepart + "\", \"region\": \"" + region
        + "\", \"total_population\":"
        + total_population + " }";
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

}