package U2.Tarea9;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o
    // "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.

    String pass, jug2_pass;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Jugador 1: Introduzca contraseña para adivinar:");
    pass = tecl.next();

    System.out.println(
        "Jugador 2: La palabra tiene -"
            + pass.length()
            + "- caracteres, y su primera y última letra son -"
            + pass.charAt(0)
            + "_"
            + pass.charAt(pass.length() - 1)
            + "-");
    System.out.println("Jugador 2: Introduzca la posible contraseña:");
    jug2_pass = tecl.next();

    if (pass.equals(jug2_pass)) {
      System.out.println("Acertaste!");
    } else {
      System.out.println("Fallaste!");
      if (pass.compareTo(jug2_pass) < 0) {
        System.out.println("Tú palabra es mayor alfabeticamente que la contraseña.");
      } else {
        System.out.println("Tú palabra es menor alfabeticamente que la contraseña.");
      }
    }
  }
}
