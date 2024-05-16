package fr.iamdamba.models;

public class Tile {
  int x;
  int y;

  public Tile(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // The `/**` in Java is used to start a documentation comment, also known as a
  // Javadoc comment.
  // Javadoc comments are used to provide documentation for classes, methods, and
  // fields in Java code.
  // These comments can be processed by tools to generate API documentation in
  // HTML format.
  /**
   * @return int
   */
  public int getX() {
    return x;
  }

  /**
   * The function setX(int x) sets the value of the variable x to the input
   * parameter x.
   * 
   * @param x The parameter "x" is an integer value that is being passed to the
   *          method "setX" in order
   *          to set the value of the instance variable "x" in the current object.
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * @return int
   */
  public int getY() {
    return y;
  }

  /**
   * @param y
   */
  public void setY(int y) {
    this.y = y;
  }

}
