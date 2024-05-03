package fr.diginamic.banque.entites;

public abstract class Operation {
  String date;
  double montant;

  public Operation(String date, double montant) {
    this.date = date;
    this.montant = montant;
  }

  public abstract Double getMontant();

  public abstract String getType();
}
