package entites;

/**
 * AdressePostale
 */
public class AdressePostale {

  public String street_number;
  public String street;
  public String zipcode;
  public String city;

  public AdressePostale(String street_number, String street, String zipcode, String city) {
    this.street_number = street_number;
    this.street = street;
    this.zipcode = zipcode;
    this.city = city;
  }

}