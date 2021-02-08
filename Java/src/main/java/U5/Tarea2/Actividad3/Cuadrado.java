package U5.Tarea2.Actividad3;

public class Cuadrado extends PoligonoRegular {
  // Constructor.
  public Cuadrado(double lado, ColorPoligoRegular color) {
    setLado(lado);
    setColor(color);
    setContadorPoligonos(contadorPoligonos + 1);
  }

  // Constructor por defecto.
  public Cuadrado() {
    setLado(10);
    setColor(ColorPoligoRegular.AZUL);
    setContadorPoligonos(contadorPoligonos + 1);
  }

  // Método para conocer el área del Cuadrado.
  @Override
  public void getArea() {
    double area;
    area = this.lado * this.lado;
    System.out.println("El área del Cuadrado es: " + area + " centímetros.");
  }

  // Método ToString para mostrar los datos del Cuadrado.
  @Override
  public String toString() {
    return "Cuadrado{" + "lados=" + lado + ", color=" + color + '}';
  }
}
