/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.io.Serializable;

/**
 *
 * @author Mondongo
 */
public class Mecanico extends Persona implements Serializable {

    //Atributos
    private String contraseña;

    //Constructor
    public Mecanico(String nombre, String contraseña, String id) {

        super(id, nombre);
        this.contraseña = contraseña;

    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
