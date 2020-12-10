package U3.U3_examen;

import java.util.Arrays;

public class Ejer4 {
  public static void main(String[] args) {
    // Define la función convierteArrayEnString con la siguiente cabecera:
    // public static String convierteArrayEnString(int[] a)
    // Esta función toma como parámetro un array que contiene números y devuelve una cadena de
    // caracteres con esos números. Por ejemplo,
    // si a = { }, convierteArrayEnString(a) devuelve “”;
    // si a = { 8 },convierteArrayEnString(a) devuelve “8”;
    // si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.

    int[] array_numeros = {6, 2, 5, 0, 1};

    System.out.println("Mostrando array...");
    System.out.println(Arrays.toString(array_numeros));
    System.out.println("");
    System.out.println("El array convertido a String es: " + convierteArrayEnString(array_numeros));
  }

  public static String convierteArrayEnString(int[] a) {
    String cadena = "";
    for (int i = 0; i < a.length; i++) {
      cadena = cadena + a[i];
    }
    return cadena;
  }
}
