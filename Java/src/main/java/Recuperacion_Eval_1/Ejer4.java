package Recuperacion_Eval_1;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
    // continuación, se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para
    // ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
    // desplazando el resto de números (los que no son primos) de tal forma que no se pierda
    // ninguno. Al final se debe mostrar el array resultante.

    int[] array = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99};
    int[] array_nue = new int[10];
    Scanner sc = new Scanner(System.in);

    /*for (int i = 0; i < array.length; i++) {
      System.out.println(i + 1 + ". Introduzca un número (hasta 10):");
      array[i] = sc.nextInt();
    }*/

    for (int i = 0; i < array.length; i++) {
      System.out.print(i + "  ");
    }

    System.out.println("");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
