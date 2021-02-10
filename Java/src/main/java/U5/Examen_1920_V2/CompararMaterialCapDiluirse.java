package U5.Examen_1920_V2;

import java.util.Comparator;

public class CompararMaterialCapDiluirse implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado;
    Material mate1 = (Material) o1;
    Material mate2 = (Material) o2;

    if (mate1.getCapacidad_diluirse() > mate2.getCapacidad_diluirse()) {
      resultado = 1;
    } else if (mate1.getCapacidad_diluirse() < mate2.getCapacidad_diluirse()) {
      resultado = -1;
    } else {
      resultado = 0;
    }

    return resultado;
  }
}
