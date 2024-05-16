package fr.diginamic.testenumeration;

import java.util.ArrayList;

import fr.diginamic.testenumeration.enums.Continent;
import fr.diginamic.testenumeration.models.Ville;

public class TestContinentAvecEnum {
  public static void main(String[] args) {
    ArrayList<Ville> villes = new ArrayList<>();

    villes.add(new Ville("New York", "NY", "Etats-Unis", "8 000 000", Continent.AMERICA));
    villes.add(new Ville("Paris", "PA", "Europe", "2 000 000", Continent.EUROPE));
    villes.add(new Ville("Pékin", "PE", "Asie", "1 000 000", Continent.ASIA));
    villes.add(new Ville("Moscou", "MO", "Asie", "1 000 000", Continent.ASIA));
    villes.add(new Ville("Berlin", "BE", "Europe", "3 000 000", Continent.EUROPE));
    villes.add(new Ville("Sydney", "SY", "Amerique", "1 000 000", Continent.AMERICA));
    villes.add(new Ville("São Paulo", "SP", "Amerique", "1 000 000", Continent.AMERICA));
    villes.add(new Ville("Dakar", "DA", "Afrique", "1 000 000", Continent.AFRICA));

    villes.forEach(ville -> System.out.println(ville));
  }
}
