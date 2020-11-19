package U3.Tarea3;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La
    // aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5 (siendo
    // n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una
    // combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor
    // menor o igual que el correspondiente de la combinación secreta.
    //
    // Ejemplo:
    // - Introduzca longitud de la clave
    // - 3
    // - (se genera la clave secreta, por ejemplo 152)
    // - Intente acertarla
    // - 351
    // - 3 es mayor,
    // - 5 es igual,
    // - 1 es menor
    // - Intente acertarla de nuevo
    // ...

    Scanner sc = new Scanner(System.in);
    int[] array_digitos, array_acierto;
    int num_acierto, n_digitos, n_temp = 0, valor_array, contador_aciertos = 0;

    System.out.println("Introduzca longitud de la clave:");
    n_digitos = sc.nextInt();
    array_digitos = new int[n_digitos];
    array_acierto = new int[n_digitos];

    // Creamos la clave aleatoria
    for (int i = 0; i < array_digitos.length; i++) {
      array_digitos[i] = (int) (Math.random() * 5 + 1);
      // System.out.print(array_digitos[i]);
    }
    System.out.println("");

    do {
      System.out.println(
          "Intente acertar la clave, introduzca "
              + n_digitos
              + " dígitos (del 1 al 5 cada dígito).");
      num_acierto = sc.nextInt();

      // Guardamos en el segundo array la clave introducida por el usuario.
      for (int i = 0; i < array_acierto.length; i++) {
        valor_array = (array_acierto.length - 1) - i;
        n_temp = num_acierto % 10;
        array_acierto[valor_array] = n_temp;
        num_acierto /= 10;
        // System.out.println(array_acierto[valor_array]);
      }
      System.out.println("");

      // Recorremos y comparamos ambas claves.
      for (int i = 0; i < array_digitos.length; i++) {
        if (array_digitos[i] > array_acierto[i]) {
          System.out.println(array_acierto[i] + " es menor.");
        }
        if (array_digitos[i] < array_acierto[i]) {
          System.out.println(array_acierto[i] + " es mayor.");
        }
        if (array_digitos[i] == array_acierto[i]) {
          System.out.println(array_acierto[i] + " es igual.");
          contador_aciertos++;
        }
      }

      // Decidimos si las claves son iguales o no.
      if (contador_aciertos == array_digitos.length) {
        System.out.println("");
        System.out.println("Acertaste!");
      } else {
        System.out.println("");
        System.out.println("Fallaste...");
        contador_aciertos = 0;
        System.out.println("");
      }

    } while (contador_aciertos != array_digitos.length);
  }
}
