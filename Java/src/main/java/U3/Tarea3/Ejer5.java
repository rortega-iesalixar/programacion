package U3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Leer una serie de 6 enteros que se almacenarán en una tabla (array) que hay que ordenar y
    // mostrar.
    // Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una
    // tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden
    // correcto para que los datos resultantes continúen ordenados sin necesidad de volver a
    // realizar una ordenación.

    Scanner sc = new Scanner(System.in);
    int[] array_1 = new int[2],
        array_2 = new int[2],
        array_3 = new int[array_1.length + array_2.length];

    for (int i = 0; i < array_1.length; i++) {
      System.out.println("Introduzca número entero Nº " + i + ":");
      array_1[i] = sc.nextInt();
    }
    funcion_ordenar(array_1);

    for (int i = 0; i < array_2.length; i++) {
      System.out.println("Introduzca número entero Nº " + i + ":");
      array_2[i] = sc.nextInt();
    }
    funcion_ordenar(array_2);

    funcion_fusionar(array_1, array_2, array_3);

    for (int i = 0; i < array_3.length; i++) {
      System.out.println("Array Nº" + i + ": " + array_3[i]);
    }
  }

  public static void funcion_ordenar(int[] array) {
    Arrays.sort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println("Array Nº " + i + ": " + array[i]);
    }
  }
  // Tiene un error que hay que corregir. Machaca la última posición.
  public static void funcion_fusionar(int[] array_a, int[] array_b, int[] array_c) {
    int indice_array_a = 0;
    int indice_array_b = 0;

    for (int i = 0; i < array_c.length; i++) {
      // Recorremos el array de 12 dígitos y a contuacion comparamos entre los otros dos arrays a/b.

      if (indice_array_a != array_a.length && indice_array_b != array_b.length) {
        if (array_a[indice_array_a] <= array_b[indice_array_b]) {
          array_c[i] = array_a[indice_array_a];
          indice_array_a++;
        } else {
          array_c[i] = array_b[indice_array_b];
          indice_array_b++;
        }
      }

      if (indice_array_a == array_a.length) {
        for (int j = indice_array_b; j < array_b.length; j++) {
          array_c[i] = array_b[indice_array_b];
          indice_array_b++;
          i++;
        }
      }
      if (indice_array_b == array_b.length && indice_array_a != array_a.length) {
        for (int j = indice_array_a; j < array_a.length; j++) {
          array_c[i] = array_a[indice_array_a];
          indice_array_a++;
          i++;
        }
      }
    }
  }
}
