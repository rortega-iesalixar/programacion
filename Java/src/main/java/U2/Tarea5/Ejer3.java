package U2.Tarea5;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

    int num, par;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    num = teclado.nextInt();

    par = num % 2;

    if (par == 0) {
      System.out.println("El número introducido es par.");
    } else {
      System.out.println("El número introducido es impar.");
    }
  }
}
