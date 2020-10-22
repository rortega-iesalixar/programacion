package U2.Tarea8;

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    // Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su
    // tabla de multiplicar. El código debe asegurarse de que el número introducido está entre 1 y
    // 10, y si no es así, volver a pedirlo hasta que lo cumpla.

    int num, i, x;
    Scanner tecl = new Scanner(System.in);

    do {
      System.out.println("Introduzca un número (entre 1 y 10):");
      num = tecl.nextInt();
      // System.out.println(num);
      if (num >= 1 && num <= 10) {
        for (i = 1; i <= 10; i++) {
          System.out.println("Multiplicar: " + num + " x " + i + " = " + num * i);
        }
        break;
      } else {
        System.out.println("El número introducido no está entre los valores indicados.");
      }
    } while (num <= 1 || num >= 10);
  }
}
