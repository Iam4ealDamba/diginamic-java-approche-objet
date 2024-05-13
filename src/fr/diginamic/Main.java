package fr.diginamic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import fr.diginamic.interfaces.CSV;
import fr.diginamic.models.Ville;

public class Main {
  public static void main(String[] args) throws IOException {
    ArrayList<Ville> villes = new ArrayList<>();
    File file = new File("src/fr/diginamic/files/recensement.csv");
    String data = "";
    BufferedWriter new_file = new BufferedWriter(new FileWriter("src/fr/diginamic/files/villes_final.csv"));
    Scanner read_file = new Scanner(file);

    while (read_file.hasNextLine()) {
      String[] lines = read_file.nextLine().split(";");
      villes.add(new Ville(lines[6], lines[2], lines[1], lines[9]));
    }
    read_file.close();

    for (Ville ville : villes) {
      Class<? extends Ville> classe = ville.getClass();
      Field[] fields = classe.getDeclaredFields();

      for (Field field : fields) {
        if (field.isAnnotationPresent(CSV.class)) {
          CSV annotation = field.getAnnotation(CSV.class);
          switch (annotation.ordre()) {
            case 1:
              data += annotation.enteteCollone() + ";";
              break;
            case 2:
              data += annotation.enteteCollone() + ";";
              break;
            case 3:
              data += annotation.enteteCollone() + ";";
              break;
            case 4:
              data += annotation.enteteCollone() + ";";
              break;
            default:
              break;
          }
        }
      }
      data += "\n";
      break;
    }

    for (Ville ville : villes) {
      Class<? extends Ville> classe = ville.getClass();
      Field[] fields = classe.getDeclaredFields();

      for (Field field : fields) {
        if (field.isAnnotationPresent(CSV.class)) {
          CSV annotation = field.getAnnotation(CSV.class);

          if (field.getName() == "nom") {
            data += ville.getNom() + ";";
          }
          if (field.getName() == "total_population") {
            data += ville.getTotal_population() + ";";
          }

          if (field.getName() == "codeDepart") {
            data += ville.getCodeDepart() + ";";
          }

          if (field.getName() == "region") {
            data += ville.getRegion() + ";";
          }
        }
      }

      data += "\n";
    }

    new_file.write(data);
    new_file.close();
    System.out.println("Done");
  }
}
