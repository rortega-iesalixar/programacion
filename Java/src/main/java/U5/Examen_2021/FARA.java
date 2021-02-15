package U5.Examen_2021;

public class FARA {
  // Atributos.
  private Vehiculo[] vehiculos;
  private int indice_vehiculos;

  // Constructor.
  public FARA(int indice_vehiculos) {
    setVehiculos();
    setIndice_vehiculos(0);
  }

  // Get and Set.
  public Vehiculo[] getVehiculos() {
    return vehiculos;
  }

  public void setVehiculos() {
    this.vehiculos = vehiculos;
  }

  public int getIndice_vehiculos() {
    return indice_vehiculos;
  }

  public void setIndice_vehiculos(int indice_vehiculos) {
    this.indice_vehiculos = indice_vehiculos;
  }
}
