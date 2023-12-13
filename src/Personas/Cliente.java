/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import ObjetosApp.Vehiculo;
import Trabajo.Oficios;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mondongo
 */
public class Cliente extends Persona implements Serializable {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Oficios> oficios = new ArrayList<>();

    public Cliente(String id, String nombre, Vehiculo vehiculo) {
        super(id, nombre);
        this.vehiculos.add(vehiculo);

    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Oficios> getOficios() {
        return oficios;
    }

    public void setOficios(ArrayList<Oficios> oficios) {
        this.oficios = oficios;
    }

  

}
