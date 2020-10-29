package U2.U2_Entrega;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Escribe un programa que pida un número entero positivo por teclado y que
    // muestre a continuación los 5 números consecutivos a partir del número
    // introducido (incluyendo él mismo). Al lado de cada número se debe indicar
    // si se trata de un primo o no.
    //
    // Ejemplo:
    // Por favor, introduzca un número entero positivo: 17
    // 17 es primo
    // 18 no es primo
    // 19 es primo
    // 20 no es primo
    // 21 no es primo

    int num, i, j, num_temp, cont_primo = 0;
    boolean primo = true;
    Scanner tecl = new Scanner(System.in);

    System.out.println(
        "(Números Primos) Introduzca un número entero positivo para saber sus 5 consecutivos:");
    num = tecl.nextInt();

    for (i = num; i < num + 5; i++) {
      for (j = i; j >= 1; j -= 1) {
        num_temp = i % j;

        if (num_temp == 0) {
          cont_primo++;
        }
        if (cont_primo > 2) {
          primo = false;
          cont_primo = 0;
        }
      }
      System.out.print("Nº:" + i + " -> ");
      if (primo == true) {
        System.out.print("es primo.");
        System.out.println("");
        cont_primo = 0;
      } else {
        System.out.print("no es primo.");
        System.out.println("");
        primo = true;
        cont_primo = 0;
      }
    }
  }
}
