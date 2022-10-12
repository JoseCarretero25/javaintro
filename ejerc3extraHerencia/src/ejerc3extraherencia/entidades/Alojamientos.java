/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia.entidades;

import ejerc3extraherencia.interfases.Precio;

/**
 *
 * @author macbookair
 */
public class Alojamientos implements Precio{
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String nombregerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String nombregerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nombregerente = nombregerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombregerente() {
        return nombregerente;
    }

    public void setNombregerente(String nombregerente) {
        this.nombregerente = nombregerente;
    }

    @Override
    public String toString() {
        return "Alojamientos{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente + '}';
    }

    @Override
    public Integer precioalojamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
