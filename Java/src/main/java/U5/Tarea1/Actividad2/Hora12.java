package U5.Tarea1.Actividad2;

// Actividad 2: Escribir la clase Hora12, que funciona de forma similar a la clase Hora, con la
// diferencia de que las horas solo pueden tomar un valor entre 1 y 12; y se distingue la mañana de
// la tarde mediante "am" y "pm".

import U5.Tarea1.Actividad1.Hora;

public class Hora12 extends Hora {
  // Atributos.
  private String am_pm;

  // Constructor.
  public Hora12(int hora, int minutos, String am_pm) {
    super(hora, minutos);
    setAm_pm(am_pm);
  }

  @Override
  public void inc() {
    if (this.minutos + 1 != 60) {
      this.minutos++;
    } else {
      this.minutos = 0;
      if (this.hora + 1 != 13) {
        this.hora++;
      } else {
        this.hora = 0;
        if (this.am_pm.equals("am")) {
          this.am_pm = "pm";
        } else {
          this.am_pm = "am";
        }
      }
    }
  }

  @Override
  public void setHora(int hora) {
    if (hora >= 0 && hora < 13) {
      super.setHora(hora);
    }
  }

  public void setAm_pm(String am_pm) {
    this.am_pm = am_pm;
  }

  @Override
  public String toString() {
    return super.toString() + " " + am_pm;
  }
}
