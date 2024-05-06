package fr.diginamic.jdr.entities;

public class Character {
  protected int str;
  protected int health;
  protected int score;

  public Character() {
    this.str = (int) Math.floor(Math.random() * (18 - 12) + 12);
    this.health = (int) Math.floor(Math.random() * (50 - 20) + 20);
    this.score = 0;
  }

  public void setStr(int str) {
    this.str = str;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getStr() {
    return str;
  }

  public int getHealth() {
    return health;
  }

  public int getScore() {
    return score;
  }

}
