package U4.Tarea1.Actividad1y2;
// Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un
// objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar
// de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas con una
// cuenta corriente son:
//
// -Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de
// descubierto será de -50 euros.
//
// -Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar,
// por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además,
// deberá devolver un valor booleano que indique lo mismo.
//
// -Ingresar dinero: se incrementa el saldo.
//
// -Mostrar información: muestra la información de la cuenta corriente.
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
