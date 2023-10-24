package ej02extra;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro("2023");
        Dato dato00 = new Dato("Blas", "Haberland", 24);
        Dato dato10 = new Dato("Blas", "Haberland", 22);
        Dato dato20 = new Dato("Blas", "Haberland", 26);
        Dato dato11 = new Dato("Fede", "Louser", 4);
        Dato dato22 = new Dato("Fabian", "Italia", 49);

        registro.agregarDato(dato00, Mes.ENERO, Localidad.SAN_LUIS);
        registro.agregarDato(dato10, Mes.FEBRERO, Localidad.SAN_LUIS);
        registro.agregarDato(dato20, Mes.MARZO, Localidad.SAN_LUIS);
        registro.agregarDato(dato11, Mes.FEBRERO, Localidad.MERLO);
        registro.agregarDato(dato22, Mes.MARZO, Localidad.VILLA_MERCEDES);

        //registro.mostrarCaleandario();

        //System.out.println(registro.obtenerPromedioMayorTotal());
        System.out.println(registro.obtenerPromedioMayorLocalidad(Localidad.SAN_LUIS));

    }
}