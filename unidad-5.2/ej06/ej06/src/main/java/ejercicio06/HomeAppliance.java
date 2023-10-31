package ejercicio06;

public class HomeAppliance extends Product {
  private int consume;

  public HomeAppliance(int code, String description, String brand, double price, int stock, int consume) {
    super(code, description, brand, price, stock);
    this.consume = consume;
  }

  @Override
  public void getPublicPrice() {
    super.setPrice(super.getPrice() * 1.25);
  }

  public int getConsume() {
    return consume;
  }

  public void setConsume(int consume) {
    this.consume = consume;
  }

  @Override
  public String toString() {
    return "HomeAppliance{" +
        "consume=" + consume +
        "} " + super.toString();
  }
}
