package fr.iamdamba;

import fr.iamdamba.models.ConwayMatrix;

public class Main {
  public static void main(String[] args) {
    int cols = 20;
    int rows = 20;

    ConwayMatrix map = new ConwayMatrix(cols, rows);
    map.update();
  }
}