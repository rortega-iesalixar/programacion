package U4.Tarea1.Actividad5;

public class main {
  public static void main(String[] args) {
    Texto a1 = new Texto(5);

    a1.n_caracter_prin('H');
    System.out.println(a1.cadena);

    a1.n_caracter_fin('o');
    System.out.println(a1.cadena);

    a1.n_caracter_prin('Y');
    System.out.println(a1.cadena);

    a1.n_cadena_prin("Ju");
    System.out.println(a1.cadena);

    a1.n_caracter_prin('M');
    System.out.println(a1.cadena);

    System.out.println("El número de vocales es: " + a1.cont_vocales());
  }
}
