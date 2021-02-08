package U5.Tarea2.Actividad2;

import java.util.Comparator;

public class ComparadorEdad implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado;
    Cliente cl1 = (Cliente) o1;
    Cliente cl2 = (Cliente) o2;
    if (cl1.getEdad() > cl2.getEdad()) {
      resultado = 1;
    } else if (cl1.getEdad() < cl2.getEdad()) {
      resultado = -1;
    } else {
      resultado = 0;
    }
    return resultado;
  }
}
