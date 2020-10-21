package U2.Tarea7;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos
    // almacenar en la variable booleana "jasp" el valor:
    //
    // - Verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los
    // ingresos superan los 28000 (euros).
    // - Falso. En caso contrario.
    // - Escribe el código necesario para inicializar "jasp" en una línea.

    int edad, nivel_de_estudios, ingresos;
    boolean jasp = false;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca Edad:");
    edad = teclado.nextInt();
    System.out.println("Introduzca Nivel de Estudios (valor numérico del 1 al 6):");
    nivel_de_estudios = teclado.nextInt();
    System.out.println("Introduzca Ingresos (en €):");
    ingresos = teclado.nextInt();

    if (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000) {
      jasp = true;
    }

    System.out.println("El valor de jasp es = " + jasp);
  }
}
