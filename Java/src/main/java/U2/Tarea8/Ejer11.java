package U2.Tarea8;

public class Ejer11 {
  public static void main(String[] args) {
    // Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

    int i = 1, j = 1, x;

    for (i = 1; i <= 10; i++) {
      System.out.println("Tabla del " + j + ": " + j + " x " + i + " = " + j * i);
      if (i == 10) {
        j++;
        i = 1;
        System.out.println("");
      }
      if (j > 10) {
        break;
      }
    }
  }
}
