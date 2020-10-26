package U2.Tarea9;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
    // central es o no un espacio.

    String frase;
    Scanner tecl = new Scanner(System.in);
    String vacio = " ";

    System.out.println("Introduzca una frase:");
    frase = tecl.nextLine();

    System.out.println("Posición " + frase.indexOf(" "));
  }
}
