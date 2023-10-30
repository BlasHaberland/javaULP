package ejercicio04;

import java.time.LocalDate;

public class Movimiento {
    private LocalDate date;
    private char type;
    private double importe;
    private double balance;

    public Movimiento(LocalDate date, char type, double importe, double balance) {
        this.date = date;
        this.type = type;
        this.importe = importe;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "date=" + date +
                ", type=" + type +
                ", importe=" + importe +
                ", balance=" + balance +
                '}';
    }
}
