package U4.Tarea1.Actividad9.Personal;

import java.io.Serializable;

public class Maquinistas implements Serializable {
  // Atributos.
  private String nombre_completo;
  private String dni;
  private int sueldo_mensual;
  private String rango;

  // Constructor.
  public Maquinistas(String nombre_completo, String dni, int sueldo_mensual, String rango) {
    this.nombre_completo = nombre_completo;
    this.dni = dni;
    this.sueldo_mensual = sueldo_mensual;
    this.rango = rango;
  }

  public void info_maquinista() {
    System.out.println("Maquinista:");
    System.out.println(this.nombre_completo);
    System.out.println("");
  }
}
