package U3.Tarea1;

import java.util.Scanner;

public class Ejer11 {
  public static void main(String[] args) {
    // Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
    // Realizar una versión iterativa y otra recursiva.

    Scanner sc = new Scanner(System.in);
    double num;
    int elevado;

    System.out.println("Introduzca un número:");
    num = sc.nextDouble();
    System.out.println("Introduzca cuantas veces quiere multiplicar el número por si mismo:");
    elevado = sc.nextInt();

    System.out.println(
        "Iterativa: " + num + " elevado a " + elevado + " = " + funcion_elevado(num, elevado));
    System.out.println(
        "Recursiva: "
            + num
            + " elevado a "
            + elevado
            + " = "
            + funcion_recursiva(num, elevado, num));
  }

  public static double funcion_elevado(double a, int b) {
    double resultado = a;
    for (int i = 1; i < b; i++) {
      resultado = resultado * a;
    }
    return resultado;
  }

  public static double funcion_recursiva(double a, int b, double c) {
    if (b > 1) {
      a = a * c;
      return funcion_recursiva(a, b - 1, c);
    } else {
      return a;
    }
  }
}
