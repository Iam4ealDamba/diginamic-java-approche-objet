# Exercice Forme
•    Implémentez    toutes    les    classes    de    ce    modèle    objet    dans    le    package fr.diginamic.formes.
•    Dans le package fr.diginamic.essais, créez une classe AffichageForme :
4
•    Créez un package fr.diginamic.formes
•    La classe Forme va représenter la classe mère de diverses formes géométriques. o  cette classe est abstraite
o  elle possède une méthode abstraite calculerSurface o  elle possède une méthode abstraite calculerPerimetre
•    Voici les autres classes à mettre en place avec leurs attributs :o cette classe possède une méthode afficher qui a un paramètre de type Forme. Cette méthode doit afficher le périmètre et la surface de la forme passée en paramètre.
•    Créer une classe TestForme :
o  Créer une variable de type cercle, une de type rectangle et une de type carré et tester la méthode afficher avec ces diverses variables.
• CONCLUSION :  comme  vous  le  constatez  la  méthode  afficher peut  prendre  en paramètre n’importe quelle instance d’une classe qui hérite de Forme. C’est l’essence même du polymorphisme.