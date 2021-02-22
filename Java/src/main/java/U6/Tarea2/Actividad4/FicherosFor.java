package U6.Tarea2.Actividad4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FicherosFor {
  public static void main(String[] args) {
    // Actividad 4. Pedir un entero n por consola. A continuación, pedir n números double, que
    // iremos guardando en una tabla. Guardar la tabla en un archivo binario.

    int tope;
    double num;
    double tabla[];
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la cantidad de números a pedir:");
    tope = sc.nextInt();
    tabla = new double[tope];

    for (int i = 0; i < tope; i++) {
      System.out.println("Introduzca número a guardar:");
      num = sc.nextDouble();
      tabla[i] = num;
    }

    ObjectOutputStream out;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//datos.dat"));
      out.writeObject(tabla);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
