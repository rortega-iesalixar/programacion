package U6.Tarea2.Actividad7;

import java.io.*;
import java.util.Scanner;

public class FicherosString {
  public static void main(String[] args) {
    // Actividad 7. Escribir por teclado una frase y guardarla en un archivo binario. A
    // continuación, recuperarla del archivo y mostrarla por pantalla.

    String frase_out = "";
    String cadena_in = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca frase a guardar en archivo binario:");
    frase_out = sc.nextLine();

    ObjectOutputStream out = null;
    ObjectInputStream in = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
      out.writeObject(frase_out);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));
      cadena_in = (String) in.readObject();
      in.close();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println();
    System.out.println("Mostrando cadena...");
    System.out.println(cadena_in);
  }
}
