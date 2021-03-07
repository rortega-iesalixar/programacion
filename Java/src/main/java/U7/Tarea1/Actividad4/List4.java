package U7.Tarea1.Actividad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List4 {
  public static void main(String[] args) {
    // Actividad 4: Introducir por consola una frase que conste exclusivamente de palabras separadas
    // por espacios. Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por
    // pantalla las palabras que estén repetidas. A continuación, mostrar las que no lo estén.

    int desde = 0, hasta = 0;
    String cadena, palabra;
    String palabras[];
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista_original = new ArrayList<>();
    ArrayList<String> lista_rep = new ArrayList<>();
    ArrayList<String> lista_no_rep = new ArrayList<>();

    System.out.println("Introduzca una cadena de texto separada por espacios:");
    cadena = sc.nextLine();
    palabras = cadena.split(" ");

    for (int i = 0; i < palabras.length; i++) {
      lista_original.add(palabras[i]);
    }

    Iterator<String> it = lista_original.iterator();
    while (it.hasNext()) {
      palabra = it.next();
      if (buscar_palabra(lista_original, palabra)) {
        lista_rep.add(palabra);
      } else {
        lista_no_rep.add(palabra);
      }
    }

    System.out.println("Lista original: " + lista_original);
    System.out.println("Lista con repetidas: " + lista_rep);
    System.out.println("Lista sin repetidas: " + lista_no_rep);
  }

  public static boolean buscar_palabra(ArrayList<String> l, String p) {
    Iterator<String> it = l.iterator();
    String otra_palabra;
    int contador = 0;

    while (it.hasNext()) {
      otra_palabra = it.next();
      if (p.equals(otra_palabra)) {
        contador++;
      }
    }

    if (contador > 1) {
      return true;
    } else {
      return false;
    }
  }
}
