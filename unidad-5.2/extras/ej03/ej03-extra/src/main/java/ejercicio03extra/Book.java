package ejercicio03extra;

import java.util.Objects;

public class Book {
  private String title;
  private String author;
  private int stock;
  private int loan;

  public Book(String title, String author, int stock, int loan) {
    this.title = title;
    this.author = author;
    this.stock = stock;
    this. loan = loan;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public int getLoan() {
    return loan;
  }

  public void setLoan(int loan) {
    this.loan = loan;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    return Objects.equals(title, book.title);
  }

  @Override
  public int hashCode() {
    return title != null ? title.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", stock=" + stock +
        ", loan=" + loan +
        '}';
  }
}
