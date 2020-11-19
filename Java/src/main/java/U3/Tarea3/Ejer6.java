package U3.Tarea3;

import java.util.Arrays;

public class Ejer6 {
  public static void main(String[] args) {
    // Implementar una función sinRepetidos() con el prototipo:
    // int[] sinRepetidos(int t[])
    // que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han
    // eliminado los datos repetidos.

    int[] array_original = {1, 2, 2, 3, 4, 5, 4};
    System.out.println("Tabla original: " + Arrays.toString(array_original));
    Arrays.sort(array_original);
    int[] array_nuevo = sinRepetidos(array_original);
    System.out.println("Tabla nueva: " + Arrays.toString(array_nuevo));
  }

  public static int[] sinRepetidos(int[] array) {
    int variable_temp, contador_resultado = 0;
    int[] resultado = new int[1];

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        resultado[contador_resultado] = array[i];
      } else {
        if (resultado[contador_resultado] != array[i]) {
          resultado = Arrays.copyOf(resultado, resultado.length + 1);
          contador_resultado++;
          resultado[contador_resultado] = array[i];
        }
      }
    }
    return resultado;
  }
}
