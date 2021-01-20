package U4.Tarea2.Actividad3;

public class main {
  public static void main(String[] args) {
    // Principal.
    PilaLista pl1 = new PilaLista();

    pl1.apilar(2);
    pl1.apilar(5);
    pl1.mostrar_PL();
    pl1.mostrar_cima();

    System.out.println("");

    pl1.desapilar();
    pl1.mostrar_PL();
    pl1.mostrar_cima();
  }
}
