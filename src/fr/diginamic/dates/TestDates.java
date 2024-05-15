package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
  public static void main(String[] args) {
    Date date1 = new Date();

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println(dateFormat.format(date1));

    Date date2 = new Date(124, 4, 15, 23, 59, 30);
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println(dateFormat2.format(date2));
  }
}
