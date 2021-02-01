package U5.Tarea1.Actividad7y8;

// Con esta clase solo se podrá ver el número de la etiqueta y no los datos personales del cliente.
public class EtiquetaNumerada extends Etiqueta {
  // Atributos.
  private int n_cliente;

  // Constructor.
  public EtiquetaNumerada(String nombre, String direccion, int n_cliente) {
    super(nombre, direccion);
    setN_cliente(n_cliente);
  }

  // To String EtiquetaNumerada.
  public String mostrar_etiqueta_numerada() {
    return "El número de cliente es: " + this.n_cliente;
  }

  // Método para visualizar los datos de la etiqueta.

  @Override
  public String toString() {
    return "EtiquetaNumerada{" + "n_cliente=" + n_cliente + '}';
  }

  // Set and Get.
  public int getN_cliente() {
    return n_cliente;
  }

  public void setN_cliente(int n_cliente) {
    this.n_cliente = n_cliente;
  }
}
