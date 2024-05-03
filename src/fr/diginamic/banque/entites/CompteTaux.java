package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
  private double taux;

  public CompteTaux(int numCompte, double solde, double taux) {
    super(numCompte, solde);
    this.taux = taux;
  }

  @Override
  public String toString() {
    String str = super.toString().replace('}', ' ').trim();
    return str + ", taux: " + taux + " }";
  }
}
