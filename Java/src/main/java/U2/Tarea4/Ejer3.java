package U2.Tarea4;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas
    // decimales.

    float nota1, nota2, nota3;
    // float notamedia;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la nota Nº1 (con decimales):");
    nota1 = teclado.nextFloat();

    System.out.println("Introduzca la nota Nº2 (con decimales):");
    nota2 = teclado.nextFloat();

    System.out.println("Introduzca la nota Nº3 (con decimales):");
    nota3 = teclado.nextFloat();

    // int notamedia = (int) (nota1 + nota2 + nota3) / 3;

    System.out.println("La nota media es :" + Math.round((nota1 + nota2 + nota3) / 3));
  }
}
