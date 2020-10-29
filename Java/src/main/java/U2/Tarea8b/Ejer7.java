package U2.Tarea8b;

import java.util.Scanner;

public class Ejer7 {
  public static void main(String[] args) {
    // Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

    int num, invertido = 0, resto;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca un número para invertir:");
    num = tecl.nextInt();

    while (num > 0) {
      resto = num % 10;
      invertido = invertido * 10 + resto;
      num /= 10;
    }

    System.out.println("El número invertido es: " + invertido);
  }
}
