package U3.Tarea1;

import java.util.Scanner;

public class Ejer1 {

  public static void eco(int num) {
    for (int i = 1; i <= num; i++) {
      System.out.println("Eco...");
    }
  }

  public static void main(String[] args) {
    // Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por
    // pantalla n veces el mensaje "Eco..."

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    int num = sc.nextInt();
    eco(num);
  }
}
