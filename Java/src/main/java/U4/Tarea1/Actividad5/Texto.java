package U4.Tarea1.Actividad5;

// Actividad 5: Diseñar la clase Texto que gestiona una cadena de caracteres con algunas
// características:
//
// -La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
//
// -Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.
//
// -Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se
// rebase el tamaño máximo establecido.
//
// -Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

public class Texto {
  public String cadena;
  public int tamMax;
  static String vocales = "aeiouAEIOU";

  public Texto(int tamMax) {
    cadena = "";
    this.tamMax = tamMax;
  }

  public void n_caracter_prin(Character nuevo_caracter) {
    if (cadena.length() + 1 <= tamMax) {
      cadena = nuevo_caracter + cadena;
    }
  }

  public void n_caracter_fin(Character nuevo_caracter) {
    if (cadena.length() + 1 <= tamMax) {
      cadena = cadena + nuevo_caracter;
    }
  }

  public void n_cadena_prin(String nueva_cadena) {
    if (cadena.length() + nueva_cadena.length() <= tamMax) {
      cadena = nueva_cadena + cadena;
    }
  }

  public void n_cadena_fin(String nueva_cadena) {
    if (cadena.length() + nueva_cadena.length() <= tamMax) {
      cadena = cadena + nueva_cadena;
    }
  }

  public int cont_vocales() {
    int contador_voc = 0;
    for (int i = 1; i < cadena.length(); i++) {
      if (voc_boolean(cadena.substring(i, i + 1))) {
        contador_voc++;
      }
    }
    // System.out.println(contador_voc);
    return contador_voc;
  }

  public boolean voc_boolean(String voc) {
    boolean compro = false;
    for (int i = 1; i < vocales.length(); i++) {
      if (vocales.substring(i, i + 1).equals(voc)) {
        compro = true;
        return compro;
      }
    }
    return compro;
  }
}
