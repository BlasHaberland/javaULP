package ejercicio04;

/*Desde el método main de una clase Test, se pide:
        - Crear el cliente Juan Lucero de la localidad de Merlo, nacido el 25/07/1978
        - Crear una cuenta nro 1234 para el cliente creado en el punto anterior.
        - Depositar en la cuenta 60.000 (sesenta mil) pesos.
        - Extraer de la cuenta 10.000 (diez mil) pesos.
        - Mostrar por consola el saldo de dicha cuenta.
        - Mostrar usando el método de cuenta todos los movimientos.*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Blas","Verri","San Luis", LocalDate.of(1999,8,10));
        Cuenta cuenta = new Cuenta(1234,cliente);
        cuenta.deposit(60000);
        cuenta.extract(10000);

        System.out.println("Balance: ");
        System.out.println(  cuenta.showBalance());
        System.out.println("Movimientos: ");
        cuenta.showMovements();

    }
}