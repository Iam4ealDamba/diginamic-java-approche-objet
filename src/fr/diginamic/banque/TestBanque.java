package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
  public static void main(String[] args) {
    Compte[] comptes = { new Compte(123456, 5000), new CompteTaux(123457, 5000, 0.5) };

    for (Compte compte : comptes) {
      System.out.println(compte);
    }
  }
}
