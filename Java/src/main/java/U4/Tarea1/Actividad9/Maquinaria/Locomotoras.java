package U4.Tarea1.Actividad9.Maquinaria;

import U4.Tarea1.Actividad9.Personal.Mecanicos;

import java.io.Serializable;

public class Locomotoras implements Serializable {
  // Atributos.
  private String matricula;
  private int potencia_motor;
  private int anio_fabricacion;
  private Mecanicos mecanico;

  // Constructor.
  public Locomotoras(
      String matricula, int potencia_motor, int anio_fabricacion, Mecanicos mecanico) {
    this.matricula = matricula;
    this.potencia_motor = potencia_motor;
    this.anio_fabricacion = anio_fabricacion;
    this.mecanico = mecanico;
  }

  public void info_locomotora() {
    System.out.println("Locomotora:");
    System.out.println(this.matricula);
    System.out.println(this.potencia_motor);
    mecanico.info_mecanico();
    System.out.println("");
  }
}
