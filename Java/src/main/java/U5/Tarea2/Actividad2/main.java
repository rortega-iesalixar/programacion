package U5.Tarea2.Actividad2;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    // Principal
    Cliente c1 = new Cliente("1155b", "Barret", 48, 12000);
    Cliente c2 = new Cliente("1121g", "Cait", 35, 1000);
    Cliente c3 = new Cliente("1123z", "Aeris", 21, 1000);
    Cliente c4 = new Cliente("1112d", "Tifa", 19, 1000);
    Cliente c5 = new Cliente("1111a", "Cloud", 23, 1000);
    Cliente[] Arr_Clientes = new Cliente[5];

    // System.out.println(c1.equals(c2));

    Arr_Clientes[0] = c1;
    Arr_Clientes[1] = c2;
    Arr_Clientes[2] = c3;
    Arr_Clientes[3] = c4;
    Arr_Clientes[4] = c5;

    Arrays.sort(Arr_Clientes);
    System.out.println(Arrays.toString(Arr_Clientes));
    System.out.println("Ordenado por DNI.");

    Arrays.sort(Arr_Clientes, new ComparadorNombres());
    System.out.println(Arrays.toString(Arr_Clientes));
    System.out.println("Ordenado por Nombre.");

    Arrays.sort(Arr_Clientes, new ComparadorEdad());
    System.out.println(Arrays.toString(Arr_Clientes));
    System.out.println("Ordenado por Edad.");
  }
}
