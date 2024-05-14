package fr.diginamic.recensement.models;

public class Ville {
  private Region region;
  private Departement departement;
  private String code_commune;
  private String nom_commune;
  private int total_population;

  /**
   * Constructor
   * 
   * @param code_region
   * @param nom_region
   * @param code_departement
   * @param code_commune
   * @param nom_commune
   * @param total_population
   */
  public Ville(Region region, Departement departement, String code_commune, String nom_commune,
      int total_population) {
    this.region = region;
    this.departement = departement;
    this.code_commune = code_commune;
    this.nom_commune = nom_commune;
    this.total_population = total_population;
  }

  public Region getRegion() {
    return this.region;
  }

  public Departement getDepartement() {
    return this.departement;
  }

  public String getCodeCommune() {
    return code_commune;
  }

  public String getNomCommune() {
    return nom_commune;
  }

  public int getPopulation() {
    return total_population;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public void setDepartement(Departement departement) {
    this.departement = departement;
  }

  public void setCodeCommune(String code_commune) {
    this.code_commune = code_commune;
  }

  public void setNomCommune(String nom_commune) {
    this.nom_commune = nom_commune;
  }

  public void setPopulation(int total_population) {
    this.total_population = total_population;
  }

  @Override
  public String toString() {
    return "{ \"code_region\": \" " + this.region.getCode_region()
        + " \", \"nom_region\": \"\"" + this.region.getNom_region() + " \"\", \"code_departement\": \"\""
        + this.departement.getCodeDepartement()
        + " \"\", \"code_commune\": \"\"" + this.code_commune + " \"\", \"nom_commune\": \"\"" + this.nom_commune
        + " \"\", \"total_population\": \"\"" + this.total_population + " \"\" }";
  }
}
