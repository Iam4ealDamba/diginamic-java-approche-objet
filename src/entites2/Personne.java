package entites2;

import entites.AdressePostale;

public class Personne {

  public String firstname;
  public String lastname;
  public AdressePostale adressePostale;

  public Personne() {
  }

  public Personne(String firstname, String lastname, AdressePostale adressePostale) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.adressePostale = adressePostale;
  }

  public void getFirstname() {
    System.out.println(this.firstname);
  }

  public void getLastname() {
    System.out.println(this.lastname);
  }

  public void getAdress() {
    System.out.println(this.adressePostale);
  }

  public void getName() {
    System.out.println(this.firstname + " " + this.lastname.toUpperCase());
  }

  public Personne setFirstname(String new_firstname) {
    this.firstname = new_firstname;
    return this;
  }

  public Personne setLastname(String new_lastname) {
    this.lastname = new_lastname;
    return this;
  }

  public Personne setAdressPersonne(AdressePostale new_adresse) {
    this.adressePostale = new_adresse;
    return this;
  }

}
