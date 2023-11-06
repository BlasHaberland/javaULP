package ejercicio03;

import java.util.*;

public class Directorio {
    HashMap<Integer,Cliente> directory;

    public Directorio() {
        this.directory = new HashMap<>();
    }

    public void addClient(int phoneNumber, Cliente client){
        this.directory.put(phoneNumber,client);
    }

    public void showDirectory() {
        for (Map.Entry<Integer, Cliente> entry : directory.entrySet()
        ) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Cliente searchClient(int phoneNumber){
        return this.directory.get(phoneNumber);
    }

    /**
     * Itera directory buscando clientes por apellido,
     * y retorna una ArrayList con los números de teléfono
     * de dichos clientes.
     *
     * @param  lastName el apellido a buscar
     * @return          ArrayList con números de teléfono
     */
    public ArrayList<Integer> searchPhone(String lastName){
        ArrayList<Integer> list = new ArrayList<>();

        for (HashMap.Entry<Integer, Cliente> entry : directory.entrySet()
             ) {
            if (entry.getValue().getLastName().equals(lastName)){
                list.add(entry.getKey());
            }
        }

        return list;
    }

    //entrySet() tod0
    //keySet() solo llaves
    //value() solo valores

    public ArrayList<Cliente> searchByCity(String city){
        ArrayList<Cliente> list = new ArrayList<>();

        for (Cliente client : directory.values()){
            if (client.getCity().equals(city)){
                list.add(client);
            }
        }

        return list;
    }

    public void removeClient(int phoneNumber){
         directory.remove(phoneNumber);
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "directory=" + directory +
                '}';
    }

}



/*
Direcotrio {
    123 : {
    nombre : "blas"
    documento : 42313213141
    ciudad : "city"
    }

    453 : {
    nombre : "fede"
    documento : 12312313141
    }
}
*/