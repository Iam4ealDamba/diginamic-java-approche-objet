package fr.diginamic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.models.Ville;

public class TriFichier {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<Ville> villes = new ArrayList<>();
    File file = new File("src/fr/diginamic/files/recensement.csv");
    Scanner myReader = new Scanner(file);

    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      String[] arr = data.split(";");
      Ville ville = new Ville(arr[6], arr[2], arr[1], arr[9].replaceAll(" ", ""));
      villes.add(ville);
    }
    myReader.close();
    villes.remove(0);

    villes.sort((v1, v2) -> v1.compareTo(v2));
    System.out.println("Villes trieées par ordre alphabétique : ");
    for (Ville ville : villes) {
      System.out.println(ville.getNom());
    }
  }
}
