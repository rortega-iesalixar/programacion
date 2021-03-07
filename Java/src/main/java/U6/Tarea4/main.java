package U6.Tarea4;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    // Principal.

    try {
      RegistroLibros Biblioteca = new RegistroLibros(4);
      Biblioteca.add_libro("28 Días", "Marcos");
      Biblioteca.add_libro("28 Días", "Marcos");
      Biblioteca.add_libro("28 Días", "Marcos");
      Biblioteca.add_libro("28 Días", "Marcos");

      Biblioteca.cargarRegistroAfichero();

      System.out.println(Biblioteca.toString());
    } catch (ExcepcionAutor ex) {
      System.out.println(ex.getMessage());
    }

    RegistroLibros Biblio = new RegistroLibros(5);
    Biblio.cargarRegistroDesdeFichero("registro.txt");

    System.out.println(Biblio.toString());

    try {
      RegistroLibros l1 = new RegistroLibros(2);
      l1.add_libro("Hacuna", "Mat2ta");

    } catch (ExcepcionAutor ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println();

    try {
      RegistroLibros Almacen = new RegistroLibros(3);
      Almacen.add_libro("Hacuna", "Matata");
      Almacen.add_libro("Bebe", "Cuna");
      Almacen.add_libro("Flank", "Bubu");

      if (Almacen.buscaLibro("Bebe")) {
        System.out.println("Tenemos el libro en el Registro.");
      } else {
        System.out.println("No tenemos el libro en el Registro.");
      }
      System.out.println();

      Libro liro1 = new Libro("Crimen y Castigo", "Roberto Fauto");
      Libro liro2 = new Libro("Nueva Luna", "Pedro Piqueras");
      Libro liro3 = new Libro("Eva", "Juan Matas");
      Libro[] liros = new Libro[3];
      liros[0] = liro1;
      liros[1] = liro2;
      liros[2] = liro3;
      Arrays.sort(liros);

      if (liro1.equals(liro1)) {
        System.out.println("Son iguales.");
      } else {
        System.out.println("No son iguales.");
      }

      System.out.println();
      System.out.println(Almacen.toString());
      Arrays.sort(Almacen.getLibros());
      System.out.println();
      System.out.println(Almacen.toString());

    } catch (ExcepcionAutor ex) {
      System.out.println(ex.getMessage());
    }
  }
}
