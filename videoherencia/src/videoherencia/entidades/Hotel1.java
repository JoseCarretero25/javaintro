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
public class Hotel1 extends Hotel {
    protected double precio;
    protected double superficie;
    protected boolean banio = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;


    public Hotel1(double precio, double superficie, Integer cantidadhabitaciones) {
        super(cantidadhabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }
    
    
}
