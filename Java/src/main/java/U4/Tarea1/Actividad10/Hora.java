package U4.Tarea1.Actividad10;

public class Hora {
  // Atributos.
  private int hora;
  private int minuto;
  private int segundo;

  // Método sumar segundos.
  public void sumar_segundos(int segundos_anadidos) {
    for (int i = 1; i <= segundos_anadidos; i++) {
      if (this.segundo + 1 < 60) {
        setSegundo(this.segundo + 1);
      } else {
        setSegundo(0);
        if (this.minuto + 1 < 60) {
          setMinuto(this.minuto + 1);
        } else {
          setMinuto(0);
          if (this.hora + 1 < 24) {
            setHora(this.hora + 1);
          } else {
            setHora(0);
          }
        }
      }
    }
  }

  // Método para mostrar hora.
  public void mostrar_hora() {
    System.out.println("La hora es: " + getHora() + ":" + getMinuto() + ":" + getSegundo());
  }

  // Constructor.
  public Hora(int hora, int minuto, int segundo) {
    setHora(hora);
    setMinuto(minuto);
    setSegundo(segundo);
  }

  // Set and get.
  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }
}
