package U5.Tarea1.Actividad3y4;

public class main {
  public static void main(String[] args) {
    // Principal Hora Exacta.

    HoraExacta hx1 = new HoraExacta(23, 59, 58);
    HoraExacta hx2 = new HoraExacta(23, 58, 58);

    System.out.println(hx1.toString());
    System.out.println(hx2.toString());

    if (hx2.equals(hx1)) {
      System.out.println("Son horas iguales");
    } else {
      System.out.println("No son horas iguales.");
    }
  }
}
