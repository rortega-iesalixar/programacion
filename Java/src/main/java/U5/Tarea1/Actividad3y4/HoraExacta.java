package U5.Tarea1.Actividad3y4;

// Actividad 3: A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la hora
// los segundos. Además de los métodos visibles de Hora, dispondrá de:
//
// HoraExacta(hora, minuto, segundo)
// setSegundo(valor), que da valor a los segundos, siempre y cuando sea un valor con sentido
// inc(), que incrementa la hora en un segundo

// Actividad 4: Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y la
// otra pasada como parámetro de entrada al método) son iguales o distintas.

import U5.Tarea1.Actividad1.Hora;

public class HoraExacta extends Hora {
  // Atributos.
  private int segudos;

  // Constructor.
  public HoraExacta(int hora, int minutos, int segudos) {
    super(hora, minutos);
    setSegudos(segudos);
  }

  @Override
  public void inc() {
    if (this.segudos + 1 != 60) {
      this.segudos++;
    } else {
      this.segudos = 0;
      super.inc();
    }
  }

  // Método para comparar dos horas.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof HoraExacta)) return false;
    if (!super.equals(o)) return false;
    HoraExacta that = (HoraExacta) o;
    return segudos == that.segudos;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  // Set segundos.
  public void setSegudos(int segudos) {
    if (segudos >= 0 && segudos < 60) {
      this.segudos = segudos;
    }
  }

  @Override
  public String toString() {
    return super.toString() + ":" + segudos;
  }
}
