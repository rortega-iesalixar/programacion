package U6.Tarea1.Actividad2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
  public static void main(String[] args) {
    // Actividad2: Diseñar una aplicación que pida al usuario su nombre y edad. Estos datos deben
    // guardarse en el fichero "datos.txt". Si este fichero existe, debe borrarse su contenido, y en
    // caso de no existir, debe crearse.

    String nombre;
    int edad;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca su nombre:");
    nombre = sc.nextLine();
    System.out.println("Introduzca su edad:");
    edad = sc.nextInt();

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros/datos.txt"));
      out.write("Nombre: " + nombre);
      out.newLine();
      out.write("Edad: " + edad);
      out.close();
    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }
}
