package U2.Tarea2;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una temperatura en grados centígrados:");
    int grados = teclado.nextInt();

    System.out.print(grados);
    System.out.print(" grados centígrados son: ");
    System.out.print(9 * grados / 5 + 32);
    System.out.println(" grados Fahrenheit.");
  }
}
