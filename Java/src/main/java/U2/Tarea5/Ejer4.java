package U2.Tarea5;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

    int num1, num2, par1, par2;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    num1 = teclado.nextInt();

    System.out.println("Introduzca otro número:");
    num2 = teclado.nextInt();

    par1 = num1 % 2;
    par2 = num2 % 2;

    if (par1 == 0 && par2 == 0) {
      System.out.println("Los dos números son pares.");
    } else {
      if (par1 == 0 || par2 == 0) {
        System.out.println("Uno de los dos números es par.");
      } else {
        System.out.println("No hay números pares.");
      }
    }
  }
}
