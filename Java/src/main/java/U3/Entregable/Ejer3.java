package U3.Entregable;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N
    // filas y N columnas con número aleatorios entre 100 y 200.
    //
    // Mostrar dicho array y a continuación rotarlo 90 grados:
    //
    // Ejemplo:
    //
    // Introduce la dimensión del Array: 5

    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Introduzca dimensión del array:");
    num = sc.nextInt();
    int array_bi[][] = new int[num][num];
    System.out.println("");

    for (int i = 0; i < array_bi.length; i++) {
      for (int j = 0; j < array_bi[i].length; j++) {
        array_bi[i][j] = (int) (Math.random() * 100 + 100);
        System.out.print(array_bi[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
