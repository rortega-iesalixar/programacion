package U4.Tarea2.Actividad3;

// Actividad 3: Repetir el ejercicio anterior para implementar la clase PilaLista, donde, en vez de
// usar una tabla para almacenar los valores apilados, usamos un objeto de la clase Lista
// implementada en el ejercicio 1.

import U4.Tarea2.Actividad1.Lista;

public class PilaLista {
  // Atributos.
  private Lista PL;
  private Integer t_defecto = 0;
  private Integer cima;

  // Constructor.
  public PilaLista() {
    PL = new Lista(t_defecto);
    cima = 0;
  }

  public void mostrar_cima() {
    PL.obtener_elemento(cima);
  }

  public void mostrar_PL() {
    PL.mostrar_tabla();
  }

  public void apilar(Integer elemento) {
    PL.insertar_final(elemento);
    cima++;
  }

  public void desapilar() {
    PL.eliminar_elemento(cima);
    cima--;
  }

  public Lista getPL() {
    return PL;
  }
}
