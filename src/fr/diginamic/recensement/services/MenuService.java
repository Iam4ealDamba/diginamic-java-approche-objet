package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import fr.diginamic.recensement.models.Departement;
import fr.diginamic.recensement.models.Region;
import fr.diginamic.recensement.models.Ville;
import fr.diginamic.recensement.services.interfaces.MenuServiceInterface;

public class MenuService implements MenuServiceInterface {

  @Override
  public void getCityPopulation(ArrayList<Ville> villes) {
    try {
      Scanner sc = new Scanner(System.in);
      String town_code = "";
      String selected_ville = "";

      System.out.print("Entrer le code d'une commune (code departement + code commune) : ");
      town_code = sc.nextLine().toLowerCase();

      for (int i = 0; i < villes.size(); i++) {
        if (villes.get(i).getCodeCommune().equals(town_code)) {
          selected_ville = villes.get(i).getNomCommune();
          break;
        }
      }

      if (selected_ville.length() == 0) {
        System.out.println("cette ville n'existe pas dans la liste.\n");
      } else {
        final String search_str = selected_ville;
        Ville ville = villes.stream().filter(v -> v.getNomCommune().equals(search_str)).findFirst().get();
        System.out.println(
            "Population de " + ville.getNomCommune() + " : " + ville.getPopulation());
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getDepartmentPopulation(ArrayList<Ville> villes) {
    try {
      Scanner sc = new Scanner(System.in);
      String depart_code = "";
      int total_population = 0;

      System.out.print("Entrer un code departement : ");
      depart_code = sc.nextLine().toLowerCase();

      for (int i = 0; i < villes.size(); i++) {
        if (villes.get(i).getDepartement().getCodeDepartement().equals(depart_code)) {
          total_population += villes.get(i).getPopulation();
        }
      }

      if (total_population == 0) {
        System.out.println("Ce département n'existe pas dans la liste.\n");
      } else {
        System.out.println(
            "Population du département " + depart_code + " : " + total_population);
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getRegionPopulation(ArrayList<Ville> villes) {
    try {
      Scanner sc = new Scanner(System.in);
      int region_code = 0;
      int total_population = 0;

      System.out.print("Entrer un code region : ");
      region_code = sc.nextInt();
      System.out.println();

      for (int i = 0; i < villes.size(); i++) {
        if (villes.get(i).getRegion().getCode_region() == region_code) {
          total_population += villes.get(i).getPopulation();
        }
      }

      if (total_population == 0) {
        System.out.println("Cette region n'existe pas dans la liste.\n");
      } else {
        System.out.println(
            "Population de la région " + (region_code < 10 ? ("0" + region_code)
                : (region_code)) + " : " + total_population);
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getPopularRegions(ArrayList<Ville> villes) {
    try {
      HashMap<Integer, Integer> best_region = new HashMap<>();
      ArrayList<Entry<Integer, Integer>> best_region_list = new ArrayList<>();

      for (Region region : (List<Region>) villes.stream().map(v -> v.getRegion()).collect(Collectors.toList())) {
        int counter = 0;

        for (int i = 0; i < villes.size(); i++) {
          if (villes.get(i).getRegion().getCode_region() == region.getCode_region()) {
            counter += villes.get(i).getPopulation();
          }
        }

        best_region.put(region.getCode_region(), counter);
      }
      for (int i = 0; i < 10; i++) {
        Entry<Integer, Integer> occ = best_region.entrySet().stream().max((v1, v2) -> v1.getValue() - v2.getValue())
            .get();
        best_region_list.add(occ);
        best_region.remove(occ.getKey());
      }

      best_region_list.sort((v1, v2) -> v2.getValue() - v1.getValue());
      System.out.println("Les 10 régions les plus peuplées sont:");
      best_region_list.forEach(
          (entry) -> System.out.println("- La region " + entry.getKey() + " : " + entry.getValue() + " habitants"));
      System.out.println();
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getPopularDepartments(ArrayList<Ville> villes) {
    try {
      HashMap<String, Integer> best_depart = new HashMap<>();
      ArrayList<Entry<String, Integer>> best_region_list = new ArrayList<>();

      for (Departement departement : (List<Departement>) villes.stream().map(v -> v.getDepartement())
          .collect(Collectors.toList())) {
        int counter = 0;

        for (int i = 0; i < villes.size(); i++) {
          if (villes.get(i).getDepartement().getCodeDepartement() == departement.getCodeDepartement()) {
            counter += villes.get(i).getPopulation();
          }
        }

        best_depart.put(departement.getCodeDepartement(), counter);
      }
      for (int i = 0; i < 10; i++) {
        Entry<String, Integer> occ = best_depart.entrySet().stream().max((v1, v2) -> v1.getValue() - v2.getValue())
            .get();
        best_region_list.add(occ);
        best_depart.remove(occ.getKey());
      }

      best_region_list.sort((v1, v2) -> v2.getValue() - v1.getValue());
      System.out.println("Les 10 départements les plus peuplées sont:");
      best_region_list.forEach(
          (entry) -> System.out
              .println("- Le département " + entry.getKey() + " : " + entry.getValue() + " habitants"));
      System.out.println();
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getPopularFrenchCities(ArrayList<Ville> villes) {
    List<Ville> villes_list = new ArrayList<>(villes);
    List<Ville> villes_populaires = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      Ville ville = villes_list.stream().max((v1, v2) -> v1.getPopulation() - v2.getPopulation()).get();
      villes_populaires.add(ville);
      villes_list.remove(ville);
    }

    villes_populaires.forEach(ville -> System.out.println(ville.getNomCommune() + " (" + ville.getPopulation() + ")"));
  }

  @Override
  public void getPopularCityByDepartments(ArrayList<Ville> villes) {
    try {
      Scanner sc = new Scanner(System.in);
      String depart_code = "";
      ArrayList<Ville> ville_list = new ArrayList<>(villes);
      ArrayList<Ville> villes_populaires = new ArrayList<>();
      ArrayList<Ville> villes_à_afficher = new ArrayList<>();

      System.out.print("Entrer un code departement : ");
      depart_code = sc.nextLine().toLowerCase();

      for (int i = 0; i < ville_list.size(); i++) {
        if (ville_list.get(i).getDepartement().getCodeDepartement().equals(depart_code)) {
          villes_populaires.add(ville_list.get(i));
        }
      }

      int counter_populaires = 0;
      for (int i = 0; i < villes_populaires.size(); i++) {
        if (counter_populaires < 10) {
          Ville occ = villes_populaires.stream().max((v1, v2) -> v1.getPopulation() - v2.getPopulation()).get();
          villes_à_afficher.add(occ);
          villes_populaires.remove(occ);
          counter_populaires++;
        } else {
          break;
        }
      }

      villes_à_afficher.sort((v1, v2) -> v2.getPopulation() - v1.getPopulation());
      System.out.println("Les villes les plus peuplées du département " + depart_code + " sont :");
      villes_à_afficher
          .forEach(ville -> System.out.println(ville.getNomCommune() + " (" + ville.getPopulation() + ")"));
      System.out.println();
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

  @Override
  public void getPopularCityByRegions(ArrayList<Ville> villes) {
    try {
      Scanner sc = new Scanner(System.in);
      int region_code = 0;
      ArrayList<Ville> ville_list = new ArrayList<>(villes);
      ArrayList<Ville> villes_populaires = new ArrayList<>();
      ArrayList<Ville> villes_à_afficher = new ArrayList<>();

      System.out.print("Entrer un code region : ");
      region_code = sc.nextInt();

      sc.nextLine();

      for (int i = 0; i < ville_list.size(); i++) {
        if (ville_list.get(i).getRegion().getCode_region() == region_code) {
          villes_populaires.add(ville_list.get(i));
        }
      }

      int counter_populaires = 0;
      for (int i = 0; i < villes_populaires.size(); i++) {
        if (counter_populaires < 10) {
          Ville occ = villes_populaires.stream().max((v1, v2) -> v1.getPopulation() - v2.getPopulation()).get();
          villes_à_afficher.add(occ);
          villes_populaires.remove(occ);
          counter_populaires++;
        } else {
          break;
        }
      }

      villes_à_afficher.sort((v1, v2) -> v2.getPopulation() - v1.getPopulation());
      System.out.println("Les villes les plus peuplées de la region " + region_code + " sont :");
      villes_à_afficher
          .forEach(ville -> System.out.println(ville.getNomCommune() + " (" + ville.getPopulation() + ")"));
      System.out.println();
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
    }
  }

}
