package U4.Tarea1.Actividad1;

public class CuentaCorriente {
  private long saldo;
  private long limite;
  private String nombre;
  private String DNI;

  void crear_cuenta(String nombre_titular, String DNI) {
    this.nombre = nombre_titular;
    this.DNI = DNI;
    this.saldo = 0;
    this.limite = -50;
  }

  boolean sacar(int cantidad) {
    boolean resultado = false;
    if (this.saldo - cantidad >= this.limite) {
      this.saldo -= cantidad;
      resultado = true;
    }
    return resultado;
  }

  void ingresar(int cantidad) {
    if (cantidad > 0) {
      this.saldo += cantidad;
    }
  }

  void mostrar_informacion() {
    System.out.println(
        "El saldo de la cuenta es "
            + saldo
            + ", el límite es "
            + limite
            + ", el nombre del titular es "
            + nombre
            + " y su DNI es "
            + DNI);
  }
}
