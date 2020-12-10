package U3.U3_examen;

import java.util.Arrays;

public class Ejer3 {
  public static void main(String[] args) {
    // Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un
    // array bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de
    // números comienza en la esquina superior izquierda y continúa en el sentido de las agujas del
    // reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa. La
    // cabecera de la función es la siguiente:
    //
    // public static int[] corteza(int[][] n)
    //
    // Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
    //
    // 45 92 14 20 25 78
    // 35 72 24 45 42 60
    // 32 42 64 23 41 39
    // 98 45 94 11 18 48
    //
    // El array unidimensional generado por corteza(a) sería el siguiente:
    //
    // 45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35

    int[][] array_bidi = new int[4][6];
    int[] array = new int[0];

    System.out.println("");
    System.out.println("El array bidimensional es el siguiente...");
    for (int i = 0; i < array_bidi.length; i++) {
      for (int j = 0; j < array_bidi[i].length; j++) {
        array_bidi[i][j] = (int) (Math.random() * 9 + 1);
        System.out.print(array_bidi[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("La corteza del Array bidimensional es...");
    array = corteza(array_bidi);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("");
  }

  public static int[] corteza(int[][] n) {
    int[] array_uni = new int[0];
    int contador_array_uni = 0;

    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        if (i == 0) {
          array_uni = Arrays.copyOf(array_uni, array_uni.length + 1);
          array_uni[contador_array_uni] = n[i][j];
          contador_array_uni++;
        }
        if (i != 0 && j == n[i].length - 1) {
          array_uni = Arrays.copyOf(array_uni, array_uni.length + 1);
          array_uni[contador_array_uni] = n[i][j];
          contador_array_uni++;
        }
      }
    }

    for (int i = n.length - 1; i > -1; i--) {
      for (int j = n[i].length - 1; j > -1; j--) {
        if (i == n.length - 1 && j != n[i].length - 1) {
          array_uni = Arrays.copyOf(array_uni, array_uni.length + 1);
          array_uni[contador_array_uni] = n[i][j];
          contador_array_uni++;
        }
        if (i != n.length - 1 && j == 0 && i != 0) {
          array_uni = Arrays.copyOf(array_uni, array_uni.length + 1);
          array_uni[contador_array_uni] = n[i][j];
          contador_array_uni++;
        }
      }
    }

    return array_uni;
  }
}
