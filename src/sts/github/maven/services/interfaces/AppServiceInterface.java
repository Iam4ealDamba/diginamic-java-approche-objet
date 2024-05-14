package sts.github.maven.services.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import sts.github.maven.models.Product;

public interface AppServiceInterface {
  /**
   * Compte le nombre de produit par categories
   * 
   * @param products - liste des produits
   * @return HashMap contenant les categories et le nombre de produits
   */
  public Optional<HashMap<String, Integer>> countByCategory(ArrayList<Product> products);

  /**
   * Compte le nombre de produit par marques
   * 
   * @param products - liste des produits
   * @return HashMap contenant les marques et le nombre de produits
   */
  public Optional<HashMap<String, Integer>> countByBrand(ArrayList<Product> products);

}
