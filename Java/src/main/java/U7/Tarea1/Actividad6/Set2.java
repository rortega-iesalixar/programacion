package U7.Tarea1.Actividad6;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set2 {
  public static void main(String[] args) {
    // Actividad 6: Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que
    // se insertarán en una colección, de forma que se conserve el orden de inserción y que no
    // puedan repetirse. Mostrar la estructura por pantalla.

    String palabra;
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<String> hash_palabras = new LinkedHashSet<>();

    System.out.println("Introduzca un nombre (fin, para terminar):");
    palabra = sc.nextLine();

    while (!palabra.equals("fin")) {
      hash_palabras.add(palabra);

      System.out.println("Introduzca un nombre (fin, para terminar):");
      palabra = sc.nextLine();
    }
    System.out.println(hash_palabras);
  }
}
