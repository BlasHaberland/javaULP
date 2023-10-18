package ej05;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] matriz = new int[n][m];
        int[][] matrizTranspuesta = new int[m][n];

        llenarMatrizAleatorio(matriz, n, m);
        calcularMatrizTranspuesta(matriz, matrizTranspuesta, n, m);

        mostrarMatriz(matriz, n, m);
        System.out.println(" ");
        mostrarMatriz(matrizTranspuesta, m, n);

    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void llenarMatrizAleatorio(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) Math.ceil(Math.random() * 5);
            }
        }
    }

    public static void calcularMatrizTranspuesta(int[][] matriz, int[][] matrizTranspuesta, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
    }

    // 1 2 3
    // 4 5 6
    // 7 8 9

    // 1
    // 2
    // 3
}