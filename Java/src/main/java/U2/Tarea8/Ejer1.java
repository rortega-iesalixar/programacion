package U2.Tarea8;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es
    // positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

    int num, par, cuadrado;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número (0 para terminar)");
    num = teclado.nextInt();

    while (num != 0) {
      par = num % 2;
      if (par == 0) {
        System.out.println("El número introducido es par.");
      } else {
        System.out.println("El número introducido es impar.");
      }
      if (num > 0) {
        System.out.println("El número es positivo.");
      } else {
        System.out.println("El número es negativo.");
      }
      System.out.println("El cuadrado del número es: " + (num * 2));
      System.out.println("");

      System.out.println("Introduce un número (0 para terminar)");
      num = teclado.nextInt();
    }

    System.out.println("El proceso ha finalizado.");
  }
}
