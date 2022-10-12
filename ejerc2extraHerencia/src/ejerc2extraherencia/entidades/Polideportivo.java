/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extraherencia.entidades;

/**
 *
 * @author macbookair
 */
public class Polideportivo extends Edificio {
    protected String nombre;
    protected boolean abierto;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean abierto) {
        this.nombre = nombre;
        this.abierto = abierto;
    }

    public Polideportivo(String nombre, boolean abierto, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.abierto = abierto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", abierto=" + abierto + ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    

    @Override
    public void calcularSuperficie() {
        double area = this.getAlto() * this.getLargo();
        System.out.println("La superficie es de : " + area);
    }

    @Override
    public void calcularVolumen() {
     double volumen = this.getAlto() * this.getLargo() * this.getAncho();
        System.out.println("El volumen es de : " + volumen);   
    }
    
}
