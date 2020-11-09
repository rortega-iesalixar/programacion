package U2.U2_Examen;

public class Ejer2 {
  public static void main(String[] args) {
    // Realiza un programa que pinte por pantalla diez líneas formadas por carac-
    // teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
    // entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
    // aleatoria entre 1 y 40 caracteres.

    String cadena = "*-=.|@", caracter;
    int num_ale1, num_ale2;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Línea Nº " + i + ": ");

      num_ale1 = (int) (Math.random() * 6);
      caracter = cadena.substring(num_ale1, num_ale1 + 1);

      num_ale2 = (int) (Math.random() * 41 + 1);

      for (int j = 1; j <= num_ale2; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
    }
  }
}
