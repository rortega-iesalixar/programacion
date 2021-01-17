package U4.Tarea1.Actividad10;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // Principal.
    int segundos, minutos, horas, n;

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca hora (0-23):");
    horas = sc.nextInt();
    System.out.println("Introduzca minutos (0-59):");
    minutos = sc.nextInt();
    System.out.println("Introduzca segundos (0-59):");
    segundos = sc.nextInt();

    Hora h1 = new Hora(horas, minutos, segundos);
    h1.mostrar_hora();

    System.out.println("Introduzca los segundos que quiere sumar a la hora actual:");
    n = sc.nextInt();
    h1.sumar_segundos(n);
    h1.mostrar_hora();
  }
}
