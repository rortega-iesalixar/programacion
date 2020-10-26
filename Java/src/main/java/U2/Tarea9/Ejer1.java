package U2.Tarea9;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

    String palb1, palb2;
    int cadena1, cadena2;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca una palabra (1º):");
    palb1 = tecl.next();
    System.out.println("Introduzca otra palabra (2º):");
    palb2 = tecl.next();

    cadena1 = palb1.length();
    cadena2 = palb2.length();

    if (cadena1 < cadena2) {
      System.out.println("La palabra -" + palb1 + "- es la más corta.");
    } else {
      System.out.println("La palabra -" + palb2 + "- es la más corta.");
    }
  }
}
