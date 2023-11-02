package ejercicio03extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Library {
  private String name;
  private HashSet<Book> list;

  public Library(String name, HashSet<Book> list) {
    this.name = name;
    this.list = list;
  }

  public Library() {
  }

  public boolean addLoan (String title) {
    for (Book book: list
         ) {
      if (book.getTitle().equals(title) && book.getStock() > 0){
          book.setLoan(book.getLoan() + 1);
          book.setStock(book.getStock() - 1);

          return true;
      }
    }

    return false;
  }

  public boolean removeLoan (String title) {
    for (Book book: list
    ) {
      if (book.getTitle().equals(title)){
        book.setLoan(book.getLoan() - 1);
        book.setStock(book.getStock() + 1);

        return true;
      }
    }

    return false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashSet<Book> getList() {
    return list;
  }

  public void setList(HashSet<Book> list) {
    this.list = list;
  }

  public ArrayList<Book> sort (){
    ArrayList<Book> clone = new ArrayList<>(list);

    Comparator<Book> comparator = new Comparator<Book>() {
      @Override
      public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
      }
    };

    clone.sort(comparator);

    return clone;
  }

  @Override
  public String toString() {
    return "Library{" +
        "name='" + name + '\'' +
        ", list=" + list +
        '}';
  }
}
