package ejercicio04;

import java.time.LocalDate;

public class Cliente {
    private String name;
    private String lastName;
    private String address;
    private LocalDate date;

    public Cliente(String name, String lastName, String address, LocalDate date) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
