package U5.Examen_20_21;

public class Atleta extends Participante implements Correr {
  // Atributos.
  private String nombre_prueba;

  // Constructor.
  public Atleta(String nombre_atleta, int edad_atleta, String nombre_prueba) {
    super(nombre_atleta, edad_atleta);
    setNombre_prueba(nombre_prueba);
  }

  // Método para el juramento.
  @Override
  public void hacerjuramento() {
    System.out.println(
        "Yo " + this.getNombre_atleta() + ", como atleta, juro los valores deportivos mundiales.");
  }

  // Método para correr.
  @Override
  public void correr() {
    System.out.println("Voy a correr.");
  }

  // Metodo tostring.
  @Override
  public String toString() {
    return "Atleta{" + "nombre_prueba='" + nombre_prueba + '\'' + "} " + super.toString();
  }

  // Get and Set.
  public String getNombre_prueba() {
    return nombre_prueba;
  }

  public void setNombre_prueba(String nombre_prueba) {
    this.nombre_prueba = nombre_prueba;
  }
}
