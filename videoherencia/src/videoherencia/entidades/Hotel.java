/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoherencia.entidades;

/**
 *
 * @author macbookair
 */
public class Hotel {
    protected Integer cantidadhabitaciones;

    public Hotel() {
    }

    public Hotel(Integer cantidadhabitaciones) {
        this.cantidadhabitaciones = cantidadhabitaciones;
    }

    public Integer getCantidadhabitaciones() {
        return cantidadhabitaciones;
    }

    public void setCantidadhabitaciones(Integer cantidadhabitaciones) {
        this.cantidadhabitaciones = cantidadhabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadhabitaciones=" + cantidadhabitaciones + '}';
    }
    
}
