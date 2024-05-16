### LES ENUMERATIONS
Objectifs du TP
Apprendre à utiliser les énumérations. 
Travaux à réaliser
Exercice 1
•       Dans le projet approche-objet
•       Creez un package fr.diginamic.testenumeration
•       Dans ce package crééz une énumération Saison (PRINTEMPS, ETE, AUTOMNE, HIVER), avec 2 attributs :
o      un libellé (Printemps, Eté, Automne, Hiver) et 
o      un numéro d’ordre (1,2,3,4). 
•       Créez une classe TestEnumeration exécutable
•       Utilisez une boucle pour affichez toutes les saisons.
•       Soit la chaine de caractères suivante : String nom = « ETE » ;
o      Utilisez une méthode de base des énumérations pour retrouver et afficher le libellé de l’instance de Saison dont le nom est ETE.
•       Soit la chaine de caractères suivante : String libelle = « Hiver » ;
o      Développez une méthode dans votre énumération qui retourne une instance de Saison en fonction du libellé.
o      Utilisez cette méthode afin de vérifier que c’est bien HIVER qui est retournée lorsque vous la tester avec la variable libelle.
Exercice 2
•       Nous allons travailler à nouveau sur la classe Ville des TP sur les listes :
o      Créez une énumération Continent avec les 5 continents. Chaque instance de continent doit avoir un libellé.
o      Complétez  la  classe  Ville  du  TP  sur  les  listes  pour  lui  ajouter  un  attribut d’instance de type Continent.
o      Complétez le constructeur afin d’ajouter le continent en paramètre
o      Ajoutez un getter/setter
12
o      Complétez la méthode toString de la classe Ville afin que cette méthode affiche le libellé du continent auquel le pays appartient.
•       Créez une classe exécutable TestContinentAvecEnum
o      Créez une liste de villes avec tous les paramètres attendus dont le continent :
▪       New York
▪       Paris
▪       Pékin
▪       Moscou
▪       Berlin
▪       Sydney
▪       Sao Paulo
▪       Dakar
o      Réalisez  une  boucle  qui  affiche  l’ensemble  des  villes  avec  leur  continent respectif
Commitez sur GitHub