package U3.Entregable_Editado;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Crea la función filtraPrimos que:
    // Recibe un array de enteros
    // Devuelve un array de enteros con todos los primos que se encuentran en el array origen
    // Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se
    // pasa como parámetro. Para facilitar el ejercicio aunque un número primo se repita lo
    // añadiremos al vector. Si no existe ningún número primo en el vector original, se devuelve un
    // array con el número -1 como único elemento.

    int array_enteros[] = {1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 11, 12, 13};
    boolean hay_primos = false;
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Los números primos encontrados son: "
            + Arrays.toString(funcion_filtraPrimos(array_enteros)));
  }

  public static int[] funcion_filtraPrimos(int[] array_entrada) {
    int array_primos[] = new int[0];
    int contador_primos = 0;
    boolean primo_encontrado = false;

    for (int i = 0; i < array_entrada.length; i++) {
      // Si el número es primo...
      if (funcion_es_primo(array_entrada[i])) {
        array_primos = Arrays.copyOf(array_primos, array_primos.length + 1);
        array_primos[contador_primos] = array_entrada[i];
        contador_primos++;
        primo_encontrado = true;
      }
    }
    if (primo_encontrado) {
      return array_primos;
    } else {
      array_primos = Arrays.copyOf(array_primos, array_primos.length + 1);
      array_primos[0] = -1;
      return array_primos;
    }
  }
  // Comprobamos si el número es primo.
  public static boolean funcion_es_primo(int n) {
    for (int i = n - 1; i >= 2; i -= 1) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
