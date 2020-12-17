package U4.Tarea1.Actividad3;

// Actividad 3: Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde
// clases externas, y la visibilidad de sus atributos para que:
//
// -saldo y limite no sean visibles para otras clases
//
// -nombre sea oúblico para cualquier clase
//
// -dni solo sea visible por clases vecinas
//
// (Comprueba la visibilidad desde el programa principal comentando cada acceso o intento de acceso)

public class main {
  public static void main(String[] args) {
    //
    CuentaCorriente c1 = new CuentaCorriente("Rafael Ortega", "10203040Y");
    CuentaCorriente c2 = new CuentaCorriente(1000);
    CuentaCorriente c3 = new CuentaCorriente(120, -100, "12454454F");

    c1.ingresar(519);

    if (c1.sacar(60)) {
      System.out.println("Has podido sacar dinero.");
    } else {
      System.out.println("No has podido sacar dinero.");
    }

    c1.mostrar_informacion();
    c2.mostrar_informacion();
    c3.mostrar_informacion();

    System.out.println(c3.getSaldo());
  }
}
