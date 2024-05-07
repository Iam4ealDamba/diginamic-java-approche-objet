### TP N°10 – APPRENDRE A UTILISER LIST ET ARRAYLIST
Objectifs du TP
-     Dans ce TP, nous allons apprendre à utiliser les List et les ArrayList.
Reprenez le projet approche-objet
Exercice 1
Apprenez à créer une liste
•        Créez un nouveau package listes.
•        Créez une classe exécutable appelée CreationListe
•        Dans la méthode main de CreationListe, créez une ArrayList d’entiers et stockez-y tous les nombres de 1 à 100
•        Affichez la taille de la liste en utilisant la méthode de la classe ArrayList fournissant cette information.
Exercice 2
•        Soit la classe exécutable FusionListe ci-dessous :
o       Dans cette classe, on a constitué 2 listes différentes, nommées liste1 et liste2 o       Ces listes contiennent des couleurs 
public class FusionListe {
public static void main(String args[]) {
List<String> liste1 = new ArrayList<String>(); liste1.add("Rouge");
liste1.add("Vert");
liste1.add("Orange");
List<String> liste2 = new ArrayList<String>(); liste2.add("Blanc");
liste2.add("Bleu");
liste2.add("Orange");
//TODO Développements à réaliser ci-dessous }
}Tâches à réaliser :
•        Créez en utilisant des boucles une liste appelée liste3 et qui contient l’ensemble des données des 2 listes précédentes. 
Exercice 3
Apprenez à manipuler une liste d’entiers
•        Dans le package listes, créez une classe TestListeInt exécutable.
•        Dans cette classe instanciez une ArrayList d’entiers et placez-y les éléments suivants : o       -1, 5, 7, 3, -2, 4, 8, 5
o       Astuce : on ne peut pas créer une ArrayList de int car int est un type primitif. Il faut créer une ArrayList de Integer : ArrayList<Integer> liste = new ArrayList<>() ;
•        Affichez tous les éléments de la liste
•        Affichez la taille de la liste
•        Recherchez et affichez le plus grand élément de la liste
•        Supprimez le plus petit élément de la liste et affichez le résultat
•        Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent positifs.
•        Affichez enfin la liste résultante
Exercice 4
Apprenez à manipuler une liste de chaines de caractères.
•        Dans le package listes, créez une classe TestListeString exécutable.
•        Dans cette classe instanciez une ArrayList de String contenant les éléments suivants : o       Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
•        Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
•        Modifiez  le  contenu  de  la  liste  de  manière  à  mettre  tous  les  noms  de  villes  en majuscules.
•        Supprimez de la liste les villes dont le nom commence par la lettre N.
•        Affichez la liste résultante
Exercice 5
Apprenez à manipuler une liste d’objets
•        Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
•        Créer une classe TestVilles exécutable.
•        Dans la méthode main, créez une ArrayList de villes contenant les villes suivantes : o       Nice, 343 000 hab.
o       Carcassonne, 47 800 hab.
o       Narbonne, 53 400 hab.
o       Lyon, 484 000 hab.
o       Foix, 9 700 hab.
o       Pau, 77 200 hab.
o       Marseille, 850 700 hab.
o       Tarbes, 40 600 hab.
23
•        Recherchez et affichez la ville la plus peuplée
•        Supprimez la ville la moins peuplée
•        Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
•        Affichez enfin la liste résultante
Commitez vos développements sur la plateforme GitHub