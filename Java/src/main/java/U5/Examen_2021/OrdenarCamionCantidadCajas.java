package U5.Examen_2021;

import java.util.Comparator;

public class OrdenarCamionCantidadCajas implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    int resultado = 0;
    CamionCajas cam1 = (CamionCajas) o1;
    CamionCajas cam2 = (CamionCajas) o2;

    if (cam1.getIndice_cajas() > cam2.getIndice_cajas()) {
      resultado = 1;
    } else if (cam1.getIndice_cajas() > cam2.getIndice_cajas()) {
      resultado = -1;
    } else {
      resultado = 0;
    }
    return resultado;
  }
}
