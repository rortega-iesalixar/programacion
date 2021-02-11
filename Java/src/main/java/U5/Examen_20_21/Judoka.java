package U5.Examen_20_21;

public class Judoka extends Participante implements Luchar {
  // Atributos.
  private int peso_categoria;

  // Constructor.
  public Judoka(String nombre_atleta, int edad_atleta, int peso_categoria) {
    super(nombre_atleta, edad_atleta);
    setPeso_categoria(peso_categoria);
  }

  // Método para el juramento.
  @Override
  public void hacerjuramento() {
    System.out.println(
        "Yo " + this.getNombre_atleta() + ", como judoka, juro los valores deportivos mundiales.");
  }

  // Método para luchar.
  @Override
  public void luchar() {
    System.out.println("Voy a pelear.");
  }

  // Metodo tostring
  @Override
  public String toString() {
    return "Judoka{" + "peso_categoria=" + peso_categoria + "} " + super.toString();
  }

  // Set and Get.
  public int getPeso_categoria() {
    return peso_categoria;
  }

  public void setPeso_categoria(int peso_categoria) {
    this.peso_categoria = peso_categoria;
  }
}
