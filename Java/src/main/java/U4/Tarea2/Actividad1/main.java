package U4.Tarea2.Actividad1;

public class main {
  public static void main(String[] args) {
    // Principal.

    Lista l1 = new Lista(); // Lista por defecto tamaño 10.
    Lista l2 = new Lista(2); // Lista con tamaño definido.

    l1.mostrar_lista();

    l1.insertar_final(4);
    l1.mostrar_lista();
    l1.mostrar_elementos();

    l1.insertar_principio(2);
    l1.mostrar_lista();
    l1.mostrar_elementos();

    l1.insertar_numero(5, 2);
    l1.mostrar_lista();
    l1.mostrar_elementos();

    l1.insert_lista_final(l2.getTabla());
    l1.mostrar_lista();
    l1.mostrar_elementos();

    l1.eliminar_elemento(2);
    l1.mostrar_lista();
    l1.mostrar_elementos();

    l1.obtener_elemento(1);

    l1.buscar_numero(4);

    l1.repr_lista();
  }
}
