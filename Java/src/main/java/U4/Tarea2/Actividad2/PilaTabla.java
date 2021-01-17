package U4.Tarea2.Actividad2;

import java.util.Arrays;

public class PilaTabla {
  // Atributos.
  int[] pila;

  // Constructor.
  public PilaTabla() {
    this.pila = new int[0];
  }

  // Método para mostrar la pila.
  public void mostrar_pila() {
    System.out.println(Arrays.toString(getPila()));
  }

  // Método para apilar.
  public void apilar(int num) {
    this.pila = Arrays.copyOf(this.pila, this.pila.length + 1);
    this.pila[this.pila.length - 1] = num;
  }

  // Método para desapilar.
  public void desapilar() {
    this.pila = Arrays.copyOf(this.pila, this.pila.length - 1);
  }

  // Get
  public int[] getPila() {
    return pila;
  }
}
