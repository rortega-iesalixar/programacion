package U5.Tarea1.Actividad5y6;

public class main {
  public static void main(String[] args) {
    // Principal Instrumento.
    Campana camp1 = new Campana();
    camp1.add(Notas_musicales.DO);
    camp1.add(Notas_musicales.RE);
    camp1.interpretar();

    Piano pia1 = new Piano();
    pia1.add(Notas_musicales.LA);
    pia1.add(Notas_musicales.FA);
    pia1.interpretar();
  }
}
