package U3.Tarea3_2;

import java.util.Arrays;

public class Ejer6 {
  public static void main(String[] args) {
    // Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
    // positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá
    // dar la posición tanto del máximo como del mínimo.
    //
    // NOTA IMPORTANTE: Los números no pueden repetirse.

    int array_nums[][] = new int[6][10];
    int num_aleatorio,
        contador = 0,
        maximo = 0,
        minimo = 1000,
        pos_max_i = 0,
        pos_max_j = 0,
        pos_min_i = 0,
        pos_min_j = 0;
    boolean introducido = false, encontrado;

    for (int i = 0; i < array_nums.length; i++) {
      for (int j = 0; j < array_nums[i].length; j++) {
        // array_nums[i][j] = (int) (Math.random() * 1000);
        do {
          num_aleatorio = (int) (Math.random() * 1000);
          encontrado = funcion_buscarnum(array_nums, num_aleatorio);

          if (encontrado == false) {
            array_nums[i][j] = num_aleatorio;
            // System.out.print("Num " + contador + ": " + array_nums[i][j]);
            // contador++;
            introducido = true;
          }
        } while (introducido == false);
        introducido = false;
      }
    }
    for (int i = 0; i < array_nums.length; i++) {
      for (int j = 0; j < array_nums[i].length; j++) {
        if (array_nums[i][j] > maximo) {
          maximo = array_nums[i][j];
          pos_max_i = i;
          pos_max_j = j;
        }
        if (array_nums[i][j] < minimo) {
          minimo = array_nums[i][j];
          pos_min_i = i;
          pos_min_j = j;
        }
      }
    }

    System.out.print(Arrays.deepToString(array_nums));
    System.out.println("");
    System.out.println("");
    System.out.println(
        "La posición del máximo es: " + maximo + ", Array [" + pos_max_i + "][" + pos_max_j + "]");
    System.out.println(
        "La posición del mínimo es: " + minimo + ", Array [" + pos_min_i + "][" + pos_min_j + "]");
  }

  public static boolean funcion_buscarnum(int[][] array, int num) {
    boolean encon = false;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (num == array[i][j]) {
          encon = true;
          break;
        }
      }
      if (encon == true) {
        break;
      }
    }
    return encon;
  }
}
