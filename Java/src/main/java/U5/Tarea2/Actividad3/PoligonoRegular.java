package U5.Tarea2.Actividad3;

public class PoligonoRegular implements Figura {
  // Atributos.
  protected double lado; // Indica lo que mide el lado en cms.
  public ColorPoligoRegular color; // (Enum) Azul, rojo, verde o amarillo.
  protected static int contadorPoligonos = 0;

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

  public int getContadorPoligonos() {
    return contadorPoligonos;
  }

  public void setContadorPoligonos(int contadorPoligonos) {
    this.contadorPoligonos = contadorPoligonos;
  }
}
