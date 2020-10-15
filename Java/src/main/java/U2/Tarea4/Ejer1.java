package U2.Tarea4;

public class Ejer1 {
  public static void main(String[] args) {
    // El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Realiza un
    // programa que muestre si el rango de valores de un tipo se comporta de forma cíclica. Es
    // decir, que muestre el valor máximo de una variable de tipo short, y muestre también qué
    // ocurre si sumamos 1 a esa variable.

    short num = 32767;
    System.out.println("El máximo de la variable short es: " + num);

    System.out.println("Vamos a sumarle 1 a " + num);
    num += 1;
    System.out.println("El resultado es: " + num);
  }
}
