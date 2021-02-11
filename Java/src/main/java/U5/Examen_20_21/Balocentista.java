package U5.Examen_20_21;

public class Balocentista extends Participante implements Encestar, Comparable {
  // Atributos.
  private double altura;

  // Constructor.
  public Balocentista(String nombre_atleta, int edad_atleta, double altura) {
    super(nombre_atleta, edad_atleta);
    setAltura(altura);
  }

  // Método para el juramento.
  @Override
  public void hacerjuramento() {
    System.out.println(
        "Yo "
            + this.getNombre_atleta()
            + ", como jugador de baloncesto, juro los valores deportivos mundiales.");
  }

  // Método para encestar.
  @Override
  public void encestar() {
    System.out.println("2 puntos!!!!!");
  }

  // Metodo tostring.
  @Override
  public String toString() {
    return "Balocentista{" + "altura=" + altura + "} " + super.toString();
  }

  // Set and Get.
  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}
