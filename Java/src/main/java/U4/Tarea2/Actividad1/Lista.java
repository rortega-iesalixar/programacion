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
  private final Integer t_defecto = 10;
  private Integer indice;
  private Integer tabla[];

  // Constructor con tamaño por defecto.
  public Lista() {
    this.tabla = new Integer[t_defecto];
    indice = 0;
  }
  // Constructor 2.
  public Lista(Integer tamanio) {
    this.tabla = new Integer[tamanio];
    indice = 0;
  }

  // Método para ver contenido de la tabla.
  public void mostrar_tabla() {
    System.out.println("Contenido de la tabla: " + Arrays.toString(getTabla()));
  }

  // Método para comprobar la cantidad de elementos que tiene la tabla.
  public void mostrar_elementos() {
    System.out.println("La tabla tiene: " + indice + " elemento/s insertado/s en la lista.");
  }

  // Método insertar número al final de la lista.
  public void insertar_final(Integer num) {
    if (indice <= tabla.length - 1) {
      tabla[indice] = num;
      indice++;
    } else {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      tabla[indice] = num;
      indice++;
    }
  }

  // Método insertar número al principio de la lista.
  public void insertar_principio(Integer num) {
    if (indice == 0) {
      tabla[indice] = num;
      indice++;
    } else if (indice <= tabla.length - 1) {
      for (int i = indice; i > 0; i--) {
        tabla[i] = tabla[i - 1];
      }
      tabla[0] = num;
      indice++;
    } else {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      for (int i = indice; i > 0; i--) {
        tabla[i] = tabla[i - 1];
      }
      tabla[0] = num;
      indice++;
    }
  }

  // Comprobar si la lista está llena y hacer un solo bucle.
  // Método para insertar número en el índice deseado.
  public void insertar_numero(int num, int ind) {
    // Compruebo que el índice está dentro del tamaño de la tabla.
    if (ind >= 0 && ind < tabla.length) {

      // Sí no hay hueco, abro un espacio nuevo.
      if (indice == tabla.length) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
      }
      // Recorro la Lista y muevo las casillas necesarias hacia delante.
      for (int i = indice; i > ind - 1; i--) {
        tabla[i] = tabla[i - 1];
      }
      tabla[ind - 1] = num;
      indice++;
    } else {
      System.out.println("Índice no valido.");
    }
  }

  // Método para añadir al final de la Lista otra Lista que se le pase.
  public void insert_lista_final(Integer[] lista) {
    for (int i = 0; i < lista.length; i++) {
      if (indice == tabla.length) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
      }
      tabla[indice] = lista[i];
      indice++;
    }
  }

  // Método para eliminar objeto de la lista que se le pase como índice.
  public void eliminar_elemento(int ind) {
    // Copiamos los objetos de la siguiente casilla a la casilla anterior (desde el índice).
    for (int i = ind - 1; i < tabla.length - 1; i++) {
      tabla[i] = tabla[i + 1];
    }
    // Redimensionamos la Lista con un elemento menos.
    tabla = Arrays.copyOf(tabla, tabla.length - 1);
    indice--;
  }

  // Método para obtener el elemento que se le pase como índice.
  public void obtener_elemento(int ind) {
    System.out.println("El elemento que ocupa el índice " + ind + " es: " + tabla[ind - 1]);
  }

  // Método para buscar un número en la Lista.
  public Integer buscar_numero(Integer num) {
    for (Integer i = 0; i < indice; i++) {
      if (num == tabla[i]) {
        return i + 1;
      }
    }
    return -1;
  }

  // Método para representar la lista como una cadena de caracteres (String).
  public void repr_lista() {
    String cadena = "";
    for (int i = 0; i < tabla.length; i++) {
      if (i != 0) {
        cadena = cadena + ", " + tabla[i];
      } else {
        cadena = cadena + tabla[i];
      }
    }
    System.out.println(cadena);
  }

  // Get.

  public Integer[] getTabla() {
    return tabla;
  }
}
