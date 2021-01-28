package U4.Entregable;

import java.util.Arrays;

public class Escenario {
  // Atributos.
  private int tpix_altura;
  private int tpix_longitud;
  private int anillos;
  private int gemas;
  private ListaEnemigos[] tipos_enemigos;
  private Enemigo[] enemigos;
  private int indice_enemigos;
  private int max_enemigos;

  // Constructor.

  public Escenario(ListaEnemigos[] tipos_enemigos) {
    this.indice_enemigos = 0;
    this.max_enemigos = 10;
    setTpix_altura(100);
    setTpix_longitud(100);
    setAnillos(500);
    setGemas(2);
    setTipos_enemigos(tipos_enemigos);
    setEnemigos();
  }

  // Método para Añadir Enemigo.
  public void add_enemigo() {
    if (indice_enemigos < 10) {
      this.enemigos = Arrays.copyOf(this.enemigos, this.enemigos.length + 1);
      int num_alea;
      num_alea = (int) (Math.random() * tipos_enemigos.length);

      Enemigo e = new Enemigo(this.tipos_enemigos[num_alea]);
      this.enemigos[indice_enemigos++] = e;
    }
  }

  // Método eliminar enemigo.
  public void del_enemigo(int num) {
    if (num < indice_enemigos) {
      for (int i = num; i < indice_enemigos; i++) {
        this.enemigos[i] = this.enemigos[i + 1];
      }
      indice_enemigos--;
      this.enemigos[indice_enemigos] = null;
    }
  }

  // ToString
  @Override
  public String toString() {
    return "Escenario{"
        + "tpix_altura="
        + tpix_altura
        + ", tpix_longitud="
        + tpix_longitud
        + ", anillos="
        + anillos
        + ", gemas="
        + gemas
        + ", tipos_enemigos="
        + Arrays.toString(tipos_enemigos)
        + ", enemigos="
        + Arrays.toString(enemigos)
        + '}';
  }

  // Set and Get.
  public int getTpix_altura() {
    return tpix_altura;
  }

  public void setTpix_altura(int tpix_altura) {
    this.tpix_altura = tpix_altura;
  }

  public int getTpix_longitud() {
    return tpix_longitud;
  }

  public void setTpix_longitud(int tpix_longitud) {
    this.tpix_longitud = tpix_longitud;
  }

  public int getAnillos() {
    return anillos;
  }

  public void setAnillos(int anillos) {
    this.anillos = anillos;
  }

  public int getGemas() {
    return gemas;
  }

  public void setGemas(int gemas) {
    this.gemas = gemas;
  }

  public ListaEnemigos[] getTipos_enemigos() {
    return tipos_enemigos;
  }

  public void setTipos_enemigos(ListaEnemigos[] tipos_enemigos) {
    this.tipos_enemigos = tipos_enemigos;
  }

  public Enemigo[] getEnemigos() {
    return enemigos;
  }

  public void setEnemigos() {
    this.enemigos = new Enemigo[indice_enemigos];
  }
}
