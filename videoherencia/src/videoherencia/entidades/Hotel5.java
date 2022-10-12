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
public final class Hotel5 extends Hotel4 {
    protected boolean casino = true;
    protected boolean restaurante = true;

    public Hotel5(double precio, double superficie, Integer cantidadhabitaciones) {
        super(precio, superficie, cantidadhabitaciones);
    }
    
    
}
