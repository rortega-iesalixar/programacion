package U4.Tarea2.Actividad1;

// Actividad 1: Las listas son estructuras dinámicas de datos, donde se pueden insertar o eliminar
// elementos de un determinado tipo sin limitación de espacio. Implementar la clase Lista
// correspondiente a una lista de números de la clase Integer. Los números se guardarán en una
// tabla. Cuando falte espacio para un nuevo elemento, la tabla se redimensionará, incrementando la
// capacidad de la lista. Entre los métodos de la clase se incluirán:
//
// Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, y otro al que
// se le pasa como argumento el tamaño inicial de la tabla.
// Obtener el número de elementos insertados en la lista.
// Insertar un número al final de la lista.
// Insertar un número al principio de la lista.
// Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
// Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
// Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
// Obtener el elemento cuyo índice se pasa como parámetro.
// Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no
// está, devolver -1.
// Representar la lista con una cadena de caracteres.

import java.util.Arrays;

public class Lista {
  // Atributos.
  private final int t_defecto = 10;
  private int tabla[];

  // Constructor con tamaño 10 por defecto.
  public Lista() {
    this.tabla = new int[t_defecto];
  }
  // Constructor 2.
  public Lista(int tamanio) {
    this.tabla = new int[tamanio];
  }

  // Método para comprobar la cantidad de elementos que tiene la tabla.
  public void mostrar_elementos() {
    System.out.println("La tabla tiene: " + getTabla().length + " elementos.");
  }

  // Método para mostrar contenido de la lista.
  public void mostrar_lista() {
    System.out.println("Contenido de la lista: " + Arrays.toString(getTabla()));
  }

  // Método insertar número al final de la lista.
  public void insertar_final(int num) {
    this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
    this.tabla[tabla.length - 1] = num;
  }

  // Método insertar número al principio de la lista.
  public void insertar_principio(int num) {
    // Primero creamos un nuevo espacio en la lista.
    this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
    // A continuación movemos todos los datos una posición e insertamos al principio el nuevo dato.
    for (int i = this.tabla.length - 1; i > 0; i--) {
      this.tabla[i] = this.tabla[i - 1];
    }
    this.tabla[0] = num;
  }

  // Método para insertar número en el índice deseado.
  public void insertar_numero(int num, int indice) {
    this.tabla[indice - 1] = num;
  }

  // Método para añadir al final de la Lista otra Lista que se le pase.
  public void insert_lista_final(int[] lista) {
    // Guardamos la última posición de la lista.
    int posicion_final = this.tabla.length;
    // Redimensionamos la Lista que va a absorver a la segunda Lista.
    this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + lista.length);
    // Luego rellenamos la lista.
    int contador = 0;
    for (int i = posicion_final; i < this.tabla.length; i++) {
      this.tabla[i] = lista[contador];
      contador++;
    }
  }

  // Método para eliminar objeto de la lista que se le pase como índice.
  public void eliminar_elemento(int indice) {
    // Copiamos los objetos de la siguiente casilla a la casilla anterior (desde el índice).
    for (int i = indice - 1; i < this.tabla.length - 1; i++) {
      this.tabla[i] = this.tabla[i + 1];
    }
    // Redimensionamos la Lista con un elemento menos.
    this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
  }

  // Método para obtener el elemento que se le pase como índice.
  public void obtener_elemento(int indice) {
    System.out.println(
        "El elemento que ocupa el índice " + indice + " es: " + this.tabla[indice - 1]);
  }

  // Método para buscar un número en la Lista.
  public void buscar_numero(int num) {
    boolean encontrado = false;
    int indice = 0;
    for (int i = 0; i < this.tabla.length; i++) {
      if (num == this.tabla[i] && !encontrado) {
        encontrado = true;
        indice = i + 1;
      }
    }
    if (encontrado) {
      System.out.println("El número " + num + " se encuentra en el índice: " + indice);
    } else {
      System.out.println("-1");
    }
  }

  // Método para representar la lista como una cadena de caracteres (String).
  public void repr_lista() {
    String cadena = "";
    for (int i = 0; i < this.tabla.length; i++) {
      if (i != 0) {
        cadena = cadena + ", " + this.tabla[i];
      } else {
        cadena = cadena + this.tabla[i];
      }
    }
    System.out.println(cadena);
  }

  // Get.
  public int[] getTabla() {
    return tabla;
  }
}
