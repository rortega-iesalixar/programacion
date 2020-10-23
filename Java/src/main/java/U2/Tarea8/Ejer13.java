package U2.Tarea8;

import java.util.Scanner;

public class Ejer13 {
  public static void main(String[] args) {
    // Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

    int nota, i, aprob = 0, condic = 0, susp = 0;
    Scanner tecl = new Scanner(System.in);

    for (i = 1; i <= 6; i++) {
      System.out.println("Introduce la nota del alumno Nº: " + i);
      nota = tecl.nextInt();

      if (nota < 4) {
        susp++;
      }
      if (nota == 4) {
        condic++;
      }
      if (nota > 4) {
        aprob++;
      }
    }
    System.out.println(
        "Alumnos, Aprobados: " + aprob + ". Condicionados: " + condic + ". Y Suspensos: " + susp);
  }
}
