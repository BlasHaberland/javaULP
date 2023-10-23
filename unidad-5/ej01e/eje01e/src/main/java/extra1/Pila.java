package extra1;

public class Pila {
  private int tope = -1;
  private String[] elementos;

  public Pila(int largo) {
    this.elementos = new String[largo];
  }

  public void agregar(String elemento){
    if (!this.pilaLlena()){
      this.tope += 1;
      elementos[this.tope] = elemento;
    }
  }

  public String verTope(){
    return elementos[this.tope];
  }

  public String quitar(){
    String aux = elementos[this.tope];
    elementos[this.tope] = null;
    tope -= 1;

    return aux;
  }

  public boolean pilaVacia(){
    return this.tope != -1;
  }

  public boolean pilaLlena(){
    return this.tope == this.elementos.length - 1;
  }

  public void mostarElementos(){
    System.out.print("{");
   for (int i = 0; i< this.elementos.length; i++){
     if (elementos[i] != null && i < this.tope) {
       System.out.print(elementos[i] + ",");
     } else if(elementos[i] != null){
       System.out.print(elementos[i]);
     }
   }
    System.out.print("}");
  }
}


