package U6.Tarea1.Actividad6;

import java.io.*;
import java.util.Scanner;

public class FicherosFirmas {
  public static void main(String[] args) {
    // Actividad6: Un libro de firmas es útil para recoger todas las personas que han pasado por un
    // determinado lugar. Crear una aplicación que permita mostrar el libro de firmas o insertar un
    // nuevo nombre (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.

    Scanner sc = new Scanner(System.in);
    int opcion;
    String texto = "", nombre = "";

    System.out.println("Pulse 1 para mostrar el libro de firmas o 2 para insertar nuevo nombre.");
    opcion = sc.nextInt();
    sc.nextLine();

    if (opcion == 1) {
      try {
        BufferedReader in = new BufferedReader(new FileReader("Ficheros//firmas.txt"));
        texto = in.readLine();

        while (texto != null) {
          System.out.println(texto);
          texto = in.readLine();
        }
        in.close();

      } catch (IOException msg) {
        System.out.println(msg.getMessage());
      }
    } else if (opcion == 2) {
      System.out.println("Introduzca nuevo nombre para insertar en la lista:");
      nombre = sc.nextLine();

      if (buscar_persona(nombre)) {
        System.out.println("La persona ya está inscrita.");
      } else {
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//firmas.txt", true));
          out.write(nombre);
          out.newLine();
          out.close();
        } catch (IOException msg) {
          System.out.println(msg.getMessage());
        }
      }
    }
  }

  public static boolean buscar_persona(String nombre) {
    boolean encontrado = false;
    String texto = "";

    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//firmas.txt"));
      texto = in.readLine();

      while (texto != null) {
        // System.out.println(texto);
        if (texto.equals(nombre)) {
          encontrado = true;
          return encontrado;
        }
        texto = in.readLine();
      }
      in.close();

    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }

    return encontrado;
  }
}
