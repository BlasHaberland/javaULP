package ejercicio06;

public class Clothing extends Product{
  private ClothType cloth;

  public Clothing(int code, String description, String brand, double price, int stock, ClothType cloth) {
    super(code, description, brand, price, stock);
    this.cloth = cloth;
  }

  @Override
  public void getPublicPrice() {
     super.setPrice(super.getPrice() * 1.4);
  }

  public ClothType getCloth() {
    return cloth;
  }

  public void setCloth(ClothType cloth) {
    this.cloth = cloth;
  }

  @Override
  public String toString() {
    return "Clothing{" +
        "cloth=" + cloth +
        "} " + super.toString();
  }
}
