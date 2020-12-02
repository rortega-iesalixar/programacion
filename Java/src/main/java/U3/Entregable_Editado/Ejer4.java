package U3.Entregable_Editado;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Juego del buscaminas.
    // Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
    // columnas.
    //
    // A continuación rellenar t odo el vector colocando en cada casilla de manera aleatoria:
    // O bien un carácter X que significa que hay una bomba.
    // O bien un carácter - que significa que esa casilla no nada.
    // A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
    //
    // En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar
    // por pantalla la cantidad de bombas que hay en las casillas de alrededor.
    //
    // Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que
    // el usuario encuentre una bomba).
    //
    // NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.

    Scanner sc = new Scanner(System.in);
    int tablero, num_temp, pos_fila, pos_colum;
    String bomba_vacia = "X-";
    boolean bomba = false;

    System.out.println("Introduzca tamaño del tablero:");
    tablero = sc.nextInt();
    String array_minas[][] = new String[tablero][tablero];

    System.out.println("");
    System.out.println("Tablero:");
    for (int i = 0; i < array_minas.length; i++) {
      for (int j = 0; j < array_minas[i].length; j++) {
        num_temp = (int) (Math.random() * 2);
        array_minas[i][j] = bomba_vacia.substring(num_temp, num_temp + 1);
        System.out.print(array_minas[i][j] + " ");
      }
      System.out.println(" ");
    }

    do {
      System.out.println(" ");
      System.out.println("Introduzca posición de la fila:");
      pos_fila = sc.nextInt();
      System.out.println("Introduzca posición de la columna:");
      pos_colum = sc.nextInt();

      if (array_minas[pos_fila][pos_colum].equals("X")) {
        System.out.println("Has encontrado una bomba!");
        bomba = true;
      } else {
        System.out.println(
            "No es una bomba, a su alrededor hay "
                + funcion_buscar_bombas(array_minas, pos_fila, pos_colum)
                + " bomba/s...");
        System.out.println("");
        for (int i = 0; i < array_minas.length; i++) {
          for (int j = 0; j < array_minas[i].length; j++) {
            System.out.print(array_minas[i][j] + " ");
          }
          System.out.println("");
        }
      }
    } while (bomba == false);
  }

  public static int funcion_buscar_bombas(String array[][], int fila, int columna) {
    int bombas = 0, temp_fila, temp_columna;

    // Tendríamos que hacer 8 diferentes posibilidades para buscar bombas.
    // 1. Restar fila (Buscar en la casilla de arriba).
    while (fila != 0) {
      temp_fila = fila - 1;
      temp_columna = columna;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 2. Restar fila y restar columna (Buscar en la casilla superior izquierda)
    while (fila != 0 && columna != 0) {
      temp_fila = fila - 1;
      temp_columna = columna - 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 3. Restar columna (buscar en la callida de la izquierda)
    while (columna != 0) {
      temp_fila = fila;
      temp_columna = columna - 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 4. Sumar fila y restar columna (buscar en la casilla inferior izquierda)
    while (fila != (array.length - 1) && columna != 0) {
      temp_fila = fila + 1;
      temp_columna = columna - 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 5. Sumar fila (buscar en la casilla de abajo)
    while (fila != (array.length - 1)) {
      temp_fila = fila + 1;
      temp_columna = columna;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 6. Sumar fila y sumar columna (buscar en la casilla inferior derecha)
    while (fila != (array.length - 1) && columna != (array[fila].length) - 1) {
      temp_fila = fila + 1;
      temp_columna = columna + 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 7. Sumar columna (buscar en la casilla de la derecha)
    while (columna != (array[fila].length - 1)) {
      temp_fila = fila;
      temp_columna = columna + 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    // 8. Restar fila y sumar columna (buscar en la casilla superior derecha)
    while (fila != 0 && columna != (array[fila].length - 1)) {
      temp_fila = fila - 1;
      temp_columna = columna + 1;
      if (array[temp_fila][temp_columna].equals("X")) {
        bombas++;
        break;
      } else {
        break;
      }
    }
    return bombas;
  }
}
