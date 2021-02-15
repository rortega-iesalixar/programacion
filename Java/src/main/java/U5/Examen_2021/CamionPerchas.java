package U5.Examen_2021;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo {
  // Atributos.
  private PrendaColgada[] prendascolgadas;
  private int indice_prenda_colgada;

  // Constructor.
  public CamionPerchas(
      String matricula, int carga_maxima, Conductor conductores, int num_tiendas_reco) {
    super(matricula, carga_maxima, conductores, num_tiendas_reco);
    setIndice_prenda_colgada(0);
    setPrendascolgadas();
  }

  // Añadir prendas al camión.
  public void add_prenda_colgada(PrendaColgada prendascolgadas) {
    this.prendascolgadas = Arrays.copyOf(this.prendascolgadas, this.prendascolgadas.length + 1);
    this.prendascolgadas[this.indice_prenda_colgada++] = prendascolgadas;
    System.out.println("Prenda Colgada añadida al camión.");
  }
  // Quitar prendas al camion.
  public void del_prenda_colgada(PrendaColgada prendascolgadas) {
    for (int i = 0; i < this.prendascolgadas.length; i++) {
      if (this.prendascolgadas[i].equals(prendascolgadas)) {
        for (int j = 0; j < this.prendascolgadas.length - 1; j++) {
          this.prendascolgadas[j] = this.prendascolgadas[j + 1];
          this.indice_prenda_colgada--;
          System.out.println("Prenda colgada eliminada del camión.");
        }
      }
    }
  }

  // Método heredado descargar.
  @Override
  public void descargar() {
    System.out.println("Descargando " + this.getIndice_prenda_colgada() + " prendas.");
  }

  // Set and Get.
  public PrendaColgada[] getPrendascolgadas() {
    return prendascolgadas;
  }

  public void setPrendascolgadas() {
    this.prendascolgadas = new PrendaColgada[this.indice_prenda_colgada];
  }

  public int getIndice_prenda_colgada() {
    return indice_prenda_colgada;
  }

  public void setIndice_prenda_colgada(int indice_prenda_colgada) {
    this.indice_prenda_colgada = indice_prenda_colgada;
  }
}
