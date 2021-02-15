package U5.Examen_2021;

public class Conductor {
  // Atributos.
  private String nombre_conductor;
  private String apellido_conductor;
  private int nss;

  // Constructor.
  public Conductor(String nombre_conductor, String apellido_conductor, int nss) {
    setNombre_conductor(nombre_conductor);
    setApellido_conductor(apellido_conductor);
    setNss(nss);
  }

  // Get and Set.
  public String getNombre_conductor() {
    return nombre_conductor;
  }

  public void setNombre_conductor(String nombre_conductor) {
    this.nombre_conductor = nombre_conductor;
  }

  public String getApellido_conductor() {
    return apellido_conductor;
  }

  public void setApellido_conductor(String apellido_conductor) {
    this.apellido_conductor = apellido_conductor;
  }

  public int getNss() {
    return nss;
  }

  public void setNss(int nss) {
    this.nss = nss;
  }
}
