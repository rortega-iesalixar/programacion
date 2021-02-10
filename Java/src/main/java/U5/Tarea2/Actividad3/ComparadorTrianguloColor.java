package U5.Tarea2.Actividad3;

import java.util.Comparator;

public class ComparadorTrianguloColor implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    Triangulo tri1 = (Triangulo) o1;
    Triangulo tri2 = (Triangulo) o2;

    return tri1.getColor().name().compareTo(tri2.getColor().name());
  }
}
