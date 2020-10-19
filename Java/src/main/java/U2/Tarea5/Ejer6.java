package U2.Tarea5;

import java.util.Scanner;

public class Ejer6 {
  public static void main(String[] args) {
    // Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el
    // valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo). Nota: si
    // el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

    final double gravedad = 9.8;
    double tiempo;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el valor de tiempo:");
    tiempo = teclado.nextDouble();

    if (tiempo > 0) {
      System.out.println("Velocidad = Gravedad * Tiempo: " + (gravedad * tiempo));
    } else {
      System.out.println("Tiempo introducido incorrecto.");
    }
  }
}
