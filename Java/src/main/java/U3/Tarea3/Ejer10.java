package U3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    // Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla
    // unidimensional que debe rellenar de la siguiente forma: se leerá por teclado una serie de
    // números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares. La
    // función tiene que devolver la cantidad de impares desechados.

    int array_pares[] = new int[1];
    int array_impares[] = new int[1];
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Los números impares desechados son: "
            + Arrays.toString(funcion_rellenaPares(array_pares, array_impares)));
  }

  public static int[] funcion_rellenaPares(int[] array_p, int[] array_i) {
    Scanner sc = new Scanner(System.in);
    int impar = 0, par = 0, num_temp;

    do {
      System.out.println("Introduzca número par para guardar (hasta 5):");
      num_temp = sc.nextInt();

      if (num_temp % 2 == 0) {
        array_p[par] = num_temp;
        // if (array_p.length <= 5) {
        array_p = Arrays.copyOf(array_p, array_p.length + 1);
        par++;
        // }
      } else {
        if (array_i[0] == 0) {
          array_i[impar] = num_temp;
        } else {
          array_i = Arrays.copyOf(array_i, array_i.length + 1);
          impar++;
          array_i[impar] = num_temp;
        }
      }

    } while (array_p.length != 6);

    return array_i;
  }
}
