package U5.Entregable_2021;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deporte {
  // Atributos.
  protected String nombre_deporte;
  protected String nombre_pabellon;
  protected Participante[] participantes;
  protected int indice_participantes;

  // Constructor.
  public Deporte(String nombre_deporte, String nombre_pabellon) {
    setNombre_deporte(nombre_deporte);
    setNombre_pabellon(nombre_pabellon);
    setIndice_participantes(0);
    setParticipantes();
  }

  // Método para añadir participantes a la lista.
  public void add_participante(Participante p) {
    this.participantes = Arrays.copyOf(this.participantes, this.participantes.length + 1);
    this.participantes[this.indice_participantes++] = p;
    System.out.println("Participante añadido.");
  }

  // Método para quitar participantes a la lista.
  public void del_participante(Participante p) {
    for (int i = 0; i < this.participantes.length; i++) {
      if (this.participantes[i].equals(p)) {
        for (int j = i; j < this.participantes.length - 1; j++) {
          this.participantes[j] = this.participantes[j + 1];
        }
        this.participantes = Arrays.copyOf(this.participantes, this.participantes.length - 1);
        this.indice_participantes--;
        System.out.println("Participante borrado.");
      } else {
        System.out.println("No se encuentra el participante.");
      }
    }
  }

  // Método para mostrar los participantes de un deporte ordenados por edad.
  public void mostrarParticipantes() {
    Arrays.sort(participantes);
    System.out.println(Arrays.toString(participantes));
  }

  // Método equals para buscar Deportes.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Deporte)) return false;
    Deporte deporte = (Deporte) o;
    return Objects.equals(nombre_deporte, deporte.nombre_deporte)
        && Objects.equals(nombre_pabellon, deporte.nombre_pabellon);
  }

  // Get and Set.
  public String getNombre_deporte() {
    return nombre_deporte;
  }

  public void setNombre_deporte(String nombre_deporte) {
    this.nombre_deporte = nombre_deporte;
  }

  public String getNombre_pabellon() {
    return nombre_pabellon;
  }

  public void setNombre_pabellon(String nombre_pabellon) {
    this.nombre_pabellon = nombre_pabellon;
  }

  public Participante[] getParticipantes() {
    return participantes;
  }

  public void setParticipantes() {
    this.participantes = new Participante[this.getIndice_participantes()];
  }

  public int getIndice_participantes() {
    return indice_participantes;
  }

  public void setIndice_participantes(int indice_participantes) {
    this.indice_participantes = indice_participantes;
  }
}
