package U6.Tarea2.Actividad3;

import java.io.*;
import java.util.Scanner;

public class FicherosInt {
  public static void main(String[] args) throws IOException {
    // Actividad 3. Pedir números enteros positivos por consola y guardarlos en un fichero binario
    // hasta que se introduzca un número negativo. Leer del fichero todos los enteros guardados y
    // mostrarlos por pantalla.

    int num;
    Scanner sc = new Scanner(System.in);

    ObjectOutputStream out = null;
    ObjectInputStream in = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));

      System.out.println("Introduzca un número (-1 para finalizar):");
      num = sc.nextInt();

      while (num > -1) {
        out.writeInt(num);
        System.out.println("Introduzca otro número (-1 para finalizar):");
        num = sc.nextInt();
      }
      out.close();

      while (true) {
        System.out.println(in.readInt());
      }

    } catch (EOFException ex) {
      System.out.println("Fin del fichero.");
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      try {
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
