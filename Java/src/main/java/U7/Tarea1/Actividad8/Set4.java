package U7.Tarea1.Actividad8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Set4 {
  public static void main(String[] args) {
    // Actividad 8: Implementar una función a la que se le pase una lista de nombres y devuelva una
    // copia sin elementos repetidos (sin modificar la original), con el prototipo:
    //
    // List eliminaRepetidos (List c)

    ArrayList<String> list_nombres = new ArrayList<String>();
    ArrayList<String> list_nombres_copia = new ArrayList<String>();

    String nom1 = "Carlos";
    String nom2 = "Carlos";
    String nom3 = "Pedro";
    String nom4 = "Alvaro";
    String nom5 = "Pedro";
    String nom6 = "Juan";
    String nom7 = "Juan";

    list_nombres.add(nom1);
    list_nombres.add(nom2);
    list_nombres.add(nom3);
    list_nombres.add(nom4);
    list_nombres.add(nom5);
    list_nombres.add(nom6);
    list_nombres.add(nom7);

    list_nombres_copia = eliminaRepetidos(list_nombres);
    System.out.println(list_nombres);
    System.out.println(list_nombres_copia);
  }

  public static ArrayList eliminaRepetidos(ArrayList c) {
    LinkedHashSet<String> list_sin_repe = new LinkedHashSet<String>();
    ArrayList<String> list_nombres_copia = new ArrayList<String>();
    list_sin_repe.addAll(c);

    list_nombres_copia.addAll(list_sin_repe);

    return list_nombres_copia;
  }
}
