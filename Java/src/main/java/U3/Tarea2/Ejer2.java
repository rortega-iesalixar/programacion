package U3.Tarea2;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique
    // cuántos espacios en blanco tiene.

    Scanner sc = new Scanner(System.in);
    String frase, letra;
    int contador = 0;

    System.out.println("Por favor, introduzca una frase:");
    frase = sc.nextLine();

    for (int i = 0; i <= frase.length() - 1; i++) {
      letra = frase.substring(i, i + 1);
      if (letra.equals(" ")) {
        contador++;
      }
    }
    System.out.println("Hay " + contador + " espacio/s en blanco dentro de la frase.");
  }
}
