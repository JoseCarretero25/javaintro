/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduraironman.entidades;

/**
 *
 * @author macbookair
 */
public class Objetos {

    private String nombre;
    private double resistencia;
    private boolean hostil;
    private double distancia;

    public Objetos() {
    }

    public Objetos(String nombre, double resistencia, boolean hostil, double distancia) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.hostil = hostil;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Objetos{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", hostil=" + hostil + ", distancia=" + distancia + '}';
    }
    
    
}

