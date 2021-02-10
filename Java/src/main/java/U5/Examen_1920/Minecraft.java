package U5.Examen_1920;

import java.util.Arrays;

public class Minecraft {
  // Atributos.
  private Material[] materiales;
  private int max_materiales;
  private int indice_materiales;

  // Constructor.
  public Minecraft() {
    setMax_materiales(10);
    setIndice_materiales(0);
    setMateriales();
  }

  // Método para añadir Material al array.
  public void add_Material(Material mate) {
    if (this.indice_materiales < this.max_materiales) {
      this.materiales = Arrays.copyOf(this.materiales, this.materiales.length + 1);
      this.materiales[this.indice_materiales++] = mate;
    } else {
      System.out.println("No puedes introducir más materiales.");
    }
  }

  // Método para borrar material/es sin masa que se encuentren en la lista.
  public void borrarMaterialSinMasa() {
    for (int i = 0; i < this.materiales.length; i++) {
      if (this.materiales[i].getMasa() <= 0) {
        for (int j = i; j < this.materiales.length - 1; j++) {
          this.materiales[j] = this.materiales[j + 1];
        }
        i = -1;
        this.materiales = Arrays.copyOf(this.materiales, this.materiales.length - 1);
      }
    }
  }

  // Método para mostrar el estado de los materiales del Array.
  public String mostrarEstado() {
    return "Minecraft{" + "materiales=" + Arrays.toString(materiales) + '}';
  }

  // Método para mostrar los datos del material que esté a 0 de masa (solo si hay 1).
  public void ultimoMaterialQueQueda() {
    int ubic_material = 0;
    int cant_materiales_a_0 = 0;

    for (int i = 0; i < this.materiales.length; i++) {
      if (this.materiales[i].getMasa() <= 0) {
        ubic_material = i;
        cant_materiales_a_0++;
      }
    }

    if (cant_materiales_a_0 == 1) {
      System.out.println(this.materiales[ubic_material].toString());
    } else if (cant_materiales_a_0 == 0) {
      System.out.println("No hay materiales a 0 de masa.");
    } else {
      System.out.println("Hay más de un material a 0 de masa.");
    }
  }

  // Set and Get.
  public Material[] getMateriales() {
    return materiales;
  }

  public void setMateriales() {
    this.materiales = new Material[this.getIndice_materiales()];
  }

  public int getMax_materiales() {
    return max_materiales;
  }

  public void setMax_materiales(int max_materiales) {
    this.max_materiales = max_materiales;
  }

  public int getIndice_materiales() {
    return indice_materiales;
  }

  public void setIndice_materiales(int indice_materiales) {
    this.indice_materiales = indice_materiales;
  }
}
