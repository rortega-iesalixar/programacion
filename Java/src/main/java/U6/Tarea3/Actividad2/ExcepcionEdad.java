package U6.Tarea3.Actividad2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcepcionEdad extends Exception {
  // Atributos.
  private Integer edad;
  private String nombre;

  // Constructor.
  public ExcepcionEdad(Integer edad, String nombre) {
    super();
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public String getMessage() {
    String mensaje = "Archivo -.log- creado.";
    String msg_guardado = "";

    Date date = new Date();
    DateFormat meshora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    DateFormat mesh_nom_archivo = new SimpleDateFormat("dd-MM-yyyy_HH.mm.ss");
    String nombre_fichero = "Ficheros//error_" + mesh_nom_archivo.format(date) + ".log";

    BufferedWriter out = null;

    if (edad < 0 || edad > 100) {
      msg_guardado =
          meshora.format(date)
              + " - EX001 - EdadErroneaException: Imposible crear el usuario con nombre "
              + nombre
              + ". La edad no puede ser negativa o superior a 100 (Edad indicada: "
              + edad
              + ").";
    } else if (edad < 18) {
      msg_guardado =
          meshora.format(date)
              + " - EX002 - MenorDeEdadException: Imposible crear el usuario con nombre "
              + nombre
              + ". El Cliente no puede ser menor de edad (Edad indicada: "
              + edad
              + ").";
    }

    try {
      out = new BufferedWriter(new FileWriter(nombre_fichero));
      out.write(msg_guardado);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    return mensaje;
  }
}
