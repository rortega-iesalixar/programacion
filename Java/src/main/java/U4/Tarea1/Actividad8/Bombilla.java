package U4.Tarea1.Actividad8;

// Actividad 8: Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender
// o apagar individualmente. Para ello hacer una clase Bombilla con una variable privada que indique
// si está encencida o apagada, así como un método que nos diga el estado de la bombilla. Además,
// queremos poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas
// se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a estar encendidas
// o apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se apagan
// individualmente, pero solo responde si su interruptor particular está activado y además hay luz
// general.

public class Bombilla {
  // Atributos
  private boolean interruptor_particular = false;
  static boolean interruptor_general = true; // Por defecto estará siempre encendido (true).

  // Para comprobar el estado de la bombilla.
  public void estado_bombilla() {
    if (interruptor_general && this.interruptor_particular) {
      System.out.println("La bombilla está encendida");
    } else if (!interruptor_general) {
      System.out.println("Han saltado los fusibles, todas las bombillas están apagadas.");
    } else {
      System.out.println("La bombilla está apagada.");
    }
  }

  // Apagamos el interruptor general (salto de fusibles).
  public void apagar_interruptor_general() {
    setInterruptor_general(false);
  }

  // Encedemos el interruptor general.
  public void encender_interruptor_general() {
    setInterruptor_general(true);
  }

  // Constructor de Bombillas.
  public Bombilla(boolean interruptor_particular) {
    this.interruptor_particular = interruptor_particular;
  }

  public boolean isInterruptor_particular() {
    return interruptor_particular;
  }

  public void setInterruptor_particular(boolean interruptor_particular) {
    this.interruptor_particular = interruptor_particular;
  }

  public static boolean isInterruptor_general() {
    return interruptor_general;
  }

  public static void setInterruptor_general(boolean interruptor_general) {
    Bombilla.interruptor_general = interruptor_general;
  }
}
