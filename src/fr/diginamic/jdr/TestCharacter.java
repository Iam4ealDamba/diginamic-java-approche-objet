package fr.diginamic.jdr;

import java.util.Optional;
import java.util.Scanner;

import fr.diginamic.jdr.entities.Character;
import fr.diginamic.jdr.entities.Goblin;
import fr.diginamic.jdr.entities.Troll;
import fr.diginamic.jdr.entities.Wolf;

public class TestCharacter {
  public static void main(String[] args) {
    Character player = new Character();
    Scanner sc = new Scanner(System.in);
    boolean continue_game = true;

    System.out.println("************ JEU DU PERSONNAGE ************");
    System.out.println("*******************************************");
    System.out.println("");
    String res1 = "";

    System.out.println("Depuis que vous avez mis ce casque VR, vos sensations du monde réel sont partie.");
    System.out
        .println("Vous voila maintenant dans un nouveau monde, dans la peau d'un personnage de ce meme univers.");
    System.out.println("Vous vous retrouvé dans une forêt hostile, avec plusieurs arbre vous obstruant la vue");
    System.out.println(
        "Mais soudain, près de vous, vous entendez un bruit léger, comme des pas et c'est la que vous le voyer, c'est un monstre qui vous attaque.");
    System.out
        .println("Vous sentez que plusieurs d'entre eux vont venir et vous devez vous survire en les terassant.");

    // Debut de la partie
    while (continue_game == true) {
      System.out.print("Voulez-vous les affronter ? (o/n) : ");
      res1 = sc.nextLine().toLowerCase();

      if (res1.equals("n") || res1.equals("non")) {
        continue_game = false;
        System.out.println("Alors c'est la fin de la partie, merci d'avoir joué !");
        System.out.println("Votre Score : " + player.getScore());
      } else if (res1.equals("o") || res1.equals("oui")) {

        while (player.getHealth() > 0) {
          Character enemy = null;
          int random = (int) Math.floor(Math.random() * (4 - 1) + 1);
          
          System.out.println("");
          System.out.println("********************");
          System.out.println("INFORMATION AVANT COMBAT");
          System.out.println("Votre Vie : " + player.getHealth());
          System.out.println("Vos Points de Force : " + player.getStr());
          System.out.println("Score : " + player.getScore());
          System.out.println("********************");
          System.out.println("");
          System.out.println("C'est parti !, un monstre s'approche...");

          switch (random) {
            case 2:
              enemy = new Goblin();
              System.out.println("C'est un Goblin");
              break;
            case 3:
              enemy = new Troll();
              System.out.println("C'est un Troll");
              break;
            default:
              enemy = new Wolf();
              System.out.println("C'est un Loup");
              break;
          }

          while (enemy.getHealth() > 0) {
            int player_atk = player.getStr() + (int) Math.floor(Math.random() * 10);
            int enemy_atk = enemy.getStr() + (int) Math.floor(Math.random() * 10);

            if (player_atk > enemy_atk) {
              int damage = player_atk - enemy_atk;
              enemy.setHealth(enemy.getHealth() - damage);
              System.out
                  .println("Le monstre à reçu " + damage + " points de dommages. Il lui reste " + enemy.getHealth());

              if (enemy.getHealth() <= 0) {
                System.out.println("Vous avez gagné ! Votre score augmente de 1");
                System.out.println();
                player.setScore(player.getScore() + 1);
              }
            } else if (enemy_atk > player_atk) {
              int damage = enemy_atk - player_atk;
              player.setHealth(player.getHealth() - damage);
              System.out
                  .println("Vous avez perdu " + damage + " points de dommages. Vous avez encore " + player.getHealth());

              if (player.getHealth() <= 0) {
                System.out.println("Vous avez perdu !");
                System.out.println();
                break;
              }
            } else {
              System.out.println("Vos forces sont identiques, vous ne perdez aucun point de dommages");
            }
          }
        }

        System.out.println("Alors c'est la fin de la partie, merci d'avoir joué !");
        System.out.println("Votre Score : " + player.getScore());
        continue_game = false;
      } else {
        System.out.println("Veuillez entrer 'o' ou 'n'");
      }
    }
  }
}
