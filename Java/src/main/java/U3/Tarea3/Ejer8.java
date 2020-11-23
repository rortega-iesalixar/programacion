package U3.Tarea3;

import java.util.Arrays;

public class Ejer8 {
  public static void main(String[] args) {
    // Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición
    // [n,m] debe contener n+m. Después, se debe mostrar su contenido.

    int array_bidim[][] = new int[5][5];

    for (int i = 0; i < array_bidim.length; i++) {
      for (int j = 0; j < array_bidim[i].length; j++) {
        array_bidim[i][j] = i + j;
      }
    }
    System.out.println("Mostrando array: " + Arrays.deepToString(array_bidim));
  }
}
