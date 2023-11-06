package ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        numero = scanner.nextLine();
        System.out.println( Division.getDivisio(8,numero));
    }

}