package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
  double[] tab;

  public CalculMoyenne(double[] tab) {
    this.tab = tab;
  }

  public void ajout(double nb) {
    tab = Arrays.copyOf(tab, tab.length + 1);
    tab[tab.length - 1] = nb;
  }

  public String calcul() {
    double somme = 0;
    for (double i : tab) {
      somme += i;
    }
    return String.valueOf(Math.round(somme / tab.length));
  }
}
