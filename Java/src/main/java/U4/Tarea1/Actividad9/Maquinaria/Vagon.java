package U4.Tarea1.Actividad9.Maquinaria;

import java.io.Serializable;

class Vagon implements Serializable {
  // Atributos.
  private long cap_maxima_carga;
  private long cap_actual_carga;
  private String mercancia;

  // Constructor con el vagón cargado.
  public Vagon(long cap_maxima_carga, long cap_actual_carga, String mercancia) {
    this.cap_maxima_carga = cap_maxima_carga;
    this.cap_actual_carga = cap_actual_carga;
    this.mercancia = mercancia;
  }

  // Constructor sin estar el vagón cargado.
  public Vagon(long cap_maxima_carga) {
    this.cap_maxima_carga = cap_maxima_carga;
  }

  public void info_vagon() {
    System.out.println(this.cap_maxima_carga);
    System.out.println(this.cap_actual_carga);
    System.out.println(this.mercancia);
    System.out.println("");
  }
}
