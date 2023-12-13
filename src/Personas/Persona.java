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
public abstract class Persona implements Serializable {

    private String id;
    private String nombre;
    private boolean estado;

    public Persona() {
        this.id = "";
        this.nombre = "";
        this.estado = true;
    }
    
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
