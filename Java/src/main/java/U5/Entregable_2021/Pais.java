package U5.Entregable_2021;

import java.util.Objects;

public class Pais implements Comparable {
  // Atributos.
  private String nombre_pais;
  private int num_participantes;

  // Constructor.
  public Pais(String nombre_pais, int num_participantes) {
    setNombre_pais(nombre_pais);
    setNum_participantes(num_participantes);
  }

  // Método equals para buscar Paises iguales.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Pais)) return false;
    Pais pais = (Pais) o;
    return num_participantes == pais.num_participantes
        && Objects.equals(nombre_pais, pais.nombre_pais);
  }

  // Método para ordenar paises por numero de participantes.
  @Override
  public int compareTo(Object o) {
    Pais otro_pais = (Pais) o;
    return this.getNombre_pais().compareTo(otro_pais.getNombre_pais());
  }

  // ToString de pais.
  @Override
  public String toString() {
    return "Pais{"
        + "nombre_pais='"
        + nombre_pais
        + '\''
        + ", num_participantes="
        + num_participantes
        + '}';
  }

  // Get and Set.
  public String getNombre_pais() {
    return nombre_pais;
  }

  public void setNombre_pais(String nombre_pais) {
    this.nombre_pais = nombre_pais;
  }

  public int getNum_participantes() {
    return num_participantes;
  }

  public void setNum_participantes(int num_participantes) {
    this.num_participantes = num_participantes;
  }
}
