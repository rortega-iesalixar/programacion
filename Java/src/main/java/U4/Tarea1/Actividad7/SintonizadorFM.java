package U4.Tarea1.Actividad7;

// Actividad 7: Se quiere definir una clase que permita controlar un sintonizador digital de
// emisoras FM; concretamente, se desea dotar al controlador de una interfaz que permita subir (up)
// o bajar (down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un
// momento dado (display). Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz
// y los 108MHz y que, al inicio, el controlador sintonice a 80MHz. Si durante una operación de
// subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser
// la del extremo contrario. Escribir un pequeño programa principal para probar su funcionamiento.

public class SintonizadorFM {
  // Atributos.
  double frecuencia;
  double limite_min = 80;
  double limite_max = 108;

  // Constructor
  public SintonizadorFM() {
    setFrecuencia(80.5);
  }

  public double getFrecuencia() {
    return frecuencia;
  }

  public void setFrecuencia(double frecuencia) {
    if (frecuencia <= limite_max && frecuencia >= limite_min) {
      this.frecuencia = frecuencia;
    } else if (frecuencia > limite_max) {
      this.frecuencia = limite_min;
    } else {
      this.frecuencia = limite_max;
    }
  }

  // Función para subir Frecuencia sintonizada.
  public void up_frecuencia() {
    setFrecuencia(this.frecuencia + 0.5);
  }

  // Función para bajar Frecuencia sintonizada.
  public void down_frecuencia() {
    setFrecuencia(this.frecuencia - 0.5);
  }

  // Para mostrar la frecuencia sintonizada.
  public void display() {
    System.out.println("La frecuencia sintonizada es: " + this.frecuencia + "MHz");
  }
}
