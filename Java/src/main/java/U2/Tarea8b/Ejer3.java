package U2.Tarea8b;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
    // término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
    // anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
    // 89, 144... El número n se debe introducir por teclado.

    int num_serie, i, a = 0, b = 1, aux = 0;
    Scanner tecl = new Scanner(System.in);

    System.out.println("(Fibonacci) Introduce el número de veces a mostrar:");
    num_serie = tecl.nextInt();

    for (i = 1; i <= num_serie; i++) {
      // System.out.println(i);
      if (i == 1) {
        System.out.println("Fibonacci Nº " + i + ": " + a);
      }
      if (i == 2) {
        System.out.println("Fibonacci Nº " + i + ": " + b);
      }
      if (i >= 3) {
        aux = a + b;
        a = b;
        b = aux;
        System.out.println("Fibonacci Nº " + i + ": " + aux);
      }
    }
  }
}
