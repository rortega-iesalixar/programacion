package U2.Examen_1920;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado realizar
    // un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que
    // debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto,
    // el programa deberá mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
    // La anchura de la figura siempre será de 6 caracteres.
    //
    // Ejemplo 1:
    //
    // Por favor, introduzca la altura (número impar mayor o igual a 5): 8
    // La altura introducida no es correcta
    //
    // Ejemplo 2:
    // Por favor, introduzca la altura (número impar mayor o igual a 5): 3
    // La altura introducida no es correcta
    //
    // Ejemplo 3:
    // Por favor, introduzca la altura (número impar mayor o igual a 5): 5
    //
    //
    // MMMMMM
    // M    M
    // MMMMMM
    // M    M
    // MMMMMM
    //
    // Ejemplo 4:
    // Por favor, introduzca la altura (número impar mayor o igual a 5): 9
    //
    //
    // MMMMMM
    // M    M
    // M    M
    // M    M
    // MMMMMM
    // M    M
    // M    M
    // M    M
    // MMMMMM

    Scanner sc = new Scanner(System.in);
    int altura, ancho = 6;

    System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
    altura = sc.nextInt();

    if (altura >= 5 && altura % 2 != 0) {
      for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= ancho; j++) {
          if (i == 1 || i == (altura + 1) / 2 || i == altura) {
            System.out.print("M");
          } else {
            if (j == 1 || j == 6) {
              System.out.print("M");
            } else {
              System.out.print(" ");
            }
          }
        }
        System.out.println("");
      }
    } else {
      System.out.println("La altura introducida no es correcta.");
    }
  }
}
