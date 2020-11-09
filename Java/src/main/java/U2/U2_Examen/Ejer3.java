package U2.U2_Examen;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Escribe un programa que pida dos números por teclado y que luego mezcle en
    // dos números diferentes los dígitos pares y los impares. Se van comprobando
    // los dígitos de la siguiente manera: primer dígito del primer número, primer
    // dígito del segundo número, segundo dígito del primer número, segundo
    // dígito del segundo número, tercer dígito del primer número… Para facilitar
    // el ejercicio, podemos suponer que el usuario introducirá dos números de la
    // misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
    // long en lugar de int donde sea necesario para admitir números largos.
    //
    // Ejemplo 1:
    // Por favor, introduzca un número: 9402
    // Introduzca otro número: 6782
    // El número formado por los dígitos pares es 640822
    // El número formado por los dígitos impares es 97
    //
    // Ejemplo 2:
    // Por favor, introduzca un número: 137
    // Introduzca otro número: 909
    // El número formado por los dígitos pares es 0
    // El número formado por los dígitos impares es 19379
    //
    // NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS

    Scanner sc = new Scanner(System.in);
    long num1, num2, num_temp1, num_temp2, contador = 0, contador_2 = 0, contador_3 = 0;
    double par = 0, impar = 0;

    System.out.println("Por favor, introduca un número:");
    num1 = sc.nextLong();
    num_temp1 = num1;
    System.out.println("Introduzca otro número:");
    num2 = sc.nextLong();

    for (int i = 1; num_temp1 > 0; i++) {
      num_temp1 /= 10;
      contador++;
    }

    num_temp1 = num1;
    num_temp2 = num2;

    for (int i = 1; i <= contador; i++) {
      num_temp1 = num1 % 10;
      num1 /= 10;

      if (num_temp1 % 2 == 0) {
        par = par / 10 + num_temp1;
        contador_2++;
      } else {
        impar = impar / 10 + num_temp1;
        contador_3++;
      }

      num_temp2 = num2 % 10;
      num2 /= 10;

      if (num_temp2 % 2 == 0) {
        par = par / 10 + num_temp2;
        contador_2++;
      } else {
        impar = impar / 10 + num_temp2;
        contador_3++;
      }
    }
    for (int j = 1; j <= contador_2 - 1; j++) {
      par = par * 10;
    }

    for (int j = 1; j <= contador_3 - 1; j++) {
      impar = impar * 10;
    }

    System.out.println("El número formado por los dígitos pares es: " + (long) par);
    System.out.println("El número formado por los dígitos impares es: " + (long) impar);
  }
}
