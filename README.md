### Exercice ManipulationChaine
Dans ce TP nous allons apprendre à manipuler des chaines de caractères, ce qui est très utile dans de nombreux cas de figures :
•    Créez un package fr.diginamic.chaines.
•    Dans ce package, créez une classe exécutable ManipulationChaine
•    Dans cette classe, déclarez la chaine de caractères suivante :
String chaine = "Durand;Marcel;2 523.5";
• Comme  vous  le  constatez,  cette  chaine  stocke  des  informations  séparées  par  le caractère « ; ». C’est par exemple le format utilisé dans les fichiers CSV pour stocker des données.
Tâches à réaliser :
La première tâche est corrigée ci-après afin d’avoir un exemple d’utilisation d’une méthode de la classe String.
1)  Utilisez la méthode charAt(int index) pour afficher le premier caractère de la chaine de caractères.
Correctif :
char    premierCaractere = chaine.charAt(0);
System.out.println("Premier caractère: " + premierCaractere);
2)  Utilisez la méthode length() pour afficher la longueur de la chaine de caractères
3)  Utilisez la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans la chaine de caractères.
4)  La méthode substring(int start, int end) permet d’extraire une portion de chaine de caractères comprise entre un index de début (inclus) et un index de fin (exclu).
Combinez la méthode  substring et indexOf pour extraire le nom de famille de la personne.
5)  Utilisez la méthode toUpperCase() pour afficher le nom de famille en majuscules.
6)  Utilisez la méthode toLowerCase() pour afficher le nom de famille en minuscules.7) Utilisez  la  méthode  split pour  découper  la  chaine  de  caractères  en  morceaux.  La méthode Le séparateur est le caractère « ; ». Cette méthode retourne un tableau. Affichez le tableau ainsi obtenu.
8)  Créez une classe Salarie dans le package entites avec 3 attributs
a.  nom : String
b.  prenom : String
c.   salaire : double
9)  A partir des 3 morceaux de chaine de caractères précédents, créez une instance de Salarie :
a.  Consigne : le nombre « 2 523.5» contient un espace qu’il faut supprimer en utilisant la méthode replace(String, String) de la classe String
b.  Astuce :  pour  transformer  une  chaine  de  caractères  en  double,  utilisez  la méthode static de la classe Double : Double.parseDouble(String)