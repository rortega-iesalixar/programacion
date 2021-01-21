package U4.Entregable;

public class Personaje {
  // Atributos.
  private ListaPersonajes personajes;
  private double velocidad;
  private int danyo_punetazo;
  private int danyo_patada;

  // Constructor 1.

  public Personaje(
      ListaPersonajes personajes, double velocidad, int danyo_punetazo, int danyo_patada) {
    setPersonajes(personajes);
    setVelocidad(velocidad);
    setDanyo_punetazo(danyo_punetazo);
    setDanyo_patada(danyo_patada);
  }

  // Constructor 2 Sony.
  public Personaje() {
    setPersonajes(ListaPersonajes.SONIC);
    setVelocidad(100.0);
    setDanyo_punetazo(100);
    setDanyo_patada(200);
  }

  // Get and Set.
  public ListaPersonajes getPersonajes() {
    return personajes;
  }

  public void setPersonajes(ListaPersonajes personajes) {
    this.personajes = personajes;
  }

  public double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(double velocidad) {
    this.velocidad = velocidad;
  }

  public int getDanyo_punetazo() {
    return danyo_punetazo;
  }

  public void setDanyo_punetazo(int danyo_punetazo) {
    this.danyo_punetazo = danyo_punetazo;
  }

  public int getDanyo_patada() {
    return danyo_patada;
  }

  public void setDanyo_patada(int danyo_patada) {
    this.danyo_patada = danyo_patada;
  }

  // ToString

  @Override
  public String toString() {
    return "Personaje{"
        + "personajes="
        + personajes
        + ", velocidad="
        + velocidad
        + ", danyo_punetazo="
        + danyo_punetazo
        + ", danyo_patada="
        + danyo_patada
        + '}';
  }
}
