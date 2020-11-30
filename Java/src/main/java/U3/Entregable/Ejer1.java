package U3.Entregable;

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

    int array_enteros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean hay_primos = false;
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Los números primos encontrados son: "
            + Arrays.toString(funcion_filtraPrimos(array_enteros)));
  }

  public static int[] funcion_filtraPrimos(int[] array) {
    int array_primos[] = new int[1];
    int contador_primos = 0;
    boolean no_primo = false;

    for (int i = 0; i < array.length; i++) {
      for (int j = (array_primos[i] - 1); j >= 2; j -= 1) {
        if (array_primos[i] % j == 0) {
          no_primo = true;
          break;
        }
      }
      if (no_primo == false && contador_primos == 0) {
        array_primos[contador_primos] = array_primos[i];
        contador_primos++;
      }
      if (no_primo == false && contador_primos != 0) {
        array_primos = Arrays.copyOf(array_primos, array_primos.length + 1);
        array_primos[contador_primos] = array_primos[i];
        contador_primos++;
      } else {
        no_primo = false;
      }
    }
    if (array_primos[0] == 0) {
      array_primos[0] = -1;
      return array_primos;
    } else {
      return array_primos;
    }
  }
}
