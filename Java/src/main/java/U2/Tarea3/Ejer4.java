package U2.Tarea3;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su
    // equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una longitud en millas:");
    float millas = teclado.nextFloat();

    System.out.println(millas + " millas es igual a :" + (millas * 1609) + " kilómetros.");
  }
}
