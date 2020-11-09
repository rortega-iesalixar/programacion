package U2.U2_Examen;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Escribe un programa que lea un número n e imprima una pirámide de números
    // con n filas como en la siguiente figura:
    //    1
    //   121
    //  12321
    // 1234321

    Scanner sc = new Scanner(System.in);
    int filas;

    System.out.println("Por favor, introduzca número de filas:");
    filas = sc.nextInt();

    for (int i = 1; i <= filas; i++) {
      for (int j = 1; j < filas - 1; j++) {
        System.out.println(j);
      }
      System.out.println("");
    }
  }
}
