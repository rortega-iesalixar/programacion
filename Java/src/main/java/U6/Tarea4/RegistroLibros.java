package U6.Tarea4;

import java.io.*;
import java.util.Arrays;

public class RegistroLibros {
  // Atributos.
  private Libro[] libros;
  private int indice_libros;
  private int max_libros;

  // Constructor.
  public RegistroLibros(int max_libros) {
    setIndice_libros(0);
    setMax_libros(max_libros);
    setLibros();
  }

  // Método para añadir libro a la tabla de registro.
  public boolean add_libro(String titulo, String autor) throws ExcepcionAutor {

    if (this.indice_libros < this.max_libros) {
      Libro nuevo_libro = new Libro(titulo, autor);
      this.libros = Arrays.copyOf(this.libros, this.libros.length + 1);
      this.libros[this.indice_libros++] = nuevo_libro;
      return true;
    } else {
      return false;
    }
  }

  // Método para buscar libros por Título.
  public boolean buscaLibro(String titulo) {
    for (int i = 0; i < this.libros.length; i++) {
      if (titulo.equals(this.libros[i].getTitulo())) {
        return true;
      }
    }
    return false;
  }

  // Métodos para cargar Registros a un fichero.
  public void cargarRegistroAfichero(String nombre_fichero) {
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//" + nombre_fichero));
      for (int i = 0; i < this.libros.length; i++) {
        out.write(this.libros[i].getTitulo() + ": " + this.libros[i].getAutor());
        out.newLine();
      }
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  public void cargarRegistroAfichero() {
    cargarRegistroAfichero("registro.txt");
  }

  // Método para cargar los registros desde el Fichero.
  public void cargarRegistroDesdeFichero(String nombre_fichero) {
    String titulo_autor = "";
    String[] array_ta = new String[2];

    try {
      BufferedReader in = new BufferedReader(new FileReader("Ficheros//" + nombre_fichero));
      titulo_autor = in.readLine();
      array_ta = titulo_autor.split(":");

      while (titulo_autor != null) {
        add_libro(array_ta[0].trim(), array_ta[1].trim());

        titulo_autor = in.readLine();

        if (titulo_autor != null) {
          array_ta = titulo_autor.split(":");
        }
      }

      in.close();
    } catch (IOException | ExcepcionAutor ex) {
      System.out.println(ex.getMessage());
    }
  }

  // Método ToString.
  @Override
  public String toString() {
    return "RegistroLibros{" + "libros=" + Arrays.toString(libros) + '}';
  }

  // Set and Get.
  public Libro[] getLibros() {
    return libros;
  }

  public void setLibros() {
    this.libros = new Libro[this.getIndice_libros()];
  }

  public int getIndice_libros() {
    return indice_libros;
  }

  public void setIndice_libros(int indice_libros) {
    this.indice_libros = indice_libros;
  }

  public int getMax_libros() {
    return max_libros;
  }

  public void setMax_libros(int max_libros) {
    this.max_libros = max_libros;
  }
}
