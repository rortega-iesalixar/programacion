package U6.Tarea1.Actividad1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
  public static void main(String[] args) throws FileNotFoundException {
    // Actividad1: Realizar un programa que solicite al usuario el nombre de un fichero de texto y
    // muestre su contenido en pantalla. Si no se proporciona ningún nombre de fichero, la
    // aplicación utilizará por defecto "prueba.txt".

    String nom_fichero;
    String texto = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el nombre del fichero a leer:");
    nom_fichero = sc.nextLine();

    if (nom_fichero.isEmpty()) {
      nom_fichero = "Ficheros//prueba.txt";
    } else {
      nom_fichero = "Ficheros//" + nom_fichero;
    }

    try {
      BufferedReader fich = new BufferedReader(new FileReader(nom_fichero));
      String linea = fich.readLine();
      while (linea != null) {
        texto += linea;
        linea = fich.readLine();
      }
      fich.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }

    System.out.println(texto);
  }
}
