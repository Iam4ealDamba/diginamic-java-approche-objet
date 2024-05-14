package fr.diginamic.recensement.models;

public class Departement {
  private String code_departement;

  public Departement(String code_departement) {
    this.code_departement = code_departement;
  }

  public String getCodeDepartement() {
    return code_departement;
  }

  public void setCodeDepartement(String code_departement) {
    this.code_departement = code_departement;
  }

}
