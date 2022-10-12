/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia.entidades;

/**
 *
 * @author macbookair
 */
public class Residencias extends ExtraHotel{
    protected Integer cHabitaciones;
    protected boolean descuentos;
    protected boolean cdeportivo;

    public Residencias() {
    }

    public Residencias(Integer cHabitaciones, boolean descuentos, boolean cdeportivo) {
        this.cHabitaciones = cHabitaciones;
        this.descuentos = descuentos;
        this.cdeportivo = cdeportivo;
    }

    public Residencias(Integer cHabitaciones, boolean descuentos, boolean cdeportivo, boolean privado, double metros2) {
        super(privado, metros2);
        this.cHabitaciones = cHabitaciones;
        this.descuentos = descuentos;
        this.cdeportivo = cdeportivo;
    }

    public Residencias(Integer cHabitaciones, boolean descuentos, boolean cdeportivo, boolean privado, double metros2, String nombre, String direccion, String localidad, String nombregerente) {
        super(privado, metros2, nombre, direccion, localidad, nombregerente);
        this.cHabitaciones = cHabitaciones;
        this.descuentos = descuentos;
        this.cdeportivo = cdeportivo;
    }

    public Integer getcHabitaciones() {
        return cHabitaciones;
    }

    public void setcHabitaciones(Integer cHabitaciones) {
        this.cHabitaciones = cHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCdeportivo() {
        return cdeportivo;
    }

    public void setCdeportivo(boolean cdeportivo) {
        this.cdeportivo = cdeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetros2() {
        return metros2;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
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
        return "Residencias{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente + "privado=" + privado + ", metros2=" + metros2+ "cHabitaciones=" + cHabitaciones + ", descuentos=" + descuentos + ", cdeportivo=" + cdeportivo + '}';
    }
    
    
    
}
