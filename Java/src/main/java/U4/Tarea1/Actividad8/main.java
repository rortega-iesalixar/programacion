package U4.Tarea1.Actividad8;

public class main {
  public static void main(String[] args) {
    Bombilla b1 = new Bombilla(true);
    Bombilla b2 = new Bombilla(false);

    b1.estado_bombilla();
    System.out.println("");

    Bombilla.setInterruptor_general(false);
    b2.estado_bombilla();
    b1.estado_bombilla();
    System.out.println("");

    Bombilla.setInterruptor_general(true);
    b1.estado_bombilla();
    // System.out.println("La bombilla 2 está: " + b2.estado_bombilla());
  }
}
