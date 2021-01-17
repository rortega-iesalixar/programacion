package U4.Tarea2.Actividad2;

public class main {
  public static void main(String[] args) {
    // Principal.

    PilaTabla p1 = new PilaTabla();
    p1.mostrar_pila();

    p1.apilar(2);
    p1.apilar(4);
    p1.mostrar_pila();

    p1.desapilar();
    p1.mostrar_pila();
  }
}
