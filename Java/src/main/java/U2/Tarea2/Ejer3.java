package U2.Tarea2;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número:");
    int num1 = teclado.nextInt();
    System.out.println("Introduzca otro número:");
    int num2 = teclado.nextInt();

    System.out.println("Su división es:");
    System.out.println(num1 / num2);
  }
}
