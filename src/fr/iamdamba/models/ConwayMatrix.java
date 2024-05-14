package fr.iamdamba.models;

import java.util.Optional;
import java.util.OptionalInt;

public class ConwayMatrix {
  private int cols;
  private int rows;
  private int[][] matrix;
  private int generation = 0;

  public ConwayMatrix(int cols, int rows) {
    this.cols = cols;
    this.rows = rows;
    this.generateMatrix();
  }

  public int getGeneration() {
    return this.generation;
  }

  /**
   * Generate random matrix with 0 and 1
   */
  private void generateMatrix() {
    this.matrix = new int[this.rows][this.cols];

    // Generate random matrix with 0 and 1
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        this.matrix[i][j] = (int) Math.floor(Math.random() * 2);
      }
    }
  }

  /**
   * Draw the matrix
   */
  public void drawMatrix() {
    System.out.println("Generation: " + this.generation);
    System.out.println("-----------------");

    for (int i = 0; i < this.cols; i++) {
      for (int j = 0; j < this.rows; j++) {
        if (this.matrix[i][j] == 0) {
          System.out.print("| ");
        } else {
          System.out.print("|X");
        }
      }
      System.out.println("|");
    }
    System.out.println();
  }

  /**
   * Update the predicted matrix
   */
  public void update() {
    int[][] nextMatrix = new int[this.cols][this.rows];
    int matrix_length = 0;

    // Display the matrix
    this.drawMatrix();
    this.generation++;

    for (int i = 0; i < this.matrix.length; i++) {
      for (int j = 0; j < this.matrix.length; j++) {
        nextMatrix[i][j] = this.updateCell(i, j);
        matrix_length += nextMatrix[i][j];
      }
    }

    if (matrix_length > 0) {
      if (this.matrix == nextMatrix) {
        this.drawMatrix();
      } else {
        this.matrix = nextMatrix;
        this.update();
      }
    } else {
      this.matrix = nextMatrix;
      this.drawMatrix();
    }
  }

  /**
   * Update the current cell of the matrix
   * 
   * @param i - row index
   * @param j - column index
   * @return new_cell - new cell value
   */
  public int updateCell(int i, int j) {
    int total_cells = 0;
    int actual_cell = this.matrix[i][j];
    int new_cell = 0;

    // Check the cells around
    if (i == 0) {
      // Middle cells
      if (j > 0 && OptionalInt.of(this.matrix[i][j - 1]).isPresent()) {
        total_cells += this.matrix[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i][j + 1]).isPresent()) {
        total_cells += this.matrix[i][j + 1];
      }

      // Bottom cells
      if (j > 0 && OptionalInt.of(this.matrix[i + 1][j - 1]).isPresent()) {
        total_cells += this.matrix[i + 1][j - 1];
      }
      if (OptionalInt.of(this.matrix[i + 1][j]).isPresent()) {
        total_cells += this.matrix[i + 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i + 1][j + 1]).isPresent()) {
        total_cells += this.matrix[i + 1][j + 1];
      }
    }
    if (i > 0 && i < this.rows - 1) {
      // Top Cells
      if (j > 0 && OptionalInt.of(this.matrix[i - 1][j - 1]).isPresent()) {
        total_cells += this.matrix[i - 1][j - 1];
      }
      if (OptionalInt.of(this.matrix[i - 1][j]).isPresent()) {
        total_cells += this.matrix[i - 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i - 1][j + 1]).isPresent()) {
        total_cells += this.matrix[i - 1][j + 1];
      }

      // Middle cells
      if (j > 0 && OptionalInt.of(this.matrix[i][j - 1]).isPresent()) {
        total_cells += this.matrix[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i][j + 1]).isPresent()) {
        total_cells += this.matrix[i][j + 1];
      }

      // Bottom cells
      if (j > 0 && OptionalInt.of(this.matrix[i + 1][j - 1]).isPresent()) {
        total_cells += this.matrix[i + 1][j - 1];
      }
      if (OptionalInt.of(this.matrix[i + 1][j]).isPresent()) {
        total_cells += this.matrix[i + 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i + 1][j + 1]).isPresent()) {
        total_cells += this.matrix[i + 1][j + 1];
      }
    }
    if (i == this.rows - 1) {
      // Top Cells
      if (j > 0 && OptionalInt.of(this.matrix[i - 1][j - 1]).isPresent()) {
        total_cells += this.matrix[i - 1][j - 1];
      }
      if (OptionalInt.of(this.matrix[i - 1][j]).isPresent()) {
        total_cells += this.matrix[i - 1][j];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i - 1][j + 1]).isPresent()) {
        total_cells += this.matrix[i - 1][j + 1];
      }

      // Middle cells
      if (j > 0 && OptionalInt.of(this.matrix[i][j - 1]).isPresent()) {
        total_cells += this.matrix[i][j - 1];
      }
      if (j < this.cols - 1 && OptionalInt.of(this.matrix[i][j + 1]).isPresent()) {
        total_cells += this.matrix[i][j + 1];
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
