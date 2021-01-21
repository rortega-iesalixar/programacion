package U4.Entregable;

public class Enemigo {
  private ListaEnemigos enemigos;
  private int puntos_vida;
  private int puntos_danyo;

  // Constructor.
  public Enemigo(ListaEnemigos enemigos) {
    setEnemigos(enemigos);
    setPuntos_vida(100);
    setPuntos_danyo(70);
  }

  // Método para restar puntos de vida.
  public void restar_vida_enemigo(int quitar_vida) {
    this.puntos_vida = this.puntos_vida - quitar_vida;
    if (this.puntos_vida < 0) {
      this.puntos_vida = 0;
    }
  }

  // ToString
  @Override
  public String toString() {
    return "Enemigo{"
        + "enemigos="
        + enemigos
        + ", puntos_vida="
        + puntos_vida
        + ", puntos_danyo="
        + puntos_danyo
        + '}';
  }

  // Get and Set.
  public ListaEnemigos getEnemigos() {
    return enemigos;
  }

  public void setEnemigos(ListaEnemigos enemigos) {
    this.enemigos = enemigos;
  }

  public int getPuntos_vida() {
    return puntos_vida;
  }

  public void setPuntos_vida(int puntos_vida) {
    this.puntos_vida = puntos_vida;
  }

  public int getPuntos_danyo() {
    return puntos_danyo;
  }

  public void setPuntos_danyo(int puntos_danyo) {
    this.puntos_danyo = puntos_danyo;
  }
}
