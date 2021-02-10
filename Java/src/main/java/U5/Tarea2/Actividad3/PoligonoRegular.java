package U5.Tarea2.Actividad3;

public abstract class PoligonoRegular implements Figura {
  // Atributos.
  protected double lado; // Indica lo que mide el lado en cms.
  public ColorPoligoRegular color; // (Enum) Azul, rojo, verde o amarillo.
  protected static int contadorPoligonos = 0;

  // Constructor.
  public PoligonoRegular(double lado, ColorPoligoRegular color) {
    setLado(lado);
    setColor(color);
    contadorPoligonos++;
  }

  // Constructor por defecto con 10cm y color Azul.
  public PoligonoRegular() {
    setLado(10);
    setColor(ColorPoligoRegular.AZUL);
    contadorPoligonos++;
  }

  // Método de la interfaz Figura.
  @Override
  public void getArea() {}

  // Get and Set.
  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public ColorPoligoRegular getColor() {
    return color;
  }

  public void setColor(ColorPoligoRegular color) {
    this.color = color;
  }
}
