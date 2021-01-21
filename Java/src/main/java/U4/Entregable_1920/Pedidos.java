package U4.Entregable_1920;

import java.util.Date;

public class Pedidos {
  // Atributos.
  Pizzas pizza;
  Date fecha = new Date();

  // Constructor de tamaño fijo.
  public Pedidos(Pizzas pizza) {
    this.pizza = pizza;
    this.fecha = fecha;
  }

  @Override
  public String toString() {
    return "Pedidos{" + "pizza=" + pizza + ", fecha=" + fecha + '}';
  }
}
