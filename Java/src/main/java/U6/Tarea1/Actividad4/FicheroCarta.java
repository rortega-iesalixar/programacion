package U6.Tarea1.Actividad4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicheroCarta {
  public static void main(String[] args) {
    // Actividad4: Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos que
    // contar los caracteres, las líneas y las palabras. Para facilitar el procesamiento supondremos
    // que cada palabra está separada de otra por un único espacio en blanco.

    String fichero = "Ficheros//carta.txt";

    System.out.println(
        "El fichero carta.txt contiene: "
            + caracteres(fichero)
            + " caracteres, "
            + palabras(fichero)
            + " palabras y "
            + lineas(fichero)
            + " líneas.");
  }

  public static int caracteres(String fichero) {
    int caracter = 0;
    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//carta.txt"));
      int c = in.read();
      while (c != -1) {
        caracter++;
        c = in.read();
      }
      in.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
    return caracter;
  }

  public static int palabras(String fichero) {
    int palabra = 0;
    char caracter;
    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//carta.txt"));
      int c = in.read();
      caracter = (char) c;
      while (c != -1) {
        if (c == ' ') {
          palabra++;
        }
        c = in.read();
        caracter = (char) c;
      }
      in.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
    return palabra;
  }

  public static int lineas(String fichero) {
    int cont_linea = 0;
    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//carta.txt"));
      String lineas_fich = in.readLine();
      while (lineas_fich != null) {
        cont_linea++;
        lineas_fich = in.readLine();
      }
      in.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
    return cont_linea;
  }
}
