package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Salle 1", 100, 0, 0);
    theatre.inscrire(10, 100);
    theatre.inscrire(10, 100);
    theatre.inscrire(20, 200);
    theatre.inscrire(40, 300);
    theatre.inscrire(30, 300);
  }
}
