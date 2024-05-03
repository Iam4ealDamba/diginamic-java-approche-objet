package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
  public static void main(String[] args) {
    CalculMoyenne calculMoyenne = new CalculMoyenne(new double[] { 1, 2, 10 });
    CalculMoyenne calculMoyenne2 = new CalculMoyenne(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });
    System.out.println(calculMoyenne.calcul());
    System.out.println(calculMoyenne2.calcul());
  }
}
