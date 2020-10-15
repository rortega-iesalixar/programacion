package U2.Tarea3;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número:");
    byte num1 = teclado.nextByte();

    System.out.println("Introduzca otro número:");
    byte num2 = teclado.nextByte();

    System.out.println("La suma total es: " + (num1 + num2));
  }
}
