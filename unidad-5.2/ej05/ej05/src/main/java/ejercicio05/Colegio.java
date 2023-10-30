package ejercicio05;

import java.util.*;

public class Colegio {
    private String name;
    private HashSet<Alumno> list;

    public Colegio(String name) {
        this.name = name;
        list = new HashSet<>();
    }

    public void addStudent(Alumno student){
        list.add(student);
    }

    public void removeStudent(int file){
        /*Iterator<Alumno> iterator = list.iterator();
        while (iterator.hasNext()) {                      //EMPIEZA EN -1
            if (iterator.next().getFile() == file) {
                iterator.remove();
            }
        }*/
        list.removeIf(alumno -> alumno.getFile() == file);
    }

    public void showList(){
        list.forEach(alumno -> System.out.println(alumno));
    }

    public void showStudentByLastname(){
        ArrayList<Alumno> listClone = new ArrayList<>(list);
        
        Comparator comparator = new Comparator<Alumno>() {
            @Override
            public int compare(Alumno alumno1, Alumno alumno2) {
                return alumno1.getLastname().compareTo(alumno2.getLastname());
            }
        };
        
        Collections.sort(listClone, comparator);

        for (Alumno alumno:listClone
             ) {
            System.out.println(alumno);
        }
        
    }
    public void showStudentByChar(){
        Scanner scanner = new Scanner(System.in);
        String character;
        System.out.println("Ingrese la inicial del apellido a buscar: ");
        character = scanner.nextLine();
        character= character.toLowerCase();
        for (Alumno alumno:list
             ) {
            if (alumno.getLastname().toLowerCase().startsWith(character)){
                System.out.println(alumno);
            }
        }
    }
    @Override
    public String toString() {
        return "Colegio{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
