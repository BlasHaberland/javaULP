package ejercicio04;

import java.time.LocalDate;
import java.util.LinkedList;

public class Cuenta {
    private long number;
    private double balance;
    private double interesAnual;
    private Cliente holder;
    private LinkedList<Movimiento> movements;

    public Cuenta(long number, Cliente holder) {
        this.number = number;
        this.holder = holder;
        movements = new LinkedList<>();
    }

    public void deposit(double cant){
        Movimiento movimiento = new Movimiento(LocalDate.now(),'D',cant,balance + cant);
        movements.add(movimiento);
        balance = balance + cant;
        interesAnual = 0;
    }
    public void extract(double cant){

        if (balance >= cant) {
            Movimiento movimiento = new Movimiento(LocalDate.now(), 'E', cant, balance - cant);
            movements.add(movimiento);
            balance = balance - cant;
        }else {
            System.out.println("El balance es insuficiente para poder extraer la cantidad de dinero");
        }
    }

    public void changeInterest(double cant){
        interesAnual = cant; //PONER IF SI ES POSITVO
    }

    public Cliente showClient(){
        return holder;
    }

    public double showBalance(){
        return balance;
    }

    public void showMovements(){
        for (Movimiento movimiento:movements
             ) {
            System.out.println(movimiento);
        }
    }








}
