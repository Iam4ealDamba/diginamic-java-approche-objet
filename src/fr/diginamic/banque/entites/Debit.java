package fr.diginamic.banque.entites;

public class Debit extends Operation {

  public Debit(String date, double montant) {
    super(date, montant);
  }

  @Override
  public Double getMontant() {
    return montant;
  }

  @Override
  public String toString() {
    return "{ date: " + date + ", montant: " + montant + ", type: " + this.getType() + " }";
  }

  @Override
  public String getType() {
    return "DEBIT";
  }

}