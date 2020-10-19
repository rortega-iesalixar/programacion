package U2.Tarea6;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
    // que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un
    // "operador condicional".

    byte num1, num2, menor1, menor2;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número (max 127):");
    num1 = teclado.nextByte();
    System.out.println("Introduzca otro número (max 127):");
    num2 = teclado.nextByte();

    if (num1 < num2) {
      menor1 = num1;
    } else {
      menor1 = num2;
    }

    menor2 = num1 < num2 ? num1 : num2;

    System.out.println("Num1: " + menor1 + " y Num2: " + menor2);
  }
}
