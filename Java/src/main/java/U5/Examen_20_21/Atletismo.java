package U5.Examen_20_21;

public class Atletismo extends Deporte {
  // Atributos.
  private int num_pruebas;

  // Constructor.
  public Atletismo(String nombre_deporte, String nombre_pabellon, int num_pruebas) {
    super(nombre_deporte, nombre_pabellon);
    setNum_pruebas(num_pruebas);
  }

  // Get and Set.
  public int getNum_pruebas() {
    return num_pruebas;
  }

  public void setNum_pruebas(int num_pruebas) {
    this.num_pruebas = num_pruebas;
  }
}
