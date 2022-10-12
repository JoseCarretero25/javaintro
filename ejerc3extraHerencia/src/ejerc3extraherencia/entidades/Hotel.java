/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia.entidades;

import ejerc3extraherencia.enumeraciones.Gimnasio;
import ejerc3extraherencia.interfases.Precio;

/**
 *
 * @author macbookair
 */
public class Hotel extends Alojamientos implements Precio{
    protected Integer cHabitaciones;
    protected Integer cCamas;
    protected Integer cPisos;
    protected Integer PrecioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cHabitaciones, Integer cCamas, Integer cPisos, Integer PrecioHabitacion) {
        this.cHabitaciones = cHabitaciones;
        this.cCamas = cCamas;
        this.cPisos = cPisos;
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public Hotel(Integer cHabitaciones, Integer cCamas, Integer cPisos, Integer PrecioHabitacion, String nombre, String direccion, String localidad, String nombregerente) {
        super(nombre, direccion, localidad, nombregerente);
        this.cHabitaciones = cHabitaciones;
        this.cCamas = cCamas;
        this.cPisos = cPisos;
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public Integer getcHabitaciones() {
        return cHabitaciones;
    }

    public void setcHabitaciones(Integer cHabitaciones) {
        this.cHabitaciones = cHabitaciones;
    }

    public Integer getcCamas() {
        return cCamas;
    }

    public void setcCamas(Integer cCamas) {
        this.cCamas = cCamas;
    }

    public Integer getcPisos() {
        return cPisos;
    }

    public void setcPisos(Integer cPisos) {
        this.cPisos = cPisos;
    }

    public Integer getPrecioHabitacion() {
        return PrecioHabitacion;
    }

    public void setPrecioHabitacion(Integer PrecioHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
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
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente+ "cHabitaciones=" + cHabitaciones + ", cCamas=" + cCamas + ", cPisos=" + cPisos + ", PrecioHabitacion=" + PrecioHabitacion + '}';
    }

    @Override
    public Integer precioalojamiento() {
         Integer valor = this.getcCamas() * this.getcHabitaciones() * this.getcPisos();
         System.out.println("El precio del alojamiento " + this.getNombre() + " es de : " + valor);
         return valor;
    }

    
    
    
}
