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
public class Hotel4E extends Hotel implements Precio {
    protected Gimnasio gimnasio;
    protected String nombreRestaurant;
    protected Integer cRestaurant;
    
    public Hotel4E() {
    }

    public Hotel4E(Gimnasio gimnasio, String nombreRestaurant, Integer cRestaurant) {
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.cRestaurant = cRestaurant;
    }

  

    public Hotel4E(Gimnasio gimnasio, String nombreRestaurant, Integer cRestaurant, Integer cHabitaciones, Integer cCamas, Integer cPisos, Integer PrecioHabitacion, String nombre, String direccion, String localidad, String nombregerente) {
        super(cHabitaciones, cCamas, cPisos, PrecioHabitacion, nombre, direccion, localidad, nombregerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.cRestaurant = cRestaurant;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getcRestaurant() {
        return cRestaurant;
    }

    public void setcRestaurant(Integer cRestaurant) {
        this.cRestaurant = cRestaurant;
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
        return "Hotel4E{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente+ "cHabitaciones=" + cHabitaciones + ", cCamas=" + cCamas + ", cPisos=" + cPisos + ", PrecioHabitacion=" + PrecioHabitacion + "gimnasio=" + gimnasio + ", nombreRestaurant=" + nombreRestaurant + ", cRestaurant=" + cRestaurant + '}';
    }
    
@Override
    public Integer precioalojamiento() {
         Integer valor = 0;
         Integer agregadoResta = 0;
         Integer agregadoGim=0;
         if(this.getcRestaurant() < 30) {
             agregadoResta = 10;   
         } else if (this.getcRestaurant() >= 30 || this.getcRestaurant() < 50) {
             agregadoResta = 30;
         } else if (this.getcRestaurant() >= 50) {
             agregadoResta = 50;
         }
         if(this.getGimnasio().equals(Gimnasio.A)) {
             agregadoGim = 50;
         } else {
             agregadoGim=30;
         }
        valor = this.getcCamas() * this.getcHabitaciones() * this.getcPisos() + agregadoResta + agregadoGim;
        System.out.println("El precio del alojamiento " + this.getNombre() + " es de : " + valor);
         return valor;
    }
   
    
    
    
}
