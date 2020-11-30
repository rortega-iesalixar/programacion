package U3.Tarea3_2;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
    // podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el
    // alfil se mueve siempre en diagonal. El tablero cuenta con64 casillas. Las columnas se indican
    // con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
    // Introduzca la posición del alfil: d5
    // El alfil puede moverse a las siguientes posiciones:h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8

    String array_tablero[][] = new String[8][8];
    String letras = "abcdefgh", posion;
    int pos_colum = 0, pos_fila = 0, temp_colum = 0, temp_fila = 0;
    boolean encontrado = false;
    Scanner sc = new Scanner(System.in);

    // Creamos el tablero.
    for (int i = 0; i < array_tablero.length; i++) {
      for (int j = 0; j < array_tablero[i].length; j++) {
        array_tablero[i][j] = letras.substring(j, j + 1) + (array_tablero.length - i);
      }
    }

    // Introducimos la posición inicial.
    System.out.println("Introduzca la posición del alfil:");
    posion = sc.nextLine();
    System.out.println("");

    // Localizamos esa posición dentro del array/tablero.
    for (int i = 0; i < array_tablero.length; i++) {
      for (int j = 0; j < array_tablero[i].length; j++) {
        if (array_tablero[i][j].equals(posion)) {
          pos_fila = i;
          pos_colum = j;
          encontrado = true;
          break;
        }
      }
      if (encontrado == true) {
        break;
      }
    }
    // Variables temporales.
    temp_fila = pos_fila;
    temp_colum = pos_colum;

    // A continuación visualizaremos las diferentes posibilidades dentro del tablero.

    System.out.print("El alfil puede moverse a las siguientes posiciones: ");
    // 1.- Restamos filas y restamos columnas.
    while (temp_fila != 0 && temp_colum != 0) {
      temp_fila -= 1;
      temp_colum -= 1;
      System.out.print(array_tablero[temp_fila][temp_colum] + " ");
    }
    temp_fila = pos_fila;
    temp_colum = pos_colum;

    // 2.- Restamos filas y sumamos columnas.
    while (temp_fila != 0 && temp_colum != 7) {
      temp_fila -= 1;
      temp_colum += 1;
      System.out.print(array_tablero[temp_fila][temp_colum] + " ");
    }
    temp_fila = pos_fila;
    temp_colum = pos_colum;

    // 3.- Sumamos filas y sumamos columnas.
    while (temp_fila != 7 && temp_colum != 7) {
      temp_fila += 1;
      temp_colum += 1;
      System.out.print(array_tablero[temp_fila][temp_colum] + " ");
    }
    temp_fila = pos_fila;
    temp_colum = pos_colum;

    // 4.- Sumamos filas y restamos columnas.
    while (temp_fila != 7 && temp_colum != 0) {
      temp_fila += 1;
      temp_colum -= 1;
      System.out.print(array_tablero[temp_fila][temp_colum] + " ");
    }
    System.out.println("");
  }
}
