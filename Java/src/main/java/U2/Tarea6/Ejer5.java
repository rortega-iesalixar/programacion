package U2.Tarea6;

import java.util.Scanner;

public class Ejer5 {
  public static void main(String[] args) {
    // Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y
    // a continuación muestre un pequeño menú con 3 opciones:
    //
    // 1.Calcular diámetro
    //
    // 2.Calcular perímetro
    //
    // 3.Calcular área
    //
    // Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
    // (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

    double radio;
    int opcion;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el radio de una circunferencia:");
    radio = teclado.nextDouble();

    System.out.println("Elija una opción:");
    System.out.println("1. Calcular diámetro.");
    System.out.println("2. Calcular perímetro.");
    System.out.println("3. Calcular área.");
    opcion = teclado.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Diámetro = " + (2 * radio));
        break;
      case 2:
        System.out.println("Perímetro = " + (2 * +Math.PI * radio));
        break;
      case 3:
        System.out.println("Área = " + (+Math.PI * radio * radio));
        break;
      default:
        System.out.println("No has introducido una opción correcta.");
        break;
    }
  }
}
