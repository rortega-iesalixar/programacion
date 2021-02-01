package U5.Tarea1.Actividad7y8;

// Actividad 7: Las empresas de transportes, para evitar daños en los paquetes, embalan todas sus
// mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho, un alto y
// un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una etiqueta con
// información útil como el nombre del destinatario, dirección, etc. Se pide implementar la clase
// Caja con constructor:
//
// Caja(double ancho, double alto, double fondo, Unidades u): que construye una caja con las
// dimensiones especificadas, que pueden encontrarse en "cm" (centímetros) o en "m" (metros)
// y métodos:
//
// double getVolumen(): que devuelve el volumen de la caja en metros cúbicos
// String toString(): que devuelva una cadena con la representación de la caja.

public class Caja {
  // Atributos.
  protected double ancho;
  protected double alto;
  protected double fondo;
  protected Unidades unidad;
  protected Etiqueta etiquetas;

  // Constructor.
  public Caja(double ancho, double alto, double fondo, Unidades u) {
    setAncho(ancho);
    setAlto(alto);
    setFondo(fondo);
    setUnidad(u);
  }

  // Método para devolver el volumen de la caja en metros cúbicos.
  public double getVolumen() {
    if (this.unidad == Unidades.M) {
      return this.ancho * this.alto * this.fondo;
    } else {
      return (this.ancho / 100) * (this.alto / 100) * (this.fondo / 100);
    }
  }

  // Método que devuelve una cadena con la representación de la caja.
  @Override
  public String toString() {
    return "Caja{"
        + "ancho="
        + ancho
        + ", alto="
        + alto
        + ", fondo="
        + fondo
        + ", unidad="
        + unidad
        + ", etiquetas="
        + etiquetas
        + '}';
  }

  // Método para añadir la etiqueta a la caja.
  public void add_etiqueta(Etiqueta etiq) {
    setEtiquetas(etiq);
  }

  // Get and Set.
  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    this.alto = alto;
  }

  public double getFondo() {
    return fondo;
  }

  public void setFondo(double fondo) {
    this.fondo = fondo;
  }

  public Unidades getUnidad() {
    return unidad;
  }

  public void setUnidad(Unidades unidad) {
    this.unidad = unidad;
  }

  public Etiqueta getEtiquetas() {
    return etiquetas;
  }

  public void setEtiquetas(Etiqueta etiquetas) {
    this.etiquetas = etiquetas;
  }
}
