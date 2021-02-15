package U5.Examen_2021;

import java.util.Arrays;

public class CamionCajas extends Vehiculo {
  // Atributos.
  private Caja[] cajas;
  private int indice_cajas;

  // Constructor.
  public CamionCajas(
      String matricula, int carga_maxima, Conductor conductores, int num_tiendas_reco) {
    super(matricula, carga_maxima, conductores, num_tiendas_reco);
    setIndice_cajas(0);
    setCajas();
  }

  // Añadir caja al camión.
  public void add_caja(Caja cajas) {
    this.cajas = Arrays.copyOf(this.cajas, this.cajas.length + 1);
    this.cajas[this.indice_cajas++] = cajas;
    System.out.println("La caja ha sido agregada al camión.");
  }

  // Quitar caja del camión.
  public void del_caja(Caja cajas) {
    for (int i = 0; i < this.cajas.length; i++) {
      if (this.cajas[i].equals(cajas)) {
        for (int j = 0; j < this.cajas.length - 1; j++) {
          this.cajas[j] = this.cajas[j + 1];
          this.indice_cajas--;
          System.out.println("La caja ha sido eliminada del camión.");
        }
      }
    }
  }

  // Método descargar heredado.
  @Override
  public void descargar() {
    int num_prendas = 0;
    num_prendas = prendas_cajas();
    System.out.println(
        "Descargando " + this.getIndice_cajas() + " caja/s y " + num_prendas + " prendas.");
  }

  // Método para calcular cantidad de prendas en las cajas.
  public int prendas_cajas() {
    int resultado = 0;

    for (int i = 0; i < this.cajas.length; i++) {
      resultado = resultado + this.cajas[i].getIndice_prendas();
    }

    return resultado;
  }

  // Set and Get.
  public Caja[] getCajas() {
    return cajas;
  }

  public void setCajas() {
    this.cajas = new Caja[this.indice_cajas];
  }

  public int getIndice_cajas() {
    return indice_cajas;
  }

  public void setIndice_cajas(int indice_cajas) {
    this.indice_cajas = indice_cajas;
  }
}
