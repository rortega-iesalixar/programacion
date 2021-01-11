package Recuperacion_Eval_1;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
    //
    // Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4
    // unidades. No hay que comprobar que los datos se introducen correctamente; podemos suponer que
    // el usuario los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un
    // pececito, que puede estar situado en cualquiera de las posiciones que quedan en el hueco que
    // forma el rectángulo.
    //
    // Ejemplo: Por favor, introduzca la altura de la pecera (como mínimo 4): 4
    //
    // Ahora introduzca la anchura (como mínimo 4): 7
    //
    // * * * * * * *
    // *           *
    // *       &   *
    // * * * * * * *

    int altura;
    int anchura;
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
    altura = sc.nextInt();
    System.out.println("Ahora introduzca la anchura (como mínimo 4):");
    anchura = sc.nextInt();

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= anchura; j++) {
        // Línea horizontal.
        if (i == 1 || i == altura) {
          System.out.print("* ");
        } else {
          if (j == 1 || j == anchura) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
      }

      // Salto de línea.
      System.out.println("");
    }
  }
}
