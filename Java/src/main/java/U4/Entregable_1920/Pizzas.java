package U4.Entregable_1920;

import java.util.Arrays;

public class Pizzas {
  // Atributos.
  private Size tamanyo_pizza;
  private Ingredientes[] ingrediente;
  private int indice_ingredientes;
  private int max_ingredientes;

  // Constructor 1.
  public Pizzas(Size tamanyo_pizza) {
    setTamanyo_pizza(tamanyo_pizza);
    setIngrediente(ingrediente);
    setIndice_ingredientes(indice_ingredientes);
    setMax_ingredientes(max_ingredientes);
  }

  // Constructor 2 por defecto FAMILIAR.
  public Pizzas() {
    setTamanyo_pizza(Size.FAMILIAR);
    setIngrediente(ingrediente);
    setIndice_ingredientes(indice_ingredientes);
    setMax_ingredientes(max_ingredientes);
  }

  // Método para mostar por pantalla los tamaños de las pizzas.
  public void mostrar_tamanyos_pizza() {
    System.out.println("Los tamaños de la pizza son:");
    for (Size s : Size.values()) {
      System.out.println(s);
    }
  }

  // Método para añadir ingredientes.
  public boolean add_ingrediente(Ingredientes ingrediente) {
    if (indice_ingredientes < max_ingredientes) {
      this.ingrediente = Arrays.copyOf(this.ingrediente, this.ingrediente.length + 1);
      this.ingrediente[indice_ingredientes++] = ingrediente;
    }
    return indice_ingredientes < max_ingredientes;
  }

  // Get and Set.
  public Size getTamanyo_pizza() {
    return tamanyo_pizza;
  }

  public void setTamanyo_pizza(Size tamanyo_pizza) {
    this.tamanyo_pizza = tamanyo_pizza;
  }

  public Ingredientes[] getIngrediente() {
    return ingrediente;
  }

  public void setIngrediente(Ingredientes[] ingrediente) {
    this.ingrediente = new Ingredientes[indice_ingredientes];
  }

  public int getIndice_ingredientes() {
    return indice_ingredientes;
  }

  public void setIndice_ingredientes(int indice_ingredientes) {
    this.indice_ingredientes = 0;
  }

  public int getMax_ingredientes() {
    return max_ingredientes;
  }

  public void setMax_ingredientes(int max_ingredientes) {
    this.max_ingredientes = 3;
  }

  @Override
  public String toString() {
    return "Pizzas{"
        + "tamanyo_pizza="
        + tamanyo_pizza
        + ", ingrediente="
        + Arrays.toString(ingrediente)
        + '}';
  }
}
