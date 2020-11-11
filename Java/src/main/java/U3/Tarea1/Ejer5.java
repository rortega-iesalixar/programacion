package U3.Tarea1;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un
    // poco, no hagas el algoritmo de comparación de los 3 números desde cero.

    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("1. Introduzca un número:");
    num1 = sc.nextInt();
    System.out.println("2. Introduzca otro número:");
    num2 = sc.nextInt();
    System.out.println("3. Introduzca otro número:");
    num3 = sc.nextInt();

    System.out.println(
        "El mayor de los tres es: " + funcion_mayor(num1, funcion_mayor(num2, num3)));
  }

  public static int funcion_mayor(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
}
