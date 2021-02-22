package U6.Tarea2.Actividad5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class FicherosForLeer {
  public static void main(String[] args) {
    // Actividad 5. Leer de un fichero binario una tabla de números double. Mostrar el contenido de
    // la tabla por consola.

    double tabla[] = null;
    ObjectInputStream in;

    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));
      tabla = (double[]) in.readObject();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(Arrays.toString(tabla));
  }
}
