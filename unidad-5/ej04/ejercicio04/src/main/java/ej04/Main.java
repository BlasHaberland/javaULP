package ej04;

public class Main {
    public static void main(String[] args) {
        int fila = 4;
        int columna = 4;
        int[][] matriz = new int[fila][columna];

        llenarMatrizAleatorio(matriz, fila, columna);

        System.out.println("Matriz normal");
        mostrarMatriz(matriz, fila, columna);
        System.out.println("Matriz transpuesta");
        mostrarMatrizTranspuesta(matriz, fila, columna);

    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatrizTranspuesta(int[][] matriz, int n, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i] + " ");
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
}
