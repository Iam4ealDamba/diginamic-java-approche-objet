package fr.iamdamba.models;

import java.awt.Color;

public class Cell {
  private int state;
  private Color color;

  public Cell() {
  }

  public Cell(int state, Color color) {
    this.state = state;
    this.color = color;
  }

  /**
   * @param state
    */
  public void setState(int state) {
    this.state = state;
  }

  /**
   * @param color
   */
  public void setColor(Color color) {
    this.color = color;
  }

  /**
   * @return int
   */
  public int getState() {
    return state;
  }

  /**
   * @return Color
   */
  public Color getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Cell [state=" + state + ", color=" + color + "]";
  }

}
