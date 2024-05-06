package fr.diginamic.jdr.entities;

public class Goblin extends Character {

  public Goblin() {
    super();
    this.str = (int) Math.floor(Math.random() * (10 - 5) + 5);
    this.health = (int) Math.floor(Math.random() * (15 - 10) + 10);
  }
}
