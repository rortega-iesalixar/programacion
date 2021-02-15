package U5.Examen_2021;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    // Principal.

    // Creamos Prendas.
    Prenda pren1 = new Prenda(100, "Calcetin", 1234, 24);
    Prenda pren2 = new Prenda(105, "Pantalon", 1222, 22);
    PrendaColgada precol1 = new PrendaColgada(44, "Camisa", 343, 32, 1);
    PrendaColgada precol2 = new PrendaColgada(22, "Blusa", 34, 2, 3);
    System.out.println("La cantidad de prendas de FARA es: " + Prenda.indice_prendas);
    pren1.devolver();
    pren1.doblar();
    precol1.colgar();
    precol1.doblar();
    System.out.println();

    // Añadimos prendas a la caja.
    Caja caja1 = new Caja(1);
    Caja caja2 = new Caja(2);
    caja1.add_prenda(pren1);
    caja1.add_prenda(precol1);
    System.out.println();

    // Eliminamos prenda de la caja.
    caja1.del_prenda(pren1);
    System.out.println();

    // Creamos conductor.
    Conductor cond1 = new Conductor("Paco", "Palotes", 123456);

    // Creamos Camion de ropa perchas y añadimos ropa colgada.
    CamionPerchas camper1 = new CamionPerchas("334FF", 334, cond1, 21);
    camper1.add_prenda_colgada(precol1);
    camper1.add_prenda_colgada(precol2);
    camper1.descargar();
    System.out.println();

    // Eliminamos prenda colgada.
    camper1.del_prenda_colgada(precol1);
    System.out.println();

    // Creamos Camion de cajas y añadimos cajas.
    CamionCajas camca1 = new CamionCajas("2345FFF", 555, cond1, 55);
    camca1.add_caja(caja1);
    camca1.add_caja(caja2);
    camca1.descargar();
    System.out.println();

    // Borramos caja del camion.
    camca1.del_caja(caja1);

    // Ordenar Camiones.
    CamionPerchas camper5 = new CamionPerchas("334FF", 334, cond1, 21);
    CamionCajas camca5 = new CamionCajas("2345FFF", 555, cond1, 55);
    Vehiculo Garaje[] = new Vehiculo[2];
    Garaje[0] = camper5;
    Garaje[1] = camca5;
    Arrays.sort(Garaje);
  }
}
