package U7.Tarea1.Actividad3;

import java.util.ArrayList;
import java.util.Iterator;

public class List3 {
  public static void main(String[] args) {
    // Actividad 3: Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos
    // por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.

    ArrayList<Integer> lista = new ArrayList<Integer>();
    Integer num;
    int max = 10, min = 1, posicion = 0;

    num = (int) (Math.random() * (max - min + 1) + (min));
    lista.add(num);

    for (int i = 1; i <= 19; i++) {
      num = (int) (Math.random() * (max - min + 1) + (min));
      posicion = posicion(lista, num);
      lista.add(posicion, num);
    }
    System.out.println(lista);
  }

  public static int posicion(ArrayList<Integer> lista, Integer num) {
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
}
