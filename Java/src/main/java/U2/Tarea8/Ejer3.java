package U2.Tarea8;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir
    // probando números tratando de acertarlo. El programa debe indicar "mayor" o "menor" según el
    // número secreto sea mayor o menor que el introducido por el usuario. El proceso finaliza
    // cuando el usuario acierta o cuando se rinde (introduciendo un -1).

    int num_loco, num;
    Scanner teclado = new Scanner(System.in);
    num_loco = (int) (Math.random() * 100 + 1);
    System.out.println(num_loco);

    System.out.println("Se ha generado un número aleatorio del 1 al 100, adivine cual es:");
    num = teclado.nextInt();

    while (num != num_loco && num != -1) {
      if (num > num_loco) {
        System.out.println("Has fallado, el número es más bajo.");
      } else {
        System.out.println("Has fallado, el número es más alto.");
      }
      System.out.println("Vuelva a intentarlo (-1 para salir):");
      num = teclado.nextInt();
    }
    if (num == -1) {
      System.out.println("Te has rendido...");
    } else {
      System.out.println("Has acertado!");
    }
  }
}
