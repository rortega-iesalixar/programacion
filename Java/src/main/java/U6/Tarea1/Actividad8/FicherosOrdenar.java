package U6.Tarea1.Actividad8;

import java.io.*;

public class FicherosOrdenar {
  public static void main(String[] args) {
    // Actividad8: Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos
    // ordenados). Realizar un programa que lea ambos ficheros y que cree un tercer fichero
    // (todos.txt) con todos los nombres ordenados alfabéticamente.
    try {
      BufferedReader perso1 = new BufferedReader(new FileReader("Ficheros//perso1.txt"));
      BufferedReader perso2 = new BufferedReader(new FileReader("Ficheros//perso2.txt"));

      BufferedWriter todos = new BufferedWriter(new FileWriter("Ficheros//todos.txt"));

      String nombre1 = perso1.readLine();
      String nombre2 = perso2.readLine();

      while (nombre1 != null && nombre2 != null) {
        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
          todos.write(nombre1);
          todos.newLine();
          nombre1 = perso1.readLine();
        } else {
          todos.write(nombre2);
          todos.newLine();
          nombre2 = perso2.readLine();
        }
      }

      if (nombre1 == null) {
        while (nombre2 != null) {
          todos.write(nombre2);
          todos.newLine();
          nombre2 = perso2.readLine();
        }
      } else {
        todos.write(nombre1);
        todos.newLine();
        nombre1 = perso1.readLine();
      }
      perso1.close();
      perso2.close();
      todos.close();

    } catch (IOException msg) {
      System.out.println(msg.getMessage());
    }
  }
}
