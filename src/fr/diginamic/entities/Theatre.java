package fr.diginamic.entities;

public class Theatre {
  String nom;
  int max_personnes;
  int total_inscrit;
  double total_recette;

  public Theatre(String nom, int max_personnes, int total_inscrit, double total_recette) {
    this.nom = nom;
    this.max_personnes = max_personnes;
    this.total_inscrit = total_inscrit;
    this.total_recette = total_recette;
  }

  public void inscrire(int nb_client, double price) {
    if (this.total_inscrit < this.max_personnes && this.total_inscrit + nb_client <= this.max_personnes) {
      this.total_recette += price;
      this.total_inscrit += nb_client;
    } else {
      System.out.println("La salle ne peut pas acceuillir autant de clients.");
      System.out.println("Total de clients : " + this.total_inscrit);
      System.out.println("total recette : " + (this.total_recette));
    }
  }
}
