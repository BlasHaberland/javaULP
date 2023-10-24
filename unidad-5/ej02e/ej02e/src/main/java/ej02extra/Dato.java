package ej02extra;

public class Dato {
    private String nombre;
    private String apellido;
    private int milimetros;

    public Dato(String nombre, String apellido, int milimetros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.milimetros = milimetros;
    }

    @Override
    public String toString() {
        return "Dato{" + "nombre='" + nombre +
                ", apellido='" + apellido +
                ", milimetros=" + milimetros +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMilimetros() {
        return milimetros;
    }

    public void setMilimetros(int milimetros) {
        this.milimetros = milimetros;
    }
}
