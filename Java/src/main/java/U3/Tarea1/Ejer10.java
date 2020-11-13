package U3.Tarea1;

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    // Escribir una función que decida si dos números enteros positivos son amigos. Dos números son
    // amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual
    // al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

    Scanner sc = new Scanner(System.in);
    long num1, num2;

    System.out.println("1. Introduzca un número entero positivo:");
    num1 = sc.nextLong();
    System.out.println("2. Introduzca otro número entero positivo:");
    num2 = sc.nextLong();

    if (funcion_amigos(num1) == num2 && funcion_amigos(num2) == num1) {
      System.out.println("Son números amigos.");
    } else {
      System.out.println("NO son números amigos.");
    }
  }

  public static long funcion_amigos(long n1) {
    long cont = 0;
    for (long i = n1 - 1; i >= 1; i -= 1) {
      if (n1 % i == 0) {
        cont = cont + i;
      }
    }
    return cont;
  }
}
