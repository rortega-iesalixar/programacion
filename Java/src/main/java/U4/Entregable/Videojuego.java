package U4.Entregable;

import java.util.Date;

public class Videojuego {
  private Date fecha;
  private Personaje personajes;
  private Escenario escenarios;
  private static String IP = "192.168.1.24";

  public Videojuego() {
    this.fecha = new Date();
    Personaje Sonic = new Personaje();
    this.personajes = Sonic;
    ListaEnemigos[] tipo_defecto_videojuego = new ListaEnemigos[2];
    tipo_defecto_videojuego[0] = ListaEnemigos.BUZZBOMBER;
    tipo_defecto_videojuego[1] = ListaEnemigos.COCONUTS;
    Escenario esc_defect = new Escenario(tipo_defecto_videojuego);
    this.escenarios = esc_defect;
  }

  public Videojuego(Personaje personajes, Escenario escenario) {
    this.fecha = new Date();
    this.personajes = personajes;
    this.escenarios = escenario;
  }

  // Método revisar IP
  public void revisar_IP() {
    System.out.println("La IP actual es: " + getIP());
  }

  // Método modificar IP.
  public void modificar_IP(String nueva_IP) {
    IP = nueva_IP;
  }

  public static String getIP() {
    return IP;
  }

  // To String.

  @Override
  public String toString() {
    return "Videojuego{"
        + "fecha="
        + fecha
        + ", personajes="
        + personajes
        + ", escenarios="
        + escenarios
        + '}';
  }
}
