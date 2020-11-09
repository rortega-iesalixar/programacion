package U3.Tarea1;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
    // especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para
    // volumen). Además, hemos de pasarle a la función el radio de la base y la altura.
    //
    // Área total:
    // AT = 2pi * r * (h + r)
    //
    // Volumen:
    // V = pi * r(al cuadrado) * h

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio de la base del cilindro:");
    int radio = sc.nextInt();
    System.out.println("Introduzca la altura del cilindro:");
    int altura = sc.nextInt();
    System.out.println("Introduzca 1 (para área) o 2 (para volumen):");
    int opcion = sc.nextInt();

    funcion_calc(radio, altura, opcion);
  }

  public static void funcion_calc(int radio, int altura, int opcion) {
    if (opcion == 1) {
      // Area
      System.out.println("Área Total = " + (2 * Math.PI * radio * (altura + radio)));
    }
    if (opcion == 2) {
      // Volumen
      System.out.println("Volumen = " + (Math.PI * (radio * radio) * altura));
    }
    if (opcion != 1 && opcion != 2) {
      System.out.println("No has introducido la opción correcta (1 o 2)...");
    }
  }
}
