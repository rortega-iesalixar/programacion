package U2.Tarea3;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {

    // Crea un programa que calcule y muestre la división de dos números reales de doble precisión
    // introducidos por el usuario.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    double num1 = teclado.nextDouble();

    System.out.println("Introduzca otro número:");
    double num2 = teclado.nextDouble();

    System.out.println("El resultado de la división es: " + (num1 / num2));
  }
}
