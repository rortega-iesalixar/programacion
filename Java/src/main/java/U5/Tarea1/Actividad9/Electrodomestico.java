package U5.Tarea1.Actividad9;

public class Electrodomestico {
  // Atributos.
  protected int precio_base;
  protected int precio_final;
  protected ColorElectro color;
  protected ConsumoEnergetico consumo;
  protected int peso;

  // Constructor por defecto.
  public Electrodomestico() {
    setPrecio_base(100);
    setColor(ColorElectro.BLANCO);
    setConsumo(ConsumoEnergetico.F);
    setPeso(5);
    setPrecio_final(0);
  }

  // Constructor sin precio ni peso, resto por defecto.
  public Electrodomestico(int precio_base, int peso) {
    setPrecio_base(precio_base);
    setColor(ColorElectro.BLANCO);
    setConsumo(ConsumoEnergetico.F);
    setPeso(peso);
    setPrecio_final(0);
  }

  // Constructor con todos los parámetros.
  public Electrodomestico(
      int precio_base, ColorElectro color, ConsumoEnergetico consumo, int peso) {
    setPrecio_base(precio_base);
    setColor(color);
    setConsumo(consumo);
    setPeso(peso);
    setPrecio_final(0);
  }

  // Método getPrecioFinal.
  public int getPrecioFinal() {
    setPrecio_final(this.precio_base); // Primero le damos el valor inicial.

    // Suma de precio por consumo.
    if (this.consumo == ConsumoEnergetico.A) {
      setPrecio_final(this.precio_final + 100);
    } else if (this.consumo == ConsumoEnergetico.B) {
      setPrecio_final(this.precio_final + 80);
    } else if (this.consumo == ConsumoEnergetico.C) {
      setPrecio_final(this.precio_final + 60);

    } else if (this.consumo == ConsumoEnergetico.D) {
      setPrecio_final(this.precio_final + 50);
    } else if (this.consumo == ConsumoEnergetico.E) {
      setPrecio_final(this.precio_final + 30);
    } else {
      setPrecio_final(this.precio_final + 10);
    }

    // Suma de precio para el peso.
    if (this.peso >= 0 && this.peso <= 29) {
      setPrecio_final(this.precio_final + 10);
    } else if (this.peso >= 30 && this.peso <= 49) {
      setPrecio_final(this.precio_final + 60);
    } else if (this.peso >= 50 && this.peso <= 79) {
      setPrecio_final(this.precio_final + 80);
    } else {
      setPrecio_final(this.precio_final + 100);
    }
    return this.precio_final;
  }

  @Override
  public String toString() {
    return "Electrodomestico{"
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
        + '}';
  }

  // Set and Get
  public int getPrecio_final() {
    return precio_final;
  }

  public void setPrecio_final(int precio_final) {
    this.precio_final = precio_final;
  }

  public int getPrecio_base() {
    return precio_base;
  }

  public void setPrecio_base(int precio_base) {
    this.precio_base = precio_base;
  }

  public ColorElectro getColor() {
    return color;
  }

  public void setColor(ColorElectro color) {
    this.color = color;
  }

  public ConsumoEnergetico getConsumo() {
    return consumo;
  }

  public void setConsumo(ConsumoEnergetico consumo) {
    this.consumo = consumo;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }
}
