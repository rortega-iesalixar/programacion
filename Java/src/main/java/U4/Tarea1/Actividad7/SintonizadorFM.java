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

  // Constructor
  public SintonizadorFM(double frecuencia) {
    setFrecuencia(80);
  }

  public double getFrecuencia() {
    return frecuencia;
  }

  public void setFrecuencia(double frecuencia) {
    this.frecuencia = frecuencia;
  }
  // Función para subir Frecuencia sintonizada.
  public void subir_frecuencia() {
    //
  }

  // Función para bajar Frecuencia sintonizada.
  public void bajar_frecuencia() {
    //
  }

  // Para mostrar la frecuencia sintonizada.
  public void display() {
    System.out.println("La frecuencia sintonizada es: " + frecuencia);
  }
}
