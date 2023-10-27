package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Pelicula rocky = new Pelicula("Rocky", "Blas", 190);
        Pelicula elSenorDeLosAnillos = new Pelicula("El señor de los anillos: ", "Pedro Juan", 240);
        Pelicula elSenorDeLosAnillos2 = new Pelicula("El señor de los anillos: LAS DOS TORRES",  "Pedro ouan", 300);
        Pelicula elSenorDeLosAnillos3 = new Pelicula("El señor de los anillos: LAS DOS TORRES",  "Pedro ouan", 300);

        Cine cineRoma = new Cine("ROMA","RIVADAVIA 230");

        cineRoma.agregarPelicula(rocky);
        cineRoma.agregarPelicula(elSenorDeLosAnillos);
        cineRoma.agregarPelicula(elSenorDeLosAnillos2);
        cineRoma.agregarPelicula(elSenorDeLosAnillos3);

        System.out.println("TODO");
        cineRoma.listarTodo();
        System.out.println("");

        System.out.println("DURACION");
        cineRoma.listarMenorDuracionAMayor();
        System.out.println("");

        System.out.println("TITULO");
        cineRoma.listarPordenadasPorTituloAZ();
        System.out.println("");

        System.out.println("DIRECTOR");
        cineRoma.listarPordenadasPorDirectorAZ();
        System.out.println("");



    }
}