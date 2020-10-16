package U2.Tarea4;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Sería interesante disponer de un programa que pida como entrada un número decimal y lo
    // muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5

    float num;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número para su redondeo:");
    num = teclado.nextFloat();

    System.out.println("El número redondeado es: " + Math.round(num));
  }
}
