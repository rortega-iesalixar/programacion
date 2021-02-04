package U5.Tarea1.Actividad9;

public class main {
  public static void main(String[] args) {
    // Principal.
    Electrodomestico[] Almacen = new Electrodomestico[10];
    Almacen[0] = new Electrodomestico();
    Almacen[1] = new Lavadora();
    Almacen[2] = new Television();
    Almacen[3] = new Television(45, true);
    Almacen[4] = new Lavadora(7);
    Almacen[5] = new Lavadora(13, 65);
    Almacen[6] = new Electrodomestico(640, ColorElectro.GRIS, ConsumoEnergetico.C, 34);
    Almacen[7] = new Television();
    Almacen[8] = new Lavadora();
    Almacen[9] = new Lavadora();

    for (int i = 0; i < Almacen.length; i++) {
      System.out.println(Almacen[i].toString());
      System.out.println();
    }
  }
}
