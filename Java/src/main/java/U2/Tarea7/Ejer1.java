package U2.Tarea7;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

    int a, b, temp;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el valor de A (número entero):");
    a = teclado.nextInt();
    System.out.println("Introduzca el valor de B (número entero):");
    b = teclado.nextInt();

    System.out.println("Valor inicial de A = " + a + " y valor inicial de B = " + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("Valores intercambiados, A = " + a + " y B = " + b);
  }
}
