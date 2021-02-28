package U6.Tarea2.Actividad8;

import java.io.*;
import java.util.Arrays;

public class FicherosArrayNumeros {
  public static void main(String[] args) {
    // Actividad 8. Crear una tabla de números aleatorios menores que 100, ordenados de menor a
    // mayor, y guardarlos en un fichero binario. A continuación, recuperarlos y mostrarlos por
    // consola.

    int array_nums[] = new int[50];
    int array_in[] = new int[0];

    for (int i = 0; i < array_nums.length; i++) {
      array_nums[i] = (int) (Math.random() * (100 - 1) + (1));
    }
    Arrays.sort(array_nums);

    ObjectOutputStream out = null;
    ObjectInputStream in = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
      out.writeObject(array_nums);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//datos.dat"));
      array_in = (int[]) in.readObject();
      in.close();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println(ex.getMessage());
    }

    System.out.println();
    System.out.println("Mostrando tabla recuperada...");
    System.out.println(Arrays.toString(array_in));
  }
}
