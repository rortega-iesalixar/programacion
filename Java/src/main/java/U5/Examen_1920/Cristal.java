package U5.Examen_1920;

public class Cristal extends Material implements Mezclar {
  // Atributos.
  private TipoCristal t_cristal;

  // Constructor.
  public Cristal(
      String nombre,
      int masa,
      int capacidad_quemarse,
      int capacidad_diluirse,
      boolean movible,
      TipoCristal t_cristal) {
    super(nombre, masa, capacidad_quemarse, capacidad_diluirse, movible);
    setT_cristal(t_cristal);
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Cristal" + super.toString() + "{" + "t_cristal=" + t_cristal + "} ";
  }

  // Método implementado Mezclar.
  @Override
  public void MezclarConMaterial(Material otro_mat) {
    if (otro_mat instanceof Cristal) {
      System.out.println("Has obtenido MegaCristal.");
    } else if (otro_mat instanceof Metal) {
      System.out.println("Has obtenido Cristal Metálico.");
    } else if (otro_mat instanceof Roca) {
      System.out.println("Has obtenido Cristal Rocoso.");
    } else {
      System.out.println("No lo estás mezclando correctamente.");
    }
  }

  // Set and Get.
  public TipoCristal getT_cristal() {
    return t_cristal;
  }

  public void setT_cristal(TipoCristal t_cristal) {
    this.t_cristal = t_cristal;
  }
}
