package ejercicio01;

public class Main {
    public static void main(String[] args) {
        Pelicula rocky = new Pelicula("Rocky", "Blas", 90);
        Pelicula elSenorDeLosAnillos = new Pelicula("El señor de los anillos: ", "Pedro Juan", 240);
        Pelicula elSenorDeLosAnillos2 = new Pelicula("El señor de los anillos: LAS DOS TORRES",  "Pedro ouan", 300);

        Cine cineRoma = new Cine("ROMA","RIVADAVIA 230");

        cineRoma.agregarPelicula(rocky);
        cineRoma.agregarPelicula(elSenorDeLosAnillos2);
        cineRoma.agregarPelicula(elSenorDeLosAnillos);

        cineRoma.listarTodo();
        cineRoma.listarDuranMas(3);
        cineRoma.listarMenorDuracionAMayorDuracion();
        cineRoma.listarMayorDuracionAMenorDuracion();
        cineRoma.listarOrdenadasPorTituloAZ();
        cineRoma.listarPorDirector();
        cineRoma.listarTodo();


    }
}