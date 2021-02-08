package U5.Tarea2.Actividad3;

public class Circulo implements Figura {
  // Atributos.
  private double radio;

  // Constructor.
  public Circulo(double radio) {
    setRadio(radio);
  }

  // Método para calcular el área del Círculo.
  @Override
  public void getArea() {
    double area;
    area = Math.PI * this.radio * this.radio;
    System.out.println("El area del círculo es: " + area + " centímetros.");
  }

  // Método ToString para mostrar los datos del Círculo.
  @Override
  public String toString() {
    return "Circulo{" + "radio=" + radio + '}';
  }

  // Get and Set.
  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
}
