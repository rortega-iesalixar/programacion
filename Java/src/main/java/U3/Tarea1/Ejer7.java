package U3.Tarea1;

import java.util.Scanner;

public class Ejer7 {
  public static void main(String[] args) {
    // Diseñar una función que nos diga si un número es primo.

    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Introduzca un número entero positivo:");
    num = sc.nextInt();
    if (funcion_primo(num) == true) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número NO es primo.");
    }
  }

  public static boolean funcion_primo(int a) {
    for (int i = a - 1; i >= 2; i -= 1) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}
