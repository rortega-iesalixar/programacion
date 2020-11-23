package U3.Tarea3;

import java.util.Arrays;

public class Ejer9 {
  public static void main(String[] args) {
    // Definir una función que tome como parámetros dos tablas, la primera con 6 números de una
    // apuesta de la primitiva, y la segunda con los 6 números de la combinación ganadora. La
    // función devolverá el número de aciertos.

    int array_apuesta[] = {12, 24, 26, 34, 38, 41};
    int array_ganadora[] = {2, 16, 26, 33, 38, 40};

    System.out.println("Tú voleto: " + Arrays.toString(array_apuesta));
    System.out.println("Número ganador: " + Arrays.toString(array_ganadora));
    System.out.println(
        "El número de aciertos es: " + funcion_aciertos(array_apuesta, array_ganadora));
  }

  public static int funcion_aciertos(int[] array_a, int[] array_b) {
    int aciertos = 0;
    for (int i = 0; i < array_a.length; i++) {
      for (int j = 0; j < array_b.length; j++) {
        if (array_a[i] == array_b[j]) {
          aciertos++;
        }
      }
    }
    return aciertos;
  }
}
