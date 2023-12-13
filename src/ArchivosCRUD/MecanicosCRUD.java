package ArchivosCRUD;

import Personas.Mecanico;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Mondongo
 */

public class MecanicosCRUD {

    private static final String URL = "Mecanicos.dat";

    /**
     * Crea un nuevo mecánico y lo agrega al archivo.
     * @param mecanico El objeto Mecanico que se va a agregar al archivo.
     */
    public static void Create(Mecanico mecanico) {
        ArrayList<Mecanico> mecanicos = Read();
        mecanicos.add(mecanico);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            for (Mecanico m : mecanicos) {
                oos.writeObject(m);
            }
            System.out.println("Mecánico agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar el mecánico: " + e.getMessage());
        }
    }

    /**
     * Lee todos los mecánicos almacenados en el archivo.
     * @return Una lista de objetos Mecanico que representan a los mecánicos almacenados.
     */
    public static ArrayList<Mecanico> Read() {
        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(URL))) {
            while (true) {
                try {
                    Mecanico mecanico = (Mecanico) ois.readObject();
                    mecanicos.add(mecanico);
                } catch (EOFException e) {
                    break; 
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer mecánicos: " + e.getMessage());
        }
        return mecanicos;
    }

    /**
     * Actualiza la información de un mecánico existente en el archivo.
     * @param mecanicoActualizado El objeto Mecanico con la información actualizada.
     */
    public static void Update(Mecanico mecanicoActualizado) {
        ArrayList<Mecanico> mecanicos = Read();
        boolean encontrado = false;

        for (int i = 0; i < mecanicos.size(); i++) {
            if (mecanicos.get(i).getId().equals(mecanicoActualizado.getId())) {
                mecanicos.set(i, mecanicoActualizado);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Mecánico no encontrado. No se realizó la actualización.");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL))) {
            for (Mecanico mecanico : mecanicos) {
                oos.writeObject(mecanico);
            }
            System.out.println("Mecánico actualizado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al actualizar el mecánico: " + e.getMessage());
        }
    }

    /**
     * Elimina un mecánico del archivo.
     * @param id El ID del mecánico que se eliminará.
     */
    public static void Delete(String id) {
        ArrayList<Mecanico> mecanicos = Read();
        boolean encontrado = false;

        for (Mecanico mecanico : mecanicos) {
            if (mecanico.getId().equals(id)) {
                //Marcar el Mecanico como inactivo
                mecanico.setEstado(false);
                encontrado = true;
                Update(mecanico);
                break;
            }
        }

         if (!encontrado) {
            System.out.println("Mecanico no encontrado. No se realizó la actualización de estado.");
            return;
        }

        System.out.println("Estado del mecanico actualizado correctamente.");
    }
}