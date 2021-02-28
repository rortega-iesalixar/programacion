package U4.Tarea1.Actividad9.Maquinaria;

import U4.Tarea1.Actividad9.Personal.Maquinistas;

import java.io.Serializable;
import java.util.Arrays;

public class Trenes implements Serializable {
  // Atributos.
  private Locomotoras locomotora;
  private Vagon[] vagones;
  private final int max_vagones = 5;
  private Maquinistas maquinista;

  // Constructor.
  public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
    this.locomotora = locomotora;
    this.maquinista = maquinista;
    this.vagones = new Vagon[0];
  }

  // Método añadir vagón.
  public void add_vagon(long cap_maxima_carga, long cap_actual_carga, String mercancia) {
    if (vagones.length < max_vagones) {
      // Crea vagones.
      Vagon v = new Vagon(cap_maxima_carga, cap_actual_carga, mercancia);
      // Vagon v2 = new Vagon(cap_maxima_carga);

      vagones = Arrays.copyOf(vagones, vagones.length + 1);
      vagones[vagones.length - 1] = v;
    } else {
      // Límite de vagones superado.
      System.out.println("No puedes introducir más vagones, has llegado al límite.");
    }
  }

  public void info_tren() {
    System.out.println("Tren en su conjunto:");
    System.out.println("");
    locomotora.info_locomotora();
    maquinista.info_maquinista();
    for (int i = 0; i < vagones.length; i++) {
      System.out.println("Vagón " + (i + 1) + ":");
      vagones[i].info_vagon();
    }
  }
}
