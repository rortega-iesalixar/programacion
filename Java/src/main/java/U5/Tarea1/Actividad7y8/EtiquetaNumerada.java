package U5.Tarea1.Actividad7y8;

// Con esta clase solo se podrá ver el número de la etiqueta y no los datos personales del cliente.
public class EtiquetaNumerada {
  Etiqueta etiquetas;

  // Constructor.
  public EtiquetaNumerada(Etiqueta etiquetas) {
    setEtiquetas(etiquetas);
  }

  // Set and get.
  public Etiqueta getEtiquetas() {
    return etiquetas;
  }

  public void setEtiquetas(Etiqueta etiquetas) {
    this.etiquetas = etiquetas;
  }
}
