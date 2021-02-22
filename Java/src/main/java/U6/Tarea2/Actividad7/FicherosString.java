package U6.Tarea2.Actividad7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FicherosString {
  public static void main(String[] args) {
    // Actividad 7. Escribir por teclado una frase y guardarla en un archivo binario. A
    // continuación, recuperarla del archivo y mostrarla por pantalla.

    String frase = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca frase a guardar en archivo binario:");
    frase = sc.nextLine();

    ObjectOutputStream out = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
