package fr.diginamic.jdr.entities;

public class Troll extends Character {

  public Troll() {
    super();
    this.str = (int) Math.floor(Math.random() * (15 - 10) + 10);
    this.health = (int) Math.floor(Math.random() * (30 - 20) + 20);
  }
}
