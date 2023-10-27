package ejercicio03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Directorio myDirectory = new Directorio();
       Cliente client1 = new Cliente(42,"Blas","Verri","b134,San luis","San Luis");
       Cliente client2 = new Cliente(10,"Fede","Gonza","Pringles 78,Santa rosa","Santa Rosa");
       Cliente client3 = new Cliente(10,"Fede","Gonza","Pringles 78,Santa rosa","Santa Rosa");

       myDirectory.addClient(123,client1);
       myDirectory.addClient(153,client2);
       myDirectory.addClient(154,client3);

        myDirectory.showDirectory();
        myDirectory.removeClient(153);
        myDirectory.showDirectory();

        //System.out.println(myDirectory);
        // System.out.println(myDirectory.searchClient(23));

        //ArrayList<Integer> busquedaNumeroGonzas = myDirectory.searchPhone("Gonza");

        //System.out.println(myDirectory.searchPhone("Gonza"));
        //System.out.println(myDirectory.searchByCity("Santa Rosa"));
    }
}