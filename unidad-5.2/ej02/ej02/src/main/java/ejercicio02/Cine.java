package ejercicio02;

import javax.management.loading.PrivateMLet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Cine {
    private final String nombre;
    private final String direccion;
    private final HashSet<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones = new HashSet<>();
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
        int minutos =horas * 60;
        proyecciones.forEach(pelicula -> {
            if (pelicula.getDuracion() > minutos){
                System.out.println(pelicula);
            }
        });
    }

    public void listarMenorDuracionAMayor(){
        ArrayList<Pelicula> copiaCine = new ArrayList<>(proyecciones);
        Comparator<Pelicula> comparador = new Comparator<>() {
            @Override
            public int compare(Pelicula peli1, Pelicula peli2) {
                return Integer.compare(peli1.getDuracion(), peli2.getDuracion());
            }
        };
        Collections.sort(copiaCine, comparador);
        copiaCine.forEach(pelicula -> System.out.println(pelicula));
    }

    public void listarPordenadasPorTituloAZ(){
        ArrayList<Pelicula> copiaCine = new ArrayList<>(proyecciones);
        Comparator<Pelicula> comparador = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula peli1, Pelicula peli2) {
              return peli1.getTitulo().compareTo(peli2.getTitulo());
            }
        };
        Collections.sort(copiaCine, comparador);
        copiaCine.forEach(pelicula -> System.out.println(pelicula));
    }

    public void listarPordenadasPorDirectorAZ(){
        ArrayList<Pelicula> copiaCine = new ArrayList<>(proyecciones);
        Comparator<Pelicula> comparador = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula peli1, Pelicula peli2) {
              return peli1.getDirector().compareTo(peli2.getDirector());
            }
        };
        Collections.sort(copiaCine, comparador);
        copiaCine.forEach(pelicula -> System.out.println(pelicula));
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
