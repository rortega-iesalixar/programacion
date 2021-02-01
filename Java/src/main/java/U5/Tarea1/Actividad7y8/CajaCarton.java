package U5.Tarea1.Actividad7y8;

import java.util.Arrays;

public class CajaCarton extends Caja {
  // Atributos.
  private EtiquetaNumerada etiquetasnumeradas;
  private int indice_envios = 0;
  private CajaCarton[] EnviosCajasCarton = new CajaCarton[indice_envios];

  // Constructor.
  public CajaCarton(double ancho, double alto, double fondo) {
    super(ancho, alto, fondo, Unidades.CM);
    // this.EnviosCajasCarton = new CajaCarton[indice_envios];
  }

  // Método para calcular el volumen de la caja de cartón.
  @Override
  public double getVolumen() {
    return ((this.ancho / 100) * (this.alto / 100) * (this.fondo / 100)) * 0.80;
  }

  // Método para añadir la Etiqueta Numerada.
  public void add_EtiquetaNumerada(EtiquetaNumerada etiqueta) {
    setEtiquetasnumeradas(etiqueta);
  }

  // Método para hacer envíos de cajas de cartón.
  public void envio_Caja(CajaCarton c) {
    this.EnviosCajasCarton = Arrays.copyOf(EnviosCajasCarton, EnviosCajasCarton.length + 1);
    this.EnviosCajasCarton[indice_envios++] = c;
  }

  // Método para calcular superficie total de cartón utilizado.
  public void total_carton() {
    double superficie = 0;
    for (int i = 0; i < EnviosCajasCarton.length; i++) {
      superficie =
          superficie
              + ((2 * this.ancho * this.fondo)
                  + (2 * this.ancho * this.alto)
                  + (2 * this.fondo * this.alto));
    }
    System.out.println(
        "La superficie total de cartón usado es: " + superficie / 10000 + " metros cuadrados.");
  }

  // Método para visualizar la información de la caja.
  @Override
  public String toString() {
    return "CajaCarton{"
        + "ancho="
        + ancho
        + ", alto="
        + alto
        + ", fondo="
        + fondo
        + ", unidad="
        + unidad
        + ", etiquetasnumeradas="
        + etiquetasnumeradas
        + '}';
  }

  // Set and Get.
  public EtiquetaNumerada getEtiquetasnumeradas() {
    return etiquetasnumeradas;
  }

  public void setEtiquetasnumeradas(EtiquetaNumerada etiquetasnumeradas) {
    this.etiquetasnumeradas = etiquetasnumeradas;
  }
}
