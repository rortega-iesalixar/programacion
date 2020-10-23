package U2.Tarea8b;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
    // cuántos son negativos.

    int num, i, posit = 0, negat = 0;
    Scanner tecl = new Scanner(System.in);

    for (i = 1; i <= 4; i++) {
      System.out.println("Introduzca Nº " + i + " (hasta 10):");
      num = tecl.nextInt();
      if (num >= 0) {
        posit++;
      } else {
        negat++;
      }
    }
    System.out.println("Hay " + posit + " números positivos. Y " + negat + " números negativos.");
  }
}
