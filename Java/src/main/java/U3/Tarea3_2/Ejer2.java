package U3.Tarea3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las
    // palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores a
    // continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce
    // el
    // programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
    // naranja,
    // rosa, negro,blanco y morado.

    String array_color_conocido[] = {"amarillo", "azul", "naranja", "rojo", "verde"};
    String array_color_intr[] = new String[8];
    String array_temp[] = new String[8];
    Scanner sc = new Scanner(System.in);
    int colores_iguales = 0;
    boolean encontrado = false;

    for (int i = 0; i < array_color_intr.length; i++) {
      System.out.println("Introduzca palabra Nº " + (i + 1) + " (hasta 8):");
      array_color_intr[i] = sc.nextLine();
      array_temp[i] = "*";
    }

    // Relleno el nuevo array con los colores en primer lugar.
    for (int i = 0; i < array_color_intr.length; i++) {
      for (int j = 0; j < array_color_conocido.length; j++) {
        if (array_color_intr[i].equals(array_color_conocido[j])) {
          array_temp[colores_iguales] = array_color_intr[i];
          colores_iguales++;
        }
      }
    }

    for (int i = 0; i < array_color_intr.length; i++) {
      for (int j = 0; j < array_temp.length; j++) {
        if (array_color_intr[i].equals(array_temp[j])) {
          encontrado = true;
        }
      }
      if (encontrado == false) {
        array_temp[colores_iguales] = array_color_intr[i];
        colores_iguales++;
      } else {
        encontrado = false;
      }
    }
    System.out.println(Arrays.toString(array_temp));
  }
}
