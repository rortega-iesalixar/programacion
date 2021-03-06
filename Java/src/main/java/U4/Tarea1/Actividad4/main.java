package U4.Tarea1.Actividad4;

// Actividad 4: Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
// Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
// Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas
// corrientes)

public class main {
  public static void main(String[] args) {

    CuentaCorriente c1 = new CuentaCorriente("Rafael Ortega", "10203040Y");

    c1.mostrar_informacion();

    System.out.println("Y su banco es: " + CuentaCorriente.banco);

    CuentaCorriente.cambiar_banco("Unicaja");
    System.out.println("Pero su nuevo banco es: " + CuentaCorriente.banco);
  }
}
