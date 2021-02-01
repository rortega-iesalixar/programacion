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
    System.out.println("");

    CajaCarton ccarton1 = new CajaCarton(50, 80, 70);
    CajaCarton ccarton2 = new CajaCarton(50, 80, 70);
    CajaCarton ccarton3 = new CajaCarton(50, 80, 70);
    EtiquetaNumerada etinum1 = new EtiquetaNumerada("Pedro", "C/Sin Número", 1);
    ccarton1.add_EtiquetaNumerada(etinum1);
    System.out.println("Info:" + ccarton1.toString());
    System.out.println("El volumen de la caja es: " + ccarton1.getVolumen() + " metros cúbicos.");
    ccarton1.envio_Caja(ccarton1);
    ccarton1.total_carton();
  }
}
