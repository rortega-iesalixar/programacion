package U2.Tarea8;

import java.util.Scanner;

public class Ejer8 {
  public static void main(String[] args) {
    // Pedir un número y calcular su factorial.
    // Ejemplo: Factorial de 5:
    // 5! = 5x4x3x2x1 = 120

    int num, i, factorial = 1;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número para calcular su factorial:");
    num = teclado.nextInt();

    for (i = num; i >= 1; i -= 1) {
      factorial = factorial * i;
      // System.out.println(i);
    }
    System.out.println("El factorial de " + num + " es: " + factorial);
  }
}
