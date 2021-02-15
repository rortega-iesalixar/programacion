package U5.Examen_2021;

import java.util.Objects;

public class Prenda implements Devolver, Doblar {
  // Atributos.
  protected int precio;
  protected String nombre_prenda;
  protected int codigo_barras;
  protected int peso;
  protected static int indice_prendas = 0;

  // Constructor.
  public Prenda(int precio, String nombre_prenda, int codigo_barras, int peso) {
    setPrecio(precio);
    setNombre_prenda(nombre_prenda);
    setCodigo_barras(codigo_barras);
    setPeso(peso);
    setIndice_prendas(indice_prendas + 1);
  }

  // Método para devolver.
  @Override
  public void devolver() {
    System.out.println(
        "Devolviendo la prenda con nombre "
            + this.getNombre_prenda()
            + " y precio "
            + this.getPrecio());
  }

  // Método para doblar.
  @Override
  public void doblar() {
    System.out.println("La prenda " + this.getNombre_prenda() + " se puede doblar.");
  }

  // Método equals para buscar la prenda.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Prenda)) return false;
    Prenda prenda = (Prenda) o;
    return precio == prenda.precio
        && codigo_barras == prenda.codigo_barras
        && peso == prenda.peso
        && Objects.equals(nombre_prenda, prenda.nombre_prenda);
  }

  // Set and Get.
  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String getNombre_prenda() {
    return nombre_prenda;
  }

  public void setNombre_prenda(String nombre_prenda) {
    this.nombre_prenda = nombre_prenda;
  }

  public int getCodigo_barras() {
    return codigo_barras;
  }

  public void setCodigo_barras(int codigo_barras) {
    this.codigo_barras = codigo_barras;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public static int getIndice_prendas() {
    return indice_prendas;
  }

  public static void setIndice_prendas(int indice_prendas) {
    Prenda.indice_prendas = indice_prendas;
  }
}
