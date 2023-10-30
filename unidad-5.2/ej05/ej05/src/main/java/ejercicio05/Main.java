package ejercicio05;

import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        Colegio colegio = new Colegio("Colegio");
        Alumno alumno1 = new Alumno(1,"Blas","Verri",1999);
        Alumno alumno2 = new Alumno(2,"Fede","Gonza",10);
        Alumno alumno3 = new Alumno(3,"Fede","Zabala",10);
        Alumno alumno4 = new Alumno(4,"Fede","Garcia",10);
        Alumno alumno5 = new Alumno(5,"Fede","Perez",10);

        colegio.addStudent(alumno1);
        colegio.addStudent(alumno2);
        colegio.addStudent(alumno3);
        colegio.addStudent(alumno4);
        colegio.addStudent(alumno5);

        //colegio.showList();

        //colegio.removeStudent(3);
        /*System.out.println("Desordenada");
        colegio.showList();*/
        System.out.println("Ordenado");
        colegio.showStudentByLastname();
        colegio.showStudentByChar();
    }
}