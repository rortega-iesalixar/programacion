package U5.Entregable_2021;

public class Judo extends Deporte {
  // Atributos.
  private int num_tatamis;

  // Constructor.
  public Judo(String nombre_deporte, String nombre_pabellon, int num_tatamis) {
    super(nombre_deporte, nombre_pabellon);
    setNum_tatamis(num_tatamis);
  }

  // Set and Get.
  public int getNum_tatamis() {
    return num_tatamis;
  }

  public void setNum_tatamis(int num_tatamis) {
    this.num_tatamis = num_tatamis;
  }
}
