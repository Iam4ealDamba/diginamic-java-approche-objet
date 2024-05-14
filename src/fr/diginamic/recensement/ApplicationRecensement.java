package fr.diginamic.recensement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.recensement.models.Departement;
import fr.diginamic.recensement.models.Recensement;
import fr.diginamic.recensement.models.Region;
import fr.diginamic.recensement.models.Ville;
import fr.diginamic.recensement.services.MenuService;

public class ApplicationRecensement {
  /** L'objet de la classe MenuService */

  public static void main(String[] args) throws FileNotFoundException {
    MenuService menuService = new MenuService();
    Recensement recensement = new Recensement(new ArrayList<>());
    File file_to_read = new File("src/fr/diginamic/recensement/assets/recensement.csv");
    Scanner reader = new Scanner(file_to_read);
    boolean quit_app = false;

    reader.nextLine();

    // Lecture du fichier
    while (reader.hasNextLine()) {
      String[] lines = reader.nextLine().split(";");
      Ville ville = new Ville(new Region(Integer.parseInt(lines[0].replaceAll(" ", "")), lines[1]),
          new Departement(lines[2]),
          lines[2] + lines[5], lines[6], Integer.parseInt(lines[9].replaceAll(" ", "")));
      recensement.getVilles().add(ville);
    }
    reader.close();

    // Debut de l'aplication
    System.out.println("********** Application Recensement Population **********");

    try {
      while (!quit_app) {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        System.out.println("********************************************************");
        System.out.println("Menu :");
        System.out.println("1. Population d'une ville");
        System.out.println("2. Population d'un departement");
        System.out.println("3. Population d'une region");
        System.out.println("4. Afficher les 10 regions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplées");
        System.out.println("6. Afficher les 10 villes les plus peuplées d'un departement");
        System.out.println("7. Afficher les 10 villes les plus peuplées d'une region");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Quitter");
        System.out.println("********************************************************\n\n");
        System.out.print("Veuillez choisir une option : ");
        choice = sc.nextLine();

        switch (choice) {
          case "1":
            menuService.getCityPopulation(recensement.getVilles());
            break;
          case "2":
            menuService.getDepartmentPopulation(recensement.getVilles());
            break;
          case "3":
            menuService.getRegionPopulation(recensement.getVilles());
            break;
          case "4":
            menuService.getPopularRegions(recensement.getVilles());
            break;
          case "5":
            menuService.getPopularDepartments(recensement.getVilles());
            break;
          case "6":
            menuService.getPopularCityByDepartments(recensement.getVilles());
            break;
          case "7":
            menuService.getPopularCityByRegions(recensement.getVilles());
            break;
          case "8":
            menuService.getPopularFrenchCities(recensement.getVilles());
            break;
          case "9":
            quit_app = true;
            System.out.println("\n********** Fin de l'application **********\n");
            break;
          default:
            break;
        }
      }
    } catch (Exception e) {
      System.out.println("\n\n********** Fin de l'application **********\n");
    }
  }
}
