package ejercicio03extra;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Book> list = new HashSet<>();

    list.add(new Book("Harry Potter", "J.K. Rowling", 10,  0));
    list.add(new Book("Harry Potter 2", "J.K. Rowling", 20,  0));
    list.add(new Book("Harry Potter 3", "J.K. Rowling", 30,  0));
    list.add(new Book("LOTR", "J.R.R. Tolkien", 40,  0));
    list.add(new Book("LOTR", "J.R.R. Tolkien", 40,  0));

    Library library = new Library("Librería", list);

    System.out.println(library);

    library.addLoan("LOTR");

    System.out.println(library);

    library.removeLoan("LOTR");

    System.out.println(library);

    ArrayList<Book> sorted =  library.sort();

    System.out.println(sorted);
  }
}