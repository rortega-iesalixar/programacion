package U6.Tarea1.Actividad7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FicherosMore {
  public static void main(String[] args) {
    // Actividad7: En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo
    // muestra poco a poco (cada 24 líneas). Implementar un programa que funcione de forma similar.

    String nom_fichero;
    String texto = "", enter = "";
    int contador = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("(more) Introduzca el nombre del fichero a leer:");
    nom_fichero = sc.nextLine();

    if (nom_fichero.isEmpty()) {
      nom_fichero = "Ficheros//prueba.txt";
    } else {
      nom_fichero = "Ficheros//" + nom_fichero;
    }

    try {
      BufferedReader in = new BufferedReader(new FileReader(nom_fichero));
      String linea = in.readLine();
      while (linea != null) {
        if (contador == 24) {
          contador = 1;
          System.out.println();
          System.out.println("Linea 24, pulse enter para continuar...");
          enter = sc.nextLine();
        }
        contador++;
        texto = linea;
        System.out.println(texto);
        linea = in.readLine();
      }
      in.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }
}
