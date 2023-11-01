package ejercicioEx02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FamousSinger {
    private String name;
    private String mostSellingAlbum;

    public FamousSinger(String name, String mostSellingAlbum) {
        this.name = name.toLowerCase();
        this.mostSellingAlbum = mostSellingAlbum.toLowerCase();
    }

    /**
     * Este metodo recibe por parametro una lista de tipo FamousSinger, un nombre de tipo "String" y un almbum mas vendido
     * de tipo "String". se instancia un objeto de tipo FamousSinger con los parametros ingresados y lo agreaga a la lista.
     * @param list lista de tipo FamousSinger.
     * @param name nombre del cantante sin discriminar entre mayusculas y minuscula.
     * @param MSA (Most Selling Almbum) nombre del almbum mas vendido.
     */
    public static void addSinger(List<FamousSinger> list,String name, String MSA){
        FamousSinger singer = new FamousSinger(name.toLowerCase(),MSA.toLowerCase());
        list.add(singer);
    }

    /**
     * Este metodo elimina a un cantante buscando el nombre en la lista pasada por parametro.
     * @param list lista de tipo FamousSinger
     * @param name nombre del cantante sin discriminar entre mayusculas y minuscula
     */
    public static void deleteSinger(List<FamousSinger> list, String name){
        int aux = 0;
        name = name.toLowerCase();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getName().equals(name)){
                System.out.println("entro");
                list.remove(i);
                aux ++;
            }
        }
        if (aux > 0){
            System.out.println("Se elimino al cantante: " + name);
        }else System.out.println("No se encontro al cantante: " + name);
    }

/*--------------------------------------------------------------------------------------------------------------------*/
    @Override
    public String toString() {
        return "Cantante[" +
                "Nombre='" + name + '\'' +
                ", Album mas vendido='" + mostSellingAlbum + '\'' +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMostSellingAlbum() {
        return mostSellingAlbum;
    }

    public void setMostSellingAlbum(String mostSellingAlbum) {
        this.mostSellingAlbum = mostSellingAlbum;
    }
}
