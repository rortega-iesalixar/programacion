package U5.Examen_20_21;

import java.util.Arrays;

public class Juego {
  // Atributos.
  private int anyo;
  private String sede;
  private Pais[] paises;
  private Deporte[] deportes;
  private int indice_paises;
  private int indice_deportes;

  // Constructor.
  public Juego(int anyo, String sede) {
    setAnyo(anyo);
    setSede(sede);
    setIndice_paises(0);
    setIndice_deportes(0);
    setPaises();
    setDeportes();
  }

  // Método para añadir paises a la lista.
  public void add_pais(Pais ps) {
    this.paises = Arrays.copyOf(this.paises, this.paises.length + 1);
    this.paises[this.indice_paises++] = ps;
    System.out.println("Participante añadido.");
  }

  // Método para quitar paises de la lista.
  public void del_pais(Pais ps) {
    for (int i = 0; i < this.paises.length; i++) {
      if (this.paises[i].equals(ps)) {
        for (int j = i; j < this.paises.length - 1; j++) {
          this.paises[j] = this.paises[j + 1];
        }
        this.paises = Arrays.copyOf(this.paises, this.paises.length - 1);
        this.indice_paises--;
        System.out.println("País borrado.");
      } else {
        System.out.println("No se encuentra el país.");
      }
    }
  }

  // Método para añadir deportes a la lista.
  public void add_deporte(Deporte deport) {
    this.deportes = Arrays.copyOf(this.deportes, this.deportes.length + 1);
    this.deportes[this.indice_deportes++] = deport;
    System.out.println("Deporte añadido.");
  }

  // Método para quitar deportes de la lista.
  public void del_deporte(Deporte deport) {
    for (int i = 0; i < this.deportes.length; i++) {
      if (this.deportes[i].equals(deport)) {
        for (int j = i; j < this.deportes.length - 1; j++) {
          this.deportes[j] = this.deportes[j + 1];
        }
        this.deportes = Arrays.copyOf(this.deportes, this.deportes.length - 1);
        this.indice_deportes--;
        System.out.println("Deporte borrado.");
      } else {
        System.out.println("No se encuentra el Deporte.");
      }
    }
  }

  // Método para mostrar Países ordenados por número de participantes.
  public void mostrarPaises() {
    Arrays.sort(paises, new OrdenarPaisParticipantes());
    System.out.println(Arrays.toString(paises));
  }

  // Método para ordenar Páises por nombre del País.
  public void mostrarPaisesParaCeremonia() {
    Arrays.sort(paises);
    System.out.println(Arrays.toString(paises));
  }

  // Set and Get.
  public int getAnyo() {
    return anyo;
  }

  public void setAnyo(int anyo) {
    if (anyo % 4 == 0) {
      this.anyo = anyo;
    } else {
      this.anyo = 2020;
    }
  }

  public String getSede() {
    return sede;
  }

  public void setSede(String sede) {
    this.sede = sede;
  }

  public Pais[] getPaises() {
    return paises;
  }

  public void setPaises() {
    this.paises = new Pais[this.getIndice_paises()];
  }

  public Deporte[] getDeportes() {
    return deportes;
  }

  public void setDeportes() {
    this.deportes = new Deporte[this.getIndice_deportes()];
  }

  public int getIndice_paises() {
    return indice_paises;
  }

  public void setIndice_paises(int indice_paises) {
    this.indice_paises = indice_paises;
  }

  public int getIndice_deportes() {
    return indice_deportes;
  }

  public void setIndice_deportes(int indice_deportes) {
    this.indice_deportes = indice_deportes;
  }
}
