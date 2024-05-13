package fr.diginamic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreerFichier {
  public static void main(String[] args) throws IOException {
    File file = new File("src/fr/diginamic/files/recensement.csv");
    Scanner myReader = new Scanner(file);
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/fr/diginamic/files/recensement2.csv"));

    for (int i = 0; i < 100; i++) {
      String data = myReader.nextLine() + "\n";
      writer.write(data);
    }
    myReader.close();

    System.out.println("Le fichier à bien été créer !");
    writer.close();

  }
}
