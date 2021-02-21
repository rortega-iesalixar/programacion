package U6.Tarea1.Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicherosNumeros {
  public static void main(String[] args) {
    // Actividad5: En el archivo numeros.txt disponemos de una serie de números (uno por cada
    // línea). Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.

    int num_min, num_max, num_int;
    String num_cadena;

    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//numeros.txt"));
      num_cadena = in.readLine();
      // String num_cadena2 = num_cadena;

      num_int = Integer.parseInt(num_cadena);
      num_min = num_int;
      num_max = num_int;

      while (num_cadena != null) {
        num_int = Integer.parseInt(num_cadena);

        if (num_int < num_min) {
          num_min = num_int;
        }
        if (num_int > num_max) {
          num_max = num_int;
        }
        num_cadena = in.readLine();
      }
      in.close();
      System.out.println(
          "El número más grande es: " + num_max + " y el más pequeño es: " + num_min);
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }
}
