/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase que representa un trabajo realizado por un mecánico para un cliente.
 * Contiene información como id, horas trabajadas, precio del material, etc.
 *
 * @author Mondongo
 */
public abstract class Trabajo implements Serializable {

    private String idTrabajo; //LEER EN ARCHIVO

    private int diasTrabajo; //Se llama días, pero lo trabajamos en horas (1 dia = 1 hora). 

    private double precioMaterial;

    private boolean estadoTrabajo;

    private LocalDate fechaInicio;

    private LocalDate fechaFinal; 

    private int plazoMaximo;

    private String idCliente;

    private String idMecanico;

    private String detalles;

    //Constructor
    public Trabajo(String idTrabajo, LocalDate fechaInicio, int plazoMaximo, String idCliente, String mecanico, String detalles) {

        this.idTrabajo = idTrabajo;

        this.diasTrabajo = 0;
        this.precioMaterial = 0;
        this.estadoTrabajo = true;

        this.fechaInicio = fechaInicio;

        this.plazoMaximo = plazoMaximo;

        this.idCliente = idCliente;

        this.idMecanico = mecanico;

        this.detalles = detalles;

    }

    @Override
    public String toString() {
        return null;
    }

    public String getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public boolean isEstadoTrabajo() {
        return estadoTrabajo;
    }

    public boolean getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(boolean estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(String idMecanico) {
        this.idMecanico = idMecanico;
    }

    public abstract double cotizarPrecio();

}
