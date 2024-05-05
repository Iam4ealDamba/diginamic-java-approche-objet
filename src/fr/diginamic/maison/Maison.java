package fr.diginamic.maison;

import java.util.Arrays;
import java.util.OptionalInt;

public class Maison {
  Piece[] pieces;

  public Maison(Piece[] pieces) {
    this.pieces = pieces;
  }

  public void ajouterPiece(Piece piece) {
    this.pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
    this.pieces[this.pieces.length - 1] = piece;
  }

  public void afficher() {
    double total = 0;
    for (Piece piece : this.pieces) {
      total += piece.superficie;
    }

    System.out.println("Superficie totale : " + total);
  }

  public void AfficherSuperficieEtage(OptionalInt etage) {
    double total = 0;

    if (etage == null || etage.getAsInt() < 0) {
      System.out.println("Erreur: maison vide");
      return;
    }

    for (Piece piece : this.pieces) {
      if (piece.etage == etage.getAsInt()) {
        total += piece.superficie;
      }
    }

    if (total == 0) {
      System.out.println("Etage inexistant");
      return;
    }

    if (etage.getAsInt() == 0) {
      System.out.println("Superficie du rez-de-chausse : " + total);
    } else {
      System.out.println("Superficie de l'etage " + etage.getAsInt() + " : " + total);
    }
  }
}
