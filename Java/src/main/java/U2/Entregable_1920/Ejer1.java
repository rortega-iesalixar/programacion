package U2.Entregable_1920;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres
    // notas que ha sacado el alumno en los tres primeros controles.
    // Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se
    // mostrará la media y la nota correspondiente .Atendiendo a esa media el alumno tendrá las
    // siguientes notas:
    //
    // Suficiente si la media en mayor o igual que 5 y menor que 6.
    // Bien si la media es mayor o igual que 6 y menor que 7.
    // Notable si la media es mayor o igual que 7 y menor que 9.
    // Sobresaliente en culaquier otro caso.
    // En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen
    // de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario
    // ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la
    // recuperación es apto, la nota será un 5; en caso contrario, se mantienela nota media
    // anterior.

    int nota1, nota2;
    String recu;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca la nota del primer control:");
    nota1 = tecl.nextInt();
    System.out.println("Introduzca la nota del segundo control:");
    nota2 = tecl.nextInt();

    tecl.nextLine();

    if ((nota1 + nota2) / 2 >= 5) {
      // Suficiente.
      if ((nota1 + nota2) / 2 >= 5 && (nota1 + nota2) / 2 < 6) {
        System.out.println(
            "Tu nota de Programación es: " + (double) (nota1 + nota2) / 2 + " - Suficiente.");
      }
      // Bien
      if ((nota1 + nota2) / 2 >= 6 && (nota1 + nota2) / 2 < 7) {
        System.out.println(
            "Tu nota de Programación es: " + (double) (nota1 + nota2) / 2 + " - Bien.");
      }
      // Notable
      if ((nota1 + nota2) / 2 >= 7 && (nota1 + nota2) / 2 < 9) {
        System.out.println(
            "Tu nota de Programación es: " + (double) (nota1 + nota2) / 2 + " - Notable.");
      }
      // Sobresaliente
      if ((nota1 + nota2) / 2 >= 9 && (nota1 + nota2) / 2 <= 10) {
        System.out.println(
            "Tu nota de Programación es: " + (double) (nota1 + nota2) / 2 + " - Sobresaliente.");
      }
    } else {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/ no apto):");
      recu = tecl.nextLine();

      if (recu.equals("apto")) {
        System.out.println("Tu nota de Programación es: 5 - Suficiente.");
      } else {
        System.out.println(
            "Tu nota de Programación es: " + (double) (nota1 + nota2) / 2 + " - Suspenso.");
      }
    }
  }
}
