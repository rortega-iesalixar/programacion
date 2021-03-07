package U7.Tarea1.Actividad5;

import java.util.Comparator;
import java.util.TreeSet;

public class Set1 {
  public static void main(String[] args) {
    // Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores que 100,
    // guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por
    // pantalla.

    TreeSet<Integer> set_numeros =
        new TreeSet<Integer>(
            new Comparator<Integer>() {
              @Override
              public int compare(Integer o1, Integer o2) {
                int resultado = 0;

                if (o1 < o2) {
                  return 1;
                } else if (o1 > o2) {
                  return -1;
                } else {
                  return 0;
                }
              }
            });

    Integer num;
    int max = 100, min = 1;

    num = (int) (Math.random() * (max - min + 1) + (min));
    set_numeros.add(num);

    while (set_numeros.size() != 19) {
      num = (int) (Math.random() * (max - min + 1) + (min));
      set_numeros.add(num);
    }

    System.out.println(set_numeros);
  }
}
