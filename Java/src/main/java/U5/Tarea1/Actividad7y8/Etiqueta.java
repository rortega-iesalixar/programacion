package U5.Tarea1.Actividad7y8;

public class Etiqueta {
  // Atributos.
  protected String nombre;
  protected String direccion;

  // Constructor.
  public Etiqueta(String nombre, String direccion) {
    setNombre(nombre);
    setDireccion(direccion);
  }

  // Método que representa la información de la etiqueta.
  @Override
  public String toString() {
    return "Etiqueta{" + "nombre='" + nombre + '\'' + ", direccion='" + direccion + '\'' + '}';
  }

  // Set and get.
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
}
