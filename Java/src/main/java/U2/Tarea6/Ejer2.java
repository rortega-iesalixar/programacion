package U2.Tarea6;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el
    // usuario. Por ejemplo, si el usuario introduce 3, deberá escribir "tres".

    int num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número del 1 al 10:");
    num = teclado.nextInt();

    if (num > 0 && num < 11) {
      switch (num) {
        case 1:
          System.out.println("Uno");
          break;
        case 2:
          System.out.println("Dos");
          break;
        case 3:
          System.out.println("Tres");
          break;
        case 4:
          System.out.println("Cuatro");
          break;
        case 5:
          System.out.println("Cinco");
          break;
        case 6:
          System.out.println("Seis");
          break;
        case 7:
          System.out.println("Siete");
          break;
        case 8:
          System.out.println("Ocho");
          break;
        case 9:
          System.out.println("Nueve");
          break;
        case 10:
          System.out.println("Diez");
          break;
      }
    } else {
      System.out.println("El número introducido no es correcto.");
    }
  }
}
