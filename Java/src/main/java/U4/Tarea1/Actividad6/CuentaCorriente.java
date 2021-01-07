package U4.Tarea1.Actividad6;

public class CuentaCorriente {
  // public static String banco = "BBVA";

  private long saldo;
  private long limite;
  public String nombre;
  String DNI;
  Banco banco; // Banco de la cuenta corriente.

  // Con este método podemos incluir un Banco.
  public CuentaCorriente(String nombre, String DNI, Banco banco) {
    // this.banco = banco;
    setBanco(banco);
    setSaldo(0);
    setLimite(-50);
    setNombre(nombre);
    setDNI(DNI);
  }

  // Modificar Banco de una Cuenta Corriente.
  public void modificar_Banco(Banco banco) {
    setBanco(banco);
    // this.banco = banco;
  }

  public CuentaCorriente(String nombre, String DNI) {
    setSaldo(0);
    setLimite(-50);
    setNombre(nombre);
    setDNI(DNI);
  }

  public CuentaCorriente(long saldo) {
    setSaldo(saldo);
    setLimite(0);
  }

  public CuentaCorriente(long saldo, long limite, String DNI) {
    setSaldo(saldo);
    setLimite(limite);
    setDNI(DNI);
  }

  public Banco getBanco() {
    return banco;
  }

  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    if (saldo < 1000) {
      this.saldo = saldo;
    }
  }

  public long getLimite() {
    return limite;
  }

  public void setLimite(long limite) {
    this.limite = limite;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
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

  public void mostrar_informacion() {

    if (banco == null) {
      System.out.println("La Cuenta Corriente no tiene un Banco vinculado.");
    } else {
      banco.Info_Banco();
    }

    System.out.println(
        "El saldo de la cuenta es: "
            + saldo
            + ", el límite es: "
            + limite
            + ", el nombre del titular es: "
            + nombre
            + " y su DNI es: "
            + DNI);
  }
}
