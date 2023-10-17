package ej01;

public class Main {
    public static void main(String[] args) {
        Arreglo.sumarLista(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

        int[][] matriz = new int[2][];
        matriz[0] = new int[] { 1, 2 };
        matriz[1] = new int[] { 3, 4, 5, 6 };
        System.out.println(Arreglo.buscarMayor(matriz));
        System.out.println(Arreglo.cuentaVocales("algo"));
    }
}
