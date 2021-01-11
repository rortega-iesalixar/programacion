package Recuperacion_Eval_1;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor
    // nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda
    // usar long en lugar de int ya que el primero admite números más largos. Suponemos que el
    // usuario introduce correctamente los datos.
    //
    // Ejemplo:
    // Por favor, introduzca un número entero positivo: 406783
    // Introduzca la posición dentro del número: 3
    // Introduzca el nuevo dígito: 1
    // El número resultante es 401783

    long num, nuevo_num, num_aux = 0, num_aux2 = 0, num_aux3 = 0, resto;
    int poscion, nuevo_digt, cant_num = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo:");
    num = sc.nextLong();
    System.out.println("Introduzca la posición dentro del número:");
    poscion = sc.nextInt();
    System.out.println("Introduzca el nuevo dígito:");
    nuevo_digt = sc.nextInt();

    for (long i = num; i > 0; i /= 10) {
      cant_num++;
    }

    for (long i = num; i > cant_num - poscion; i /= 10) {
      num_aux = i;
      resto = i % 10;
      if (num_aux2 == 0) {
        num_aux2 = num_aux2 + resto;
      } else {
        num_aux2 = (num_aux2 * 10) + resto;
      }
    }

    for (long i = 1; i < cant_num; i--) {
      resto = i % 10;
      if (num_aux3 == 0) {
        num_aux3 = num_aux3 + resto;
      } else {
        num_aux3 = (num_aux3 * 10) + resto;
      }
    }

    nuevo_num = (num_aux * 10) + nuevo_digt;

    for (int i = 1; i < cant_num; i++) {
      nuevo_num = nuevo_num * 10;
    }
    nuevo_num = nuevo_num + num_aux3;

    System.out.println(cant_num + " y " + nuevo_num);
    // System.out.println("El número resultante es " + nuevo_num);
  }
}
