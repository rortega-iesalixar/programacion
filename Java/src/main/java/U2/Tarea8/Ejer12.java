package U2.Tarea8;

import java.util.Scanner;

public class Ejer12 {
  public static void main(String[] args) {
    // Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o
    // no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

    int nota, i;
    boolean suspenso = false;
    Scanner tecl = new Scanner(System.in);

    for (i = 1; i <= 5; i++) {
      System.out.println("(5 Notas) - Introduce la nota del alumno Nº: " + i);
      nota = tecl.nextInt();
      if (nota < 5) {
        suspenso = true;
      }
    }

    if (suspenso == true) {
      System.out.println("Hay algún alumno suspenso.");
    } else {
      System.out.println("No hay alumnos suspensos.");
    }
  }
}
