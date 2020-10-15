package U2.Tarea2;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una longitud en millas:");
    int millas = teclado.nextInt();
    System.out.println();

    System.out.println(millas + " millas son: " + millas * 1609 + " metros.");
    //  System.out.print(" millas son: ");
    // System.out.print(millas * 1609);
    // System.out.println(" metros.");
  }
}
