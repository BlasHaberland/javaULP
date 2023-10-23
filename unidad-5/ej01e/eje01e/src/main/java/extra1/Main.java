package extra1;

public class Main {
  public static void main(String[] args) {
    Pila pila5 = new Pila(5);


    pila5.agregar("1");
    System.out.println(pila5.verTope());
    pila5.agregar("2");
    System.out.println(pila5.verTope());
    pila5.agregar("3");
    System.out.println(pila5.verTope());
    pila5.agregar("4");
    pila5.agregar("5");
    System.out.println(pila5.verTope());
    pila5.agregar("6"); // NO SE AGREGA
    System.out.println(pila5.verTope());
    pila5.quitar();
    pila5.agregar("7"); // NO SE AGREGA
    System.out.println(pila5.verTope());
    pila5.quitar();
    pila5.quitar();

    pila5.mostarElementos();
  }
}