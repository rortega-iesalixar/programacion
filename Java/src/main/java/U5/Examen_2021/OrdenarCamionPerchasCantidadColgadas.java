package U5.Examen_2021;

import java.util.Comparator;

public class OrdenarCamionPerchasCantidadColgadas implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado = 0;
    CamionPerchas cam1 = (CamionPerchas) o1;
    CamionPerchas cam2 = (CamionPerchas) o2;

    if (cam1.getIndice_prenda_colgada() > cam2.getIndice_prenda_colgada()) {
      resultado = 1;
    } else if (cam1.getIndice_prenda_colgada() < cam2.getIndice_prenda_colgada()) {
      resultado = -1;
    } else {
      resultado = 0;
    }
    return resultado;
  }
}
