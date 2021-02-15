package U5.Examen_2021;

import java.util.Arrays;

public class Caja {
  // Atributos.
  private Prenda[] prendas;
  private int num_indentificador;
  private int indice_prendas;
  private int max_prendas;

  // Constructor.
  public Caja(int num_indentificador) {
    setIndice_prendas(0);
    setMax_prendas(5);
    setPrendas();
    setNum_indentificador(num_indentificador);
  }

  // Añadir prendas a la caja.
  public void add_prenda(Prenda prendas) {
    if (this.indice_prendas < this.max_prendas) {
      this.prendas = Arrays.copyOf(this.prendas, this.prendas.length + 1);
      this.prendas[indice_prendas++] = prendas;
      System.out.println("Prenda agregada a la caja.");
    } else {
      System.out.println("No caben más prendas en la caja.");
    }
  }

  // Quitar prenda a la caja.
  public void del_prenda(Prenda prendas) {
    for (int i = 0; i < this.prendas.length; i++) {
      if (this.prendas[i].equals(prendas)) {
        for (int j = i; j < this.prendas.length - 1; j++) {
          this.prendas[j] = this.prendas[j + 1];
          this.indice_prendas--;
          System.out.println("Prenda eliminada.");
        }
      }
    }
  }

  // Método equals para buscar la caja.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Caja)) return false;
    Caja caja = (Caja) o;
    return num_indentificador == caja.num_indentificador;
  }

  // Set and get.
  public Prenda[] getPrendas() {
    return prendas;
  }

  public void setPrendas() {
    this.prendas = new Prenda[this.indice_prendas];
  }

  public int getIndice_prendas() {
    return indice_prendas;
  }

  public void setIndice_prendas(int indice_prendas) {
    this.indice_prendas = indice_prendas;
  }

  public int getMax_prendas() {
    return max_prendas;
  }

  public void setMax_prendas(int max_prendas) {
    this.max_prendas = max_prendas;
  }

  public int getNum_indentificador() {
    return num_indentificador;
  }

  public void setNum_indentificador(int num_indentificador) {
    this.num_indentificador = num_indentificador;
  }
}
