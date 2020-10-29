package U2.U2_Entrega;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    // hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    // primero admite números más largos.
    //
    // Ejemplo 1:
    // Por favor, introduzca un número entero positivo: 406783
    // El 406783 contiene 4 dígitos pares y 2 dígitos impares.
    //
    // Ejemplo 2:
    // Por favor, introduzca un número entero positivo: 3177840
    // El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

    long num, num_temp, num_cuenta, resto;
    int par = 0, impar = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo:");
    num = sc.nextLong();
    num_temp = num;
    System.out.println("");

    while (num_temp > 0) {
      resto = num_temp % 10;
      num_temp /= 10;
      num_cuenta = resto % 2;
      if (num_cuenta == 0) {
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("");
    System.out.println(
        "El " + num + " contiene " + par + " dígitos pares y " + impar + " dígitos impares.");
  }
}
