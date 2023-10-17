package ej01;

public class Arreglo {
  public static void sumarLista(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
      suma += lista[i];
    }
    System.out.println("La suma es: " + suma);
    System.out.println("El promedio es: " + suma / lista.length);
  }

  public static int buscarMayor(int[][] lista) {
    int mayor = lista[0][0];

    for (int i = 0; i < lista.length; i++) {
      for (int j = 0; j < lista[i].length; j++) {
        if (lista[i][j] > mayor) {
          mayor = lista[i][j];
        }
      }
    }

    return mayor;
  }

  public static int cuentaVocales(String palabra) {
    /*
     * String normal = palabra.toLowerCase();
     * int contador = 0;
     * 
     * for (int i = 0; i < normal.length(); i++) {
     * if (normal.charAt(i) == 'a' || normal.charAt(i) == 'e' || normal.charAt(i) ==
     * 'i' || normal.charAt(i) == 'o'
     * || normal.charAt(i) == 'u') {
     * contador++;
     * }
     * 
     * }
     * 
     * return contador;
     */
    int contador = 0;
    // "hola, como estás"
    String[] arreglo = palabra.toLowerCase().split("");

    for (String letra : arreglo) {
      if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")
          || letra.equals("u")) {
        contador++;
      }
    }

    return contador;
  }
}
