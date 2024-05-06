package fr.diginamic.maison;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalInt;

public class Maison {
  Piece[] pieces;

  public static enum TypePiece {
    SALON,
    CUISINE,
    WC,
    CHAMBRE,
    SDB
  }

  public Maison(Piece[] pieces) {
    this.pieces = pieces;
  }

  public void ajouterPiece(Piece piece) {
    this.pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
    this.pieces[this.pieces.length - 1] = piece;
  }

  /**
   * Afficher la superficie d'un type de pièce'
   * 
   * @param typePiece - le tyype de la piece : [{@link TypePiece}]
   */
  public void afficherPieces(TypePiece typePiece) {
    double superficie = 0;
    switch (typePiece) {
      case SALON:
        for (Piece piece : this.pieces) {
          if (piece instanceof Salon) {
            superficie += piece.superficie;
          }
        }

        System.out.print("Superficie totale des pièces ''Salon''   : ");
        break;
      case CUISINE:
        for (Piece piece : this.pieces) {
          if (piece instanceof Cuisine) {
            superficie += piece.superficie;
          }
        }

        System.out.print("Superficie totale des pièces ''Cuisine''   : ");
        break;
      case WC:
        for (Piece piece : this.pieces) {
          if (piece instanceof WC) {
            superficie += piece.superficie;
          }
        }

        System.out.print("Superficie totale des pièces ''WC''   : ");
        break;
      case CHAMBRE:
        for (Piece piece : this.pieces) {
          if (piece instanceof Chambre) {
            superficie += piece.superficie;
          }
        }

        System.out.print("Superficie totale des pièces ''Chambre''   : ");
        break;
      case SDB:
        for (Piece piece : this.pieces) {
          if (piece instanceof SalleDeBain) {
            superficie += piece.superficie;
          }
        }

        System.out.print("Superficie totale des pièces ''Salle De Bain''   : ");
        break;
    }

    System.out.println(superficie);
  }

  /**
   * Afficher le total de pièce d'un type donné
   * 
   * @param typePiece - le type de la piece : [{@link TypePiece}]
   */
  public void afficherNbPieces(TypePiece typePiece) {
    DecimalFormat df = new DecimalFormat("#");
    double total = 0;

    switch (typePiece) {
      case SALON:
        for (Piece piece : this.pieces) {
          if (piece instanceof Salon) {
            total++;
          }
        }

        System.out.print("Le nombre total de pièce ''Salon'' est : ");
        break;
      case CUISINE:
        for (Piece piece : this.pieces) {
          if (piece instanceof Cuisine) {
            total++;
          }
        }

        System.out.print("Le nombre total de pièce ''Cuisine'' est : ");
        break;
      case WC:
        for (Piece piece : this.pieces) {
          if (piece instanceof WC) {
            total++;
          }
        }

        System.out.print("Le nombre total de pièce ''WC'' est : ");
        break;
      case CHAMBRE:
        for (Piece piece : this.pieces) {
          if (piece instanceof Chambre) {
            total++;
          }
        }

        System.out.print("Le nombre total de pièce ''Chambre'' est : ");
        break;
      case SDB:
        for (Piece piece : this.pieces) {
          if (piece instanceof SalleDeBain) {
            total++;
          }
        }

        System.out.print("Le nombre total de pièce ''Salle De Bain'' est : ");
        break;
    }

    System.out.println(df.format(total));
  }

  /**
   * Afficher la superficie de la maison
   */
  public void afficherTotal() {
    double total = 0;
    for (Piece piece : this.pieces) {
      total += piece.superficie;
    }

    System.out.println("Superficie totale : " + total);
  }

  /**
   * Afficher la superficie d'un étage donné
   * 
   * @param etage - l'etage à afficher: [{@link OptionalInt}]
   */
  public void afficherSuperficieEtage(OptionalInt etage) {
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
