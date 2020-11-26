package U3.Tarea3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En
    // una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
    //
    // Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado
    // para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo
    // de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
    // personas como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la
    // primera mesa libre (con 0 personas).
    //
    // Si no quedan mesas libres, se busca donde haya un hueco para tod o el grupo, por ejemplo si
    // el grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,las
    // mesas se cargan con valores aleatorios entre 0 y 4.
    //
    // Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no
    // se pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se
    // ilustra a continuación:

    Scanner sc = new Scanner(System.in);
    int comensales;
    int array_mesas[] = new int[10];

    for (int i = 0; i < array_mesas.length; i++) {
      array_mesas[i] = (int) (Math.random() * 5);
      // System.out.println("Mesa Nº" + i + ": " + array_mesas[i] + " comensales.");
    }
    System.out.println("Mesa Nº:    1  2  3  4  5  6  7  8  9  10");
    System.out.println("Ocupación: " + Arrays.toString(array_mesas));

    do {
      System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
      comensales = sc.nextInt();

      if (comensales > 0 && comensales < 5) {
        // Aquí busca las mesas vacías.
        if (funcion_mesa0(array_mesas)) {
          for (int i = 0; i < array_mesas.length; i++) {
            if (array_mesas[i] == 0) {
              array_mesas[i] = comensales;
              System.out.println("Por favor, siéntese en la mesa número " + (i + 1));
              break;
            }
          }
        } else {
          // Aquí rellenamos mesas.
          if (funcion_rellena_mesa(array_mesas, comensales)) {
            for (int i = 0; i < array_mesas.length; i++) {
              if (comensales + array_mesas[i] < 5) {
                array_mesas[i] = array_mesas[i] + comensales;
                System.out.println(
                    "Tendrá que compartir mesa. Por favor, siéntese en la mesa número " + (i + 1));
                break;
              }
            }
          } else {
            System.out.println("Lo sentimos, en estos momentos no queda sitio.");
          }
        }

        System.out.println("Mesa Nº:    1  2  3  4  5  6  7  8  9  10");
        System.out.println("Ocupación: " + Arrays.toString(array_mesas));

      } else if (comensales != -1) {
        System.out.println(
            "Lo siento, no admitimos grupos mayores de 4, haga grupos de 4 personas como máximo e intente de nuevo.");
      }

    } while (comensales != -1);
    System.out.println("Gracias. Hasta pronto.");
  }

  // Para buscar mesas vacías.
  public static boolean funcion_mesa0(int[] array_m) {
    boolean mesa_vacia = false;
    for (int i = 0; i < array_m.length; i++) {
      if (array_m[i] == 0) {
        mesa_vacia = true;
        break;
      }
    }
    return mesa_vacia;
  }

  // Buscamos espacio en las mesas que están llenas.
  public static boolean funcion_rellena_mesa(int[] array_m, int personas) {
    boolean mesa_espacio = false;
    int mesa_total;
    for (int i = 0; i < array_m.length; i++) {
      mesa_total = personas + array_m[i];
      if (mesa_total < 5) {
        mesa_espacio = true;
        break;
      }
    }
    return mesa_espacio;
  }
}
