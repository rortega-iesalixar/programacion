package U3.Tarea3_2;

import java.util.Scanner;

public class Ejer1 {
  public static void main(String[] args) {
    // Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios
    // comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y
    // preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a
    // mostrar el array escribiendo el número destacado entre dobles asteriscos.
    //
    // Ejemplo:
    //
    // 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298
    // 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21251 6 383 47 78 392 394
    // 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225426 267 330 243 209 426 435 309 356
    // 173 130 416 15 477 34 28 377 193 481 368 466262 422 275 384 399 397 87 218 84 312 480 207 68
    // 108
    //
    // ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
    //
    // 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298
    // 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21251 **6** 383 47 78 392
    // 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402225 426 267 330 243 209 426 435 309
    // 356 173 130 416 15 477 34 28 377 193 481 368466 262 422 275 384 399 397 87 218 84 312 480 207
    // 68 10

    Scanner sc = new Scanner(System.in);
    int[] array_aleatorio = new int[100];
    int num_min_max, num_aleat_max = 500, num_aleat_min = 0, numi_temp = 0;

    for (int i = 0; i < array_aleatorio.length; i++) {
      array_aleatorio[i] = (int) (Math.random() * 501);
      System.out.print(array_aleatorio[i] + " ");
    }
    // System.out.println(Arrays.toString(array_aleatorio));

    System.out.println("");
    System.out.println("");
    System.out.println("¿Qué quieres destacar? [1 (mínimo) - 2 (máximo)]:");
    num_min_max = sc.nextInt();

    System.out.println("");
    if (num_min_max == 1) {
      // Buscamos el número más pequeño entre los 100 creados.
      for (int i = 0; i < array_aleatorio.length; i++) {
        if (array_aleatorio[i] < num_aleat_max) {
          num_aleat_max = array_aleatorio[i];
          numi_temp = i;
        }
      }
      for (int i = 0; i < array_aleatorio.length; i++) {
        if (i == numi_temp) {
          System.out.print("**" + array_aleatorio[i] + "** ");
        } else {
          System.out.print(array_aleatorio[i] + " ");
        }
      }

    } else {
      // Buscamos el número más alto entre los 100 creados.
      for (int i = 0; i < array_aleatorio.length; i++) {
        if (array_aleatorio[i] > num_aleat_min) {
          num_aleat_min = array_aleatorio[i];
          numi_temp = i;
        }
      }
      for (int i = 0; i < array_aleatorio.length; i++) {
        if (i == numi_temp) {
          System.out.print("**" + array_aleatorio[i] + "** ");
        } else {
          System.out.print(array_aleatorio[i] + " ");
        }
      }
    }
  }
}
