### Exercice Immobilier
Dans cet exercice nous allons modéliser une maison avec ses diverses pièces qui peuvent être de types différents : Chambre, Cuisine, Salon, Salle de bain, WC
•    Créez un package fr.diginamic.maison
•    On va commencer par créer une classe abstraite Piece, qui a 2 attributs : 
o  la superficie 
o  le numéro de l’étage. On considèrera par convention que l’étage 0 désigne le RDC, 1 le 1er étage, et ainsi de suite.
•    La  classe  Piece  a  un  constructeur  avec  2  paramètres  permettant  d’initialiser  les variables d’instance superficie et étage.
•    Comme le montre le diagramme de classes, la classe Piece est la classe mère de toutes les pièces de la maison. Cette classe mère a 5 classes filles :
o  Chambre
o  Cuisine
o  Salon
o  SalleDeBain
o  WC
•    La classe Maison va représenter une maison avec un unique attribut : un tableau d’objets de type Piece.
o  cette  classe  possède  une  méthode  ajouterPiece(Piece  piece)  qui  permet d’ajouter une pièce à la maison.
o  cette  classe  possède  une  méthode  qui  retourne  la  superficie  totale  de  la maison
o  cette classe a une méthode qui retourne la superficie d’un étage donné.
• Dans le package fr.diginamic.essais, créez une classe TestMaison qui permet de tester la création d’une maison. Ajoutez des pièces de diverses natures à différents étages et vérifiez que toutes vos méthodes fonctionnent.
•    Que se passe t’il si vous passez null en paramètre de la méthode ajouterPiece(Piece piece) ? Faites un test.
o  Si vous détectez une erreur, ajoutez un contrôle dans la méthode ajouterPiece pour éviter d’ajouter au tableau quelque chose de null.
•    Que se passe t’il si la pièce à une superficie ou un étage négatif ? 
o  Ajoutez  un  contrôle  pour  éviter  d’ajouter  au  tableau  une  pièce  avec  des données non cohérentes.
•    Plus difficile : l’écriture des 2 méthodes suivantes demande un peu de réflexion
o Dans la classe Maison, écrivez une méthode qui prend en paramètre un type de pièce donné et retourne la superficie globale pour ce type de pièce donné : par exemple, la superficie globale des chambres. 
o  Dans la classe Maison, écrivez une méthode qui retourne le nombre de pièces d’un type donné : par exemple le nombre de chambres.