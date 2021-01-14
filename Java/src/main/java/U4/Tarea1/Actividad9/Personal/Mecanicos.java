package U4.Tarea1.Actividad9.Personal;

public class Mecanicos {
  // Atributos.
  private String nombre_completo;
  private long telefono;
  private Especialidad especialidad;

  // Constructor.
  public Mecanicos(String nombre_completo, long telefono, Especialidad especialidad) {
    this.nombre_completo = nombre_completo;
    this.telefono = telefono;
    this.especialidad = especialidad;
  }

  public void info_mecanico() {
    System.out.println("Mecánico:");
    System.out.println(this.nombre_completo);
    System.out.println(this.especialidad);
    System.out.println("");
  }
}
