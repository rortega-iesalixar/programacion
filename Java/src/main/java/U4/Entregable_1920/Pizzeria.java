package U4.Entregable_1920;

import java.util.Arrays;

public class Pizzeria {
  // Atributos.
  Pedidos[] pedido;
  int indice_pedidos;
  int tamanyo_pizzeria;

  public Pizzeria() {
    this.pedido = new Pedidos[tamanyo_pizzeria];
    this.indice_pedidos = 0;
    this.tamanyo_pizzeria = 5;
  }

  public void add_pedido(Pedidos pedido) {
    this.pedido[indice_pedidos++] = pedido;
  }

  @Override
  public String toString() {
    return "Pizzeria{" + "pedido=" + Arrays.toString(pedido) + '}';
  }
}
