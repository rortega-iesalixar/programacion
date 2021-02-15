package U5.Entregable_2021;

import java.util.Comparator;

public class OrdenarPaisParticipantes implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado;
    Pais p1 = (Pais) o1;
    Pais p2 = (Pais) o2;

    if (p1.getNum_participantes() > p2.getNum_participantes()) {
      resultado = -1;
    } else if (p1.getNum_participantes() < p2.getNum_participantes()) {
      resultado = 1;
    } else {
      resultado = 0;
    }

    return resultado;
  }
}
