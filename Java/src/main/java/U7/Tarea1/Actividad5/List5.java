package U7.Tarea1.Actividad5;

import java.util.ArrayList;
import java.util.Iterator;

public class List5 {
  public static void main(String[] args) {
    // Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores que 100,
    // guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por
    // pantalla.

    ArrayList<Integer> lista = new ArrayList<Integer>();
    Integer num;
    int max = 100, min = 1, posicion = 0, contador = 1;
    boolean repetido;

    num = (int) (Math.random() * (max - min + 1) + (min));
    lista.add(num);

    while (contador < 20) {
      num = (int) (Math.random() * (max - min + 1) + (min));
      posicion = busca_posicion(lista, num);
      repetido = busca_repetido(lista, num);

      if (!repetido) {
        lista.add(posicion, num);
        contador++;
      }
    }

    System.out.println(lista);
  }

  public static int busca_posicion(ArrayList<Integer> lista, Integer num) {
    int posicion = 0;
    Iterator<Integer> it = lista.iterator();

    while (it.hasNext()) {
      Integer num_temp = it.next();
      if (num >= num_temp) {
        return posicion;
      } else {
        posicion++;
      }
    }
    return posicion;
  }

  public static boolean busca_repetido(ArrayList<Integer> lista, Integer num) {
    Iterator<Integer> it = lista.iterator();

    while (it.hasNext()) {
      Integer num_temp = it.next();
      if (num == num_temp) {
        return true;
      }
    }
    return false;
  }
}
