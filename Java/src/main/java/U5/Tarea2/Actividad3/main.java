package U5.Tarea2.Actividad3;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    // Principal.
    PoligonoRegular[] FigurasGeometricas = new PoligonoRegular[5];
    FigurasGeometricas[0] = new Cuadrado(4, ColorPoligoRegular.AMARILLO);
    FigurasGeometricas[1] = new Cuadrado(7, ColorPoligoRegular.ROJO);
    FigurasGeometricas[2] = new Triangulo(12, 7, ColorPoligoRegular.VERDE);
    FigurasGeometricas[3] = new Triangulo(3, 6, ColorPoligoRegular.AZUL);
    FigurasGeometricas[4] = new Triangulo();

    System.out.println(Arrays.toString(FigurasGeometricas));
    System.out.println();

    System.out.println(
        "Se han creado: " + PoligonoRegular.contadorPoligonos + " figuras geométricas.");
    System.out.println();

    // Prueba de Triángulos.
    Triangulo[] cajaTriangulos = new Triangulo[4];
    cajaTriangulos[0] = new Triangulo();
    cajaTriangulos[1] = new Triangulo(2, 5, ColorPoligoRegular.VERDE);
    cajaTriangulos[2] = new Triangulo(7, 12, ColorPoligoRegular.AMARILLO);
    cajaTriangulos[3] = new Triangulo(8, 14, ColorPoligoRegular.AZUL);

    Arrays.sort(cajaTriangulos);
    System.out.println(Arrays.toString(cajaTriangulos));
    System.out.println();

    Arrays.sort(cajaTriangulos, new ComparadorTrianguloColor());
    System.out.println(Arrays.toString(cajaTriangulos));
  }
}
