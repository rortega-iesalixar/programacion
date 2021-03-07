package U7.Tarea1.Actividad1;

import java.util.ArrayList;
import java.util.Collections;

public class List1 {
  public static void main(String[] args) {
    // Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100, y
    // guardarlos en el orden en que se vayan generando; mostrar por pantalla dicha lista una vez
    // creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.

    ArrayList<Integer> lista = new ArrayList<Integer>();
    Integer num;

    for (int i = 1; i <= 20; i++) {
      num = (int) (Math.random() * 100);
      lista.add(num);
    }
    System.out.println(lista);

    Collections.sort(lista);
    System.out.println(lista);
  }
}
