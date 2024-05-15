package fr.diginamic.chaines;

public class TestStringBuilder {
  public static void main(String[] args) throws InterruptedException {
    long debut = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= 100000; i++) {
      sb.append(i).append(";");
    }

    Thread.sleep(1000);

    // Code à chronométrer
    long fin = System.currentTimeMillis();
    System.out.println("Nombre de chiffre enregistreé: " + sb.toString().split(";").length);
    System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
  }
}