package U5.Tarea2.Actividad2;

import java.util.Objects;

public class Cliente implements Comparable {
  // Atributos.
  private String dni;
  private String nombre;
  private int edad;
  private long saldo;

  // Constructor.
  public Cliente(String dni, String nombre, int edad, long saldo) {
    setDni(dni);
    setNombre(nombre);
    setEdad(edad);
    setSaldo(saldo);
  }

  // Método ToString.
  @Override
  public String toString() {
    return "Cliente{"
        + "dni='"
        + dni
        + '\''
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", saldo="
        + saldo
        + '}';
  }

  // Método Equals() basado en el atributo DNI.
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Cliente)) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(dni, cliente.dni);
  }

  @Override
  public int compareTo(Object o) {
    int resultado;
    Cliente otro_c = (Cliente) o;

    return (getDni().compareTo(otro_c.getDni()));
  }

  // Get and Set.
  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    this.saldo = saldo;
  }
}
