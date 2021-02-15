package U5.Examen_2021;

public class PrendaColgada extends Prenda implements Colgar {
  // Atributos.
  private int altura_barra;

  // Constructor.
  public PrendaColgada(
      int precio, String nombre_prenda, int codigo_barras, int peso, int altura_barra) {
    super(precio, nombre_prenda, codigo_barras, peso);
    setAltura_barra(altura_barra);
  }

  // Método para colgar.
  @Override
  public void colgar() {
    System.out.println("La prenda " + this.getNombre_prenda() + " se debe colgar.");
  }

  // Método para devolver.
  @Override
  public void devolver() {
    super.devolver();
  }

  // Método para doblar.
  @Override
  public void doblar() {
    System.out.println("La prenda " + this.getNombre_prenda() + " no se puede doblar.");
  }

  // Set and Get.
  public int getAltura_barra() {
    return altura_barra;
  }

  public void setAltura_barra(int altura_barra) {
    this.altura_barra = altura_barra;
  }
}
