package U5.Examen_1920;

import java.util.Comparator;

public class CompararMaterialCapQuema implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado;
    Material mate1 = (Material) o1;
    Material mate2 = (Material) o2;

    if (mate1.getCapacidad_quemarse() > mate2.getCapacidad_quemarse()) {
      resultado = 1;
    } else if (mate1.getCapacidad_quemarse() < mate2.getCapacidad_quemarse()) {
      resultado = -1;
    } else {
      resultado = 0;
    }

    return resultado;
  }
}
