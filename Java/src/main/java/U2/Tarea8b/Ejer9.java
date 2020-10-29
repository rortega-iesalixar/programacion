package U2.Tarea8b;

import java.util.Scanner;

public class Ejer9 {
  public static void main(String[] args) {
    // Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa
    // pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera
    // entre 2) de la altura más uno.

    int altura;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca altura de la L:");
    altura = tecl.nextInt();

    for (int filas = 1; filas <= altura; filas++) {
      for (int columnas = 1; columnas < altura; columnas++) {
        if (columnas == 1) {
          System.out.println("*");
        }
        if (filas == altura && columnas < altura / +1) {
          System.out.print(" * ");
        }
      }
      // System.out.println("");
    }
  }
}
