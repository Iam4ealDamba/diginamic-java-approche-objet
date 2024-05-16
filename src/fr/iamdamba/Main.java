package fr.iamdamba;

import javax.swing.*;

import fr.iamdamba.models.Game;

public class Main {
  public static void main(String[] args) {
    int boardWidth = 600;
    int boardHeight = boardWidth;

    Game game = new Game(boardWidth, boardHeight);
    JFrame frame = new JFrame("Conway's Game of Life");
    frame.add(game);

    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
  }
}