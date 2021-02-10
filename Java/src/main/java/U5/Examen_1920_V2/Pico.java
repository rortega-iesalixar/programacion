package U5.Examen_1920_V2;

public class Pico extends Herramientas implements Minar {
  // Atributos.
  private int grosor;

  // Constructor.
  public Pico(int grosor) {
    super("Pico", 60, 0, 0, true);
    setGrosor(grosor);
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Pico{" + "grosor en milímetros=" + grosor + '}';
  }

  // Método de Minar1.
  @Override
  public void Hacer(Material mate) {
    mate.setMasa(mate.getMasa() + 100);
  }

  // Método de Minar2.
  @Override
  public void Deshacer(Material mate) {
    mate.setMasa(mate.getMasa() - 100);
  }

  // Set and Get.
  public int getGrosor() {
    return grosor;
  }

  public void setGrosor(int grosor) {
    this.grosor = grosor;
  }
}
