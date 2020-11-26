package U3.Tarea3_2;

public class Ejer5 {
  public static void main(String[] args) {
    // Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
    // números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de
    // la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así
    // como el máximo, el mínimo y la media de los números que hay en esa diagonal.

    int array_alea[][] = new int[10][10];
    int maximo = 200, minimo = 300, media = 0;

    for (int i = 0; i < array_alea.length; i++) {
      for (int j = 0; j < array_alea[i].length; j++) {
        array_alea[i][j] = (int) (Math.random() * 101 + 200);
      }
    }

    // System.out.println(Arrays.deepToString(array_alea));
    System.out.println("");
    for (int i = 0; i < array_alea.length; i++) {
      System.out.print(array_alea[i][i] + " ");
      media = media + array_alea[i][i];
      if (array_alea[i][i] > maximo) {
        maximo = array_alea[i][i];
      }
      if (array_alea[i][i] < minimo) {
        minimo = array_alea[i][i];
      }
    }
    System.out.println("");
    System.out.println("Número máximo de la diagonal: " + maximo);
    System.out.println("Número mínimo de la diagonal: " + minimo);
    System.out.println("Media de la diagonal: " + (media / 10));
    // System.out.println(Arrays.deepToString(array_alea));
  }
}
