package U2.Tarea8b;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
    // programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
    // Lo siento, esa no es la combinación y si acertamos se nos dirá La caja fuerte se ha
    // abierto satisfactoriamente. Tendremos cuatro oportunidades para abrir la caja fuerte.

    int num_acceso = 1234, intento = 1, clave;
    Scanner tecl = new Scanner(System.in);

    do {
      System.out.println("Introduzca la clave de la caja fuerte, Intento Nº " + intento);
      clave = tecl.nextInt();
      if (clave == 1234) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        break;
      } else {
        System.out.println("Lo siento, esa no es la convinación.");
      }
      intento++;
    } while (clave != 1234 && intento < 5);
    System.out.println("Has sobrepasado los 4 intentos, adiós.");
  }
}
