package fr.diginamic.banque.entites;

public class Credit extends Operation {

  public Credit(String date, double montant) {
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
    return "CREDIT";
  }
}
