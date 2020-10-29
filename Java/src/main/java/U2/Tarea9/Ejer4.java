package U2.Tarea9;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
    // central es o no un espacio.

    String frase, mitad, vacio = " ";
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca una frase:");
    frase = tecl.nextLine();
    mitad = frase.substring(frase.length() / 2, frase.length() / 2 + 1);

    System.out.println("Posición " + mitad);

    if (mitad.equals(vacio)) {
      System.out.println("El carácter de la posición central es un espacio.");
    } else {
      System.out.println("El carácter de la posición central NO es un espacio.");
    }
  }
}
