package U3.Tarea2;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier
    // vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán
    // las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

    Scanner sc = new Scanner(System.in);
    String nombre, letra, nuevo_nombre = "", nuevo_nombre2 = "";
    String quitar_letras = "aeiouAEIOU";

    System.out.println("Por favor, introduzca su nombre completo:");
    nombre = sc.nextLine();

    for (int i = 0; i < nombre.length(); i++) {
      letra = nombre.substring(i, i + 1);
      if (!letra.equalsIgnoreCase("a")
          && !letra.equalsIgnoreCase("e")
          && !letra.equalsIgnoreCase("i")
          && !letra.equalsIgnoreCase("o")
          && !letra.equalsIgnoreCase("u")
          && !letra.equalsIgnoreCase("á")
          && !letra.equalsIgnoreCase("é")
          && !letra.equalsIgnoreCase("í")
          && !letra.equalsIgnoreCase("ó")
          && !letra.equalsIgnoreCase("ú")) {
        nuevo_nombre = nuevo_nombre + letra;
      }
    }

    for (int i = 0; i < nombre.length(); i++) {
      letra = nombre.substring(i, i + 1);
      for (int j = 0; j < quitar_letras.length(); j++) {
        if (!quitar_letras.substring(j, j + 1).equals(letra)) {
          nuevo_nombre2 = nuevo_nombre2 + letra;
          break;
        }
      }
    }

    System.out.println("El nuevo nombre es: " + nuevo_nombre);
    System.out.println("El nuevo nombre es: " + nuevo_nombre2);
  }
}
