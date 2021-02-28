package U4.Tarea1.Actividad9.Personal;

import java.io.Serializable;

public class Jefes_Estacion implements Serializable {
  // Atributos.
  private String nombre_completo;
  private String dni;

  // Constructor.
  public Jefes_Estacion(String nombre_completo, String dni) {
    this.nombre_completo = nombre_completo;
    this.dni = dni;
  }
}
