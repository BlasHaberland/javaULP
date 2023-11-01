package ejercicioEx02;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        ArrayList<FamousSinger> list = new ArrayList<>();

        FamousSinger singer1 = new FamousSinger("Kurt Cobain","Nevermind");
        FamousSinger singer2 = new FamousSinger("Phill Collins","No Jacket Required");
        FamousSinger singer3 = new FamousSinger("Michael Jackson","Thriller");
        FamousSinger singer4 = new FamousSinger("Gustavo Cerati","Ahi Vamos");
        FamousSinger singer5 = new FamousSinger("Frank Sinatra","Watertown ");

        list.add(singer1);
        list.add(singer2);
        list.add(singer3);
        list.add(singer4);
        list.add(singer5);

        System.out.println("Lista de cantantes original:");
        list.forEach(singer -> System.out.println(singer));

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("MENÚ");
            System.out.println("1- INGRESAR UN NUEVO CANTANTE");
            System.out.println("2- MOSTRAR CANTANTES");
            System.out.println("3- ELIMINAR CANTANTE");
            System.out.println("4- SALIR");

            option = scanner.nextInt();

            if (option == 1){
                String name;
                String mostSellingAlbum;
                System.out.print("Nombre: ");
                name = scanner.nextLine().trim();
                name = scanner.nextLine().trim();
                System.out.print("Album mas vendido: ");
                mostSellingAlbum = scanner.nextLine().trim();
                FamousSinger.addSinger(list,name,mostSellingAlbum);
            }else if (option == 2){
                System.out.println("LISTA DE CANTANTES ACTUAL");
                list.forEach(singer -> System.out.println(singer));
                System.out.println("");
                continue;
            } else if (option == 3) {
                String name;
                System.out.print("Ingrese el nombre del cantante que desea borrar de la lista: ");
                name = scanner.nextLine().trim();
                name = scanner.nextLine().trim();
                FamousSinger.deleteSinger(list,name);
            }else if (option == 4){
                break;
            }else System.out.println("Opción no valida.");
        }while (option >= 1 && option <= 4);

        scanner.close();

        System.out.println("Lista de cantantes con los cambios realizados:");
        list.forEach(singer -> System.out.println(singer));




    }
}