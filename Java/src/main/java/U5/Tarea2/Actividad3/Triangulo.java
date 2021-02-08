package U5.Tarea2.Actividad3;

public class Triangulo extends PoligonoRegular implements Comparable {
  // Atributos.
  private double altura;

  // Constructor.
  public Triangulo(double base, double altura, ColorPoligoRegular color) {
    setLado(base);
    setAltura(altura);
    setColor(color);
    setContadorPoligonos(contadorPoligonos + 1);
  }

  // Constructor por defecto.
  public Triangulo() {
    setLado(10);
    setAltura(10);
    setColor(ColorPoligoRegular.AZUL);
    setContadorPoligonos(contadorPoligonos + 1);
  }

  // Método para calcular área del Triángulo.
  @Override
  public void getArea() {
    double area;
    area = (this.lado * this.altura) / 2;
    System.out.println("El área del triangulo es: " + area + " centímetros.");
  }

  // Método para comparar Triángulos por su lado.
  @Override
  public int compareTo(Object o) {
    int resultado;
    Triangulo otro_tri = (Triangulo) o;

    if (this.lado > otro_tri.lado) {
      resultado = 1;
    } else if (this.lado < otro_tri.lado) {
      resultado = -1;
    } else {
      resultado = 0;
    }
    return resultado;
  }

  // Método ToString para mostrar los datos del Triángulo.
  @Override
  public String toString() {
    return "Triangulo{" + "base=" + lado + ", altura=" + altura + ", color=" + color + '}';
  }

  // Get and Set.
  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}
