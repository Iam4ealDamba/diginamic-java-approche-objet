package sts.github.maven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import sts.github.maven.models.Product;

public class ApplicationOpenFoodFacts {
  public static void main(String[] args) throws IOException {
    File open_foodFile = new File("./src/sts/github/maven/files/open-food-facts.csv");
    BufferedWriter new_file = new BufferedWriter(new FileWriter("./src/sts/github/maven/files/liste.json"));

    ArrayList<Product> cat_products = new ArrayList<>();
    ArrayList<Product> brand_products = new ArrayList<>();
    HashMap<String, Integer> category_list = new HashMap<>();
    HashMap<String, Integer> brand_list = new HashMap<>();
    String data = "";
    Scanner reader = new Scanner(open_foodFile);
    reader.nextLine();

    while (reader.hasNextLine()) {
      String[] line = reader.nextLine().split("\\|");
      Product occ = new Product(line[2], line[1], line[0]);
      cat_products.add(occ);
      brand_products.add(occ);
    }
    reader.close();

    // For each category, count the number of products
    for (int i = 0; i < cat_products.size(); i++) {
      String cat_name = cat_products.get(i).getCategory().toLowerCase();
      int counter = 0;

      for (int j = 0; j < cat_products.size(); j++) {
        if (cat_name.equals(cat_products.get(j).getCategory().toLowerCase())) {
          counter++;
        }
      }
      category_list.put(cat_name, counter);

      cat_products
          .removeAll(cat_products.stream().filter(p -> p.getCategory().toLowerCase().equals(cat_name))
              .collect(Collectors.toList()));
    }

    // For each brand, count the number of products
    for (int i = 0; i < brand_products.size(); i++) {
      String brand_name = brand_products.get(i).getBrand().toLowerCase();
      int counter = 0;

      for (int j = 0; j < brand_products.size(); j++) {
        if (brand_name.equals(brand_products.get(j).getBrand().toLowerCase())) {
          counter++;
        }
      }
      brand_list.put(brand_name, counter);

      brand_products
          .removeAll(
              brand_products.stream().filter(p -> p.getBrand().toLowerCase().equals(brand_name))
                  .collect(Collectors.toList()));
    }

    // System.out.println("**************** Brand List ***************");
    // brand_list.forEach((key, value) -> System.out.println(key + " : " + value));

    // System.out.println("**************** Category List ***************");
    // category_list.forEach((key, value) -> System.out.println(key + " : " +
    // value));

    data += "[";
    // For each category, count the number of products
    data += "{\n\"category\": [\n";
    for (Entry<String, Integer> entry : category_list.entrySet()) {
      data += "{ \"" + entry.getKey() + "\" : " + entry.getValue() + " },\n";
    }
    data += "]},\n";

    // For each brand, count the number of products
    data += "{\n\"brand\": [\n";
    for (Entry<String, Integer> entry : brand_list.entrySet()) {
      data += "{ \"" + entry.getKey() + "\" : " + entry.getValue() + " },\n";
    }
    data += "]}\n";
    data += "]";

    // Write the data to a file
    new_file.write(data);

    // End of program
    new_file.close();
    System.out.println("\nDone\n");
  }
}
