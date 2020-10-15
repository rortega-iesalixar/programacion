package U2.Tarea3;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca su año de nacimiento:");
    short num1 = teclado.nextShort();

    System.out.println("Introduzca el año actual:");
    short num2 = teclado.nextShort();

    System.out.println("Su edad es: " + (num2 - num1) + " años.");
  }
}
