package U5.Examen_1920;

public class Sierra extends Herramientas {
  // Atributos.
  private int diametro;

  // Constructor.
  public Sierra(int diametro) {
    super("Sierra", 45, 0, 0, true);
    setDiametro(diametro);
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Sierra{" + "diametro en milímetros=" + diametro + '}';
  }

  // Set and get.
  public int getDiametro() {
    return diametro;
  }

  public void setDiametro(int diametro) {
    this.diametro = diametro;
  }
}
