package U2.Tarea6;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si
    // ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un
    // "operador condicional".

    int num, calc, par1, par2;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número entero:");
    num = teclado.nextInt();
    calc = num % 2;

    if (calc == 0) {
      par1 = 1;
    } else {
      par1 = 0;
    }

    par2 = num % 2 == 0 ? 1 : 0;

    System.out.println("Num1: " + par1 + " y Num2: " + par2);
  }
}
