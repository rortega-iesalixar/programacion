package U3.Entregable;

import java.util.Scanner;

public class Ejer4 {
  public static void main(String[] args) {
    // Juego del buscaminas
    //
    // Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
    // columnas.
    //
    // A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
    //
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
    int num, num_temp;
    String bomba_vacia = "X-", posicion;
    boolean bomba = false;

    System.out.println("Introduzca tamaño del tablero:");
    num = sc.nextInt();
    String array_minas[][] = new String[num][num];

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
      System.out.println("Introduzca una posición (Ejemplo 1,1):");
      posicion = sc.nextLine();

    } while (bomba == false);
  }
}
