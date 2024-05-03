package fr.diginamic.banque;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
  public static void main(String[] args) {
    double total = 0;
    DecimalFormat df = new DecimalFormat("0.##");
    List<Operation> operations = new ArrayList<>();
    operations.add(new Credit("1/04/2024", 2000));
    operations.add(new Credit("2/04/2024", 150));
    operations.add(new Credit("3/04/2024", 541));
    operations.add(new Credit("4/04/2024", 25));

    operations.add(new Debit("10/07/2024", 247.58));
    operations.add(new Debit("11/07/2024", 1000));
    operations.add(new Debit("12/07/2024", 182.57));
    operations.add(new Debit("13/07/2024", 200.58));

    for (Operation operation : operations) {
      switch (operation.getType()) {
        case "CREDIT":
          total += operation.getMontant();
          break;
        default:
          total -= operation.getMontant();
          break;
      }

      System.out.println(operation);
    }

    System.out.println("Total: " + df.format(total));
  }
}
