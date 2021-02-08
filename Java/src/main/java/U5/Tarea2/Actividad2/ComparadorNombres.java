package U5.Tarea2.Actividad2;

import java.util.Comparator;

public class ComparadorNombres implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    Cliente cl1 = (Cliente) o1;
    Cliente cl2 = (Cliente) o2;

    return cl1.getNombre().compareTo(cl2.getNombre());
  }
}
