package U4.Tarea2.Actividad1;

public class main {
  public static void main(String[] args) {
    // Principal.

    Lista l1 = new Lista(); // Lista por defecto tamaño 10.
    Lista l2 = new Lista(4); // Lista con tamaño definido.

    l2.insertar_final(4);
    l2.mostrar_elementos();
    l2.mostrar_tabla();

    l2.insertar_principio(2);
    l2.mostrar_elementos();
    l2.mostrar_tabla();
    l2.insertar_principio(8);
    l2.insertar_principio(3);
    l2.mostrar_elementos();
    l2.mostrar_tabla();

    l2.insertar_numero(7, 2);
    l2.mostrar_elementos();
    l2.mostrar_tabla();

    l1.insertar_principio(9);
    l1.insertar_final(8);
    l1.mostrar_tabla();
    l2.insert_lista_final(l1.getTabla());
    l2.mostrar_elementos();
    l2.mostrar_tabla();

    l2.eliminar_elemento(2);
    l2.mostrar_elementos();
    l2.mostrar_tabla();

    l2.obtener_elemento(5);

    if (l2.buscar_numero(1) == -1) {
      System.out.println("El número no se encuentra en la lista.");
    } else {
      System.out.println("El número se encuentra en el índice: " + l2.buscar_numero(1));
    }

    // System.out.println("El número se encuentra en el índice: " + l2.buscar_numero(1));

    l2.repr_lista();
  }
}
