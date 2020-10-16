package U2.Tarea4;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Necesitamos una aplicación que calcule la media aritmética de dos notas enteras. Hay que
    // tener en cuenta que la media puede contener decimales.

    float nota1, nota2;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la nota Nº1 (sin decimales):");
    nota1 = teclado.nextInt();

    System.out.println("Introduzca la nota Nº2 (sin decimales):");
    nota2 = teclado.nextInt();

    System.out.println("La nota media es :" + ((nota1 + nota2) / 2));
  }
}
