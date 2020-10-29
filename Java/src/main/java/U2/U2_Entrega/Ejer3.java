package U2.U2_Entrega;

import java.util.Scanner;

public class Ejer3 {
  public static void main(String[] args) {
    // Escribe un programa que sea capaz de insertar un dígito dentro de un número
    // indicando la posición. El nuevo dígito se colocará en la posición indicada y el
    // resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
    // izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
    // correctamente los datos. Se recomienda usar long en lugar de int ya que el
    // primero admite números más largos.
    //
    // Ejemplo:
    // Por favor, introduzca un número entero positivo: 406783
    // Introduzca la posición donde quiere insertar: 3
    // Introduzca el dígito que quiere insertar: 5
    // El número resultante es 4056783.

    long num;
    int posicion, digito;
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo:");
    num = sc.nextLong();
    String numSt = Long.toString(num);

    System.out.println("Introduzca la posición donde quiere insertar:");
    posicion = sc.nextInt();

    System.out.println("Introduzca el dígito que quiere insertar:");
    digito = sc.nextInt();
    String digitoSt = Integer.toString(digito);

    System.out.println(
        "El número resultante es: "
            + numSt.substring(0, posicion)
            + digitoSt
            + numSt.substring(posicion, numSt.length()));
  }
}
