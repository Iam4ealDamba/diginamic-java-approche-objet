package sts.github.maven.services;

import java.util.ArrayList;
import java.util.HashMap;

import sts.github.maven.models.Product;
import sts.github.maven.services.interfaces.AppServiceInterface;

public class AppService implements AppServiceInterface {

  @Override
  public HashMap<String, Integer> countByCategory(ArrayList<Product> products) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'countByCategory'");
  }

  @Override
  public HashMap<String, Integer> countByBrand(ArrayList<Product> products) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'countByBrand'");
  }

}
