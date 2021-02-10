package U5.Examen_1920;

public abstract class Material implements Comparable {
  // Atributos.
  private String nombre;
  private int masa;
  private int capacidad_quemarse;
  private int capacidad_diluirse;
  private boolean movible;

  // Constructor.
  public Material(
      String nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movible) {
    setNombre(nombre);
    setMasa(masa);
    setCapacidad_quemarse(capacidad_quemarse);
    setCapacidad_diluirse(capacidad_diluirse);
    setMovible(movible);
  }

  // Método para ordenar los Materiales por Masa.
  @Override
  public int compareTo(Object o) {
    int resultado;
    Material otro_mate = (Material) o;

    if (this.getMasa() > otro_mate.getMasa()) {
      resultado = 1;
    } else if (this.getMasa() < otro_mate.getMasa()) {
      resultado = -1;
    } else {
      resultado = 0;
    }
    return resultado;
  }

  // Método ToString.
  @Override
  public String toString() {
    return "{"
        + "nombre='"
        + nombre
        + '\''
        + ", masa="
        + masa
        + ", capacidad_quemarse="
        + capacidad_quemarse
        + ", capacidad_diluirse="
        + capacidad_diluirse
        + ", movible="
        + movible
        + '}';
  }

  // Set and Get.
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getMasa() {
    return masa;
  }

  public void setMasa(int masa) {
    if (masa > 0 && masa <= 1000) {
      this.masa = masa;
    } else if (masa < 0) {
      this.masa = 0;
    } else {
      this.masa = 1000;
    }
  }

  public int getCapacidad_quemarse() {
    return capacidad_quemarse;
  }

  public void setCapacidad_quemarse(int capacidad_quemarse) {
    if (capacidad_quemarse > 0 && capacidad_quemarse <= 100) {
      this.capacidad_quemarse = capacidad_quemarse;
    } else if (capacidad_quemarse < 0) {
      this.capacidad_quemarse = 0;
    } else {
      this.capacidad_quemarse = 100;
    }
  }

  public int getCapacidad_diluirse() {
    return capacidad_diluirse;
  }

  public void setCapacidad_diluirse(int capacidad_diluirse) {
    if (capacidad_diluirse > 0 && capacidad_diluirse <= 100) {
      this.capacidad_diluirse = capacidad_diluirse;
    } else if (capacidad_diluirse < 0) {
      this.capacidad_diluirse = 0;
    } else {
      this.capacidad_diluirse = 100;
    }
  }

  public boolean isMovible() {
    return movible;
  }

  public void setMovible(boolean movible) {
    this.movible = movible;
  }
}
