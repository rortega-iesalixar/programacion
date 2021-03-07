package U7.Tarea1.Actividad2;

import java.util.ArrayList;
import java.util.Collections;

public class List2 {
  public static void main(String[] args) {
    // Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.

    ArrayList<Integer> lista = new ArrayList<Integer>();
    Integer num;
    int min = 1, max = 10;

    for (int i = 1; i <= 20; i++) {
      num = (int) (Math.random() * (max - min + 1) + (min));
      lista.add(num);
    }
    System.out.println(lista);

    // Comparator<Integer> comparador_inverso = Collections.reverseOrder();
    Collections.sort(lista, Collections.reverseOrder());
    System.out.println(lista);
  }
}
