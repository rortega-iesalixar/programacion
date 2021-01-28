package U5.Tarea1.Actividad5y6;

import java.util.Arrays;

public class Piano extends Instrumento {
  @Override
  public void interpretar() {
    System.out.println("Notas del piano: " + Arrays.toString(this.notas_musicales));
  }
}
