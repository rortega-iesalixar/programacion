package U2.Tarea8b;

import java.util.Scanner;

public class Ejer8 {
  public static void main(String[] args) {
    // Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
    // semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede
    // pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe
    // comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior
    // al primero.

    int hora_semana1, hora_semana2;
    String dia_semana1, dia_semana2;
    Scanner tecl = new Scanner(System.in);

    System.out.println("Introduzca primer día de la semana (1 a 7 - Lunes a Domingo):");
    dia_semana1 = tecl.nextLine();
    System.out.println("Introduzca hora del primer día:");
    hora_semana1 = tecl.nextInt();
    System.out.println("Introduzca segundo día de la semana (1 a 7 - Lunes a Domingo):");
    dia_semana2 = tecl.nextLine();
    System.out.println("Introduzca hora del segundo día:");
    hora_semana2 = tecl.nextInt();
  }
}
