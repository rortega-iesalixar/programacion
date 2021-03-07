package U7.Tarea1.Actividad7;

import java.util.Scanner;
import java.util.TreeSet;

public class Set3 {
  public static void main(String[] args) {
    // Actividad 7: Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que
    // se insertarán por orden alfabético en una colección que no permita repeticiones. Mostrar
    // luego la lista de nombres por pantalla.

    String nombre;
    Scanner sc = new Scanner(System.in);

    TreeSet<String> tree_nombres = new TreeSet<>();

    System.out.println("Introduzca un nombre (fin, para terminar):");
    nombre = sc.nextLine();

    while (!nombre.equals("fin")) {
      tree_nombres.add(nombre);

      System.out.println("Introduzca un nombre (fin, para terminar):");
      nombre = sc.nextLine();
    }
    System.out.println(tree_nombres);
  }
}
