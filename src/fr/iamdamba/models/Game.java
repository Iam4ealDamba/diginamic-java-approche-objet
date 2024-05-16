package fr.iamdamba.models;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.OptionalInt;

import javax.swing.*;

public class Game extends JPanel implements ActionListener {
  /** Window height and width */
  private int w_height;
  /** Window height and width */
  private int w_width;
  /** Number of rows and columns */
  private int rows;
  /** Number of rows and columns */
  private int cols;
  /** Cell size */
  private int cell_size = 25;
  /** Matrix of values */
  private int[][] map;
  /** Timer */
  Timer timer;

  /**
   * Constructor
   * 
   * @param width  - width of the window
   * @param height - height of the window
   */
  public Game(int width, int height) {
    super();
    this.w_height = width;
    this.w_width = height;
    this.rows = this.w_height / this.cell_size;
    this.cols = this.w_width / this.cell_size;
    this.map = this.generate2DMap();

    setPreferredSize(new Dimension(this.w_width, this.w_height));
    setBackground(Color.black);
    ;

    this.timer = new Timer(120, this);
    this.timer.start();
  }

  /**
   * The `paint` method in Java overrides the default behavior to paint graphics
   * and calls the `draw`
   * method to render custom graphics.
   * 
   * @param g In the code snippet you provided, the parameter `g` is of type
   *          `Graphics`. This parameter
   *          is used in the `paint` method to draw graphics on a component. The
   *          `paint` method is typically
   *          overridden in Swing components to perform custom painting
   *          operations. The `Graphics` object
   *          provides methods for
   */
  @Override
  public void paint(Graphics g) {
    super.paintComponent(g);
    draw(g);
  }

  /**
   * The actionPerformed method calls the update method in response to an
   * ActionEvent.
   * 
   * @param e The parameter "e" in the actionPerformed method of an ActionListener
   *          represents the
   *          ActionEvent that occurred, such as a button click or menu selection.
   *          It provides information about
   *          the event that can be used to determine the source of the event and
   *          take appropriate actions.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    this.update();
    this.repaint();
  }

  /**
   * This Java function draws a grid of colored cells using the Graphics object.
   * 
   * @param g The parameter `g` in the `draw` method is of type `Graphics`. It is
   *          used to draw graphics
   *          on the screen or any other drawing surface. In this method, it is
   *          used to draw filled rectangles
   *          representing cells in a grid based on the color and position
   *          specified by the `map`
   */
  private void draw(Graphics g) {
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        // Cell
        g.setColor(this.map[i][j] == 1 ? Color.decode("#FFFFFF") : Color.black);
        g.fillRect((cell_size * j), (cell_size * i), 100, cell_size);
      }
    }
  }

  /**
   * The function generates a 2D map by randomly assigning cell values and colors
   * to each cell.
   */
  private int[][] generate2DMap() {
    int[][] map = new int[this.rows][this.cols];
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        int cell_value = (int) Math.floor(Math.random() * 2);
        map[i][j] = cell_value;
      }
    }
    return map;
  }

  /**
   * The `update` function creates a new map based on the current map state and
   * updates the display if
   * there are changes.
   */
  public void update() {
    int[][] nextMap = new int[this.rows][this.cols];
    int map_length = 0;

    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        int occ = this.updateCell(i, j);
        nextMap[i][j] = occ;
        map_length += nextMap[i][j];
      }
    }

    if (map_length == 0) {
      this.timer.stop();
      System.out.println("Game Over");
    } else {
      if (!!this.map.equals(nextMap)) {
        this.timer.stop();
        System.out.println("Game Over");
      } else {
        this.map = nextMap;
      }
    }
  }

  /**
   * Update the current cell of the map
   * 
   * @param i - row index
   * @param j - column index
   * @return new_cell - new cell value
   */
  public int updateCell(int i, int j) {
    int total_cells = 0;
    int actual_cell = this.map[i][j];
    int new_cell = 0;

    // Check the cells around
    if (i == 0) {
      // Middle cells
      if (j > 0 && OptionalInt.of(this.map[i][j - 1]).isPresent()) {
        total_cells += this.map[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i][j + 1]).isPresent()) {
        total_cells += this.map[i][j + 1];
      }

      // Bottom cells
      if (j > 0 && OptionalInt.of(this.map[i + 1][j - 1]).isPresent()) {
        total_cells += this.map[i + 1][j - 1];
      }
      if (OptionalInt.of(this.map[i + 1][j]).isPresent()) {
        total_cells += this.map[i + 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i + 1][j + 1]).isPresent()) {
        total_cells += this.map[i + 1][j + 1];
      }
    }
    if (i > 0 && i < this.rows - 1) {
      // Top Cells
      if (j > 0 && OptionalInt.of(this.map[i - 1][j - 1]).isPresent()) {
        total_cells += this.map[i - 1][j - 1];
      }
      if (OptionalInt.of(this.map[i - 1][j]).isPresent()) {
        total_cells += this.map[i - 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i - 1][j + 1]).isPresent()) {
        total_cells += this.map[i - 1][j + 1];
      }

      // Middle cells
      if (j > 0 && OptionalInt.of(this.map[i][j - 1]).isPresent()) {
        total_cells += this.map[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i][j + 1]).isPresent()) {
        total_cells += this.map[i][j + 1];
      }

      // Bottom cells
      if (j > 0 && OptionalInt.of(this.map[i + 1][j - 1]).isPresent()) {
        total_cells += this.map[i + 1][j - 1];
      }
      if (OptionalInt.of(this.map[i + 1][j]).isPresent()) {
        total_cells += this.map[i + 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i + 1][j + 1]).isPresent()) {
        total_cells += this.map[i + 1][j + 1];
      }
    }
    if (i == this.rows - 1) {
      // Top Cells
      if (j > 0 && OptionalInt.of(this.map[i - 1][j - 1]).isPresent()) {
        total_cells += this.map[i - 1][j - 1];
      }
      if (OptionalInt.of(this.map[i - 1][j]).isPresent()) {
        total_cells += this.map[i - 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i - 1][j + 1]).isPresent()) {
        total_cells += this.map[i - 1][j + 1];
      }

      // Middle cells
      if (j > 0 && OptionalInt.of(this.map[i][j - 1]).isPresent()) {
        total_cells += this.map[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.map[i][j + 1]).isPresent()) {
        total_cells += this.map[i][j + 1];
      }
    }

    switch (actual_cell) {
      case 0:
        if (total_cells < 3) {
          new_cell = 0;
        } else if (total_cells == 3) {
          new_cell = 1;
        } else {
          new_cell = 0;
        }
        break;
      default:
        if (total_cells < 2) {
          new_cell = 0;
        } else if (total_cells == 2 || total_cells == 3) {
          new_cell = 1;
        } else {
          new_cell = 0;
        }
        break;
    }
    return new_cell;
  }
}
