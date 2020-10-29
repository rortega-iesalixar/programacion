package U2.Tarea8b;

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    // Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa
    // pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en
    // la base para simular la curvatura de las esquinas inferiores.

    int altura;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca la altura de la U:");
    altura = tecl.nextInt();

    for (int filas = 1; filas <= altura; filas++) {
      for (int columnas = 1; columnas <= altura; columnas++) {
        if (columnas == 1 || columnas == altura && filas != altura) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

        // if (filas==altura && columnas !=1 && columnas!=)
      }
      System.out.println("");
    }
  }
}
