package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cine {
    private final String nombre;
    private final String direccion;
    private final ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones = new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula){
        proyecciones.add(pelicula);
    }
    public void listarTodo(){
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }
    public void listarDuranMas(int horas){
        int minutos = horas * 60;

        for (Pelicula pelicula : proyecciones){
            if (pelicula.getDuracion() > minutos) System.out.println(pelicula);
        }
    }

    public void listarMenorDuracionAMayorDuracion(){
        //Collections.sort(proyecciones, (p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));
        Collections.sort(proyecciones, new Comparator<>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p1.getDuracion(), p2.getDuracion());
            }
        });
        listarTodo();

    }

    public void listarMayorDuracionAMenorDuracion(){
        proyecciones.sort(new Comparator<>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
        listarTodo();

    }

    public void listarOrdenadasPorTituloAZ(){
        proyecciones.sort(new Comparator<>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        listarTodo();

    }
    public void listarPorDirector(){
        ArrayList<Pelicula> copiaProyecciones = new ArrayList<>(proyecciones);
        copiaProyecciones.sort(new Comparator<>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        listarTodo();
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", proyecciones=" + proyecciones +
                '}';
    }
}
