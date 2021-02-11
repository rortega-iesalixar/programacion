package U5.Examen_20_21;

public class Baloncesto extends Deporte {
  // Atributos.
  private int num_equipos;

  // Constructor.
  public Baloncesto(String nombre_deporte, String nombre_pabellon, int num_equipos) {
    super(nombre_deporte, nombre_pabellon);
    setNum_equipos(num_equipos);
  }

  // Set and Get.
  public int getNum_equipos() {
    return num_equipos;
  }

  public void setNum_equipos(int num_equipos) {
    this.num_equipos = num_equipos;
  }
}
