package U3.Tarea3;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
    // Realizar la media de los números positivos, la media de los negativos, y contar el número de
    // ceros introducidos.

    Scanner sc = new Scanner(System.in);
    int[] array_numero;
    int num,
        num_positivo = 0,
        num_negativo = 0,
        num_cero = 0,
        media_positivo = 0,
        media_negativo = 0;

    System.out.println("¿Cuántos números desea introducir?");
    num = sc.nextInt();
    array_numero = new int[num];

    System.out.println("");
    for (int i = 0; i < array_numero.length; i++) {
      System.out.println("Introduzca Array Nº" + i + ":");
      array_numero[i] = sc.nextInt();
    }

    for (int i = 0; i < array_numero.length; i++) {
      if (array_numero[i] > 0) {
        num_positivo = num_positivo + array_numero[i];
        media_positivo++;
      }
      if (array_numero[i] < 0) {
        num_negativo = num_negativo + array_numero[i];
        media_negativo++;
      }
      if (array_numero[i] == 0) {
        num_cero++;
      }
    }

    System.out.println("");
    System.out.println("Media Nº Positivos: " + (num_positivo / media_positivo));
    System.out.println("Media Nº Negativos: " + (num_negativo / media_negativo));
    System.out.println("Nº de ceros: " + num_cero);
  }
}
