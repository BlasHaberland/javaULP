package ejercicio06;

public abstract class Product {
  private int code;
  private String description;
  private String brand;
  private double price;
  private int stock;

  public Product(int code, String description, String brand, double price, int stock) {
    this.code = code;
    this.description = description;
    this.brand = brand;
    this.price = price;
    this.stock = stock;
  }

  public abstract void getPublicPrice();

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;

    return code == product.code;
  }

  @Override
  public int hashCode() {
    return code;
  }

  @Override
  public String toString() {
    return "Product{" +
        "code=" + code +
        ", description='" + description + '\'' +
        ", brand='" + brand + '\'' +
        ", price=" + price +
        ", stock=" + stock +
        '}';
  }
}


