package ej07;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int[][] tablero = new int[n][n];
        int[][] matriz = new int[m][m];

        int[] fila0 = { 1, 26, 36, 47, 5, 6, 72, 81, 95, 10 };
        int[] fila1 = { 11, 12, 13, 21, 41, 22, 67, 20, 10, 61, };
        int[] fila2 = { 56, 78, 87, 90, 9, 90, 17, 12, 87, 67 };
        int[] fila3 = { 41, 87, 24, 56, 97, 74, 87, 42, 64, 35 };
        int[] fila4 = { 32, 76, 79, 1, 36, 5, 67, 96, 12, 11 };
        int[] fila5 = { 99, 13, 54, 88, 89, 90, 75, 12, 41, 76 };
        int[] fila6 = { 67, 78, 87, 45, 14, 22, 26, 42, 56, 78 };
        int[] fila7 = { 1, 26, 36, 47, 5, 6, 72, 81, 95, 10 };
        int[] fila8 = { 1, 26, 36, 47, 5, 6, 72, 81, 95, 10 };
        int[] fila9 = { 1, 26, 36, 47, 5, 6, 72, 81, 95, 10 };

        tablero[0] = fila0;
        tablero[1] = fila1;
        tablero[2] = fila2;
        tablero[3] = fila3;
        tablero[4] = fila4;
        tablero[5] = fila5;
        tablero[6] = fila6;
        tablero[7] = fila7;
        tablero[8] = fila8;
        tablero[9] = fila9;

        int[] otraFila0 = { 41, 22, 67 };
        int[] otraFila1 = { 9, 90, 17 };
        int[] otraFila2 = { 97, 74, 87 };

        matriz[0] = otraFila0;
        matriz[1] = otraFila1;
        matriz[2] = otraFila2;

        System.out.println("Se encontró la matriz dentro del tablero?: " + fede(tablero, matriz));
    }

    public static boolean fede(int[][] tablero, int[][] matriz) {
        int primerValor = matriz[0][0];

        for (int i = 0; i < tablero.length - 2; i++) {
            for (int j = 0; j < tablero.length - 2; j++) {
                if (tablero[i][j] == primerValor) {
                    int[][] matrizExtraida = extraerMatriz(tablero, i, j);
                    if (comprobarMatriz(matrizExtraida, matriz)) {
                        return true;
                    }
                }
            }

        }

        return false;
    }

    public static int[][] extraerMatriz(int[][] tablero, int x, int y) {

        int[][] matriz = new int[3][3];

        int auxA = 0;
        int auxB = 0;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                matriz[auxA][auxB] = tablero[i][j];
                auxB++;
            }
            auxB = 0;
            auxA++;
        }

        return matriz;
    }

    public static boolean comprobarMatriz(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}