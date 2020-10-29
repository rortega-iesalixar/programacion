package U2.Entregable_1920;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.

    int num;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca un número para pasar a binario:");
    num = tecl.nextInt();

    System.out.println("El número en binario es: " + Integer.toBinaryString(num));
  }
}
