package U5.Tarea1.Actividad9;

public class Television extends Electrodomestico {
  // Atributos.
  private int resolucion;
  private boolean sintonizadorTDT;

  // Constructor por defecto.
  public Television() {
    setResolucion(20);
    setSintonizadorTDT(false);
  }

  // Constructor con precio y peso a introducir.
  public Television(int precio_base, int peso) {
    super(precio_base, peso);
  }

  // Constructor para introducir resolucion y sintonizador TDT.
  public Television(int resolucion, boolean sintonizadorTDT) {
    setResolucion(resolucion);
    setSintonizadorTDT(sintonizadorTDT);
  }

  // Método para mostrar el precio final con suplementos.
  @Override
  public int getPrecioFinal() {
    this.precio_final = super.getPrecioFinal();

    if (this.resolucion > 40) {
      setPrecio_final((this.precio_final * 130) / 100);
    }
    if (this.sintonizadorTDT) {
      setPrecio_final(this.precio_final + 50);
    }

    return this.precio_final;
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Television{"
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
        + ", resolucion="
        + resolucion
        + ", sintonizadorTDT="
        + sintonizadorTDT
        + '}';
  }

  // Get and Set.
  public int getResolucion() {
    return resolucion;
  }

  public void setResolucion(int resolucion) {
    this.resolucion = resolucion;
  }

  public boolean isSintonizadorTDT() {
    return sintonizadorTDT;
  }

  public void setSintonizadorTDT(boolean sintonizadorTDT) {
    this.sintonizadorTDT = sintonizadorTDT;
  }
}
