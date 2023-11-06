package ejercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String cualquiercosa = null;

        try{
            cualquiercosa.toLowerCase();
        }catch (NullPointerException e){
            System.out.println("Se produjo un error: " + e.getMessage());
        }finally {
            System.out.println("terminado");
        }
    }
}