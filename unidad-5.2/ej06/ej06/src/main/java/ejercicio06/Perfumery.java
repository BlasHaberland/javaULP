package ejercicio06;

public class Perfumery extends Product{
  private int size;

  public Perfumery(int code, String description, String brand, double price, int stock, int size) {
    super(code, description, brand, price, stock);
    this.size = size;
  }

  @Override
  public void getPublicPrice() {
    super.setPrice(super.getPrice() + ((int)(this.size / 100) * super.getPrice()* 0.2));
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }



  @Override
  public String toString() {
    return "Perfumery{" +
        "size=" + size +
        "} " + super.toString();
  }
}
