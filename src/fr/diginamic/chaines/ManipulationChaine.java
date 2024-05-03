package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {
  public static void main(String[] args) {
    String chaine = "Durand;Marcel;2 523.5";
    char premierCaractere = chaine.charAt(0);
    int chaine_length = chaine.length();
    int index_of_semicolon = chaine.indexOf(';');
    String lastname = chaine.substring(0, index_of_semicolon);
    String lastname_upper = lastname.toUpperCase();
    String lastname_lower = lastname.toLowerCase();
    String[] chaine_split = chaine.split(";");
    Salarie new_salarie = new Salarie(chaine_split[0], chaine_split[1],
        Double.parseDouble(chaine_split[2].replace(" ", "")));

    System.out.println("Premier caractere : " + premierCaractere);
    System.out.println("Longueur de la chaine : " + chaine_length);
    System.out.println("Index du dernier ';' : " + index_of_semicolon);
    System.out.println("Nom de famille : " + lastname);
    System.out.println("Nom de famille en majuscules : " + lastname_upper);
    System.out.println("Nom de famille en minuscules : " + lastname_lower);
    System.out.println("Chaine splittée : " + Arrays.toString(chaine_split));
    System.out.println(new_salarie);

  }
}
