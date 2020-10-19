package U2.Tarea5;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de
    // los tres.

    long num1, num2, num3;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número entero (1):");
    num1 = teclado.nextLong();
    System.out.println("Introduzca otro número entero (2):");
    num2 = teclado.nextLong();
    System.out.println("Introduzca otro número entero (3):");
    num3 = teclado.nextLong();

    if (num1 > num2 && num1 > num3) {
      System.out.println("El número: " + num1 + " es el mayor de los tres.");
    } else {
      if (num2 > num1 && num2 > num3) {
        System.out.println("El número: " + num2 + " es el mayor de los tres.");
      } else {
        System.out.println("El número: " + num3 + " es el mayor de los tres.");
      }
    }
  }
}
