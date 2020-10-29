package U2.Entregable_1920;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los
    // números capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números
    // de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se
    // dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más
    // largos.
    //
    // NOTA: No puedo utilizar funciones de cadenas.

    long num, resto, nuevo_num = 0, num_guard;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca un número entero positivo:");
    num = tecl.nextLong();
    num_guard = num;

    while (num != 0) {
      resto = num % 10;
      nuevo_num = nuevo_num * 10 + resto;
      num /= 10;
    }

    if (num_guard == nuevo_num) {
      System.out.println("El " + num_guard + " es capicua.");
    } else {
      System.out.println("El " + num_guard + " no es capicúa.");
    }
  }
}
