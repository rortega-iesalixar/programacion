package U4.Entregable_1920;

public class Ingredientes {
  // Atributos.
  private String n_ingrediente;
  private int calorias_ingrediente;

  // Constructor 1.
  public Ingredientes(String n_ingrediente, int calorias_ingrediente) {
    setN_ingrediente(n_ingrediente);
    setCalorias_ingrediente(calorias_ingrediente);
  }

  // Constructor 2.
  public Ingredientes() {
    setN_ingrediente("Queso");
    setCalorias_ingrediente(250);
  }

  // Get y Set.
  public String getN_ingrediente() {
    return n_ingrediente;
  }

  public void setN_ingrediente(String n_ingrediente) {
    this.n_ingrediente = n_ingrediente;
  }

  public int getCalorias_ingrediente() {
    return calorias_ingrediente;
  }

  public void setCalorias_ingrediente(int calorias_ingrediente) {
    this.calorias_ingrediente = calorias_ingrediente;
  }

  @Override
  public String toString() {
    return "Ingredientes{"
        + "n_ingrediente='"
        + n_ingrediente
        + '\''
        + ", calorias_ingrediente="
        + calorias_ingrediente
        + '}';
  }
}
