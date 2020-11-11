package U3.Tarea1;

import java.util.Scanner;

public class Ejer8 {
  public static void main(String[] args) {
    // Escribir una función a la que se le pase un número entero y devuelva el número de divisores
    // primos que tiene.

    Scanner sc = new Scanner(System.in);
    int num, divisores = 0;

    System.out.println("Introduzca un número entero positivo:");
    num = sc.nextInt();

    System.out.println("El número de divisores primos de " + num + " es: " + funcion_primo(num));
  }

  public static int funcion_primo(int a) {
    int contador = 0;
    boolean primo = false;
    for (int i = a; i >= 1; i -= 1) {
      if (a % i == 0) {
        for (int j = i - 1; j >= 2; j -= 1) {
          if (i % j == 0) {
            primo = true;
            break;
          }
        }
        if (primo == false) {
          contador++;
        } else {
          primo = false;
        }
      }
    }
    return contador;
  }
}
