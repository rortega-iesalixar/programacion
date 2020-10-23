package U2.Tarea8;

import java.util.Scanner;

public class Ejer14 {
  public static void main(String[] args) {
    // Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para
    // ello asteriscos (*). Por ejemplo, para n=4:
    //
    // * * * *
    // * * *
    // * *
    // *

    int altura, altu_tem, i, j;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca altura del triángulo rectángulo:");
    altura = tecl.nextInt();
    altu_tem = altura;

    for (j = 1; j <= altura; j++) {
      for (i = altu_tem; i >= 1; i -= 1) {
        System.out.print("*");
      }
      altu_tem--;
      System.out.println("");
    }
  }
}
