package entites;

import entites2.Personne;

public class TestPersonne {
  public static void main(String[] args) {
    Personne personne = new Personne();
    personne.firstname = "Jean";
    personne.lastname = "Dupont";
    personne.adressePostale = new AdressePostale();
    personne.adressePostale.street_number = "10";
    personne.adressePostale.street = "rue de la paix";
    personne.adressePostale.zipcode = "75000";
    personne.adressePostale.city = "Paris";
  }
}
