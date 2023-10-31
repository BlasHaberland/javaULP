package ejercicio06;

public class Main {
  public static void main(String[] args) {

    Catalog catalog = new Catalog();
    Clothing product1 = new Clothing(1,"pantalón","levis",42,10,ClothType.COTTON);
    HomeAppliance product2 = new HomeAppliance(2,"heladera","lg",5000,20, 100);
    Perfumery product3 = new Perfumery(3,"perfume caro","avon",13,5, 205);

    Clothing product4 = new Clothing(4,"remera","levis",35,12,ClothType.POLYESTER);
    HomeAppliance product5 = new HomeAppliance(5,"licuadora","philips",1120,7, 76);
    Perfumery product6 = new Perfumery(6,"perfume carísimo","kevin",1300,4, 310);
    Perfumery product7 = new Perfumery(6,"perfume carísimo","kevin",1300,4, 310);

    catalog.addProduct(product1);
    catalog.addProduct(product2);
    catalog.addProduct(product3);
    catalog.addProduct(product4);
    catalog.addProduct(product5);
    catalog.addProduct(product6);
    catalog.addProduct(product7);

    System.out.println(product6.equals(product7));

    catalog.getProducts();
    catalog.getProductsByCategory("clothing");
    catalog.getProductsByCategory("homeAppliance");
    catalog.getProductsByCategory("perfumery");
  }
}