package U2.Tarea8b;

import java.util.Scanner;

public class Ejer6 {
  public static void main(String[] args) {
    // Lo mismo que el 5 pero la pirámide hueca.

    // Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
    // El carácter con el que se pinta la pirámide también se debe pedir por teclado.

    Scanner tecl = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura de la pirámide:");
    int alturaIntroducida = tecl.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = tecl.next();

    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;

    while (altura < alturaIntroducida) {

      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }

      if (altura > 1) {
        System.out.print(relleno);
      }

      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////

    // base de la pirámide
    for (i = 1; i < altura * 2; i++) {
      System.out.print(relleno);
    }
  }
}
