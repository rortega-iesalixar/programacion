package U3.Tarea3;

import java.util.Scanner;

public class Ejer10_1 {
  public static void main(String[] args) {
    // Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla
    // unidimensional que debe rellenar de la siguiente forma: se leerá por teclado una serie de
    // números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares. La
    // función tiene que devolver la cantidad de impares desechados.

    int[] array_pares = new int[5];

    System.out.println(
        "La cantidad de impares desechados es: " + funcion_rellenaPares(array_pares));
  }

  public static int funcion_rellenaPares(int[] array_p) {
    Scanner sc = new Scanner(System.in);
    int impares = 0, num_temp;

    for (int i = 0; i < array_p.length; i++) {
      do {
        System.out.println("Introduzca un número par (hasta 5):");
        num_temp = sc.nextInt();
        if (num_temp % 2 != 0) {
          impares++;
        }
      } while (num_temp % 2 != 0);
    }
    return impares;
  }
}
