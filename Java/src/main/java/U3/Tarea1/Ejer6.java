package U3.Tarea1;

import java.util.Scanner;

public class Ejer6 {
  public static void main(String[] args) {
    // Crear una función que, mediante un booleano, indique si el carácter que se pasa como
    // parámetro de entrada corresponde con una vocal.

    Scanner sc = new Scanner(System.in);
    String caracter;

    System.out.println("Introduzca caracter:");
    caracter = sc.nextLine();

    if (funcionbl(caracter) == true) {
      System.out.println("El carácter corresponde a una vocal.");
    } else {
      System.out.println("El carácter no corresponde a una vocal.");
    }
  }

  public static boolean funcionbl(String a) {
    if (a.equalsIgnoreCase("a")
        || a.equalsIgnoreCase("e")
        || a.equalsIgnoreCase("i")
        || a.equalsIgnoreCase("o")
        || a.equalsIgnoreCase("u")) {
      return true;
    } else {
      return false;
    }
  }
}
