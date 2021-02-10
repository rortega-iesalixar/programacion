package U5.Examen_1920;

public class Metal extends Material implements Mezclar {
  // Atributos.
  private boolean imantable;

  // Constructor.
  public Metal(
      String nombre,
      int masa,
      int capacidad_quemarse,
      int capacidad_diluirse,
      boolean movible,
      boolean imantable) {
    super(nombre, masa, capacidad_quemarse, capacidad_diluirse, movible);
    setImantable(imantable);
  }

  // Método implementado Mezclar.
  @Override
  public void MezclarConMaterial(Material otro_mat) {
    if (otro_mat instanceof Cristal) {
      System.out.println("Has obtenido Cristal Metálico.");
    } else if (otro_mat instanceof Metal) {
      System.out.println("Has obtenido MegaMetal.");
    } else if (otro_mat instanceof Roca) {
      System.out.println("Has obtenido Roca Metálica.");
    } else {
      System.out.println("No lo estás mezclando correctamente.");
    }
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Metal" + super.toString() + "{" + "imantable=" + imantable + '}';
  }

  // Set and Get.
  public boolean isImantable() {
    return imantable;
  }

  public void setImantable(boolean imantable) {
    this.imantable = imantable;
  }
}
