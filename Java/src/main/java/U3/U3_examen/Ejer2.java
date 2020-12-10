package U3.U3_examen;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un
    // array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas
    // igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina
    // inferior derecha.

    int[][] array_bidi = new int[4][5];
    int contador = 1;
    long suma_fila = 0,
        suma_columna0 = 0,
        suma_columna1 = 0,
        suma_columna2 = 0,
        suma_columna3 = 0,
        suma_columna4 = 0,
        suma_total = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < array_bidi.length; i++) {
      for (int j = 0; j < array_bidi[i].length; j++) {
        System.out.println("Nº" + contador + ", Por favor introduzca un número entero (hasta 20):");
        array_bidi[i][j] = sc.nextInt();
        contador++;
      }
    }

    /* Rellena el array de manera aleatoria, para hacer pruebas.
          for (int i = 0; i < array_bidi.length; i++) {
          for (int j = 0; j < array_bidi[i].length; j++) {
            array_bidi[i][j] = (int) (Math.random() * 5 + 1);
            // System.out.print(array_bidi[i][j] + " ");
          }
          // System.out.println("");
        }
    */

    System.out.println("");
    System.out.println("La tabla es la siguiente:");
    for (int i = 0; i < array_bidi.length; i++) {
      for (int j = 0; j < array_bidi[i].length; j++) {
        System.out.print(array_bidi[i][j] + " ");

        suma_fila = suma_fila + array_bidi[i][j];

        if (j == array_bidi[i].length - 1) {
          System.out.print(suma_fila);
          suma_total = suma_total + suma_fila;
          suma_fila = 0;
        }

        if (j == 0) {
          suma_columna0 = suma_columna0 + array_bidi[i][j];
        }
        if (j == 1) {
          suma_columna1 = suma_columna1 + array_bidi[i][j];
        }

        if (j == 2) {
          suma_columna2 = suma_columna2 + array_bidi[i][j];
        }

        if (j == 3) {
          suma_columna3 = suma_columna3 + array_bidi[i][j];
        }

        if (j == 4) {
          suma_columna4 = suma_columna4 + array_bidi[i][j];
        }
      }
      System.out.println("");
    }

    suma_total =
        suma_total + suma_columna0 + suma_columna1 + suma_columna2 + suma_columna3 + suma_columna4;
    System.out.print(
        suma_columna0
            + " "
            + suma_columna1
            + " "
            + suma_columna2
            + " "
            + suma_columna3
            + " "
            + suma_columna4
            + " "
            + suma_total);

    System.out.println("");
  }
}
