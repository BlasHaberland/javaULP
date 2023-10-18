package ej03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] vector = new int[n];
        // ArrayList vector2 = new ArrayList<Integer>();
        int contador = 0;
        int indice = -1;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.ceil(Math.random() * 10);
        }

        System.out.println("Ingrese el numero a buscar");
        int numeroBuscado = leer.nextInt();

        // MOSTRAR VECTOR
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            if (numeroBuscado == vector[i]) {
                contador++;
                indice = i;
            }
        }

        if (contador > 0) {
            System.out.println("El numero buscado se encontró en el vector " + contador + " veces.");
            System.out.println("La ultima posicion donde se encontró fue: " + indice + 1);
        } else {
            System.out.println("No se encontró el numero buscado :c.");
        }
        leer.close();
    }
}