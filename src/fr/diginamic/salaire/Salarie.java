package fr.diginamic.salaire;

import java.text.DecimalFormat;

public class Salarie extends Intervenant {
  private double salaire_mensuel;
  private String status;

  public Salarie(String nom, String prenom, double salaire_mensuel, String status) {
    super();
    this.nom = nom;
    this.prenom = prenom;
    this.salaire_mensuel = salaire_mensuel;
    this.status = status;
  }

  @Override
  protected String getSalaire() {
    DecimalFormat df = new DecimalFormat("#");
    return "Salarie Mensuel : " + df.format(salaire_mensuel) + " euros";
  }

  @Override
  public void afficherDonnees() {
    System.out.println("Nom : " + nom);
    System.out.println("Prenom : " + prenom);
    System.out.println(getSalaire());
    System.out.println("Status : " + status);
  }
}
