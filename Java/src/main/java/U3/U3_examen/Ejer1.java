package U3.U3_examen;

import java.util.Arrays;

public class Ejer1 {
  public static void main(String[] args) {
    // Define la función mezcla con la siguiente cabecera:
    //
    // public static int[] mezcla(int[] a, int[] b)
    //
    // Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de
    // mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a,
    // etc. Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los
    // números de un array se terminan de coger todos los que quedan del otro.
    //
    // Ejemplos:
    // Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
    // Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
    // Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
    // Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}

    int[] array_a = {8, 9, 0};
    int[] array_b = {7, 8, 9, 10, 5};

    System.out.println("Array a: " + Arrays.toString(array_a));
    System.out.println("Array b: " + Arrays.toString(array_b));
    System.out.println("Array mezcla (a, b): " + Arrays.toString(mezcla(array_a, array_b)));
  }

  public static int[] mezcla(int[] a, int[] b) {
    int[] array_c = new int[0];
    int contador_a = 0, contador_b = 0, contador_c = 0;

    while (contador_a < a.length || contador_b < b.length) {
      if (contador_a < a.length) {
        array_c = Arrays.copyOf(array_c, array_c.length + 1);
        array_c[contador_c] = a[contador_a];
        contador_a++;
        contador_c++;
      }

      if (contador_b < b.length) {
        array_c = Arrays.copyOf(array_c, array_c.length + 1);
        array_c[contador_c] = b[contador_b];
        contador_b++;
        contador_c++;
      }
    }
    return array_c;
  }
}
