package U2.Tarea8;

import java.util.Scanner;

public class Ejer9 {
  public static void main(String[] args) {
    // Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el
    // árbol más alto. Para ello se introducirán por teclado las alturas en cms de cada árbol,
    // terminando cuando se introduzca -1. Los árboles se identifican mediante etiquetas con números
    // correlativos, comenzando en 0.

    int arbol, i = 0, temp_arbol = 0, temp_i = 0;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("Introduzca tamaño del arbol en cm (-1 para terminar):");
      arbol = teclado.nextInt();

      if (arbol > temp_arbol) {
        temp_arbol = arbol;
        temp_i = i;
      }
      i++;
    } while (arbol != -1);
    System.out.println("El arbol más alto es el Nº: " + temp_i + " con " + temp_arbol + " cm.");
  }
}
