package U2.Tarea5;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo
    // ha hecho correctamente o no.

    int num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el número 12:");
    num = teclado.nextInt();

    if (num == 12) {
      System.out.println("Lo has hecho correctamente.");
    } else {
      System.out.println("No lo has hecho correctamente.");
    }
  }
}
