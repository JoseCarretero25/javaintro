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
public class Camping extends ExtraHotel {
    protected Integer cCarpas;
    protected Integer cBanios;
    protected boolean Restaurant;

    public Camping() {
    }

    public Camping(Integer cCarpas, Integer cBanios, boolean Restaurant) {
        this.cCarpas = cCarpas;
        this.cBanios = cBanios;
        this.Restaurant = Restaurant;
    }

    public Camping(Integer cCarpas, Integer cBanios, boolean Restaurant, boolean privado, double metros2) {
        super(privado, metros2);
        this.cCarpas = cCarpas;
        this.cBanios = cBanios;
        this.Restaurant = Restaurant;
    }

    public Camping(Integer cCarpas, Integer cBanios, boolean Restaurant, boolean privado, double metros2, String nombre, String direccion, String localidad, String nombregerente) {
        super(privado, metros2, nombre, direccion, localidad, nombregerente);
        this.cCarpas = cCarpas;
        this.cBanios = cBanios;
        this.Restaurant = Restaurant;
    }

    public Integer getcCarpas() {
        return cCarpas;
    }

    public void setcCarpas(Integer cCarpas) {
        this.cCarpas = cCarpas;
    }

    public Integer getcBanios() {
        return cBanios;
    }

    public void setcBanios(Integer cBanios) {
        this.cBanios = cBanios;
    }

    public boolean isRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(boolean Restaurant) {
        this.Restaurant = Restaurant;
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
        return "Camping{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente + "privado=" + privado + ", metros2=" + metros2 + "cCarpas=" + cCarpas + ", cBanios=" + cBanios + ", Restaurant=" + Restaurant + '}';
    }
    
    
}
