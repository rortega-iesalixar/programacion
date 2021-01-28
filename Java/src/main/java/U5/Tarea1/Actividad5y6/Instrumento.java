package U5.Tarea1.Actividad5y6;

// Actividad 5: Crear la clase Instrumento, que es una clase abstracta que almacena un máximo de 100
// notas musicales. Mientras haya sitio es posible añadir nuevas notas musicales, al final, con el
// método add(). La clase también dispone del método abstracto interpretar() que en cada subclase
// que herede de Instrumento, mostrará por consola las notas musicales según las interprete.
// Utilizar enumerados para definir las notas musicales.

// Actividad 6: Crear la clase Piano y la clase Campana que heredan de Instrumento.

import java.util.Arrays;

public abstract class Instrumento {
  // Atributos.
  Notas_musicales[] notas_musicales;
  int maximo_notas;
  int indice_notas;

  // Constructor.
  public Instrumento() {
    this.maximo_notas = 100;
    this.indice_notas = 0;
    this.notas_musicales = new Notas_musicales[indice_notas];
  }

  // Método para añadir nuevas notas musicales.
  public void add(Notas_musicales nota_musical) {
    if (this.indice_notas < this.maximo_notas) {
      this.notas_musicales = Arrays.copyOf(this.notas_musicales, this.notas_musicales.length + 1);
      this.notas_musicales[indice_notas++] = nota_musical;
    } else {
      System.out.println("No caben más notas musicales en el instrumento.");
    }
  }

  // Método abstracto Interpretar.
  public abstract void interpretar();
}
