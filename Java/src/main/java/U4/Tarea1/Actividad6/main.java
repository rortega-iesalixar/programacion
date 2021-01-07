package U4.Tarea1.Actividad6;

public class main {
  public static void main(String[] args) {

    // Creo Diferentes Bancos
    Banco b1 = new Banco("BBVA", "C/Naranjo");
    Banco b2 = new Banco("Caixa", 5400, "C/Central");

    // Muestro la info del banco b1.
    b1.Info_Banco();

    // Creo diferentes Cuentas Corrientes
    CuentaCorriente c1 = new CuentaCorriente("Rafa", "111111T", b1);
    CuentaCorriente c2 = new CuentaCorriente("Juan", "2222222C", b2);
    CuentaCorriente c3 = new CuentaCorriente("Miguel", "3333333Y");

    // Mostramos información.
    c2.mostrar_informacion();

    // Cambiar Banco y mostramos información.
    c2.modificar_Banco(b1);
    c2.mostrar_informacion();
    c2.modificar_Banco(null);
    c2.mostrar_informacion();
  }
}
