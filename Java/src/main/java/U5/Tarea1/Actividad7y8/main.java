package U5.Tarea1.Actividad7y8;

public class main {
  public static void main(String[] args) {
    // Principal.
    Etiqueta eti1 = new Etiqueta("Ramon", "Calle Pepito Flore");

    Caja cj1 = new Caja(25, 67, 45, Unidades.CM);
    System.out.println("El volumen de la caja es: " + cj1.getVolumen() + " metros cúbicos.");
    System.out.println("");

    cj1.add_etiqueta(eti1);
    System.out.println(cj1.toString());
  }
}
