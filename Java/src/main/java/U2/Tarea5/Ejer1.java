package U2.Tarea5;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
    // o si, por el contrario, no lo es (usando "else").

    int num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número entero:");
    num = teclado.nextInt();

    if (num > 0) {
      System.out.println("El número es positivo.");
    } else {
      System.out.println("El número es 0 ó negativo.");
    }
  }
}
