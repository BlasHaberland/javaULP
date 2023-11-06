package ejercicio02;

public class Main {
    public static void main(String[] args) {
       int[] qsyo = new int[4];
       try {
            qsyo[10] = 5;
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
           System.out.println(e.fillInStackTrace());
       }

    }
}