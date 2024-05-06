package fr.diginamic.jdr.entities;

public class Wolf extends Character {

  public Wolf() {
    super();
    this.str = (int) Math.floor(Math.random() * (8 - 3) + 3);
    this.health = (int) Math.floor(Math.random() * (10 - 5) + 5);
  }
}
