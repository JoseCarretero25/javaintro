/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrairon.entidades;

/**
 *
 * @author macbookair
 */
public class Objetos {
    private String nombre;
    private double resistencia;
    private double distancia;
    private boolean hostil;

    public Objetos() {
    }

    public Objetos(String nombre, double resistencia, double distancia, boolean hostil) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.distancia = distancia;
        this.hostil = hostil;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public String toString() {
        return "Objetos{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", distancia=" + distancia + ", hostil=" + hostil + '}';
    }
    
    
}
