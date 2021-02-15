package U5.Entregable_2021;

public class main {
  public static void main(String[] args) {
    // Principal.
    Juego olimpiadas = new Juego(2020, "Roma");

    Atleta atleta1 = new Atleta("Jorge", 22, "Carrera");
    Atleta atleta2 = new Atleta("Pablo", 18, "Carrera");
    Atletismo atletismo1 = new Atletismo("100 metros", "Cantera", 2);
    atleta1.hacerjuramento();
    atleta1.correr();
    System.out.println();

    atletismo1.add_participante(atleta1);
    atletismo1.add_participante(atleta2);
    atletismo1.mostrarParticipantes();
    // atletismo1.del_participante(atleta1);
    System.out.println();

    Pais italia = new Pais("Italia", 10);
    Pais absten = new Pais("Absten", 23);
    Pais escocia = new Pais("Escocia", 45);
    olimpiadas.add_pais(italia);
    olimpiadas.add_pais(escocia);
    olimpiadas.add_pais(absten);
    olimpiadas.mostrarPaises();
    System.out.println();

    olimpiadas.mostrarPaisesParaCeremonia();
    System.out.println();

    atletismo1.mostrarParticipantes();
  }
}
