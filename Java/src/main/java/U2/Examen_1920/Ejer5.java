package U2.Examen_1920;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
    //
    // Ejemplo:
    // Entrada: cad = "Hola tu"
    // Salida: La cantidad de vocales es 3

    String cadena, cadena_minus, letra;
    int contador = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una cadena de texto:");
    cadena = sc.nextLine();

    for (int i = 0; i <= cadena.length() - 1; i++) {
      letra = cadena.substring(i, i + 1);
      // System.out.println(letra);
      if (letra.equalsIgnoreCase("a")
          || letra.equalsIgnoreCase("e")
          || letra.equalsIgnoreCase("i")
          || letra.equalsIgnoreCase("o")
          || letra.equalsIgnoreCase("u")) {
        contador++;
      }
    }
    System.out.println("La cantidad de vocales es: " + contador);
  }
}
