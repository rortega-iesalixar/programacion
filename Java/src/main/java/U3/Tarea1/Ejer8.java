package U3.Tarea1;

import java.util.Scanner;

public class Ejer8 {
  public static void main(String[] args) {
    // Escribir una función a la que se le pase un número entero y devuelva el número de divisores
    // primos que tiene.

    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Introduzca un número entero positivo:");
    num = sc.nextInt();

    System.out.println(
        "El número de divisores primos de " + num + " es: " + funcion_divisores(num));
  }

  public static int funcion_divisores(int a) {
    int contador = 0;
    for (int i = a; i >= 1; i -= 1) {
      if (a % i == 0) {
        if (funcion_primo(i) == true) {
          contador++;
          // System.out.println(i);
        }
      }
    }
    return contador;
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
