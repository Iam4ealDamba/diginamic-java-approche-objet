package entites;

import entites2.Personne;

public class TestPersonne {
  public static void main(String[] args) {
    Personne personne = new Personne();
    personne.setFirstname("Pierre").setLastname("Durand")
        .setAdressPersonne(new AdressePostale("10", "rue de la paix", "75000", "Paris")).getName();
  }
}
