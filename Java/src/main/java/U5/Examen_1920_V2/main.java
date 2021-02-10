package U5.Examen_1920_V2;

public class main {
  public static void main(String[] args) {
    // Principal.

    Cristal cris1 = new Cristal("Opalo", 14, 4, 1, true, TipoCristal.TRANSLUCIDO);
    // System.out.println(cris1.toString());
    Roca roc1 = new Roca("Pieda", 5, 4, 1, true, 3);
    // System.out.println(roc1.toString());
    // cris1.MezclarConMaterial(roc1);
    Metal metal1 = new Metal("Hierro", 35, 3, 4, true, false);

    Minecraft Almacen1 = new Minecraft();
    Almacen1.add_Material(cris1);
    Almacen1.add_Material(metal1);
    Almacen1.add_Material(roc1);
    System.out.println(Almacen1.mostrarEstado());
    System.out.println("");

    Pico pico1 = new Pico(3);
    pico1.Deshacer(roc1);
    pico1.Deshacer(cris1);
    pico1.Deshacer(metal1);
    System.out.println(Almacen1.mostrarEstado());
    System.out.println("");

    Almacen1.ultimoMaterialQueQueda();
    System.out.println("");

    Almacen1.borrarMaterialSinMasa();
    System.out.println(Almacen1.mostrarEstado());

    Almacen1.add_Material(metal1);
    System.out.println(Almacen1.mostrarEstado());
  }
}
