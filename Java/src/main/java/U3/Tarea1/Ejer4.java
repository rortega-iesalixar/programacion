package U3.Tarea1;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de
    // los dos.

    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.println("Introduzca un número:");
    num1 = sc.nextInt();
    System.out.println("Introduzca otro número:");
    num2 = sc.nextInt();

    System.out.println("El mayor de los dos es: " + funcion_mayor(num1, num2));
  }

  public static int funcion_mayor(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
}
