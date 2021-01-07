package U4.Tarea1.Actividad6;

// Actividad 6: Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección
// central. Los bancos tienen las siguientes restricciones:
// a) Siempre tienen que tener un nombre, que no puede ser modificado
// b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros
// al crearse.
// c) El capital y la dirección de un banco son modificables.
//
// Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
// Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que
// pertenece (cambiar de banco, mostrar la info de la cuenta, incluídos los datos del banco si lo
// tiene vinculado). Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún
// banco.

public class Banco {
  private final String nombre;
  private double capital;
  private String direccion_central;

  public Banco(String nombre, double capital, String direccion_central) {
    this.nombre = nombre;
    this.capital = capital;
    this.direccion_central = direccion_central;
  }

  public Banco(String nombre, String direccion_central) {
    this.nombre = nombre;
    this.capital = 5.2;
    this.direccion_central = direccion_central;
  }

  public void Info_Banco() {
    System.out.println("Banco: " + nombre);
    System.out.println("Capital: " + capital);
    System.out.println("Dirección Central: " + direccion_central);
  }
}
