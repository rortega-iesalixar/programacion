package U2.Tarea4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejer5 {
  public static void main(String[] args) {
    // Escribe un programa que muestre la hora actual.

    Calendar calendario = new GregorianCalendar();
    int hora, minuto, segundo;

    hora = calendario.get(calendario.HOUR_OF_DAY);
    minuto = calendario.get(calendario.MINUTE);
    segundo = calendario.get(calendario.SECOND);
    System.out.println("");
    System.out.println("La hora actual es: " + hora + ":" + minuto + ":" + segundo);
  }
}
