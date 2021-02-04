package U5.Tarea1.Actividad9;

public class Lavadora extends Electrodomestico {
  // Atributos.
  private int carga;

  // Constructor por defecto.
  public Lavadora() {
    setCarga(5);
  }

  // Constructor con precio y peso, resto por defecto.
  public Lavadora(int precio_base, int peso) {
    super(precio_base, peso);
    setCarga(5);
  }

  // Constructor para colocar solo la carga, el resto por defecto.
  public Lavadora(int carga) {
    setCarga(carga);
  }

  // Método modificado de GetPrecioFinal.
  @Override
  public int getPrecioFinal() {
    this.precio_final = super.getPrecioFinal();

    if (this.carga > 30) {
      setPrecio_final(this.precio_final + 50);
    }
    return this.precio_final;
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Lavadora{"
        + "precio_base="
        + precio_base
        + ", precio_final="
        + this.getPrecioFinal()
        + ", color="
        + color
        + ", consumo="
        + consumo
        + ", peso="
        + peso
        + ", carga="
        + carga
        + '}';
  }

  // Set and Get.
  public int getCarga() {
    return carga;
  }

  public void setCarga(int carga) {
    this.carga = carga;
  }
}
