package U2.Tarea7;

public class Ejer3 {
  public static void main(String[] args) {
    // Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la
    // función Math.random(). Investiga también sobre el sistema de codificación ASCII y ten en
    // cuenta que las letras minúsculas se corresponden con los números del 97 al 122.

    // La variable palabra almacena el resultado final
    String palabra = "";

    // La variable caractéres es un número aleatorio entre 2 y 20 que define la longitud de la
    // palabra.
    int caracteres = (int) (Math.random() * 20) + 2;

    // Con un bucle for, que recorreremos las veces que tengamos almacenadas en la variable
    // caracteres, que será como mínimo 2, iremos concatenando los caracteres aleatorios.
    for (int i = 0; i < caracteres; i++) {
      // Para generar caracteres aleatorios hay que recurrir al valor numérico de estos
      // caracteres en el alfabeto Ascii. En este programa vamos a generar palabras con
      // letras minúsculas, que se encuentran en el rango 97-122. El método floor
      // devuelve el máximo entero.
      int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
      // para pasar el código a carácter basta con hacer un cast a char
      palabra = palabra + (char) codigoAscii;
    }
    System.out.println("Ejemplo con una cadena aleatoria:");
    System.out.println(palabra);

    // Segundo ejemplo con una sola letra.
    String letra = "";
    int codigoAscii2 = (int) Math.floor(Math.random() * (122 - 97) + 97);
    letra = letra + (char) codigoAscii2;
    System.out.println("");
    System.out.println("Ejemplo con una letra aleatoria:");
    System.out.println(letra);
  }
}
