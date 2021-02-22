package U6.Tarea2.Actividad2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FicherosDoubleAbrir {
  public static void main(String[] args) {
    // Actividad 2. Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por
    // pantalla.
    ObjectInputStream in = null;

    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));
      double num = in.readDouble();
      System.out.println("El número double guardado es el: " + num);
      in.close();
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
