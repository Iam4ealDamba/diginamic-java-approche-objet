package fr.diginamic.banque.entites;

public class Compte {
  private int numCompte;
  private double solde;

  public Compte(int numCompte, double solde) {
    this.numCompte = numCompte;
    this.solde = solde;
  }

  @Override
  public String toString() {
    return "{ numCompte: " + numCompte + ", solde: " + solde + " }";
  }

}
