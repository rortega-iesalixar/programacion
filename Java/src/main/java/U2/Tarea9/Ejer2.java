package U2.Tarea9;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el
    // segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
    // número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o
    // "Fallaste".

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
    }
  }
}
