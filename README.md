### Exercice CalculSalaire
Dans  une  application  de  gestion  de  la  paie  d’un  journal  quotidien  « La  Voix  de  Saint- Herblain », on a une hiérarchie d’objets suivants :
•       Intervenant : classe mère, qui désigne une personne travaillant pour la société,
•       Salarie : classe fille de la classe Intervenant, qui désigne un salarié du journal,
• Pigiste :  classe  fille  de  la  classe  Intervenant,  qui  désigne  un indépendant intervenant au sein du journal pour une courte durée, parfois pour une seule journée. C’est un statut qu’on retrouve beaucoup dans le milieu médiatique.
Etape 1 : implémentation des classes
•    Créez un package fr.diginamic.salaire
•    La classe Intervenant va représenter la classe mère des diverses personnes travaillant pour le journal
o  cette classe a 2 attributs : nom et prénom
o  cette classe a une méthode abstraite getSalaire()
•    La classe Salarie:
o  est une classe fille de la classe Intervenant. 
o  représente un salarié du journal, i.e. ceux qui ont un contrat de travail type CDI ou CDD.
o  a un attribut d’instance : le montant du salaire mensuel
•    La  classe  Pigiste  représente  les  personnes  payées  à  la  journée.  Cette  classe  a  2 attributs :
o      un attribut qui représente le nombre de jours travaillés pour la société durant le mois
o      un attribut qui représente le montant journalier de rémunération.
•       Implémentez la méthode getSalaire() pour les 2 classes : Pigiste et Intervenant.
•       Dans le package fr.diginamic.essais, développez une classe TestIntervenant :
5o      Créez une instance de Salarie et affichez le résultat retourné par la méthode getSalaire()
o      Créez une instance de Pigiste et affichez le résultat retourné par la méthode getSalaire()
Etape 2 : la méthode afficherDonnees
•    La classe Intervenant a une nouvelle méthode:
o  Cette  méthode  s’appelle  afficherDonnees  et  affiche  toutes  les  données concernant un intervenant : 
▪   son nom, 
▪   son prénom,
▪   son salaire,
▪   son statut
o  Développez cette méthode dans la classe Intervenant. Vous aurez sans doute besoin d’une autre méthode pour que cela fonctionne.
•       Développez une classe TestIntervenant :
o      Pour chacune des instances de salarié et de pigiste invoquez ces méthodes afin de vérifier qu’elles fonctionnent