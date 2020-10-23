package U2.Tarea8;

import java.util.Scanner;

public class Ejer15 {
  public static void main(String[] args) {
    // Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que
    // sean primos. Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo:
    // Para n=8:
    // 1-> primo
    // 2->primo
    // 3->primo
    // 4->no primo
    // 5->primo
    // 6->no primo
    // 7->primo
    // 8->no primo
    // Resultado del programa: Entre 1 y 8 hay 5 números primos.

    int num, i, j, num_temp, cont_primo = 0;
    boolean primo = true;
    Scanner tecl = new Scanner(System.in);

    System.out.println("(Números Primos) Introduzca un número máximo:");
    num = tecl.nextInt();

    for (i = 1; i <= num; i++) {
      for (j = i; j >= 1; j -= 1) {
        num_temp = i % j;
        // System.out.println(num_temp);

        if (num_temp == 0) {
          cont_primo++;
          //  System.out.println(cont_primo);
        }
        if (cont_primo > 2) {
          primo = false;
          cont_primo = 0;
        }
      }
      System.out.print("Nº:" + i + " -> ");
      if (primo == true) {
        System.out.print("primo.");
        System.out.println("");
        cont_primo = 0;
      } else {
        System.out.print("no primo.");
        System.out.println("");
        primo = true;
        cont_primo = 0;
      }
    }
  }
}
