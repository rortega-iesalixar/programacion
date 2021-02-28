package U6.Tarea2.Actividad9;

import U4.Tarea1.Actividad9.Maquinaria.Locomotoras;
import U4.Tarea1.Actividad9.Maquinaria.Trenes;
import U4.Tarea1.Actividad9.Personal.Especialidad;
import U4.Tarea1.Actividad9.Personal.Maquinistas;
import U4.Tarea1.Actividad9.Personal.Mecanicos;

import java.io.*;

public class FicherosTren {
  public static void main(String[] args) {
    // Actividad 9. Crear un fichero binario e insertar varios objetos de tipo Tren. Cerrar el
    // fichero y leerlo a continuación, mostrándo los objetos por pantalla.

    Mecanicos mec1 = new Mecanicos("Hector", 7894613, Especialidad.MOTOR);
    Maquinistas maq1 = new Maquinistas("Perico Palotes", "12457845T", 1500, "Jefe");
    Maquinistas maq2 = new Maquinistas("Juan", "12457845T", 1500, "Peon");
    Maquinistas maq3 = new Maquinistas("Pedro", "12457845T", 1500, "Intermedio");
    Locomotoras loc1 = new Locomotoras("124FFF", 600, 1980, mec1);
    Locomotoras loc2 = new Locomotoras("1234FF", 500, 1980, mec1);
    Locomotoras loc3 = new Locomotoras("134FFF", 980, 1980, mec1);
    Trenes tren1 = new Trenes(loc1, maq1);
    Trenes tren2 = new Trenes(loc2, maq2);
    Trenes tren3 = new Trenes(loc3, maq3);

    Trenes Garaje[] = new Trenes[3];
    Garaje[0] = tren1;
    Garaje[1] = tren2;
    Garaje[2] = tren3;

    Trenes Garaje_in[] = null;
    ObjectOutputStream out = null;
    ObjectInputStream in = null;

    try {
      out = new ObjectOutputStream(new FileOutputStream("Ficheros//trenes.dat"));
      // out.writeObject(Garaje);
      out.writeObject(tren1);
      out.writeObject(tren2);
      out.writeObject(tren3);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    Trenes tren_in = null;
    try {
      in = new ObjectInputStream(new FileInputStream("Ficheros//trenes.dat"));
      // Garaje_in = (Trenes[]) in.readObject();
      tren_in = (Trenes) in.readObject();
      in.close();
    } catch (IOException | ClassNotFoundException ex) {
      System.out.println(ex.getMessage());
    }

    // System.out.println(Arrays.toString(Garaje_in));
    tren_in.info_tren();
    System.out.println();
    /*
    for (int i = 0; i < Garaje_in.length; i++) {
      Garaje_in[i].info_tren();
    }*/
  }
}
