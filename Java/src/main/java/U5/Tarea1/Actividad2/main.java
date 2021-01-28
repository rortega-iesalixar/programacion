package U5.Tarea1.Actividad2;

public class main {
  public static void main(String[] args) {
    // Principal Hora12.

    Hora12 h2 = new Hora12(12, 58, "am");
    System.out.println(h2.toString());

    h2.inc();
    System.out.println(h2.toString());

    h2.inc();
    System.out.println(h2.toString());
  }
}
