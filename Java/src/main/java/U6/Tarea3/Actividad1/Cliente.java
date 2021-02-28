package U6.Tarea3.Actividad1;

public class Cliente {
  // Atributos.
  private String nombre;
  private int edad;

  // Constructor.
  public Cliente(String nombre, int edad) throws ExcepcionEdad {
    setNombre(nombre);
    setEdad(edad);
  }

  // Set and Get.
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) throws ExcepcionEdad {
    if (edad < 0 || edad > 100) {
      throw new ExcepcionEdad("Edad fuera de intervalo.");
    } else if (edad < 18) {
      throw new ExcepcionEdad("Es un menor de edad, no damos servicio a menores.");
    }
    this.edad = edad;
  }
}
