package sts.github.maven.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

import sts.github.maven.models.Product;
import sts.github.maven.services.interfaces.AppServiceInterface;

public class AppService implements AppServiceInterface {

  @Override
  public Optional<HashMap<String, Integer>> countByCategory(ArrayList<Product> products) {
    HashMap<String, Integer> category_list = new HashMap<>();
    try {
      for (int i = 0; i < products.size(); i++) {
        String cat_name = products.get(i).getCategory().toLowerCase();
        int counter = 0;

        for (int j = 0; j < products.size(); j++) {
          if (cat_name.equals(products.get(j).getCategory().toLowerCase())) {
            counter++;
          }
        }
        category_list.put(cat_name, counter);

        products
            .removeAll(
                products.stream().filter(p -> p.getCategory().toLowerCase().equals(cat_name))
                    .collect(Collectors.toList()));
      }

      return Optional.of(category_list);
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
      return null;
    }
  }

  @Override
  public Optional<HashMap<String, Integer>> countByBrand(ArrayList<Product> products) {
    HashMap<String, Integer> brand_list = new HashMap<>();

    try {
      for (int i = 0; i < products.size(); i++) {
        String brand_name = products.get(i).getBrand().toLowerCase();
        int counter = 0;

        for (int j = 0; j < products.size(); j++) {
          if (brand_name.equals(products.get(j).getBrand().toLowerCase())) {
            counter++;
          }
        }
        brand_list.put(brand_name, counter);

        products
            .removeAll(
                products.stream().filter(p -> p.getBrand().toLowerCase().equals(brand_name))
                    .collect(Collectors.toList()));
      }

      return Optional.of(brand_list);
    } catch (Exception e) {
      System.out.println("Une erreur est survenue : " + e.getMessage());
      return null;
    }
  }

}
