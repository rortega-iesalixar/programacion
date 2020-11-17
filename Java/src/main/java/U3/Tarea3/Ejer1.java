package U3.Tarea3;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
    // los números en el mismo orden en que se han introducido.

    Scanner sc = new Scanner(System.in);
    double[] numeros_decimales = new double[5];

    for (int i = 0; i < numeros_decimales.length; i++) {
      System.out.println("Introduzca número con decimal, Nº " + i + 1);
      numeros_decimales[i] = sc.nextDouble();
    }
    for (int i = 0; i < numeros_decimales.length; i++) {
      System.out.println("Array Nº " + i + ": " + numeros_decimales[i]);
    }
  }
}
