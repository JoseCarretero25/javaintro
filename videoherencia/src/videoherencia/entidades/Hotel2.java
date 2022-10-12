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
public class Hotel2 extends Hotel1 {
  protected boolean cajadeseguridad = true;

    public Hotel2(double precio, double superficie, Integer cantidadhabitaciones) {
        super(precio, superficie, cantidadhabitaciones);
    }
  
}
