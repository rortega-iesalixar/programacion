package U2.Tarea8;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos
    // estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas
    // sea negativa. La aplicación mostrará la suma de las edades, la media, de cuántos alumnos
    // hemos introducido su edad, y cuántos alumnos son mayores de edad.

    int edad, suma_edad, media_edad, mayor_edad;
    Scanner teclado = new Scanner(System.in);
    suma_edad = 0;
    media_edad = 0;
    mayor_edad = 0;

    System.out.println("Introduzca la edad del alumno (número negativo para terminar):");
    edad = teclado.nextInt();

    while (edad >= 0) {
      suma_edad = suma_edad + edad;
      media_edad++;
      if (edad > 17) {
        mayor_edad++;
      }

      System.out.println("Introduzca la edad del alumno (número negativo para terminar):");
      edad = teclado.nextInt();
    }
    System.out.println("La suma de las edades es: " + suma_edad);
    System.out.println("La media de las edades es: " + (suma_edad / media_edad));
    System.out.println("Son mayores de edad: " + mayor_edad);
  }
}
