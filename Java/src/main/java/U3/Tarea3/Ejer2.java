package U3.Tarea3;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
    // continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los
    // mostrará en el orden inverso al introducido.

    Scanner sc = new Scanner(System.in);
    int cantidad_num;
    int[] array_numeros;

    System.out.println("¿Cuántos números desea introducir?:");
    cantidad_num = sc.nextInt();
    array_numeros = new int[cantidad_num];

    System.out.println("");
    for (int i = 0; i < array_numeros.length; i++) {
      System.out.println("Introduca número " + i + ":");
      array_numeros[i] = sc.nextInt();
    }

    System.out.println("");
    for (int i = array_numeros.length - 1; i >= 0; i--) {
      System.out.println("El Array Nº" + i + " contiene: " + array_numeros[i]);
    }
  }
}
