package U5.Tarea2.Actividad1;

public class PilaLista implements Pila {
  // Atributos.
  private Lista PL;
  private Integer t_defecto = 0;
  private Integer cima;

  // Constructor.
  public PilaLista() {
    PL = new Lista(t_defecto);
    cima = 0;
  }

  @Override
  public void apilar(int num) {
    PL.insertar_final(num);
    cima++;
  }

  @Override
  public void desapilar() {
    PL.obtener_elemento(cima);
    PL.eliminar_elemento(cima);
    cima--;
  }

  public void mostrar_cima() {
    PL.obtener_elemento(cima);
  }

  public void mostrar_PL() {
    PL.mostrar_tabla();
  }

  public Lista getPL() {
    return PL;
  }
}
