package U5.Examen_1920_V2;

public abstract class Herramientas extends Material {
  // Constructor.
  public Herramientas(
      String nombre, int masa, int capacidad_quemarse, int capacidad_diluirse, boolean movible) {
    super(nombre, masa, capacidad_quemarse, capacidad_diluirse, movible);
  }
}
