package U2.U2_Entrega;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Realiza un programa que pinte por pantalla un rombo hueco hecho con
    // asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
    // sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
    // mensaje de error y volverlo a pedir hasta que sea correcto.
    // Ejemplo:
    // Por favor, introduzca la altura del rombo: 5
    //   *
    //  * *
    // *   *
    //  * *
    //   *

    int altura, fila, columna;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println(
          "Por favor, introduzca altura del rombo (número impar mayor o igual a 3):");
      altura = sc.nextInt();

      if (altura >= 3 && altura % 2 != 0) {
        for (fila = 1; fila <= altura; fila++) {
          for (columna = 1; columna <= altura; columna++) {
            System.out.print("*");
          }
        }
      } else {
        System.out.println("EL número introducido no es correcto.");
      }
    } while (altura < 3 || altura % 2 == 0);
  }
}
