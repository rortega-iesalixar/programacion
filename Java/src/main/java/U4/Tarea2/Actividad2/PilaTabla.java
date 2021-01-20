package U4.Tarea2.Actividad2;

import java.util.Arrays;

public class PilaTabla {
  // Atributos.
  private Integer[] pila;
  private int t_defecto = 0;
  private int cima_pila;

  // Constructor.
  public PilaTabla() {
    pila = new Integer[t_defecto];
    cima_pila = t_defecto;
  }

  // Método para mostrar la cima de la pila.
  public void cima_p() {
    System.out.println("La cima de la pila es el dato: " + pila[pila.length - 1]);
  }

  // Método para mostrar la pila.
  public void mostrar_pila() {
    System.out.println(Arrays.toString(getPila()));
  }

  // Método para apilar.
  public void apilar(Integer num) {
    pila = Arrays.copyOf(pila, pila.length + 1);
    pila[pila.length - 1] = num;
  }

  // Método para desapilar.
  public void desapilar() {
    pila = Arrays.copyOf(pila, pila.length - 1);
  }

  // Get
  public Integer[] getPila() {
    return pila;
  }
}
