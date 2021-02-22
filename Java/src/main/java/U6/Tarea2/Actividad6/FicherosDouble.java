package U6.Tarea2.Actividad6;

import java.io.*;
import java.util.Scanner;

public class FicherosDouble {
  public static void main(String[] args) throws IOException {
    // Actividad 6. En un fichero binario, sabemos que se ha guardado una serie de números double,
    // pero no sabemos cuántos. Implementar un programa que los lea todos y los muestre por
    // pantalla.

    double num;
    Scanner sc = new Scanner(System.in);

    ObjectOutputStream out = null;
    ObjectInputStream in = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));

      System.out.println("Introduzca un número (-1 para finalizar):");
      num = sc.nextInt();

      while (num > -1) {
        out.writeDouble(num);
        System.out.println("Introduzca otro número (-1 para finalizar):");
        num = sc.nextInt();
      }
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));

      while (true) {
        System.out.println(in.readDouble());
      }

    } catch (EOFException ex) {
      System.out.println("Final de fichero.");
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      try {
        if (in != null) {
          in.close();
        }
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
