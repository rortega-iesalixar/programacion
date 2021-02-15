package U5.Examen_2021;

public abstract class Vehiculo implements Comparable {
  // Atributos.
  private String matricula;
  private int carga_maxima;
  private Conductor conductores;
  private int num_tiendas_reco;

  // Constructor.
  public Vehiculo(String matricula, int carga_maxima, Conductor conductores, int num_tiendas_reco) {
    setMatricula(matricula);
    setCarga_maxima(carga_maxima);
    setConductores(conductores);
    setNum_tiendas_reco(num_tiendas_reco);
  }

  // Método para heredar "descargar()"
  public void descargar() {}

  // Método para ordenar camiones por número de tiendas que reparte.
  @Override
  public int compareTo(Object o) {
    int resultado = 0;
    Vehiculo otro_vehiculo = (Vehiculo) o;

    if (this.num_tiendas_reco > otro_vehiculo.num_tiendas_reco) {
      resultado = 1;
    } else if (this.num_tiendas_reco < otro_vehiculo.num_tiendas_reco) {
      resultado = -1;
    } else {
      resultado = 0;
    }

    return resultado;
  }

  // Set and Get.
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public int getCarga_maxima() {
    return carga_maxima;
  }

  public void setCarga_maxima(int carga_maxima) {
    this.carga_maxima = carga_maxima;
  }

  public Conductor getConductores() {
    return conductores;
  }

  public void setConductores(Conductor conductores) {
    this.conductores = conductores;
  }

  public int getNum_tiendas_reco() {
    return num_tiendas_reco;
  }

  public void setNum_tiendas_reco(int num_tiendas_reco) {
    this.num_tiendas_reco = num_tiendas_reco;
  }
}
