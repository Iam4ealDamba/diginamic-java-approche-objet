### EXERCICE RECENSEMENT POPULATION

---

#### Objectif du TP - Maintenant que vous avis mis en œuvre les lignes de code qui permettent de lire et générer un fichier, nous allons passer à l’exploitation des données qu’il contient !

- Le but de cet TP va être de créer une application simple, dotée du menu suivant:
  - 1. Population d’une ville donnée
  - 2. Population d’un département donné
  - 3. Population d’une région donnée
  - 4. Afficher les 10 régions les plus peuplées
  - 5. Afficher les 10 départements les plus peuplés
  - 6. Afficher les 10 villes les plus peuplées d’un département
  - 7. Afficher les 10 villes les plus peuplées d’une région
  - 8. Afficher les 10 villes les plus peuplées de France
  - 9. Sortir

**Description du TP Recensement Population**

- Dans le projet approche-objet, créez le package fr.diginamic.recensement.
- Créez une classe exécutable ApplicationRecensement qui sera notre point d’entrée

**Modèle objet simple**

- Dans ce modèle nous avons une classe Recensement qui possède la liste de toutes les villes du fichier. La classe Ville est décrite ci-dessous :
- La classe Ville a les attributs suivants :
  - code région
  - nom de la région
  - code département
  - code de la commune
  - nom de la commune
  - population totale
- Dans ce cas l’objectif va être de construire une variable de type Recensement avec sa liste de 35800 instances de villes.
- Pour certains cas d’utilisation vous aurez sans doute besoin d’autres classes :2
  - une classe Region pour la recherche des 10 régions les plus peuplées
  - une classe Departement pour la recherche des 10 départements les plus peuplés.

**Consignes spécifiques**

- Afin d’éviter d’avoir des kilomètres de code dans la classe Application, le code de chaque option de menu sera développé dans une classe dite « de services ».
- Exemple dans le cas où l’utilisateur recherche la population d’une ville:
  ```java
    switch (choix){
    case 1:
    RecherchePopulationVille recherche = new RecherchePopulationVille(); recherche.traiter(recensement, scanner);
    break;
  ```
- Dans le package fr.diginamic.recensement créez une classe MenuService abstraite dont hériteront toutes les classes de services.
- La classe MenuService a une méthode abstraite :
  public abstract void traiter(Recensement recensement, Scanner scanner) ;

**Commitez vos développements sur GitHub**
