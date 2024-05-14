package sts.github.maven.models;

public class Product {
  private String name;
  private String brand;
  private String category;

  public Product(String name, String brand, String category) {
    this.name = name;
    this.brand = brand;
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public String getCategory() {
    return category;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "{ \"name\": \"" + name + "\", \"brand\": \"" + brand + "\", \"category\": \"" + category + "\" }";
  }

}
