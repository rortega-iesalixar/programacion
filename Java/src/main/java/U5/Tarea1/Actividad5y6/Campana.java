package U5.Tarea1.Actividad5y6;

import java.util.Arrays;

public class Campana extends Instrumento {
  @Override
  public void interpretar() {
    System.out.println("Notas de la campana: " + Arrays.toString(this.notas_musicales));
  }
}
