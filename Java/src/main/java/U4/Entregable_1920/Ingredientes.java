package U4.Entregable_1920;

public class Ingredientes {
  // Atributos.
  private String n_ingrediente;
  private String calorias_ingrediente;

  // Constructor.
  public Ingredientes(String n_ingrediente, String calorias_ingrediente) {
    setN_ingrediente(n_ingrediente);
    setCalorias_ingrediente(calorias_ingrediente);
  }

  // Get y Set.
  public String getN_ingrediente() {
    return n_ingrediente;
  }

  public void setN_ingrediente(String n_ingrediente) {
    this.n_ingrediente = n_ingrediente;
  }

  public String getCalorias_ingrediente() {
    return calorias_ingrediente;
  }

  public void setCalorias_ingrediente(String calorias_ingrediente) {
    this.calorias_ingrediente = calorias_ingrediente;
  }
}
