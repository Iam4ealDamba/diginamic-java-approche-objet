### TP 15 – APPRENDRE A MANIPULER DES FICHIERS
---
#### Objectifs du TP. Dans ce TP, nous allons apprendre à manipuler des fichiers.
Reprenez le projet approche-objet
Exercice LireFichier
•        Créez un package fichier.
•        Téléchargez le fichier recensement.csv situé dans le répertoire TP.
•        Créez une classe LectureFichier exécutable
•        Dans la méthode main, lisez le contenu du fichier et affichez son contenu.
Exercice CreerFichier
•        Créez une classe CreerFichier exécutable
•        Dans ce fichier extraire les 100 premières lignes du fichier recensement.
•        Générez un fichier contenant ces 100 premières lignes
Exercice LireFichierAvecInstanciation
•        Pour cet exercice, vous pouvez repartir de la classe LectureFichier précédente, qui va être complétée dans cet exercice.
•        Tout d’abord, créez une classe Ville avec les attributs suivants : 
o       Nom
o       Code département
o       Nom de la région
o       Population totale
•        Dans la classe LectureFichier en début de méthode main, créez une ArrayList de Ville vide
•        Lire le contenu du fichier recensement.csv et, pour chaque ligne de ce fichier, créez une instance de classe Ville que vous allez stocker dans une ArrayList
o Pour ce faire vous allez être obligé d’extraire de l’information de la ligne. Vous pouvez utiliser la méthode split qui permet de découper une ligne en tableau de chaine de caractères sur la base d’un séparateur
String[] tokens = ligne.split(";");2
Exercice GenererFichier
•        Pour cet exercice, vous pouvez repartir de la classe LectureFichier précédente.
•        Vous avez précédemment constitué une ArrayList de Ville contenant la totalité des 36000 villes du fichier
•        Générez maintenant un fichier de sortie ne contenant que les villes de plus de 25 000 habitants.
o       Attention, seules les informations utiles sont stockées dans le fichier final :
▪        Nom
▪        Code département
▪        Nom de la région
▪        Population totale
o       La première ligne doit être similaire à celle du fichier d’origine. Elle fournit les entêtes de colonnes.
•        Ouvrez le fichier résultant afin d’en vérifier le contenu
Quelques rappels sur les manipulations de chaine de caractères
1)   Pour découper une chaine de caractères
String maChaine = "Valeur 1; valeur 2; valeur3"; String[] tokens = maChaine.split(";");
2)   Pour retirer des caractères blancs
maValeur = maValeur.trim().replaceAll(" ", "");
Commitez vos développements sur GitHub