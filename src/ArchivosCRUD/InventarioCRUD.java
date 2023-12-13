/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosCRUD;

import ObjetosApp.Inventario;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Mondongo
 */
public class InventarioCRUD {
    
     private static final String URL = "inventario.dat";

    /**
     * Crea un nuevo inventario y lo agrega al archivo.
     *
     * @param inventario El objeto Inventario que se va a agregar al archivo.
     */
    public static void Create(Inventario inventario) {
        ArrayList<Inventario> inventarios = Read();
        inventarios.add(inventario);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            for (Inventario inv : inventarios) {
                oos.writeObject(inv);
            }
            System.out.println("Material agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar al inventario: " + e.getMessage());
        }
    }

    /**
     * Lee todos los inventarios almacenados en el archivo.
     *
     * @return Una lista de objetos Inventario que representan a los inventarios almacenados.
     */
    public static ArrayList<Inventario> Read() {
        ArrayList<Inventario> inventarios = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(URL))) {
            while (true) {
                try {
                    Inventario inventario = (Inventario) ois.readObject();
                    inventarios.add(inventario);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer inventarios: " + e.getMessage());
        }
        return inventarios;
    }

    /**
     * Actualiza la información de un Material existente en el archivo.
     *
     * @param inventarioActualizado El objeto Inventario con la información actualizada.
     */
    public static void Update(Inventario inventarioActualizado) {
        ArrayList<Inventario> inventarios = Read();
        boolean encontrado = false;

        for (int i = 0; i < inventarios.size(); i++) {
            if (inventarios.get(i).getId() == inventarioActualizado.getId()) {
                inventarios.set(i, inventarioActualizado);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("Material no encontrado. No se realizó la actualización.");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            for (Inventario inventario : inventarios) {
                oos.writeObject(inventario);
            }
            System.out.println("Inventario actualizado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al actualizar el inventario: " + e.getMessage());
        }
    }

    /**
     * Elimina un inventario del archivo.
     *
     * @param id El ID del inventario que se eliminará.
     */
    public static void Delete(int id) {
        ArrayList<Inventario> inventarios = Read();
        boolean encontrado = false;

        for (Inventario inventario : inventarios) {
            if (inventario.getId() == id) {
                //Eliminar el Inventario
                encontrado = true;
                inventarios.remove(inventario);
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("Material no encontrado. No se realizó la eliminación.");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            for (Inventario inventario : inventarios) {
                oos.writeObject(inventario);
            }
            System.out.println("Material eliminado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al eliminar el material: " + e.getMessage());
        }
    }
    
}
