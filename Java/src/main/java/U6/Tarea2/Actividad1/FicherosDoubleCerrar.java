package U6.Tarea2.Actividad1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FicherosDoubleCerrar {
  public static void main(String[] args) {
    // Actividad 1. Pedir un double por consola y guardarlo en un archivo binario.
    double num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número real:");
    num = sc.nextDouble();

    ObjectOutputStream out = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
      out.writeDouble(num);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      try {
        if (out != null) {
          out.close();
        }
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
