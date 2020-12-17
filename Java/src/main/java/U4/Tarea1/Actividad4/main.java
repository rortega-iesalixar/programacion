package U4.Tarea1.Actividad4;

// Actividad 4: Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
// Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
// Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas
// corrientes)

public class main {
  public static void main(String[] args) {

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
