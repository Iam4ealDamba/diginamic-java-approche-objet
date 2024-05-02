package entites;

public class TestAdressePostale {
  public static void main(String[] args) {
    AdressePostale adresse1 = new AdressePostale();
    adresse1.street_number = "10";
    adresse1.street = "rue de la paix";
    adresse1.zipcode = "75000";
    adresse1.city = "Paris";

    AdressePostale adresse2 = new AdressePostale();
    adresse2.street_number = "10";
    adresse2.street = "rue de la paix";
    adresse2.zipcode = "75000";
    adresse2.city = "Paris";
  }
}
