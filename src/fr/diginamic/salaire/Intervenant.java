package fr.diginamic.salaire;

public abstract class Intervenant {
  // Properties
  protected String nom;
  protected String prenom;

  // Methodes
  protected abstract String getSalaire();
  public abstract void afficherDonnees();
}
