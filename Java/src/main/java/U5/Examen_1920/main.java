package U5.Examen_1920;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    // Principal.

    Cristal cris1 = new Cristal("Opalo", 14, 4, 1, true, TipoCristal.TRANSLUCIDO);
    // System.out.println(cris1.toString());
    Roca roc1 = new Roca("Pieda", 5, 4, 1, true, 3);
    // System.out.println(roc1.toString());
    // cris1.MezclarConMaterial(roc1);

    Minecraft Almacen1 = new Minecraft();
    Almacen1.add_Material(cris1);
    Almacen1.add_Material(roc1);
    System.out.println(Almacen1.mostrarEstado());
    System.out.println("");

    // Pico pico1 = new Pico(3);
    // pico1.Deshacer(roc1);
    // pico1.Deshacer(cris1);
    // System.out.println(Almacen1.mostrarEstado());
    // System.out.println("");

    // Almacen1.ultimoMaterialQueQueda();
    // System.out.println("");

    // Almacen1.borrarMaterialSinMasa();
    // System.out.println(Almacen1.mostrarEstado());

    Arrays.sort(Almacen1.getMateriales());
    System.out.println(Almacen1.mostrarEstado());
  }
}
