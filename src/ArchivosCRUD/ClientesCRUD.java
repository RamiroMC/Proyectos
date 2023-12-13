/*
 * Clase para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en un archivo binario de clientes.
 */
package ArchivosCRUD;

import java.io.*;
import Personas.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Mondongo
 */

/**
 * Clase que proporciona métodos para realizar operaciones CRUD en un archivo binario de clientes llamado "Clientes.dat".
 * Se encarga de la gestión de clientes, permitiendo agregar, leer, actualizar y eliminar información de clientes.
 */
public class ClientesCRUD {

    //Ruta del archivo donde se almacenarán los clientes.
    private static final String URL = "Clientes.dat";

    /**
     * Crea un nuevo cliente y lo agrega al archivo.
     * @param cliente El objeto Cliente que se va a agregar al archivo.
     */
    public static void Create(Cliente cliente) {
        //Leer la lista actual de clientes del archivo.
        ArrayList<Cliente> clientes = Read();
        //Agregar el nuevo cliente a la lista.
        clientes.add(cliente);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            //Escribir la lista actualizada de clientes en el archivo.
            for (Cliente c : clientes) {
                oos.writeObject(c);
            }
            System.out.println("Cliente agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }

    /**
     * Lee todos los clientes almacenados en el archivo.
     * @return Una lista de objetos Cliente que representan a los clientes almacenados.
     */
    public static ArrayList<Cliente> Read() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(URL))) {
            //Leer continuamente del archivo hasta que se alcance el final del archivo (EOF).
            while (true) {
                try {
                    //Intentar leer un objeto Cliente del archivo y agregarlo a la lista.
                    Cliente cliente = (Cliente) ois.readObject();
                    clientes.add(cliente);
                } catch (EOFException e) {
                    //Se alcanzó el final del archivo.
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer clientes: " + e.getMessage());
        }
        return clientes;
    }

    /**
     * Actualiza la información de un cliente existente en el archivo.
     * @param clienteActualizado El objeto Cliente con la información actualizada.
     */
    public static void Update(Cliente clienteActualizado) {
        //Leer la lista actual de clientes del archivo.
        ArrayList<Cliente> clientes = Read();
        boolean encontrado = false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(clienteActualizado.getId())) {
                //Reemplazar el cliente existente con el cliente actualizado.
                clientes.set(i, clienteActualizado);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("Cliente no encontrado. No se realizó la actualización.");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            //Escribir la lista actualizada de clientes en el archivo.
            for (Cliente cliente : clientes) {
                oos.writeObject(cliente);
            }
            System.out.println("Cliente actualizado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al actualizar el cliente: " + e.getMessage());
        }
    }

    /**
     * Actualiza el estado de un cliente a inactivo en el archivo.
     * @param id El ID del cliente que se marcará como inactivo.
     */
    public static void Delete(String id) {
        //Leer la lista actual de clientes del archivo.
        ArrayList<Cliente> clientes = Read();
        boolean encontrado = false;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                //Marcar el cliente como inactivo.
                cliente.setEstado(false);
                encontrado = true;
                Update(cliente);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado. No se realizó la actualización de estado.");
            return;
        }

        System.out.println("Estado del cliente actualizado correctamente.");
    }
}
