package U3.Tarea2;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
    // palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra
    // introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
    // "fin" no aparecerá en la frase final.

    Scanner sc = new Scanner(System.in);
    String palabra, frase = "";

    do {
      System.out.println("Introduzca palabras para la frase (Fin para terminar):");
      palabra = sc.nextLine();

      if (!palabra.equalsIgnoreCase("fin")) {
        frase = frase + " " + palabra;
      }

    } while (!palabra.equalsIgnoreCase("fin"));
    System.out.println(frase);
  }
}
