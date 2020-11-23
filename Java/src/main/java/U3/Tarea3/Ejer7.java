package U3.Tarea3;

import java.util.Scanner;

public class Ejer7 {
  public static void main(String[] args) {
    // Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
    // educativo. Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros)
    // de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del
    // tercero. Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del
    // alumno que se encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3
    // vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los
    // trimestres y las columnas los alumnos).

    // Notas de 5 alumnos en 3 trimestres.
    int[][] array_notas = {{6, 8, 5}, {7, 9, 10}, {9, 6, 3}, {4, 1, 8}, {2, 6, 7}};
    Scanner sc = new Scanner(System.in);
    int pos, mediatri_1 = 0, mediatri_2 = 0, mediatri_3 = 0, media_alu = 0;

    System.out.println("¿De qué alumno desea conocer su media? (número del 1 al 5):");
    pos = sc.nextInt() - 1;

    // Columnas
    for (int i = 0; i < array_notas.length; i++) {
      // Filas
      for (int j = 0; j < array_notas[i].length; j++) {
        if (i == pos) {
          media_alu = media_alu + array_notas[i][j];
        }
        // Primer trimestre
        if (array_notas[i][j] == array_notas[i][0]) {
          mediatri_1 = mediatri_1 + array_notas[i][j];
        }
        // Segundo trimestre
        if (array_notas[i][j] == array_notas[i][1]) {
          mediatri_2 = mediatri_2 + array_notas[i][j];
        }
        // Tercer trimestre
        if (array_notas[i][j] == array_notas[i][2]) {
          mediatri_3 = mediatri_3 + array_notas[i][j];
        }
      }
    }
    System.out.println("");
    System.out.println("Media trimestre 1: " + (mediatri_1 / 5));
    System.out.println("Media trimestre 2: " + (mediatri_2 / 5));
    System.out.println("Media trimestre 3: " + (mediatri_3 / 5));
    System.out.println("La media del alumno " + (pos + 1) + " es: " + (media_alu / 3));
  }
}
