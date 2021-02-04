package U5.Tarea2.Actividad1;

public class main {
  public static void main(String[] args) {
    // Principal.

    Pila p1 = new PilaTabla();
    p1.apilar(2);
    p1.apilar(3);
    p1.apilar(6);
    p1.apilar(7);
    p1.desapilar();
    p1.desapilar();
    p1.desapilar();
    p1.desapilar();
    System.out.println();

    Pila p2 = new PilaLista();
    p2.apilar(3);
    p2.apilar(65);
    p2.apilar(7);
    p2.desapilar();
    p2.desapilar();
  }
}
