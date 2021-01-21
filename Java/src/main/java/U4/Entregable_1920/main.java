package U4.Entregable_1920;

public class main {
  public static void main(String[] args) {
    // Principal.
    Pizzas p1 = new Pizzas(Size.MEDIANA);
    Ingredientes Queso = new Ingredientes();
    Ingredientes Jamon_iberico = new Ingredientes("Jamon", 50);
    Ingredientes Bacon = new Ingredientes("Bacon", 300);
    Ingredientes Carne = new Ingredientes("Carne", 175);

    p1.add_ingrediente(Queso);
    p1.add_ingrediente(Jamon_iberico);
    // p1.add_ingrediente(Bacon);
    // p1.add_ingrediente(Carne);

    p1.mostrar_tamanyos_pizza();
    System.out.println("");

    System.out.println("La pizza tiene " + p1.getIndice_ingredientes() + " ingrediente/s.");
    System.out.println("");

    System.out.println(p1.toString());
    System.out.println("");

    Pedidos pedido1 = new Pedidos(p1);
    Pizzeria pizzeria = new Pizzeria();
    System.out.println(pedido1.toString());

    Pizzeria tomato = new Pizzeria();
    // tomato.add_pedido(pedido1);
    // System.out.println(tomato.toString());
    // pizzeria.add_pedido(pedido1);
    // System.out.println(pizzeria.toString());

    /*
    Pedidos pedido = new Pedidos();
    pedido.add_pedido(p1);
    pedido.add_pedido(p1);
    System.out.println(pedido.toString());
    System.out.println("");

    System.out.println("Se han realizado " + pedido.getCantidad_pedidos() + " pedido/s.");

    // Pizza estrella Familiar de jamón iberico y queso.
    Pizzas pizza_estrella = new Pizzas();
    pizza_estrella.add_ingrediente(Jamon_iberico);
    pizza_estrella.add_ingrediente(Queso);
    pedido.add_pedido(pizza_estrella);
    System.out.println(pedido.toString());

     */
  }
}
