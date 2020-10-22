package U2.Tarea8;

public class Ejer7 {
  public static void main(String[] args) {
    // Diseñar un programa que muestre el producto de los 10 primeros números impares.

    int num1 = 1, num2, i = 1;

    while (i != 11) {
      num2 = num1 % 2;

      if (num2 != 0) {
        System.out.println("Mostrando Nº " + i + ": " + num1 + " (impar) " + num1 * num1);
        i++;
        num1++;
      } else {
        num1++;
      }
    }
  }
}
