package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
  private int journésTravailles;
  private int tjm;
  private String status = "Pigiste";

  public Pigiste(String nom, String prenom, int journésTravailles, int tjm) {
    super();
    this.nom = nom;
    this.prenom = prenom;
    this.journésTravailles = journésTravailles;
    this.tjm = tjm;
  }

  @Override
  protected String getSalaire() {
    return "Salaire Mensuel : " + (journésTravailles * tjm) + " euros";
  }

  @Override
  public void afficherDonnees() {
    System.out.println("Nom : " + nom);
    System.out.println("Prenom : " + prenom);
    System.out.println(getSalaire());
    System.out.println("Status : " + status);
  }
}
