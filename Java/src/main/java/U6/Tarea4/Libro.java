package U6.Tarea4;

import java.util.Objects;

public class Libro implements Comparable {
  // Atributos.
  private String titulo;
  private String autor;

  // Constructor.
  public Libro(String titulo, String autor) throws ExcepcionAutor {
    setTitulo(titulo);
    setAutor(autor);
  }

  // Método Equals por sus dos atributos.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Libro)) return false;
    Libro libro = (Libro) o;
    return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
  }

  // Método CompareTo
  @Override
  public int compareTo(Object o) {
    Libro otro_libro = (Libro) o;

    return this.getTitulo().compareTo(otro_libro.getTitulo());
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Libro {" + titulo + ": " + autor + "}";
  }

  // Set and Get.
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) throws ExcepcionAutor {
    for (int i = 0; i < autor.length(); i++) {
      char c = autor.charAt(i);
      // Si no está entre a y z, ni entre A y Z, ni es un espacio.
      if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
        throw new ExcepcionAutor("No puedes meter números en el nombre del Autor.");
      }
    }
    this.autor = autor;
  }
}
