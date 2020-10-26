package U2.Tarea8b;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
    // El carácter con el que se pinta la pirámide también se debe pedir por teclado.

    int num_filas, altura, blancos, caracter;
    String carc_pintar;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca número de filas de la piramide:");
    num_filas = tecl.nextInt();
    System.out.println("Introduzca el carácter para pintar la piramide:");
    carc_pintar = tecl.next();

    System.out.println();

    for (altura = 1; altura <= num_filas; altura++) {
      // Espacios en blanco
      for (blancos = 1; blancos <= num_filas - altura; blancos++) {
        System.out.print(" ");
      }
      // Carácter
      for (caracter = 1; caracter <= (altura * 2) - 1; caracter++) {
        System.out.print(carc_pintar);
      }
      System.out.println();
    }
  }
}
