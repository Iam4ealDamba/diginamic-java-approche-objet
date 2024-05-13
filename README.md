### TP N°12 – APPRENDRE A UTILISER MAP ET HASHMAP
---
#### Objectifs du TP - Dans ce TP, nous allons apprendre à utiliser les Maps et HashMaps.
Reprenez le projet approche-objet
Créez un nouveau package appelé maps et qui contiendra l’ensemble du code de ce TP.
Exercice 1
Voici une liste d’employés avec leur salaire respectifs :
•        Paul – 1750 €
•        Hicham – 1825 €
•        Yu – 2250 €
•        Ingrid – 2015 €
•        Chantal – 2418 €
Tâches à réaliser :
•        Creez une classe exécutable appelée CreationMap :
o       Créez une map nommée mapSalaires et qui permet de stocker les informations de salaire (valeur) en fonction du prénom de la personne (clé).
o       Une fois la map créée, affichez sa taille
Exercice 2
•        Soit la classe exécutable suivante :
o       Dans cette classe, la map nommée mapVilles contient les noms des préféctures stockés par numéro de département.
public class CreationEtManipulationMap {
public static void main(String args[]) {
HashMap<Integer, String> mapVilles = new HashMap<>(); mapVilles.put(13, "Marseille");
mapVilles.put(34, "Montpellier"); mapVilles.put(44, "Nantes");
mapVilles.put(75, "Paris");
mapVilles.put(31, "Toulouse");
//TODO Développements à réaliser ci-dessous }
}2
Tâches à réaliser :
•        Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
•        Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
•        Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
•        Afficher la taille de la map
Exercice 3
•        Soit la classe exécutable suivante :
o       Dans cette classe, on a constitué 2 maps différentes, nommées map1 et map2 o       Ces maps contiennent des couleurs stockées en fonction d’un index
public class FusionMap {
public static void main(String args[]) {
// Création map1
HashMap<Integer, String> map1 = new HashMap<Integer, String>();
map1.put(1, "Rouge");
map1.put(2, "Vert");
map1.put(3, "Orange");
// Création map2
HashMap<Integer, String> map2 = new HashMap<Integer, String>();
map2.put(4, "Blanc");
map2.put(5, "Bleu");
map2.put(6, "Orange");
//TODO Développements à réaliser ci-dessous
}
}
Tâches à réaliser :
•        Créer une map appelée map3 et qui contient l’ensemble des données des 2 maps précédentes avec les mêmes clés et les mêmes valeurs
Exercice 4
•        Creez une classe exécutable MapVilles
•        Dans ce TP nous allons retravailler avec la classe Ville et les informations des TPs précédent.
•        Dans cette classe, créez une map permettant de stocker les instances de villes (valeur) en fonction de leur nom (clé).
•        Recherchez et supprimez la ville qui a le moins d’habitants
•        Affichez l’ensemble des villes restantes.3
Exercice 5
•        Créez une classe exécutable ComptagePaysParContinent
•        Créez une classe Pays avec 3 attributs
o       Le nom
o       Le nombre d’habitants
o       Le continent
•        Créez une ArrayList de Pays contenant les pays suivants :
o       France, 65 millions d’habitants, Europe
o       Allemagne, 80 millions d’habitants, Europe
o       Belgique, 10 millions d’habitants, Europe
o       Russie, 150 millions d’habitants, Asie
o       Chine, 1.4 milliards d’habitants, Asie
o       Indonésie, 220 millions d’habitants, Océanie,
o       Australie, 20 millions d’habitants, Océanie
•        Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent. o       Astuce : l’idée est de créer une HashMap avec :
▪        en clé une String qui va permettre de stocker le nom du continent et 
▪        en valeur un Integer qui va permettre de compter les pays.
Commitez vos développements sur GitHub