package U3.Tarea1;

public class Ejer2 {
  public static void main(String[] args) {
    // Diseñar una  función a la que se le pasen dos enteros y muestre todos los números
    // comprendidos entre ellos.

    int a = 7, b = 14;
    funcion1(a, b);
  }

  public static void funcion1(int a, int b) {
    for (int i = a; i <= b; i++) {
      System.out.println("Número: " + i);
    }
  }
}
