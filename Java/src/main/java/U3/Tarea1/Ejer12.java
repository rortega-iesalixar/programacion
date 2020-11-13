package U3.Tarea1;

import java.util.Scanner;

public class Ejer12 {
  public static void main(String[] args) {
    // Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es
    // 1.

    Scanner sc = new Scanner(System.in);
    long num;

    System.out.println("Introduzca un número para calcular su factorial:");
    num = sc.nextLong();
    System.out.println(
        "El factorial de " + num + " es " + funcion_recursiva_factorial(num, num - 1));
  }

  public static long funcion_recursiva_factorial(long a, long b) {
    if (a == 0) {
      return 1;
    }
    if (b < 1) {
      return a;
    } else {
      a = a * b;
      return funcion_recursiva_factorial(a, b - 1);
    }
  }
}
