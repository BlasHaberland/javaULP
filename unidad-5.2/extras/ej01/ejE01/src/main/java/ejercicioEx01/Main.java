package ejercicioEx01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int total = 0;

        System.out.println("Carga de lista. La carga finaliza al ingresar '-99'");
        do {
            System.out.println("Ingrese un número a cargar");
            number = scanner.nextInt();
            if (number != -99) {
                list.add(number);
            }
        }while (number != -99);

        //list.forEach(numero -> System.out.println(numero));
        System.out.println("Cantidad de valores ingresados:");
        System.out.println(list.size());

        System.out.println("Suma de los numeros ingresados:");
        for (int i = 0; i < list.size() ; i++) {
            total = total + list.get(i);
        }
        System.out.println(total);

        System.out.println("Promedio de los numeros ingresados");
        System.out.println(total / list.size());

    }
    
}