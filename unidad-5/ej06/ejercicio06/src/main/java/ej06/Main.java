package ej06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;

        int[][] matriz = new int[n][n];

        llenarMatrizManualmente(matriz, n, n);
        mostrarMatriz(matriz, n, n);
        //System.out.println(matrizEsMagica(matriz, n));

        if(matrizEsMagica(matriz, n)){
            System.out.println("La matriz es mágica.");
        }else{
            System.out.println("La matriz no es mágica.");
        }

    }

    public static boolean matrizEsMagica(int[][] matriz, int n) {
        int numeroMagico = 0;

        // Calcular numero mágico a partir de la primera fila
        for (int i = 0; i < n; i++) {
            numeroMagico = numeroMagico + matriz[0][i];
        }

        // Calcular las filas restantes
        for (int i = 1; i < n; i++) {
            int aux = 0;
            for (int j = 0; j < n; j++) {
                aux = aux + matriz[i][j];
            }
            if (aux != numeroMagico) {
                return false;
            }
        }

        // Calcular las columnas
        for (int i = 1; i < n; i++) {
            int aux = 0;
            for (int j = 0; j < n; j++) {
                aux = aux + matriz[j][i];
            }
            if (aux != numeroMagico) {
                return false;
            }
        }

        // Calculo de la diagonal principal
        int auxiliar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    auxiliar = auxiliar + matriz[i][j];
                }
            }
        }

        if (auxiliar != numeroMagico) {
            return false;
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

    public static void llenarMatrizManualmente(int[][] matriz, int n, int m) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese un numero");
                matriz[i][j] = leer.nextInt();
            }
        }
        leer.close();
    }

}
