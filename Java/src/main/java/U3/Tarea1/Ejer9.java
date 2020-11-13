package U3.Tarea1;

import java.util.Scanner;

public class Ejer9 {
  public static void main(String[] args) {
    // Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos
    // del número que se le pasa como parámetro
    // Quiere saber exactamente que números son los divisores primos.

    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Introduzca un número entero positivo:");
    num = sc.nextInt();

    // System.out.println(
    //  "El número de divisores primos de " + num + " es: " + funcion_divisores(num));
    funcion_divisores(num);
  }

  public static void funcion_divisores(int a) {
    int contador = 0;
    for (int i = a; i >= 1; i -= 1) {
      if (a % i == 0) {
        if (funcion_primo(i) == true) {
          // contador++;
          System.out.println("Divisor primo de " + a + ": " + i);
        }
      }
    }
    // return contador;
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
