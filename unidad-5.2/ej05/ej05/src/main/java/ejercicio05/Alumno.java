package ejercicio05;

public class Alumno {
    private int file;
    private String name;
    private String lastname;
    private int year;

    public Alumno(int file, String name, String lastname, int year) {
        this.file = file;
        this.name = name;
        this.lastname = lastname;
        this.year = year;
    }

    public Alumno() {
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "file=" + file +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;

        return file == alumno.file;
    }

    @Override
    public int hashCode() {
        return file;
    }
}
