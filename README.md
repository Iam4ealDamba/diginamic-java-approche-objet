### Exercice Jeu de role

#### (Difficile / Facultative) Exercice JeuDeRole

Pour ce TP nous allons développer un jeu assez simple inspiré des jeux de rôles.
Dans ce jeu il va y avoir une interaction avec l’utilisateur qui sera donc amené à saisir des actions au clavier.

Pour simplifier le jeu, les actions se feront grâce à un système de menu.
Conseils avant de commencer le développement de ce jeu : 

  -    Créez un package **fr.diginamic.jdr** pour placer l’ensemble des classes de ce jeu.
  -    imaginez les classes dont vous allez avoir besoin pour créer ce petit jeu.

Menu du jeu :

  - **Créer le personnage**
    - lorsqu’on choisit cette option, un personnage va être créé avec 3 attributs : 
    - force (entre 12 et 18) tirée aléatoirement
    - points de vie (entre 20 et 50) tirés aléatoirement
    - score (à 0)
  
  - **Combattre une créature**
    - Le choix de cette option va permettre au personnage d’engager un combat. Ce combat n’est possible que si votre personnage a un nombre de points de vie > 0, sinon un message est affiché : « Votre personnage est décédé. Il a obtenu le score de X points. Veuillez créer un nouveau personnage ».
    - lorsqu’on  choisit  cette  option,  le  personnage  doit  combattre  une  créature parmi les créatures suivantes :
    -  Un loup : force (entre 3 et 8) et points de vie (entre 5 et 10)
    -  Un gobelin : force (entre 5 et 10) et points de vie (entre 10 et 15)
    -  Un troll : force (entre 10 et 15) et points de vie (entre 20 et 30).
    -  Le combat dure jusqu’à ce que votre personnage ou la créature soit victorieuse.
  
    - Le combat se déroule de la manière suivante :
      - A chaque tour, on calcule l’attaque des 2 protagonistes. l’attaque est calculée de la manière suivante : force + nombre aléatoire entre 1 et 10.
      - Celui dont l’attaque est la plus forte remporte le tour
      - Celui qui remporte le tour inflige une quantité de dégats égale à la différence entre les 2 valeurs d’attaque calculées précédemment.
      - Cette quantité de dégats se soustrait au nombre de points de vie de celui qui a perdu le tour.9
      - Si votre personnage perd, la partie est finie et le score du joueur est affiché.
      - Si votre personnage gagne le combat, son score augmente de : 1 si c’est un loup, 2 si c’est un gobelin et 5 si c’est un troll. Un message affiche alors l’issue du combat avec le nouveau score.
      - Vous  pouvez  engager  un  nouveau  combat  tant  que  votre  personnage  est encore en vie. L’objectif du jeu étant d’avoir un score maximum.
  - **Afficher score**
    - cette méthode affiche le score.
  - **Sortir**