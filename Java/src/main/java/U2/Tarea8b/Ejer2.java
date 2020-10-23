package U2.Tarea8b;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
    // números enteros a partir de uno que se introduce por teclado.

    int num, i;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    num = tecl.nextInt();

    for (i = 1; i <= 5; i++) {
      System.out.println(
          "Nº " + num + ": Al cuadradado: " + num * num + ". Y al cubo: " + num * num * num);
      num++;
    }
  }
}
