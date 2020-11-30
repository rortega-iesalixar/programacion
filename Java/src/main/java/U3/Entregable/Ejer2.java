package U3.Entregable;

import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public String convierteEnMorse(int n)
    //
    // Esta función convierte el número n al sistema Morse y lo devuelve en una
    // cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
    // Morse. Utiliza esta función en un programa para comprobar que funciona bien.
    // Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
    // desde el programa principal.
    //
    // 1 . _ _ _ _ 6 _ . . . .
    // 2 . . _ _ _ 7 _ _ . . .
    // 3 . . . _ _ 8 _ _ _ . .
    // 4 . . . . _ 9 _ _ _ _ .
    // 5 . . . . . 0 _ _ _ _ _

    int num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número entero para convertir a código Morse:");
    num = sc.nextInt();
    System.out.println("");
    System.out.println("Su código Morse es: " + convierteEnMorse(num));
  }

  public static String convierteEnMorse(int n) {
    String codigo = "";
    int num_temp;
    String array_morse[] = {
      "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
    };

    // Convertidor.
    for (int i = n; i > 0; i /= 10) {
      num_temp = i % 10;
      codigo = array_morse[num_temp] + codigo;
    }
    return codigo;
  }
}
