/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosApp;

import java.io.Serializable;

/**
 *
 * @author Mondongo
 */
public class Vehiculo implements Serializable {
    
    private String placa;
    private String marca;
    private String color;
    private String tipoVehiculo;

    public Vehiculo(String placa, String marca, String color, String tipoVehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", color=" + color + ", tipoVehiculo=" + tipoVehiculo + '}';
    }

    
    
    
}