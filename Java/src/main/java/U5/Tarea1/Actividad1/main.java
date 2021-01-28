package U5.Tarea1.Actividad1;

public class main {
  public static void main(String[] args) {
    // Principal.

    Hora h1 = new Hora(23, 58);
    System.out.println(h1.toString());

    h1.inc();
    System.out.println(h1.toString());

    h1.inc();
    System.out.println(h1.toString());
  }
}
