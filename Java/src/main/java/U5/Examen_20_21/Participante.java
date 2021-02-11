package U5.Examen_20_21;

import java.util.Objects;

public abstract class Participante implements Comparable {
  // Atributos.
  protected String nombre_atleta;
  protected int edad_atleta;

  // Constructor.
  public Participante(String nombre_atleta, int edad_atleta) {
    setNombre_atleta(nombre_atleta);
    setEdad_atleta(edad_atleta);
  }

  // Método para hacer juramento.
  public void hacerjuramento() {}

  // Método equals para comparar Participantes.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Participante)) return false;
    Participante that = (Participante) o;
    return edad_atleta == that.edad_atleta && Objects.equals(nombre_atleta, that.nombre_atleta);
  }

  // Método para ordenar participantes por edad.
  @Override
  public int compareTo(Object o) {
    int resultado;
    Participante otro_parti = (Participante) o;

    if (this.getEdad_atleta() > otro_parti.getEdad_atleta()) {
      return 1;
    } else if (this.getEdad_atleta() < otro_parti.getEdad_atleta()) {
      return -1;
    } else {
      return 0;
    }
  }

  // Método ToString
  @Override
  public String toString() {
    return "Participante{"
        + "nombre_atleta='"
        + nombre_atleta
        + '\''
        + ", edad_atleta="
        + edad_atleta
        + '}';
  }

  // Get and Set.
  public String getNombre_atleta() {
    return nombre_atleta;
  }

  public void setNombre_atleta(String nombre_atleta) {
    this.nombre_atleta = nombre_atleta;
  }

  public int getEdad_atleta() {
    return edad_atleta;
  }

  public void setEdad_atleta(int edad_atleta) {
    this.edad_atleta = edad_atleta;
  }
}
