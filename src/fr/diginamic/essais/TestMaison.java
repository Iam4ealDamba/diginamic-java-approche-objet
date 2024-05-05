package fr.diginamic.essais;

import java.util.OptionalInt;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {
  public static void main(String[] args) {
    Maison maison = new Maison(new Piece[] {});
    maison.afficher();

    Salon salon = new Salon(15, 0);
    Cuisine cuisine = new Cuisine(9, 0);
    WC wc = new WC(5, 0);
    Chambre chambre = new Chambre(20, 1);
    SalleDeBain sdb = new SalleDeBain(10, 1);
    WC wc2 = new WC(5, 1);
    maison.ajouterPiece(salon);
    maison.ajouterPiece(cuisine);
    maison.ajouterPiece(wc);
    maison.ajouterPiece(chambre);
    maison.ajouterPiece(sdb);
    maison.ajouterPiece(wc2);
    maison.afficher();
    maison.AfficherSuperficieEtage(OptionalInt.of(0));
    maison.AfficherSuperficieEtage(OptionalInt.of(1));
    maison.AfficherSuperficieEtage(null);
    maison.AfficherSuperficieEtage(OptionalInt.of(-1));
  }
}
