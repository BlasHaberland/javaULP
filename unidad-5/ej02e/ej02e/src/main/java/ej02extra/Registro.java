package ej02extra;

public class Registro {
    private final String year;
    private final Dato[][] calendarioMilimetrosLluvia;

    public Registro(String year) {
        this.year = year;
        calendarioMilimetrosLluvia = new Dato[12][3];
    }

    public void agregarDato(Dato dato, Mes mes, Localidad localidad) {
        int fila = this.obtenerMes(mes);
        int columna = this.obtenerLocalidad(localidad);

        calendarioMilimetrosLluvia[fila][columna] = dato;

    }

    private int obtenerMes(Mes mes) {
        switch (mes) {
            case ENERO -> {
                return 0;
            }
            case FEBRERO -> {
                return 1;
            }
            case MARZO -> {
                return 2;
            }
            case ABRIL -> {
                return 3;
            }
            case MAYO -> {
                return 4;
            }
            case JUNIO -> {
                return 5;
            }
            case JULIO -> {
                return 6;
            }
            case AGOSTO -> {
                return 7;
            }
            case SEPTIMEBRE -> {
                return 8;
            }
            case OCTUBRE -> {
                return 9;
            }
            case NOVIEMBRE -> {
                return 10;
            }
            default -> {
                return 11;
            }
        }
    }

    private int obtenerLocalidad(Localidad localidad) {
        switch (localidad) {
            case SAN_LUIS -> {
                return 0;
            }
            case MERLO -> {
                return 1;
            }
            default -> {
                return 2;
            }
        }
    }

    public void mostrarCaleandario() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < calendarioMilimetrosLluvia[0].length; j++) {
                if (calendarioMilimetrosLluvia[i][j] != null) {
                    System.out.println(calendarioMilimetrosLluvia[i][j].toString());
                } else {
                    System.out.println("No hay datos");
                }
            }
        }
    }

    public Dato obtenerPromedioMayorTotal() {
        Dato mayor = calendarioMilimetrosLluvia[0][0];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < calendarioMilimetrosLluvia[0].length; j++) {
                if (calendarioMilimetrosLluvia[i][j] != null) {
                    if (calendarioMilimetrosLluvia[i][j].getMilimetros() > mayor.getMilimetros()) {
                        mayor = calendarioMilimetrosLluvia[i][j];
                    }
                }
            }
        }
        return mayor;
    }

    public Dato obtenerPromedioMayorLocalidad(Localidad localidad) {

        int numLocalidad = obtenerLocalidad(localidad);
        System.out.println("localidad" + numLocalidad);
        Dato mayor = calendarioMilimetrosLluvia[0][numLocalidad];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < calendarioMilimetrosLluvia[0].length; j++) {
                if (calendarioMilimetrosLluvia[i][j] != null && j == numLocalidad) {
                    if (calendarioMilimetrosLluvia[i][j].getMilimetros() > mayor.getMilimetros()) {
                        mayor = calendarioMilimetrosLluvia[i][j];
                    }
                }
            }
        }
        return mayor;
    }


}
