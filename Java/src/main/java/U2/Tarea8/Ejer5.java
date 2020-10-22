package U2.Tarea8;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación,
    // solicitará por teclado un valor que debe estar dentro del rango. Si no es asi, volverá a
    // solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

    int min, max, num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca valor mínimo:");
    min = teclado.nextInt();
    System.out.println("Introduzca valor máximo:");
    max = teclado.nextInt();

    do {
      System.out.println("Introduzca un valor que esté dentro del rango:");
      num = teclado.nextInt();

      // Min 1
      // Max 5
      // Num 7

      if (num <= min || num >= max) {
        System.out.println("Valor incorrecto.");
      }

    } while (num <= min || num >= max);

    System.out.println("El valor estaba dentro del rango dado.");
  }
}
