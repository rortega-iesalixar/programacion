package U4.Tarea1.Actividad9;

import U4.Tarea1.Actividad9.Maquinaria.Locomotoras;
import U4.Tarea1.Actividad9.Maquinaria.Trenes;
import U4.Tarea1.Actividad9.Personal.Especialidad;
import U4.Tarea1.Actividad9.Personal.Maquinistas;
import U4.Tarea1.Actividad9.Personal.Mecanicos;

public class main {
  public static void main(String[] args) {
    // Programa principal.

    Maquinistas maq1 = new Maquinistas("Antonio", "11111111Y", 1200, "Aprendiz");
    Mecanicos meca1 = new Mecanicos("Juan Jose", 654987321, Especialidad.FRENOS);
    Locomotoras loco1 = new Locomotoras("1234VVV", 130, 1980, meca1);
    Trenes tren1 = new Trenes(loco1, maq1);

    tren1.add_vagon(1000, 250, "Vinagre");
    tren1.add_vagon(1000, 300, "Aceite");

    tren1.info_tren();
  }
}
