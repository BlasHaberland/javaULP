package ejercicio03;

public class Division {
    public static int getDivisio(int num1,String num2){

        try {
            int numero2;
            numero2 = Integer.parseInt(num2);
            return num1 / numero2;
        }catch (NumberFormatException e){
            System.out.println("Exception" + e.getMessage());
            throw e;
        }
    }
}
