package U2.U2_Entrega;

import java.text.Collator;
import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
    // abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
    // Las vocales abiertas son a, e, o.
    //
    // Ejemplo:
    // Entrada: cad = "Hipólito el Ánodo"
    // Salida: La cantidad de espacios, haches y vocales abiertas es 9

    String cadena, cadena_temp;
    int contador = 0;
    // char[] a = {'a', 'e', 'o', 'h', ' '};
    // String s = new String(a);

    Scanner sc = new Scanner(System.in);

    Collator comparador = Collator.getInstance();
    comparador.setStrength(Collator.PRIMARY);

    System.out.println("Por favor, introduzca la cadena a analizar:");
    cadena = sc.nextLine();

    for (int i = 0; i < cadena.length(); i++) {
      cadena_temp = cadena.substring(i, i + 1);

      if (comparador.compare(cadena_temp, "a") == 0) {
        contador++;
      }
      if (comparador.compare(cadena_temp, "e") == 0) {
        contador++;
      }
      if (comparador.compare(cadena_temp, "o") == 0) {
        contador++;
      }
      if (comparador.compare(cadena_temp, "h") == 0) {
        contador++;
      }
      if (comparador.compare(cadena_temp, " ") == 0) {
        contador++;
      }
    }
    System.out.println("");
    System.out.println("La cantidad de espacios, haches y vocales abiertas es: " + contador);
  }
}
