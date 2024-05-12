package fr.diginamic.fichier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.models.Ville;

public class LectureFichier {
  public static void main(String[] args) throws IOException {
    ArrayList<Ville> villes = new ArrayList<>();
    ArrayList<Ville> villes_a_afficher = new ArrayList<>();
    File file = new File("src/fr/diginamic/files/recensement.csv");
    BufferedWriter new_file = new BufferedWriter(new FileWriter("src/fr/diginamic/files/new_recensement.json"));
    BufferedWriter new_file2 = new BufferedWriter(new FileWriter("src/fr/diginamic/files/new_recensement.csv"));
    Scanner myReader = new Scanner(file);

    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      String[] arr = data.split(";");
      Ville ville = new Ville(arr[6], arr[2], arr[1], arr[9].replaceAll(" ", ""));
      villes.add(ville);
    }
    myReader.close();
    villes_a_afficher.add(villes.get(0));

    for (int i = 1; i < villes.size(); i++) {
      if (Integer.parseInt(villes.get(i).getTotal_population()) > 25000) {
        Ville ville = villes.get(i);
        villes_a_afficher.add(ville);
      }
    }

    for (int i = 0; i < villes_a_afficher.size(); i++) {
      new_file2.write(villes_a_afficher.get(i).getNom() + ";" + villes_a_afficher.get(i).getCodeDepart() + ";"
          + villes_a_afficher.get(i).getRegion() + ";" + villes_a_afficher.get(i).getTotal_population() + ";\n");
    }
    villes_a_afficher.remove(0);
    new_file.write(villes_a_afficher.toString());

    new_file.close();
    new_file2.close();
  }
}
