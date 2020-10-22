package U2.Tarea8;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

    int num, i = 1;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número máximo para conteo (mínimo 1):");
    num = teclado.nextInt();

    for (i = 1; i <= num; i++) {
      System.out.println(i);
    }

    // while (i <= num) {
    // System.out.println(i);
    // i++;
    // }
  }
}
