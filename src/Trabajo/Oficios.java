/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import java.time.LocalDate;

/**
 *
 * @author Mondongo
 */
public class Oficios extends Trabajo {

    private String tipoTrabajo; //MECANICA O LATONERIA O REVISION
    private boolean pagado;

    //Constructor
    public Oficios(String idTrabajo, String tipoTrabajo, LocalDate fechaInicio, int plazoMaximo, String idCliente, String mecanico,
            String detalles) {

        super(idTrabajo, fechaInicio, plazoMaximo, idCliente, mecanico, detalles);

        this.tipoTrabajo = tipoTrabajo;
        pagado = false;
    }

    //Implementación del método abstracto cotizarPrecio para Oficios
    @Override
    public double cotizarPrecio() {
        
        double precioFinal = 0;

        if (tipoTrabajo.equals("REPARACION MECANICA")) {

            precioFinal = this.getDiasTrabajo() * 12000 + this.getPrecioMaterial() * 1.1;

        } else if (tipoTrabajo.equals("REPARACION LATONERIA")) {

            precioFinal = this.getDiasTrabajo() * 12000 + this.getPrecioMaterial() * 1.3;

        } else if (tipoTrabajo.equals("REVISION")) {

            precioFinal = this.getDiasTrabajo() * 12000;

        }

        return precioFinal;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Trabajo{"
                + "idTrabajo = " + this.getIdTrabajo()
                + ", diasTrabajo = " + this.getDiasTrabajo()
                + ", precioMaterial = " + this.getPrecioMaterial()
                + ", estadoTrabajo = " + this.getEstadoTrabajo()
                + ", tipoTrabajo = '" + this.getTipoTrabajo() + '\''
                + ", fechaInicio= " + this.getFechaInicio()
                + ", fechaFinal = " + this.getFechaFinal()
                + ", plazoMaximo = " + this.getPlazoMaximo()
                + ", detalles = '" + this.getDetalles() + '\''
                + ", cliente = " + this.getIdCliente()
                + ", mecanico = " + this.getIdMecanico()
                + ", Pagado = " + this.getPagado()
                + '}';

    }

}
