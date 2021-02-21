package U6.Tarea1.Actividad3;

import java.io.*;
import java.util.Scanner;

public class FicheroDuplicar {
  public static void main(String[] args) {
    // Actividad3: Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
    //
    // 1. Duplicaremos el fichero original.txt en uno que se llame copia.txt
    // 2. Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el
    // prefijo "copia_de".

    String nom_fichero;
    Scanner sc = new Scanner(System.in);
    int opcion;

    System.out.println("Introduzca opción 1 o 2 (versión 1/2 duplicar):");
    opcion = sc.nextInt();
    sc.nextLine();

    if (opcion == 1) {
      duplicar1();
    } else {
      System.out.println("Introduzca el nombre del fichero fuente a duplicar:");
      nom_fichero = sc.nextLine();
      duplicar2(nom_fichero);
    }
  }

  public static void duplicar1() {
    String texto = "";
    try {
      BufferedReader fich = new BufferedReader(new FileReader("Ficheros//original.txt"));
      String linea = fich.readLine();

      while (linea != null) {
        texto += linea;

        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//copia.txt"));
          out.write(texto);
          out.newLine();
          out.close();
        } catch (IOException msg) {
          System.out.println(msg.getMessage());
        }

        linea = fich.readLine();
      }

      fich.close();

    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }

  public static void duplicar2(String fichero) {
    String fich_original = "Ficheros//" + fichero;
    String fich_copia = "Ficheros//copia_de_" + fichero;
    String texto = "";
    try {
      BufferedReader fich = new BufferedReader(new FileReader(fich_original));
      String linea = fich.readLine();

      while (linea != null) {
        texto = linea;
        System.out.println(texto);

        try {
          BufferedWriter out = new BufferedWriter(new FileWriter(fich_copia, true));
          out.write(texto);
          out.newLine();
          out.close();
        } catch (IOException msg) {
          System.out.println(msg.getMessage());
        }

        linea = fich.readLine();
      }

      fich.close();

    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }
}
