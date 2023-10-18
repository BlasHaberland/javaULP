package ejercicio02;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] enteros = new int[n];

        for (int i = 0; i < n; i++) {
            enteros[i] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(enteros[n - 1 - i]);
        }
    }
}