package ejercicio06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog {
  private Map<String, ArrayList<Product>> myCatalog;

  public Catalog() {
    this.myCatalog = new HashMap<>();
    this.createCategory("clothing");
    this.createCategory("homeAppliance");
    this.createCategory("perfumery");
  }

  public void addProduct(Product product) {
    if (product instanceof Clothing) {
      this.myCatalog.get("clothing").add(product);
    } else if (product instanceof HomeAppliance) {
      this.myCatalog.get("homeAppliance").add(product);
    } else if (product instanceof Perfumery && !this.myCatalog.get("perfumery").contains(product)){
      this.myCatalog.get("perfumery").add(product);
    } else {
      System.out.println("Producto no valido");
    }
  }


  public void getProducts() {

    for (Map.Entry<String, ArrayList<Product>> entrada: this.myCatalog.entrySet()
         ) {
      System.out.println("Categoría: " + entrada.getKey());
      System.out.println("Cantidad de productos: " + entrada.getValue().size());
    }
  }

  /**
   * Esta función hace tal cosa...
   * @param category Nombre de la categoría a buscar
   * */
  public void getProductsByCategory(String category){
    for (Product product: this.myCatalog.get(category)
    ) {
      System.out.println(product);
    }
  }

  private void createCategory(String category){
    this.myCatalog.put(category, new ArrayList<>());
  }
}

/*
myCatalog {
  "clothing" : [clothing1, clothing2, clothing3],
  "perfumery" : [clothing1, clothing2, clothing3],
}
*/





