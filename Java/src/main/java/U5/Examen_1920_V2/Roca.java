package U5.Examen_1920_V2;

public class Roca extends Material implements Mezclar {
  // Atributos.
  private int dureza;

  // Constructor.
  public Roca(
      String nombre,
      int masa,
      int capacidad_quemarse,
      int capacidad_diluirse,
      boolean movible,
      int dureza) {
    super(nombre, masa, capacidad_quemarse, capacidad_diluirse, movible);
    setDureza(dureza);
  }

  // Método implementado Mezclar.
  @Override
  public void MezclarConMaterial(Material otro_mat) {
    if (otro_mat instanceof Cristal) {
      System.out.println("Has obtenido Cristal Rocoso.");
    } else if (otro_mat instanceof Metal) {
      System.out.println("Has obtenido Roca Metálica.");
    } else if (otro_mat instanceof Roca) {
      System.out.println("Has obtenido Roca MegaRoca.");
    } else {
      System.out.println("No lo estás mezclando correctamente.");
    }
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Roca" + super.toString() + "{" + "dureza=" + dureza + '}';
  }

  // Get and Set.
  public int getDureza() {
    return dureza;
  }

  public void setDureza(int dureza) {
    if (dureza > 0 && dureza <= 5) {
      this.dureza = dureza;
    } else if (dureza < 0) {
      this.dureza = 1;
    } else {
      this.dureza = 5;
    }
  }
}
