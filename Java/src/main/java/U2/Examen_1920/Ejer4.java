package U2.Examen_1920;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números
    // enteros positivos introducidos por teclado. El programa terminará
    // cuando el usuario introduzca un número primo. Este último número no se tendrá en cuenta en
    // los cálculos. El programa debe indicar también cuántos
    // números ha introducido el usuario (sin contar el primo que sirve para salir).
    //
    // Ejemplo:
    // Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número
    // primo:
    // 6
    // 8
    // 15
    // 12
    // 23
    // Ha introducido 4 números no primos.
    // Máximo: 15
    // Mínimo: 6
    // Media: 10.25

    Scanner sc = new Scanner(System.in);
    int num, maximo = 0, minimo = 0, contador = 0;
    double media = 0;
    boolean no_primo = false;

    do {
      System.out.println(
          "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
      num = sc.nextInt();

      for (int i = num - 1; i >= 2; i -= 1) {
        if (num % i == 0) {
          no_primo = true;
          break;
        }
      }
      if (no_primo == true) {
        contador++;
        if (num > maximo) {
          maximo = num;
        }
        if (num < minimo || minimo == 0) {
          minimo = num;
        }
        media = media + num;
        no_primo = false;
      } else {
        no_primo = true;
      }

    } while (no_primo == false);

    System.out.println("Has introducido " + contador + " número no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + media);
  }
}
