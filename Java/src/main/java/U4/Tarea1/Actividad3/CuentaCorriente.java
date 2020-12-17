package U4.Tarea1.Actividad3;

public class CuentaCorriente {
  private long saldo;
  private long limite;
  public String nombre;
  String DNI;

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

  void mostrar_informacion() {
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
