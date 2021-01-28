package U5.Tarea1.Actividad1;

// Actividad 1: Diseñar la clase Hora que representa un instante de tiempo compuesto por una hora
// (de 0 a 23) y los minutos.
//
// Dispone del constructor:
//
// Hora (hora,minuto), que construye un objeto con los datos pasados como parámetro
// y de los métodos:
//
// inc(), que incrementa la hora en un minuto
// setMinutos(valor), que da valor a los minutos, siempre y cuando sea un valor con sentido
// setHora(valor),que da valor a la hora, siempre y cuando sea un valor con sentido
// toString(), que devuelve un String con la representación del reloj.

public class Hora {
  // Atributos.
  protected int hora;
  protected int minutos;

  // Constructor.
  public Hora(int hora, int minutos) {
    setHora(hora);
    setMinutos(minutos);
  }

  // Método que incrementa la hora en un minuto.
  public void inc() {
    if (this.minutos + 1 != 60) {
      this.minutos++;
    } else {
      this.minutos = 0;
      if (this.hora + 1 != 24) {
        this.hora++;
      } else {
        this.hora = 0;
      }
    }
  }

  // Método equals.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Hora)) return false;
    Hora hora1 = (Hora) o;
    return hora == hora1.hora && minutos == hora1.minutos;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  // Get and Set
  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    if (hora >= 0 && hora < 24) {
      this.hora = hora;
    }
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    if (minutos >= 0 && minutos < 60) {
      this.minutos = minutos;
    }
  }

  @Override
  public String toString() {
    return "La hora es: " + hora + ":" + minutos;
  }
}
